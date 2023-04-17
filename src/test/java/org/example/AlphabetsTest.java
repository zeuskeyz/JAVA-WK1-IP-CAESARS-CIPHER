package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetsTest {
    @Test
    @DisplayName(value = "TESTING ALPHABET GENERATION")
    void getEncryptors() {
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ",Alphabets.getEncryptors());
    }
}