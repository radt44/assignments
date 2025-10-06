//Name: Garrett Radtke
//Date: 26th of September, 2025
//Class: CS145

import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) { //prompts a user for input, then converts the letters in the input to a number
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter text to convert: ");
        String s = input.nextLine();
        char[] sArr = s.toCharArray();
        String runStr = "";
        for (int i = 0; i < sArr.length; i++) {
            if (Character.isLetter(sArr[i])){
                runStr = runStr + getNumber(sArr[i]);
            } else {
                runStr = runStr + sArr[i];
            }
        }
        System.out.println(runStr);
    }

    public static int getNumber(char input) { //returns an integer based on a character input according to the letter-number mapping for phones
        int number = 0;
        switch (Character.toUpperCase(input)) {
            case 'A':
            case 'B':
            case 'C':
                number = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                number = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                number = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                number = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                number = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                number = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                number = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                number = 9;
                break;
            default:
                System.out.println(input + "is an invalid input, please enter a letter ");
                System.exit(1);
        }
        return number;
    }
}
