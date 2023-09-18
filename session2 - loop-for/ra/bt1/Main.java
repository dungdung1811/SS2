package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("nhap gia tri ban dau");
        int dau = sc.nextInt();
        System.out.println("nhap gia tri cuoi");
        int cuoi = sc.nextInt();
        for (int i = dau; i <= cuoi; i++) {
            if (checkNumber(i)) {
                sum += i;

            }
        }
        System.out.println(sum);
    }

    public static boolean checkNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }
}
