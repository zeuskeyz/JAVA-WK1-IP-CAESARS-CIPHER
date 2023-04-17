package org.example;

public class Alphabets {
    //FUNCTION TO GENERATE ALPHABETS FROM A-Z
    private static String encryptors (){
        String encodingAlphabets = "";
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            encodingAlphabets += letter;
        }
        return encodingAlphabets;
    }

    //GETTER FUNCTION TO GET ALPHABETS encryptors()
    public static String getEncryptors(){
        return encryptors();
    }
}