package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetsTest {
    @Test
    @DisplayName(value = "TESTING ALPHABET GENERATION")
    void getEncryptors() {
        //TESTS F THE ALPHABETICAL LETTERS ARE GENERATED BY THE FUNCTION encryptors()
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ",Alphabets.getEncryptors());
    }
}