import java.util.*;

class basiclib{

    public static int[] roll(int n){
        int[] rollDice = new int[n];
        for (int i = 0; i < rollDice.length; i++) {
            rollDice[i] = (int) (Math.random() * 6 + 1);
        }
        return rollDice;
    }

    public static boolean containsDuplicates(int[] arr){
        ArrayList<Integer> testArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            testArr.add(arr[i]);
            if (testArr.indexOf(arr[i]) != i) {
                return true;
            }

        }
        return false;
    }

    public static double calculating_Averages(int[] arr){
        double summation = 0;
        for (int i = 0 ; i < arr.length ; i++){
            summation+=arr[i];
        }
        return summation/arr.length;
    }

    public static int[] Arrays_of_Arrays(int[][]arr){
        double minValue = 10000000;
        double sum = 0;
        int indexRow = 0;
        for (int row = 0 ; row < arr.length ; row ++){
            sum = 0;
            for (int col = 0 ; col < arr[row].length ; col++){
                sum+=arr[row][col];
            }
            if ((sum / arr[row].length) < minValue){
                minValue = sum / arr[row].length;
                indexRow = row;
            }
        }
        return arr[indexRow];
    }

    public static void main(String[] args){
        System.out.println("Hello Lab2!");
        System.out.println(Arrays.toString(roll(5)));
        int[] testArr = {1,2,3,4,2} ;
        System.out.println(containsDuplicates(testArr));
        System.out.println(calculating_Averages(testArr));
        int[][] arr = {{6,7,8,9,10} , {1,2,3,4,5} , {11,12,13,14,15}};
        System.out.println(Arrays.toString((Arrays_of_Arrays(arr))));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString((Arrays_of_Arrays(weeklyMonthTemperatures))));
    }
}