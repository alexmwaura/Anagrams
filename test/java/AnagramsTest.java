import org.junit.*;

//import java.util.ArrayList;

import static org.junit.Assert.*;
public class AnagramsTest {
    @Test
    public void returnWords_toTestIfWordsAreCompared_Boolean(){
        Anagrams anagrams= new Anagrams();
        assertTrue(anagrams.returnAnagram("work kowr"));
    }

}