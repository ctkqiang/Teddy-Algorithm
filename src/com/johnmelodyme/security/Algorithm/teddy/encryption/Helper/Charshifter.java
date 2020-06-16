package com.johnmelodyme.security.Algorithm.teddy.encryption.Helper;

/**
 * @Author: John Melody
 * @Class: Charshifter
 * @doc: Character Shifter Caesatr cipher: REFERENCE : https://bit.ly/2N0yOA7
 */

public class Charshifter {

    /**
     * @Method CSC Caesar cipher
     * @param Value getStringFromUSer
     * @param Shift intToShiftChar_userInput()
     * @return --> Create CharShift From user input
     */

    public static String CSC(String Value, int Shift) {
        // Convert Character into Char Array:
        char[] buffer = Value.toCharArray();

        // loop Over the CHARS
        for (int i = 0x0; i < buffer.length; i++) {

            char _letter = buffer[i];
            _letter = (char) (_letter + shift);

            if (_letter > "z") {
                _letter = (char) (_letter - 0x1a);
            } else if (_letter < "a") {
                _letter = (char) (_letter + 0x1a);
            }

            buffer[i] = _letter;
        }

        return new String(buffer);
    }
}
