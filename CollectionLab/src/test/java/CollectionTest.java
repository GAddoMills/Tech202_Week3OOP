import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static com.sparta.gam.Lab.*;

public class CollectionTest {

    @Test
    @DisplayName("Given the HashSet with integer 5, makeFiveSet returns 5")
    public void makeFiveSetTestInputFive(){
        HashSet<Integer> exampleFive = new HashSet<Integer>();
        exampleFive.add(5);
        Assert.assertTrue(exampleFive.equals(makeFiveSet(5)));
    }

    @Test
    @DisplayName("Given a HashSet, makeFiveSet returns correct answer")
    public void makeFiveSetTest(){
        HashSet<Integer> exampleFive = new HashSet<Integer>();
        exampleFive.add(5);
        exampleFive.add(10);
        exampleFive.add(15);
        Assert.assertTrue(exampleFive.equals(makeFiveSet(15)));
    }

    @Test
    @DisplayName("Given a phrase, longWordList returns an arrayList with words longer than 5")
    public void longWordListTest(){
        String phrase = "The water bottle is empty";
        ArrayList<String> expected =new ArrayList<>();
        expected.add("water");
        expected.add("bottle");
        expected.add("empty");
        Assert.assertTrue(expected.equals(longWordList(phrase)));
    }

    @Test
    @DisplayName("Given a phrase, longWordList returns an arrayList with repeated words")
    public void longWordListTestRepetition(){
        String phrase = "Longer words might get added to other words";
        ArrayList<String> expected =new ArrayList<>();
        expected.add("Longer");
        expected.add("words");
        expected.add("might");
        expected.add("added");
        expected.add("other");
        expected.add("words");
        Assert.assertTrue(expected.equals(longWordList(phrase)));
    }

    @Test
    @DisplayName("Given a phrase, the method returns a HashMap")
    public void stringToHashMap(){
        String phrase = "Sparta Global";
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "Sparta");
        expected.put(2, "Global");
        Assert.assertTrue(expected.equals(phraseToHashMap(phrase)));
    }


}
