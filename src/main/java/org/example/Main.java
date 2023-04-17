package org.example;

import java.util.Scanner;

public class Main {

    //SETTER FUNCTION FOR THE USER MESSAGE TO BE ENCODED/DECODED
    private static String setMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message here: ");
        String message = scanner.nextLine().toUpperCase();
        return message;
    }

    //SETTER FUNCTION FOR THE KEY TO BE USED TO ENCODE/DECODE USER MESSAGE
    private static Integer setKey(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key ...(KEY SHOULD BE GREATER THAN 0 AND LESS THAN 26): ");
        int cipherKey = scanner.nextInt();
        return cipherKey;
    }

    //GETTER FUNCTION FOR THE USER MESSAGE TO BE ENCODED/DECODED
    private static String getMessage(){
        return setMessage();
    }

    //GETTER FUNCTION FOR THE KEY TO BE USED TO ENCODE/DECODE USER MESSAGE
    private static Integer getKey(){
        return setKey();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            //PROMPTS THE USER TO CHOOSE THE PROCESS THEY WISH TO EXECUTE
            System.out.print("What do you wish to do ...(E to ENCODE) or (D to DECODE): ");
            String process = scanner.nextLine();

            //TELLS THE CODE WHICH FILE TO EXECUTE DEPENDING ON THE PROCESS SELECTED
            if (process.equalsIgnoreCase("E") || process.equalsIgnoreCase("ENCODE")) {
                String output = Encoding.encode (getMessage(), getKey());
                System.out.print("RESULT: ".concat(output));
            }
            else if (process.equalsIgnoreCase("D") || process.equalsIgnoreCase("DECODE")) {
                String results = Decoding.decode(getMessage(), getKey());
                System.out.print("RESULT: ".concat(results));
                scanner.nextLine();
            }
            else {
                System.out.print("PROCESS ERROR! PLEASE REPLY WITH (E TO ENCODE) OR (D TO DECODE)\n\n");
                continue;
            }

            //PROMPTS THE USER WHETHER TO CONTINUE WITH OR TERMINATE THE PROCESS
            System.out.print("\nDo you wish to proceed...(C to CONTINUE) or (Q to Quit): ");
            String proceedPrompt = scanner.nextLine();

            //OUTPUT IF THE USER TERMINATES THE PROCESS
            if (proceedPrompt.equalsIgnoreCase("Q") || proceedPrompt.equalsIgnoreCase("QUIT")){
                System.out.println("PROCESS ENDED!");
                break;
            }
        } while(true);
    }
}