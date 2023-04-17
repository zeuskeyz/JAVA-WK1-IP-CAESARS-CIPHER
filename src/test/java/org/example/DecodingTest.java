package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {
    @Test
    @DisplayName(value = "TESTING DECODING FUNCTIONS")
    void decode() {
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", Decoding.decode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23));
        assertEquals("KEY ERROR! THE KEY HAS TO BE A NUMBER BETWEEN 1 AND 26\n", Decoding.decode("HELLO WORLD", 27));
    }
}