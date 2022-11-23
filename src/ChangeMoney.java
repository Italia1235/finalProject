
class ChangeMoney {

    static Thousand thousand;

    public static String changeAmount(int amount) {
        int numberOfTens = Utils.countOfNumber(amount);
        if (numberOfTens <= 3) {
            return getThreeNumbersToString(amount) + " " + Valuta.RUB.getSuffix(amount);
        }

        if (numberOfTens <= 6) {
            int countThousand = Utils.checkHowManyThousands(amount);
            int rest = Utils.getRestFordivByThousand(amount);
            if (rest == 0 && countThousand <= 9) {
                return getUtilsForThousand(countThousand) + " " + Thousand.THO.getThousand(countThousand) + " " + Valuta.RUB.getSuffix(amount);
            } else if (countThousand <= 9) {
                return getUtilsForThousand(countThousand) + " " + Thousand.THO.getThousand(countThousand) + " " + getThreeNumbersToString(rest) + " " + Valuta.RUB.getSuffix(amount);
            } else
                return getThreeNumbersToStringforThousand(countThousand) + " " + Thousand.THO.getThousand(countThousand) + " " + getThreeNumbersToString(rest) + " " + Valuta.RUB.getSuffix(amount);
        }


        return "error";
    }

    public static String getThreeNumbersToString(int amount) {
        long numberOfTens = Utils.countOfNumber(amount);
        if (numberOfTens == 1) {
            return getUtils(amount);
        }
        if (numberOfTens == 2) {
            int rest = Utils.getRestFordivByTen(amount);
            int countTens = Utils.checkHowManyTens(amount);
            if (rest != 0 && countTens == 1) {
                return getTenNineteen(rest);
            } else return getTens(countTens) + " " + getUtils(rest);
        }

        if (numberOfTens == 3) {
            int rest = Utils.getRestFordivByHundred(amount);
            int countHundred = Utils.checkHowManyHundreds(amount);
            int countTens = Utils.checkHowManyTens(rest);
            int restByTen = Utils.getRestFordivByTen(rest);
            if (rest == 0) {
                return getHundreds(countHundred);
            }
            if (rest <= 9) {
                return getHundreds(countHundred) + " " + getUtils(rest);
            } else if (rest <= 19) {
                return getHundreds(countHundred) + " " + getTenNineteen(rest - 10);
            } else {
                return getHundreds(countHundred) + " " + getTens(countTens) + " " + getUtils(restByTen);
            }

        } else return "Error";
    }

    public static String getThreeNumbersToStringforThousand(int amount) {
        long numberOfTens = Utils.countOfNumber(amount);
        if (numberOfTens == 1) {
            return getUtilsForThousand(amount);
        }
        if (numberOfTens == 2) {
            int rest = Utils.getRestFordivByTen(amount);
            int countTens = Utils.checkHowManyTens(amount);
            if (rest != 0 && countTens == 1) {
                return getTenNineteen(rest);

            } else return getTens(countTens) + " " + getUtilsForThousand(rest);
        }

        if (numberOfTens == 3) {
            int rest = Utils.getRestFordivByHundred(amount);
            int countHundred = Utils.checkHowManyHundreds(amount);
            int countTens = Utils.checkHowManyTens(rest);
            int restByTen = Utils.getRestFordivByTen(rest);
            if (rest == 0) {
                return getHundreds(countHundred);
            }
            if (rest <= 9) {
                return getHundreds(countHundred) + " " + getUtilsForThousand(rest);
            } else if (rest <= 19) {
                return getHundreds(countHundred) + " " + getTenNineteen(rest - 10);
            } else {
                return getHundreds(countHundred) + " " + getTens(countTens) + " " + getUtilsForThousand(restByTen);
            }

        } else return "Error";
    }

    //считаем единицы
    public static String getUtils(int value) {
        String[] oneTen = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        return oneTen[value];
    }

    public static String getTens(int value) {
        String[] dozens = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        return dozens[value];
    }


    public static String getTenNineteen(int value) {
        String[] tenNineteen = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        return tenNineteen[value];

    }

    public static String getHundreds(int value) {
        String[] hundred = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        return hundred[value];
    }


    public static String getUtilsForThousand(int value) {
        String[] oneTen = {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        return oneTen[value];
    }

    public static String getThousands(int value) {
        String[] thousand = {"тысяча", "тысячи", "тысяч"};
        int countThousands = Utils.checkHowManyThousands(value);
        int rest = value % 1000;
        String numberThousand = getUtilsForThousand(countThousands);
        if (rest == 0) {
            if (countThousands == 1) {
                return numberThousand + " " + thousand[0];
            }
            if (countThousands <= 4) {
                return numberThousand + " " + thousand[1];
            } else
                return numberThousand + " " + thousand[2];
        } else {
            if (countThousands == 1) {
                return numberThousand + " " + thousand[0] + getHundreds(rest);
            }
            if (countThousands <= 4) {
                return numberThousand + " " + thousand[1] + getHundreds(rest);
            } else
                return numberThousand + " " + thousand[2] + getHundreds(rest);
        }
    }






}
