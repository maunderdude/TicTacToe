package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] gameBoard = {"------------------------\n\n    |","   |","   \n",
                           "___|","___|","___\n",
                           "   |","   |","   \n",
                           "___|","___|","___\n",
                           "   |","   |","   \n",
                           "   |","   |","   \n\n------------------------"};


        String  str = Arrays.toString(gameBoard).replace(",", "");

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

        // Win condition
        boolean winCondition = true;



        while(winCondition) {

            str = Arrays.toString(gameBoard).replace(",", "");
            System.out.println(str);

            System.out.println("Please enter number between 1 - 9 to complete your go:");
            int userInput = scan.nextInt();


            // Validation needed


            // Switch
            switch (userInput) {
                case 1:
                    gameBoard[0] = "\n  x |";
                    System.out.println(gameBoard[0]);
                    System.out.println("------------------------");
                    break;
                case 2:
                    gameBoard[1] = " x |";
                    System.out.println(gameBoard[1]);
                    System.out.println("------------------------");
                    break;
                case 3:
                    gameBoard[2] = " x \n";
                    System.out.println(gameBoard[2]);
                    System.out.println("------------------------");
                    break;
                case 4:
                    gameBoard[6] = " x |";
                    System.out.println(gameBoard[3]);
                    System.out.println("------------------------");
                    break;
                case 5:
                    gameBoard[7] = " x |";
                    System.out.println(gameBoard[4]);
                    System.out.println("------------------------");
                    break;
                case 6:
                    gameBoard[8] = " x \n";
                    System.out.println(gameBoard[5]);
                    System.out.println("------------------------");
                    break;
                case 7:
                    gameBoard[15] = " x |";
                    System.out.println(gameBoard[6]);
                    System.out.println("------------------------");
                    break;
                case 8:
                    gameBoard[16] = " x |";
                    System.out.println(gameBoard[7]);
                    System.out.println("------------------------");
                    break;
                case 9:
                    gameBoard[17] = " x \n";
                    System.out.println(gameBoard[8]);
                    System.out.println("------------------------");
                    break;
            }

        }
    }
}
