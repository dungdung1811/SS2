package ra.bt5;

public class Main {
    public static void main(String[] args) {
        int n = 1;

        while (true) {
            if (checkNumber(n)) {
                System.out.println(n);
                break;
            }
            n++;
        }

    }

    public static boolean checkNumber(int number) {
        if (number % 5 == 0 && number % 7 == 0 && number % 11 == 0) {
            return true;
        }
        return false;
    }

}
