import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        // TODO put your code below this comment

        if(phrase == null || phrase == "") return null;

        return Arrays.stream(phrase.split(" "))
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)).collect(Collectors.joining(" "));

    }
}
