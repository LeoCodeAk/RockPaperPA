package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating a scanner Object
        Scanner scanner = new Scanner(System.in);
        //While loop is set True to keep the loop going until a break is thrown at the end
        while (true) {
            //Creating a array of String[] called rps that holds the value
            String[] rps = {"Rock", "Paper", "Scissor"};
            //generates "ComputerMove" that randomly selects one of the string in the rps array
            String computerMove = rps[new Random().nextInt(rps.length)];
            computerMove = computerMove.toLowerCase(); //converts the computerInput to lowercase for input criteria

            //Declaring String userMove
            String userMove;

            //While loop begins looping for a valid input from user
            while (true) {
                //Asks for user input on what their move will be
                System.out.print("Please enter your move(rock, paper, scissor): ");
                userMove = scanner.nextLine().toLowerCase(); //Takes the userinput and assigns it to userMove
                //If statement (|| = OR operator) if userMove is not valid it will keep looping till it is one of these three input.
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissor")) {
                    break; // it will end the while loop if it is one of those three inputs
                }
                System.out.println(userMove + " is not a valid move. Try again!"); // prints that the type is not valid move and to try again
            } // ends while loop after the user inputs correct input

            System.out.println("User selected " + userMove); // Prints out user input
            System.out.println("Computer selected " + computerMove);// prints out what the computer randomly  generated

            //If statement for the following cases of the game. If both select same move it will end in a tie
            if (userMove.equals(computerMove)) {
                System.out.println("Game is a tie");
            } else if (userMove.equals("rock")) {
                //Nested if statement showing if user picks rock and computer picks paper.. you lose
                if (computerMove.equals("paper")) {
                    System.out.println("You lose!");
                //if user picks paper and computer picks scissor.. you win
                } else if (computerMove.equals("scissor")) {
                    System.out.println("You win!");
                } else if (userMove.equals("paper")) {
                    if (computerMove.equals("rock")) {
                        System.out.println("You win!");

                    } else if (computerMove.equals("scissor")) {
                        System.out.println("You lost!");
                    } else if (userMove.equals("scissor")) {
                        if (computerMove.equals("rock")) {
                            System.out.println("You lose!");

                        } else if (computerMove.equals("paper")) {
                            System.out.println("You win!");
                        }
                    }
                }
            }
            //Asks user if they want to play again
            System.out.println("Play again?(y/n)");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("n")) {
                break;
            }

        }
        System.out.println("Thanks for playing!");
    }
}

