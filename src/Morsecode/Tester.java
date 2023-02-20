package Morsecode;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Tester {

    @Test
    public void printMorse() {
        Logic morseCode = new Logic();

        String testData = "A";
        String expected = "*- ";
        String actual = morseCode.getMorseCode(testData);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void printEng() {
        Logic morseCode = new Logic();

        String testData = "*-";
        String expected = "A";
        String actual = morseCode.getMorseCode(testData);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void printManyMorse() {
        Logic morseCode = new Logic();

        String testData = "Hemant";
        String expected = "**** * -- *- -* - ";
        String actual = morseCode.getMorseCode(testData);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSpecials() {
        Logic morseCode = new Logic();

        String testData = "ÅÄÖ";
        String expected = "Something went wrong! Please use correct input form :)";
        String actual = morseCode.getMorseCode(testData);

        Assert.assertEquals(expected,actual);
    }

}
