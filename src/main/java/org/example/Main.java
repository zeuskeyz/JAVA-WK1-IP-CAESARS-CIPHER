package org.example;

import java.util.Scanner;

public class Main {
    private static String setMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message here: ");
        String message = scanner.nextLine().toUpperCase();
        return message;
    }
    private static Integer setKey(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key ...(KEY SHOULD BE GREATER THAN 0 AND LESS THAN 26): ");
        int cipherKey = scanner.nextInt();
        return cipherKey;
    }
    private static String getMessage(){
        return setMessage();
    }
    private static Integer getKey(){
        return setKey();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("What do you wish to do ...(E to ENCODE) or (D to DECODE): ");
            String process = scanner.nextLine();

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

            System.out.print("\nDo you wish to proceed...(C to CONTINUE) or (Q to Quit): ");
            String proceedPrompt = scanner.nextLine();

            if (proceedPrompt.equalsIgnoreCase("Q") || proceedPrompt.equalsIgnoreCase("QUIT")){
                System.out.println("PROCESS ENDED!");
                break;
            }
        } while(true);
    }
}