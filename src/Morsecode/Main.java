package Morsecode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = "";
        System.out.println("Welcome to the English & MorseCode Translator :)");
        System.out.println("Please type something in English OR Morsecode - Do not mix both :)");
        System.out.println("If typing in English, use the English alphabet :)");
        System.out.println("If typing in Morsecode, use  *  for dots and  -  for dashes, and  |  for spaces :)");
        System.out.println("Type # to exit the program :)");

        text = scan.nextLine();

        while (!text.equals("#")) {

            Logic textLogic = new Logic();
            text = textLogic.getMorseCode(text);
            System.out.println(text);
            System.out.println("Please type something in English OR Morsecode - Do not mix both :)");
            System.out.println("If typing in English, use the English alphabet :)");
            System.out.println("If typing in Morsecode, use  *  for dots and  -  for dashes, and  |  for spaces :)");
            System.out.println("Type # to exit the program :)");
            text = scan.nextLine();
        }

        }

    }

