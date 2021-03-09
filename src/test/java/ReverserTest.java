import com.anagram.Reverser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserTest {
    Reverser reverser = new Reverser();

    @Test
    void letterAnagramProducer_nullAsInParameter_exceptionIsExpected() {
        assertThrows(NullPointerException.class, () -> reverser.letterAnagramProducer(null));
    }

    @Test
    void letterAnagramProducer_stringAsInParameter_reversedStringIsExpected() {

        String initialString = "abcd";
        String expectedOutput = "dcba";
        String actualOutput = reverser.letterAnagramProducer(initialString);

        assertEquals(expectedOutput, actualOutput, "Method produces letters only anagram from initial string");

    }

    @Test
    void letterAnagramProducer_emptyStringAsInParameter_emptyStringIsExpected() {

        String initialString = "";
        String expectedOutput = "";
        String actualOutput = reverser.letterAnagramProducer(initialString);

        assertEquals(expectedOutput, actualOutput, "Method produces letters only anagram from initial string");

    }

    @Test
    void letterAnagramProducer_mixedStringAsInParameter_onlyLettersReveredAreExpected() {

        String initialString = "a!ert ?f12j";
        String expectedOutput = "t!rea ?j12f";
        String actualOutput = reverser.letterAnagramProducer(initialString);

        assertEquals(expectedOutput, actualOutput, "Method produces letters only anagram from initial string");

    }

    @Test
    void letterAnagramProducer_numbersOrSymbolsAsInParameter_sameStringAsInitialIsExpected() {

        String initialString = "12324 ?";
        String expectedOutput = "12324 ?";
        String actualOutput = reverser.letterAnagramProducer(initialString);

        assertEquals(expectedOutput, actualOutput, "Method produces letters only anagram from initial string");

    }
}

