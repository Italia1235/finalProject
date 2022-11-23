public class Utils {

    public static int checkHowManyTens(int number) {
        return number / 10;
    }

    public static int checkHowManyHundreds(int number) {
        return number / 100;
    }

    public static int checkHowManyThousands(int number) {
        return number / 1000;
    }

    public static int getRestFordivByTen(int number) {
        return number % 10;
    }

    public static int getRestFordivByHundred(int number) {
        return number % 100;
    }

    public static int getRestFordivByThousand(int number) {
        return number % 1000;
    }


    public static int countOfNumber(int value) {
        int count = 1;
        while (value / 10 > 0) {
            count += 1;
            value /= 10;
        }
        return count;
    }

}
