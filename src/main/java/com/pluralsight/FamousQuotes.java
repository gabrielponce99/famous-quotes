package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] quotes = {
                    "The only thing we have to fear is fear itself. - Franklin D. Roosevelt",
                    "I think, therefore I am. - René Descartes",
                    "That which does not kill us makes us stronger. - Friedrich Nietzsche",
                    "Be the change that you wish to see in the world. - Mahatma Gandhi",
                    "In the middle of difficulty lies opportunity. - Albert Einstein",
                    "The unexamined life is not worth living. - Socrates",
                    "It always seems impossible until it's done. - Nelson Mandela",
                    "Stay hungry, stay foolish. - Steve Jobs",
                    "The journey of a thousand miles begins with a single step. - Lao Tzu",
                    "Do what you can, with what you have, where you are. - Theodore Roosevelt"
            };

            System.out.println("Pick a quote (Select a number between 1 and 10): ");
            int index = scanner.nextInt();
            index = index - 1;

            System.out.println(quotes[index]);

        } catch (Exception e) {
            System.out.println("Pick a number between 1 and 10, that number is invalid.");
            System.out.println("Goodbye");
        }

    }
}
