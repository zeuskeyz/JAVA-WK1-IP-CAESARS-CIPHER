package org.example;
public class Decoding {
    public static String decode (String message, int cipherKey) {

        String decodingAlphabets = Alphabets.getEncryptors();;

        //DECODING PART
        String decodedText = "";
        if (cipherKey > 0 && cipherKey < decodingAlphabets.length()){
            for(int i=0; i<message.length(); i++){

                char msgLetter = message.charAt(i);

                if(Character.isLetter(msgLetter)){

                    int cipherStart = decodingAlphabets.length()- cipherKey + decodingAlphabets.indexOf(msgLetter);

                    if (cipherStart < decodingAlphabets.length() )
                        decodedText += decodingAlphabets.charAt(cipherStart);
                    else
                        decodedText += decodingAlphabets.charAt(cipherStart%decodingAlphabets.length());
                }
                else
                    decodedText += msgLetter;
            }
        }
        else
            decodedText = "KEY ERROR! THE KEY HAS TO BE A NUMBER BETWEEN 1 AND 26\n";
        return decodedText;
    }
}