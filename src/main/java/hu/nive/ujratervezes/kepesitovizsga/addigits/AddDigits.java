package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {

        if (input == null) {
            return -1;
        }

        if (input.isEmpty()) {
            return -1;
        }

        else {

            int sum = 0;
            for (char c : input.toCharArray()) {


                if (Character.isDigit(c)) {
                    sum = sum + Integer.parseInt(String.valueOf(c));
                }

            }
            return sum;
        }
    }
}
