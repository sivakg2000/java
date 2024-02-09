package com.siva.apps.practice.util;

import org.eclipse.jgit.api.*;
import org.eclipse.jgit.api.errors.*;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.io.IOException;

public class JGitExampleWithCommitAndPush {

    public static void main(String[] args) {
        // Specify the URL of the remote Git repository
        String remoteRepoURL = "REMOTE_REPO_URL";

        // Specify the local path where the repository will be cloned
        String localRepoPath = "LOCAL_REPO_PATH";

        // Specify the branch name to switch to
        String branchNameToSwitch = "BRANCH_NAME_TO_SWITCH";

        // Specify the name of the new branch to create
        String newBranchName = "NEW_BRANCH_NAME";

        // Specify the Git repository username and password
        String username = "YOUR_USERNAME";
        String password = "YOUR_PASSWORD";

        try {
            // Clone the remote repository with authentication
            Git.cloneRepository()
                    .setURI(remoteRepoURL)
                    .setDirectory(new File(localRepoPath))
                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password))
                    .call();

            // Open the cloned repository
            Repository repository = new FileRepositoryBuilder()
                    .setGitDir(new File(localRepoPath + "/.git"))
                    .build();

            // Checkout a branch
            try (Git git = new Git(repository)) {
                git.checkout()
                        .setName(branchNameToSwitch)
                        .call();
            }

            // Switch to a different branch or create a new branch if it doesn't exist
            try (Git git = new Git(repository)) {
                if (git.branchList().setListMode(ListBranchCommand.ListMode.REMOTE).call()
                        .stream().anyMatch(ref -> ref.getName().endsWith("/" + newBranchName))) {
                    // Switch to an existing remote branch
                    git.checkout()
                            .setName(newBranchName)
                            .setCreateBranch(false)
                            .setUpstreamMode(CreateBranchCommand.SetupUpstreamMode.TRACK)
                            .setStartPoint("origin/" + newBranchName)
                            .call();
                } else {
                    // Create and switch to a new local branch
                    git.checkout()
                            .setCreateBranch(true)
                            .setName(newBranchName)
                            .setUpstreamMode(CreateBranchCommand.SetupUpstreamMode.TRACK)
                            .setStartPoint("origin/" + branchNameToSwitch)
                            .call();
                }
            }

            // Make changes and commit
            File newFile = new File(localRepoPath, "newFile.txt");
            newFile.createNewFile();

            try (Git git = new Git(repository)) {
                git.add()
                        .addFilepattern(".")
                        .call();

                git.commit()
                        .setMessage("Committing new file")
                        .call();
            }

            // Push changes to the remote repository
            try (Git git = new Git(repository)) {
                git.push()
                        .setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password))
                        .call();
            }

            // Delete a branch if it exists on the remote repository
            try (Git git = new Git(repository)) {
                String remoteBranchToDelete = "refs/heads/" + newBranchName;

                if (git.lsRemote()
                        .setHeads(true)
                        .setRemote(remoteRepoURL)
                        .call()
                        .stream()
                        .anyMatch(ref -> ref.getName().equals(remoteBranchToDelete))) {

                    git.push()
                            .setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password))
                            .setRefSpecs(new RefSpec().setSource(null).setDestination(remoteBranchToDelete))
                            .setForce(true)
                            .call();
                }
            }

        } catch (GitAPIException | IOException e) {
            e.printStackTrace();
        }
    }
}
