package org.example;

public class Encoding {

    public static String encode (String message, Integer cipherKey) {

        final String encodingAlphabets = Alphabets.getEncryptors();

        //ENCODING PART
        String encodedText = "";

        if (cipherKey > 0 && cipherKey < encodingAlphabets.length()){
            for(int i=0; i<message.length(); i++){

                Character msgLetter = message.charAt(i);

                if(Character.isLetter(msgLetter)){

                    int cipherStart = encodingAlphabets.indexOf(msgLetter) + cipherKey;

                    if (cipherStart < encodingAlphabets.length() )
                        encodedText += encodingAlphabets.charAt(cipherStart);
                    else
                        encodedText += encodingAlphabets.charAt(cipherStart%encodingAlphabets.length());
                }
                else
                    encodedText += msgLetter;
            }
        }
        else
            encodedText = "KEY ERROR! THE KEY HAS TO BE A NUMBER BETWEEN 1 AND 26\n";
        return encodedText;
    }
}
