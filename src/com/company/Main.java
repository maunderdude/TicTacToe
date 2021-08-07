package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] gameBoard = {"\n   |"+"   |"+"   \n"+
                           "___|"+"___|"+"___\n"+
                           "   |"+"   |"+"   \n"+
                           "___|"+"___|"+"___\n"+
                           "   |"+"   |"+"   \n"+
                           "   |"+"   |"+"   \n"};

         // System.out.println(gameBoard);

        // Variables
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";
        String six = "";
        String seven = "";
        String eight = "";
        String nine = "";

        boolean optionOne = false;
        boolean optionTwo = false;
        boolean optionThree = false;
        boolean optionFour = false;
        boolean optionFive = false;
        boolean optionSix = false;
        boolean optionSeven = false;
        boolean optionEight = false;
        boolean optionNine = false;

        // User input
        Scanner scan = new Scanner(System.in);

        // AI input
        Random ai = new Random();



        while(true) {

            System.out.println(Arrays.toString(gameBoard));

            System.out.println("Please enter number between 1 - 9 to complete your go:");
            int userInput = scan.nextInt();



            // Switch
            switch (userInput) {
                case 1:
                    System.out.println(gameBoard[0]);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
            }

        }
    }
}
