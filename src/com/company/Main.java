package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] gameBoard = {"\n    |","   |","   \n",
                           "___|","___|","___\n",
                           "   |","   |","   \n",
                           "___|","___|","___\n",
                           "   |","   |","   \n",
                           "   |","   |","   \n",
                "\n------------------------"};


        String  str = Arrays.toString(gameBoard).replace(",", "");

        // System.out.println(gameBoard);

        // Variables
        /*
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";
        String six = "";
        String seven = "";
        String eight = "";
        String nine = "";

         */

        boolean optionOne = false;
        boolean optionTwo = false;
        boolean optionThree = false;
        boolean optionFour = false;
        boolean optionFive = false;
        boolean optionSix = false;
        boolean optionSeven = false;
        boolean optionEight = false;
        boolean optionNine = false;

        /*
        boolean optionOneAi = false;
        boolean optionTwoAi = false;
        boolean optionThreeAi = false;
        boolean optionFourAi = false;
        boolean optionFiveAi = false;
        boolean optionSixAi = false;
        boolean optionSevenAi = false;
        boolean optionEightAi = false;
        boolean optionNineAi = false;

         */

        // User input
        Scanner scan = new Scanner(System.in);
        int userInput;

        // AI input
        Random ai = new Random();
        int [] choiceArray = {0,1,2,6,7,8,15,16,17};
        int aiChoice;


        // Coin flip generator
        int flip = ai.nextInt(2);

        // Win condition
        boolean winCondition = true;


        // Intro coin flip to game
        System.out.println("Flip a coin to see who goes first:\n" +
                "Press enter:");
        scan.nextLine();

        // If heads
        int coinFlip = 0;
        if(flip == 0){
            System.out.println("Heads! You go first!\nYou are 'x'\n" +
                    "Press enter:");
            scan.nextLine();

            while(winCondition) {


                System.out.println("Please enter number between 1 - 9 to complete your go:");

                str = Arrays.toString(gameBoard).replace(",", "");
                System.out.println(str);

                userInput = scan.nextInt();


                // Validation loop
                while(true){
                    // Checks to see if if choice has already been chosen
                    if(userInput == 1 && optionOne){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 2 && optionTwo){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 3 && optionThree){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 4 && optionFour){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 5 && optionFive){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 6 && optionSix){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 7 && optionSeven){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 8 && optionEight){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 9 && optionNine){
                        System.out.println("Choose again:");
                    }
                    else{
                        break;
                    }

                    userInput = scan.nextInt();

                }

                        // Switch
                        switch (userInput) {
                            case 1:
                                gameBoard[0] = "\n  x |";
                                //one = "x";
                                optionOne = true;
                                break;
                            case 2:
                                gameBoard[1] = " x |";
                                //two = "x";
                                optionTwo = true;
                                break;
                            case 3:
                                gameBoard[2] = " x \n";
                                //three = "x";
                                optionThree = true;
                                break;
                            case 4:
                                gameBoard[6] = " x |";
                                //four = "x";
                                optionFour = true;
                                break;
                            case 5:
                                gameBoard[7] = " x |";
                                //five = "x";
                                optionFive = true;
                                break;
                            case 6:
                                gameBoard[8] = " x \n";
                                //six = "x";
                                optionSix = true;
                                break;
                            case 7:
                                gameBoard[15] = " x |";
                                //seven = "x";
                                optionSeven = true;
                                break;
                            case 8:
                                gameBoard[16] = " x |";
                                //eight = "x";
                                optionEight = true;
                                break;
                            case 9:
                                gameBoard[17] = " x \n";
                                //nine = "x";
                                optionNine = true;
                                break;
                        }


                     /*   if ((optionOne && optionTwo && optionThree) || (optionOne && optionFour && optionSeven) || (optionTwo && optionFive && optionEight)
                                || (optionThree && optionSix && optionNine) || (optionOne && optionFive && optionNine) || (optionFour && optionFive && optionSix) || (optionSeven && optionEight && optionNine)) {
                            str = Arrays.toString(gameBoard).replace(",", "");
                            System.out.println(str);
                            System.out.println("-----------------------------\n");
                            System.out.println("Congratulations! You win!");
                            winCondition = false;
                        }


                      */

                aiChoice = ai.nextInt(choiceArray.length );

                // Validation loop
                while(true){
                    // Checks to see if if choice has already been chosen
                    if(aiChoice == 0 && optionOne){

                    }
                    else if(aiChoice == 1 && optionTwo){

                    }
                    else if(aiChoice == 2 && optionThree){

                    }
                    else if(aiChoice == 3 && optionFour){

                    }
                    else if(aiChoice == 4 && optionFive){

                    }
                    else if(aiChoice == 5 && optionSix){

                    }
                    else if(aiChoice == 6 && optionSeven){

                    }
                    else if(aiChoice == 7 && optionEight){

                    }
                    else if(aiChoice == 8 && optionNine){

                    }
                    else{
                        break;
                    }

                    aiChoice = ai.nextInt(choiceArray.length + 1);

                }

                        // Switch
                        switch (aiChoice) {
                            case 0:
                                gameBoard[0] = "\n  o |";
                                //one = "o";
                                optionOne = true;
                                break;
                            case 1:
                                gameBoard[1] = " o |";
                                //two = "o";
                                optionTwo = true;
                                break;
                            case 2:
                                gameBoard[2] = " o \n";
                                //three = "o";
                                optionThree = true;
                                break;
                            case 3:
                                gameBoard[6] = " o |";
                                //four = "o";
                                optionFour = true;
                                break;
                            case 4:
                                gameBoard[7] = " o |";
                                //five = "o";
                                optionFive = true;
                                break;
                            case 5:
                                gameBoard[8] = " o \n";
                                //six = "o";
                                optionSix = true;
                                break;
                            case 6:
                                gameBoard[15] = " o |";
                                //seven = "o";
                                optionSeven = true;
                                break;
                            case 7:
                                gameBoard[16] = " o |";
                                //eight = "o";
                                optionEight = true;
                                break;
                            case 8:
                                gameBoard[17] = " o \n";
                                //nine = "";
                                optionNine = true;
                                break;

                        }

                    }

            /*
            if((optionOneAi && optionTwoAi  && optionThreeAi) || (optionOneAi && optionFourAi && optionSevenAi) || (optionTwoAi && optionFiveAi && optionEightAi)
                    || (optionThreeAi && optionSixAi && optionNineAi) || (optionOneAi && optionFiveAi && optionNineAi) || (optionFourAi && optionFiveAi && optionSixAi) ||
                    (optionSevenAi && optionEightAi && optionNineAi)){
                str = Arrays.toString(gameBoard).replace(",", "");
                System.out.println(str);
                System.out.println("-----------------------------\n");
                System.out.println("You Lose!");
                winCondition = false;
            }

             */


            System.exit(0);
        }
        else{
            // If tails
            System.out.println("Tails! Computer goes first:\nComputer is 'o'\n" +
                    "Press enter:");
            scan.nextLine();


            while(winCondition) {


                aiChoice = ai.nextInt(choiceArray.length + 1);

                // Validation loop
                while(true){
                    // Checks to see if if choice has already been chosen
                    if(aiChoice == 0 && optionOne){
                    }
                    else if(aiChoice == 1 && optionTwo){

                    }
                    else if(aiChoice == 2 && optionThree){

                    }
                    else if(aiChoice == 3 && optionFour){

                    }
                    else if(aiChoice == 4 && optionFive){

                    }
                    else if(aiChoice == 5 && optionSix){

                    }
                    else if(aiChoice == 6 && optionSeven){

                    }
                    else if(aiChoice == 7 && optionEight){

                    }
                    else if(aiChoice == 8 && optionNine){

                    }
                    else{
                        break;
                    }

                    aiChoice = ai.nextInt(choiceArray.length );

                }

                // Switch
                switch (aiChoice) {
                    case 0:
                        gameBoard[0] = "\n  o |";
                        //one = "o";
                        optionOne = true;
                        break;
                    case 1:
                        gameBoard[1] = " o |";
                        //two = "o";
                        optionTwo = true;
                        break;
                    case 2:
                        gameBoard[2] = " o \n";
                        //three = "o";
                        optionThree = true;
                        break;
                    case 3:
                        gameBoard[6] = " o |";
                        //four = "o";
                        optionFour = true;
                        break;
                    case 4:
                        gameBoard[7] = " o |";
                        //five = "o";
                        optionFive = true;
                        break;
                    case 5:
                        gameBoard[8] = " o \n";
                        //six = "o";
                        optionSix = true;
                        break;
                    case 6:
                        gameBoard[15] = " o |";
                        //seven = "o";
                        optionSeven = true;
                        break;
                    case 7:
                        gameBoard[16] = " o |";
                        //eight = "o";
                        optionEight = true;
                        break;
                    case 8:
                        gameBoard[17] = " o \n";
                        //nine = "";
                        optionNine = true;
                        break;

                }

                /*
                if((optionOneAi && optionTwoAi  && optionThreeAi) || (optionOneAi && optionFourAi && optionSevenAi) || (optionTwoAi && optionFiveAi && optionEightAi)
                        || (optionThreeAi && optionSixAi && optionNineAi) || (optionOneAi && optionFiveAi && optionNineAi) || (optionFourAi && optionFiveAi && optionSixAi) ||
                        (optionSevenAi && optionEightAi && optionNineAi)){
                    str = Arrays.toString(gameBoard).replace(",", "");
                    System.out.println(str);
                    System.out.println("-----------------------------\n");
                    System.out.println("You Lose!");
                    winCondition = false;
                }

                 */

                str = Arrays.toString(gameBoard).replace(",", "");
                System.out.println(str);

                System.out.println("Please enter number between 1 - 9 to complete your go:");


                userInput = scan.nextInt();

                // Validation loop
                while(true){
                    // Checks to see if if choice has already been chosen
                    if(userInput == 1 && optionOne){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 2 && optionTwo){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 3 && optionThree){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 4 && optionFour){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 5 && optionFive){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 6 && optionSix){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 7 && optionSeven){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 8 && optionEight){
                        System.out.println("Choose again:");
                    }
                    else if(userInput == 9 && optionNine){
                        System.out.println("Choose again:");
                    }
                    else{
                        break;
                    }

                    userInput = scan.nextInt();

                }

                switch (userInput) {
                    case 1:
                        gameBoard[0] = "\n  x |";
                        //one = "x";
                        optionOne = true;
                        break;
                    case 2:
                        gameBoard[1] = " x |";
                        //two = "x";
                        optionTwo = true;
                        break;
                    case 3:
                        gameBoard[2] = " x \n";
                        //three = "x";
                        optionThree = true;
                        break;
                    case 4:
                        gameBoard[6] = " x |";
                        //four = "x";
                        optionFour = true;
                        break;
                    case 5:
                        gameBoard[7] = " x |";
                        //five = "x";
                        optionFive = true;
                        break;
                    case 6:
                        gameBoard[8] = " x \n";
                        //six = "x";
                        optionSix = true;
                        break;
                    case 7:
                        gameBoard[15] = " x |";
                        //seven = "x";
                        optionSeven = true;
                        break;
                    case 8:
                        gameBoard[16] = " x |";
                        //eight = "x";
                        optionEight = true;
                        break;
                    case 9:
                        gameBoard[17] = " x \n";
                        //nine = "x";
                        optionNine = true;
                        break;
                }

                /*
                if((optionOne && optionTwo  && optionThree) || (optionOne && optionFour && optionSeven) || (optionTwo && optionFive && optionEight)
                        || (optionThree && optionSix && optionNine) || (optionOne && optionFive && optionNine) || (optionFour && optionFive && optionSix) || (optionSeven && optionEight && optionNine)){
                    str = Arrays.toString(gameBoard).replace(",", "");
                    System.out.println(str);
                    System.out.println("-----------------------------\n");
                    System.out.println("Congratulations! You win!");
                    winCondition = false;
                }

                 */

            }


        }


    }
}
