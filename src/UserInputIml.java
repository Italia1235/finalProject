import java.util.Scanner;

public class UserInputIml implements UserInput {
    @Override
    public int readUserNumber(){
        System.out.println("Пожалуйста введите стоимость");
         int userNumber=0;
         final int MIN_VALUE=1;
         final int MAX_VALUE=999999;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber >= MIN_VALUE && userNumber <= MAX_VALUE) {
                    return userNumber;
                } else
                    System.out.println("Пожалуйста, введите стоимость от 1 до 999999999");
            }
            else System.out.println("Пожалуйста, введите число");
            scanner.next();
        }
return userNumber;


    }


}
