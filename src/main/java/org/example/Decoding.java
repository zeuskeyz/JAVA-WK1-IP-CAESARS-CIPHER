package org.example;
public class Decoding {
    public static String decode (String message, int cipherKey) {
        //UES THE getEncryptors() FROM THE ALPHABETS.JAVA CLASS TO ASSIGN ALPHABETS IN THE DECODING.JAVA CLASS
        String decodingAlphabets = Alphabets.getEncryptors();;

        String decodedText = ""; //INITIALIZES AN EMPTY STRING TO HOLD DECODED OUTPUT

        //ENSURES THE CIPHER KEY IS BETWEEN 1-26
        if (cipherKey > 0 && cipherKey < decodingAlphabets.length()){
            //LOOPS THROUGH THE USER MESSAGE
            for(int i=0; i<message.length(); i++){
                char msgLetter = message.charAt(i);

                //CHECKS IF MESSAGE CHARACTER IS AN ALPHABETICAL LETTER
                if(Character.isLetter(msgLetter)){

                    int cipherStart = decodingAlphabets.length()- cipherKey + decodingAlphabets.indexOf(msgLetter);

                    if (cipherStart < decodingAlphabets.length() )
                        decodedText += decodingAlphabets.charAt(cipherStart);
                    else
                        decodedText += decodingAlphabets.charAt(cipherStart%decodingAlphabets.length());
                }
                //HANDLES NON-ALPHABETICAL MEMBERS OF THE USER MESSAGE
                else
                    decodedText += msgLetter;
            }
        }
        //HANDLES ERROR MESSAGE IF THE KEY BREACHES THE CONDITIONAL BOUNDS
        else
            decodedText = "KEY ERROR! THE KEY HAS TO BE A NUMBER BETWEEN 1 AND 26\n";

        return decodedText;
    }
}