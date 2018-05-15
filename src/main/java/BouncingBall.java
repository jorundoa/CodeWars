public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        if(!verifyValue(h, bounce, window)) return -1;

        int times = 1;
        h *= bounce;
        while(h > window){
            times += 2;
            h *= bounce;
        }
        return times;
    }


    private static boolean verifyValue(double h, double bounce, double window){
        if(h <= 0) return false;
        if(bounce <= 0 || bounce >=1) return false;
        if(window >= h) return false;
        return true;
    }
}
