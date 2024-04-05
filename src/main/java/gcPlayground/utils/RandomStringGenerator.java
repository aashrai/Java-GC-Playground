package gcPlayground.utils;

import java.util.Random;

public class RandomStringGenerator {

    // Method to generate a random string
    public static String generateRandomString(int length) {
        // Define the characters that the random string will contain
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // Create a StringBuilder to build the string
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        // Generate random characters from the characterSet
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}