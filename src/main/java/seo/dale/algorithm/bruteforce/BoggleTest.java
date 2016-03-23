package seo.dale.algorithm.bruteforce;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BoggleTest {

    @Test
    public void testHasWord() {
        char[][] metrix = {
                {'U', 'R', 'L', 'P', 'M'},
                {'X', 'P', 'R', 'E', 'T'},
                {'G', 'I', 'A', 'E', 'T'},
                {'X', 'T', 'N', 'Z', 'Y'},
                {'X', 'O', 'Q', 'R', 'S'}
        };

        Boggle boggle = new Boggle(metrix);
        assertTrue(boggle.hasWord(1, 1, "PRETTY"));
        assertTrue(boggle.hasWord(2, 0, "GIRL"));
        assertTrue(boggle.hasWord(1, 2, "REPEAT"));
        assertFalse(boggle.hasWord(2, 2, "YES"));
    }

}
