package com.siva.apps.tools;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.*;
import com.azure.core.credential.AzureKeyCredential;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.dotenv.Dotenv;
import okhttp3.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CloudNativeAssessTool {


    public  String endpoint = "https://adcloud-openai-swiz.openai.azure.com/";
    public String apiKey = "b56a820ba3384b4ea0565fc8d1dd9276";
    //public String deploymentName = "adcloud_gpt_4_32k";

    public String deploymentName = "adcloudgpt35turbo";

    public OpenAIClient client;


    private static final OkHttpClient httpClient = new OkHttpClient();

    public static void main(String[] args) throws IOException {

    new CloudNativeAssessTool().start();
    }

    private void start() throws IOException {

        // Directory to scan
        String projectDirectory = "/Users/skaruppiah/Test/1/";

        client = new OpenAIClientBuilder()
                .endpoint(endpoint)
                .credential(new AzureKeyCredential(apiKey))
                .buildClient();

        // Scan the directory and assess each file
        scanDirectoryAndAssessFiles(Paths.get(projectDirectory), apiKey);

    }

    private   void scanDirectoryAndAssessFiles(Path directory, String apiKey) throws IOException {
        // Walk through files in the directory
        Files.walk(directory)
                .filter(Files::isRegularFile)
                .filter(path -> isValidFileType(path.toString()))
                .forEach(path -> {
                    try {
                        System.out.println("Assessing: " + path);
                        String fileContent = Files.readString(path);
                        analyzeFile(fileContent, detectLanguage(path), apiKey);
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + path);
                        e.printStackTrace();
                    }
                });
    }

    // Identify valid file types (.java, .cs, .py)
    private static boolean isValidFileType(String filePath) {
        return filePath.endsWith(".java") || filePath.endsWith(".cs") || filePath.endsWith(".py");
    }

    // Detect language based on file extension
    private static String detectLanguage(Path filePath) {
        if (filePath.toString().endsWith(".java")) {
            return "Java";
        } else if (filePath.toString().endsWith(".cs")) {
            return ".NET (C#)";
        } else if (filePath.toString().endsWith(".py")) {
            return "Python";
        }
        return "Unknown";
    }

    // Analyze the file using Azure OpenAI API
    private   void analyzeFile(String fileContent, String language, String apiKey) throws IOException {


        List<ChatRequestMessage> prompts = new ArrayList<>();
        // Construct the system prompt
        prompts.add(new ChatRequestSystemMessage("You are an expert cloud-native engineer. Your task is to analyze software projects and provide recommendations to make them cloud-native. You will assess code files in different languages such as Java, .NET, and Python, identifying potential issues with cloud-native principles like stateless design, scalability, and microservices compatibility. You will also suggest code refactoring and provide best practices for integrating cloud services like AWS, Azure, and GCP."));
        String systemPrompt = "You are now analyzing a " + language + "  file. The file belongs to a project that is intended to be migrated to a AWS cloud-native architecture . Assess the file, identify non-cloud-native patterns If refactoring is needed, provide code changes. Dont change the code which are not relavent to cloudnative. keep the method name,  Here is the code:\n" + fileContent;
        prompts.add(new ChatRequestUserMessage(systemPrompt));

        ChatCompletionsOptions options = new ChatCompletionsOptions(prompts)
                .setMaxTokens(800)
                .setTemperature(0.7)
                .setTopP(0.95)
                .setFrequencyPenalty(0.0)
                .setPresencePenalty(0.0)
                .setStream(false);

        ChatCompletions chatCompletions = client.getChatCompletions(deploymentName, options);

        // Print the response
        for (ChatChoice choice : chatCompletions.getChoices()) {
            ChatResponseMessage message = choice.getMessage();
            System.out.printf("Index: %d, Chat Role: %s.%n", choice.getIndex(), message.getRole());
            System.out.println("Message:");
            System.out.println(message.getContent());
        }
        System.out.println();

    }

    // OpenAI Request class to create the request payload
    static class OpenAIRequest {
        public String prompt;
        public String model;
        public int max_tokens;

        public OpenAIRequest(String prompt, String model, int max_tokens) {
            this.prompt = prompt;
            this.model = model;
            this.max_tokens = max_tokens;
        }
    }
}

