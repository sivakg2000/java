package com.siva.apps.test;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

public class AzureStorageAccount {
    public static void main(String args[]){
        System.out.println("Test Azure Storage Account");
        new AzureStorageAccount().listFiles();
    }

    public void listFiles(){
        System.out.println("File List");

        /*BlobServiceClient client=new BlobServiceClientBuilder()
                //.credential(new DefaultAzureCredentialBuilder().build())
                .connectionString("DefaultEndpointsProtocol=https;AccountName=adcloudtest2020;AccountKey=p4BBuU3//TMQZqUB7nt356H2V1CCqr7gPh0kt9TjAzafJMaoESkl4s5q3NtwE9zJrR5HveeRrbBoMV7MW+QCSg==;EndpointSuffix=core.windows.net")
                .buildClient();
        client.listBlobContainers().forEach(System.out::println);*/



        // Your Azure Storage Account connection string
        String connectionString = "DefaultEndpointsProtocol=https;AccountName=adcloudtest2020;AccountKey=p4BBuU3//TMQZqUB7nt356H2V1CCqr7gPh0kt9TjAzafJMaoESkl4s5q3NtwE9zJrR5HveeRrbBoMV7MW+QCSg==;EndpointSuffix=core.windows.net";

        BlobServiceClient blobServiceClient=new BlobServiceClientBuilder()
                .connectionString(connectionString)
                .buildClient();
        // Now you can use the blobServiceClient to interact with your storage account
        System.out.println("Connected to Azure Blob Storage");



        // Example: Create a new container
        String containerName = "my-new-container";
        blobServiceClient.createBlobContainer(containerName);
        System.out.println("Container '" + containerName + "' created.");



    }





}

