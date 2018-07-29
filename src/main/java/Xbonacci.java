import java.util.Arrays;
public class Xbonacci {

    public double[] xbonacci(double[] signature, int n) {
        printarray(signature);
        System.out.println("Size: "+ n);

        double[] res = new double[(signature.length < n ? signature.length : n)];
        for(int i = 0; i < (signature.length < n ? signature.length : n); i++){
            res[i] = signature[i];
        }
        for(int i = signature.length; i < res.length; i++){
            double sum = 0;
            for(int j = i-signature.length; j < i; j++){
                sum+= res[j];
            }
            res[i] = sum;
        }
        printarray(res);

        return res;
    }


    private static void printarray(double[] arr){
        Arrays.stream(arr).forEach(d -> System.out.print(" "+ d));
        System.out.println(" ");
    }
}