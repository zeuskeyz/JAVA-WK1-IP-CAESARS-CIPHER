package org.example;

public class Alphabets {
    private static String encryptors (){
        String encodingAlphabets = "";
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            encodingAlphabets += letter;
        }
        return encodingAlphabets;
    }

    public static String getEncryptors(){
        return encryptors();
    }
}