package ra.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập vào cạnh A");
            int A = sc.nextInt();
            System.out.println("Nhập vào cạnh B");
            int B = sc.nextInt();
            System.out.println("Nhập vào cạnh C");
            int C = sc.nextInt();
            if (A > 0 && B > 0 && C > 0 && A + B > C && B + C > A && C + A > B) {
                System.out.println(A + " " + " " + B + " " + C + " là cạnh của tam giác ");
                break;
            } else {
                System.out.println("vui lòng nhập lại ");
            }

        }
        while (true);
    }
}
