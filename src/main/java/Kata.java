import java.util.Arrays;
import java.util.Comparator;

public class Kata {

    public static String high(String words){
        return Arrays.stream(words.split(" ")).max(Comparator.comparingInt(s -> s.chars().map(c -> c - 'a' + 1).sum())).get();
    }

}