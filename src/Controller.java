 class Controller {

    public static void transformNumberToString(){
        UserInput userinput = new UserInputIml();
        int userNumber = userinput.readUserNumber();
        String answer = ChangeMoney.changeAmount(userNumber);
        ConsoleTV.showResult(answer);
    }


}
