import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(maxOccurrences == 0) return new int[0];
        HashMap<Integer, Integer> occurences = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            if (occurences.containsKey(elements[i]) && !(occurences.get(elements[i]) == maxOccurrences)) {
                res.add(elements[i]);
                occurences.put(elements[i], occurences.get(elements[i]) + 1);
            }else if (!occurences.containsKey(elements[i])){
                res.add(elements[i]);
                occurences.put(elements[i], 1);
            }
        }

        System.out.println(res);

        return res.stream().mapToInt(i -> i).toArray();
    }


}