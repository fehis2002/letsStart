package be.vives.ti;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @org.junit.jupiter.api.Test
    void appendIfMissingWithSuffix() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hallo!", "!");
        assertEquals(result, "hallo!");
    }

    @org.junit.jupiter.api.Test
    void appendIfMissingWithout() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hallo", "!");
        assertEquals(result, "hallo!");
    }
}