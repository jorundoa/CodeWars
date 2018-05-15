import org.apache.commons.lang3.StringUtils;

public class Accumul {

    public static String accum(String s) {
        String acc = "";
        for(int i = 0; i < s.length(); i++){
            acc += (Character.toUpperCase(s.charAt(i)) + StringUtils.repeat(Character.toLowerCase(s.charAt(i)), i) + "-");


        }
    return acc.substring(0, acc.length()-1);
    }
}
