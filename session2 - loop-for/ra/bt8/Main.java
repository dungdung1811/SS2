package ra.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập vào cạnh A");
            double A = sc.nextDouble();
            System.out.println("Nhập vào cạnh B");
            double B = sc.nextDouble();
            System.out.println("Nhập vào cạnh C");
            double C = sc.nextDouble();
            if (A > 0 && B > 0 && C > 0 && A + B > C && B + C > A && C + A > B) {
            double chuvi = A + B + C;
            double p = chuvi/2;
            double s = Math.sqrt(p*(p-A)*(p-B)*(p-C));
                System.out.println(" chu vi của tam giác là " + chuvi );
                System.out.println(" diện tich của tam giác là " + s );
                break;
            } else {
                System.out.println("vui lòng nhập lại ");
            }

        }
        while (true);
    }
}
