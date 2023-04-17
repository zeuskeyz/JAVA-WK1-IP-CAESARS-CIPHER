package org.example;

public class Encoding {
    public static String encode (String message, Integer cipherKey) {
        //USES THE getEncryptors() FROM THE ALPHABETS.JAVA CLASS TO ASSIGN ALPHABETS IN THE ENCODING.JAVA CLASS
        final String encodingAlphabets = Alphabets.getEncryptors();

        String encodedText = ""; //INITIALIZES AN EMPTY STRING TO HOLD FINAL OUTPUT

        //ENSURES THE CIPHER KEY IS BETWEEN 1-26
        if (cipherKey > 0 && cipherKey < encodingAlphabets.length()){
            //LOOPS THROUGH THE USER MESSAGE
            for (int i=0; i<message.length(); i++) {
                char msgLetter = message.charAt(i);

                //CHECKS IF MESSAGE CHARACTER IS AN ALPHABETICAL LETTER
                if (Character.isLetter(msgLetter)){

                    int cipherStart = encodingAlphabets.indexOf(msgLetter) + cipherKey;

                    if (cipherStart < encodingAlphabets.length() )
                        encodedText += encodingAlphabets.charAt(cipherStart);
                    else
                        encodedText += encodingAlphabets.charAt(cipherStart % encodingAlphabets.length());
                }

                //HANDLES NON-ALPHABETICAL MEMBERS OF THE USER MESSAGEE
                else
                    encodedText += msgLetter;
            }
        }
        //HANDLES ERROR IF THE KEY BREACHES THE CONDITIONAL BOUNDS
        else
            encodedText = "KEY ERROR! THE KEY HAS TO BE A NUMBER BETWEEN 1 AND 26\n";

        return encodedText;
    }
}
