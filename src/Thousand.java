public enum Thousand {
    THO(new String[]{"тысяча", "тысячи", "тысяч"});
    private String[] title;

    private Thousand(String[] title) {
        this.title = title;
    }

    public String oneTwoTreeFourThousand(int amount) {
        if (amount == 1) {
            return title[0];
        }
        if (amount >= 2 && amount <= 4) {
            return title[1];
        } else return title[2];

    }

    public String getThousand(int amount) {
        int countNumber = Utils.countOfNumber(amount);

        if (countNumber == 1) {
            return oneTwoTreeFourThousand(amount);
        }


        if (countNumber == 2) {
            if (amount >= 10 && amount <= 19) {
                return title[2];
            } else {
                int rest = Utils.getRestFordivByTen(amount);
                return oneTwoTreeFourThousand(rest);
            }

        }
        if (countNumber == 3) {
            int rest = Utils.getRestFordivByHundred(amount);


            if (rest >= 10 && rest <= 19) {
                return title[2];
            } else {
                int restTen = Utils.getRestFordivByTen(rest);
                return oneTwoTreeFourThousand(restTen);
            }

        }
        return "Ошибка getThousand";
    }
}
