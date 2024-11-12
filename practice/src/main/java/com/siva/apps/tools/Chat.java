package com.siva.apps.tools;


import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.*;
import com.azure.core.credential.AzureKeyCredential;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    public static void main(String[] args) {
        // Retrieve endpoint and API key from environment variables
        String endpoint = "https://adcloud-openai-swiz.openai.azure.com/";
        String apiKey = "b56a820ba3384b4ea0565fc8d1dd9276";
        String deploymentName = "adcloud_gpt_4_32k";
        if (endpoint == null || apiKey == null) {
            System.err.println("Please set the AZURE_OPENAI_ENDPOINT and AZURE_OPENAI_API_KEY environment variables.");
            return;
        }

        // Initialize the OpenAI client with key-based authentication
        OpenAIClient client = new OpenAIClientBuilder()
                .endpoint(endpoint)
                .credential(new AzureKeyCredential(apiKey))
                .buildClient();

        // Simulate chat interaction
        List<ChatRequestMessage> prompts = new ArrayList<>();

        prompts.add(new ChatRequestSystemMessage("You are an AI assistant that helps people find information."));
        prompts.add(new ChatRequestUserMessage("Generate 10 random quotes"));


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
}