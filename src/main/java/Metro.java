import java.util.ArrayList;
import java.util.stream.Collectors;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!

        return stops.stream().map(list -> list[0] - list[1]).reduce(0, (x,y) -> x+y);
    }
}