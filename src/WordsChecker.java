import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>(Arrays.asList(text.toLowerCase().split("\\P{IsAlphabetic}+")));
        while (set.contains(word)) {
            return true;
        }
        return false;
    }
}
