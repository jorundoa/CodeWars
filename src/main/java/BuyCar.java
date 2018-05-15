public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        double currentPercentageLoss = percentLossByMonth;
        int totalSavings = 0;
        double surplus = startPriceOld - startPriceNew;
        int month = 0;
        double currentPriceNew = startPriceNew;
        double currentPriceOld = startPriceOld;

        System.out.println("Surplus: " + surplus + " Old: " + currentPriceOld + " New: " + currentPriceNew);


        while(surplus < 0){

            month++;
            if(month%2 == 0){
                currentPercentageLoss += 0.5;
            }

            totalSavings += savingperMonth;
            currentPriceNew *= (1-currentPercentageLoss/100);
            currentPriceOld *= (1-currentPercentageLoss/100);

            surplus = currentPriceOld + totalSavings - currentPriceNew;
            System.out.println("Surplus: " + surplus + " Old: " + currentPriceOld + " New: " + currentPriceNew+ " %: " + currentPercentageLoss + " Savings: " + totalSavings);

        }

        int[] res = {month, (int) Math.round(surplus)};
        return res;
    }

}