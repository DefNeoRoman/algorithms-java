package seo.dale.algorithm.anagram;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AnagramsTest {

    @Test
    public void testGetAnagrams() {
        List<String> words = Arrays.asList("warned", "apple", "andrew", "samsung", "battle", "korea", "japan");
        Anagrams anagrams = new Anagrams(words);
        assertEquals(Arrays.asList("warned", "andrew"), anagrams.getAnagrams("wander"));
    }

}
