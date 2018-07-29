import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxRotate {

    public static long maxRot(long n) {
        String nstring = String.valueOf(n);

        return Long.parseLong(rec("0", nstring).stream().reduce((x,y) -> x.compareTo(y) > 0 ? x : y).get());

    }

    public static List<String> rec(String set, String rot) {
        if (rot == "0") return new ArrayList<>(Arrays.asList(set));

        String newSet = moveDigitFromRightToLeft(set, rotate(rot)).get(0);
        String newRot = moveDigitFromRightToLeft(set, rotate(rot)).get(1);

        List<String> newRes = rec(newSet, newRot);
        newRes.add(set + rot);

        System.out.println(newRes);
        return newRes;

    }

    public static String rotate(String rot) {
        return rot.substring(1) + rot.charAt(0);
    }

    public static List<String> moveDigitFromRightToLeft(String left, String right){
        left = left + right.charAt(0);
        right = right.substring(1).equals("") ? "0" : right.substring(1);
        System.out.println(left + "  " + right);
        List<String> res = new ArrayList<>();
        res.add(left);
        res.add(right);
        return res;
    }




}


