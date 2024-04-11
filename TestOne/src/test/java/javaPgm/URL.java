package javaPgm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class URL {
    public static void main(String[] args) {
        String fileName = "file:///F:/Hi.txt"; // Change this to the path of your file

        // Create a map to store URL frequencies
        Map<String, Integer> urlMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Increment the count of each URL
                urlMap.put(line, urlMap.getOrDefault(line, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Find the most popular URL
        String mostPopularURL = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : urlMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularURL = entry.getKey();
            }
        }

        // Output the most popular URL
        if (mostPopularURL != null) {
            System.out.println("The most popular URL is: " + mostPopularURL);
            System.out.println("It occurred " + maxCount + " times.");
        } else {
            System.out.println("No URLs found in the file.");
        }
    }
}
