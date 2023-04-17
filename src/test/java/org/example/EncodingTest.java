package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {
    @Test
    @DisplayName(value = "TESTING ENCODING FUNCTIONS")
    void encode() {
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", Encoding.encode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
        assertEquals("KEY ERROR! THE KEY HAS TO BE A NUMBER BETWEEN 1 AND 26\n", Decoding.decode("HELLO WORLD", 27));
        assertEquals("KEY ERROR! THE KEY HAS TO BE A NUMBER BETWEEN 1 AND 26\n", Decoding.decode("HELLO WORLD", 0));
    }
}