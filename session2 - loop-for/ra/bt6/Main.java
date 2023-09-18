package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chose;
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy chọn 1 chức nằng: ");
        System.out.println("0: Thoát chương trình: ");
        System.out.println("1: Kiểm tra tính chẵn lẻ: ");
        System.out.println("2: Kiểm tra số nguyên tố: ");
        System.out.println("3: Kiểm tra 1 số chia hết cho 3: ");

        chose = sc.nextInt();


        do {
            switch (chose) {
                case 0:
                    System.out.println("Đã thoát chương trình");
                    break;
                case 1:
                    System.out.println("Bắt đầu chương trình kiểm tra tính chẵn lẻ của 1 số");
                    System.out.println("Nhâp vào 1 số");
                    int number = sc.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " Là số chẵn");
                        break;
                    } else {
                        System.out.println(number + " Là số lẻ");
                        break;
                    }
                case 2:
                    System.out.println("Bắt đầu chương trình kiểm tra số nguyên tố");
                    System.out.println("Nhâp vào số bất kì");
                    int primer = sc.nextInt();
                    if (checkPrimer(primer)) {
                        System.out.println(primer + "là số nguyên tố");
                        break;
                    } else {
                        System.out.println(primer + " không phải số nguyên tố");
                        break;
                    }

                case 3:
                    System.out.println("Bắt đầu chương trình kiểm tra số chia hết cho 3");
                    System.out.println("Nhâp vào số bất kì");
                    int number2 = sc.nextInt();
                    if (number2 % 3 == 0) {
                        System.out.println(number2 + " Chia hết cho 3");
                        break;
                    } else {
                        System.out.println(number2 + " Không hết cho 3");
                        break;
                    }

                default:
                    System.out.println("lưa chọn không hợp lệ, xin vui lòng lựa chọn lại");
            }


            chose = sc.nextInt();
        }
        while (chose != 0);
    }

    public static boolean checkPrimer(int number) {
        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }


        return true;
    }
}
