public enum Valuta {

    RUB(new String[]{"рубль", "рубля", "рублей"});
    private String[] title;

    private Valuta(String[] title) {
        this.title = title;
    }

    public String getOneThreeNumberSuffix(int amount) {
        int countNumber = Utils.countOfNumber(amount);
        if (countNumber == 1) {
            if (amount == 1) {
                return title[0];
            }
            if (amount >= 2 && amount <= 4) {
                return title[1];
            } else return title[2];
        }
        if (countNumber == 2) {
            if (amount >= 10 && amount <= 19) {
                return title[2];
            } else {
                int rest = Utils.getRestFordivByTen(amount);
                if (rest == 1) {
                    return title[0];
                }
                if (rest >= 2 && rest <= 4) {
                    return title[1];
                } else return title[2];
            }

        }
        if (countNumber == 3) {
            int rest = Utils.getRestFordivByHundred(amount);
            if (rest >= 10 && rest <= 19) {
                return title[2];
            } else {
                int restTen = Utils.getRestFordivByTen(rest);
                if (restTen == 1) {
                    return title[0];
                }
                if (restTen >= 2 && restTen <= 4) {
                    return title[1];
                } else return title[2];
            }
        }
        return "Ошибка getOneThreeNumberSuffix";
    }

    public String getSuffix(int amount) {

        int count = Utils.countOfNumber(amount);

        if (count <= 3) {
            return getOneThreeNumberSuffix(amount);
        }

       else {
            int rest = Utils.getRestFordivByThousand(amount);
            return getOneThreeNumberSuffix(rest);
        }

    }

}


