package Morsecode;

import java.util.HashMap;

public class Logic {

    private HashMap<String, String> morseCode = new HashMap<>();

    public Logic() {

        //Key´s n values
        morseCode.put("A", "*-");
        morseCode.put("B", "-***");
        morseCode.put("C", "-*-*");
        morseCode.put("D", "-**");
        morseCode.put("E", "*");
        morseCode.put("F", "**-*");
        morseCode.put("G", "--*");
        morseCode.put("H", "****");
        morseCode.put("I", "**");
        morseCode.put("J", "*---");
        morseCode.put("K", "-*-");
        morseCode.put("L", "*-**");
        morseCode.put("M", "--");
        morseCode.put("N", "-*");
        morseCode.put("O", "---");
        morseCode.put("P", "*--*");
        morseCode.put("Q", "--*-");
        morseCode.put("R", "*-*");
        morseCode.put("S", "***");
        morseCode.put("T", "-");
        morseCode.put("U", "**-");
        morseCode.put("V", "***-");
        morseCode.put("W", "*--");
        morseCode.put("X", "-**-");
        morseCode.put("Y", "-*--");
        morseCode.put("Z", "--**");
        morseCode.put("1", "*----");
        morseCode.put("2", "**---");
        morseCode.put("3", "***--");
        morseCode.put("4", "****-");
        morseCode.put("5", "*****");
        morseCode.put("6", "-****");
        morseCode.put("7", "--***");
        morseCode.put("8", "---**");
        morseCode.put("9", "----*");
        morseCode.put("0", "-----");
        morseCode.put(".", "*-*-*-");
        morseCode.put(",", "--**--");
        morseCode.put("?", "**--**");

        morseCode.put("*-", "A");
        morseCode.put("-***", "B");
        morseCode.put("-*-*", "C");
        morseCode.put("-**", "D");
        morseCode.put("*", "E");
        morseCode.put("**-*", "F");
        morseCode.put("--*", "G");
        morseCode.put("****", "H");
        morseCode.put("**", "I");
        morseCode.put("*---", "J");
        morseCode.put("-*-", "K");
        morseCode.put("*-**", "L");
        morseCode.put("--", "M");
        morseCode.put("-*", "N");
        morseCode.put("---", "O");
        morseCode.put("*--*", "P");
        morseCode.put("--*-", "Q");
        morseCode.put("*-*", "R");
        morseCode.put("***", "S");
        morseCode.put("-", "T");
        morseCode.put("**-", "U");
        morseCode.put("***-", "V");
        morseCode.put("*--", "W");
        morseCode.put("-**-", "X");
        morseCode.put("-*--", "Y");
        morseCode.put("--**", "Z");
        morseCode.put("*----", "1");
        morseCode.put("**---", "2");
        morseCode.put("***--", "3");
        morseCode.put("****-", "4");
        morseCode.put("*****", "5");
        morseCode.put("-****", "6");
        morseCode.put("--***", "7");
        morseCode.put("---**", "8");
        morseCode.put("----*", "9");
        morseCode.put("-----", "0");
        morseCode.put("*-*-*-", ".");
        morseCode.put("--**--", ",");
        morseCode.put("**--**", "?");
        morseCode.put(" ", "|");
        morseCode.put("|", " ");

    }

    public String getMorseCode(String text) {
        String textout = "";
        text = text.toUpperCase();

        if (text.contains("*") || (text.contains("-"))) {
            String[] writeMorse = text.split(" ");


            for (int i = 0; i < writeMorse.length; i++) {
                if (morseCode.get(writeMorse[i]) == null) {
                    textout = "Something went wrong! Please use correct input form :)";
                    break; }
                textout += morseCode.get(writeMorse[i]);
            }
        } else {

            String[] writeEnglish = text.split("");

            for (int i = 0; i < writeEnglish.length; i++) {
                if (morseCode.get(writeEnglish[i]) == null) {
                    textout = "Something went wrong! Please use correct input form :)";
                    break; }
                    textout += morseCode.get(writeEnglish[i]) + " ";
                }
            }
            return textout;

        }


    }

