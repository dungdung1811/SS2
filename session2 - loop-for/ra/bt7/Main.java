package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choise;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Chọn chức năng");
            System.out.println("0. Thoát chương trình");
            System.out.println("1. Tính diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác ");
            System.out.println("3. Tính chu vi và diện tích hình tròn");

            choise = sc.nextInt();

            switch (choise){
                case 0:
                    System.out.println("đã thoát chương trình");
                    break;
                case 1:
                    System.out.println("bắt đầu trương trình ");
                    System.out.println("nhập vào chiều dài");
                    int length = sc.nextInt();
                    System.out.println("nhập vào chiều rộng");
                    int width = sc.nextInt();
                    int area = length*width;
                    int chuvi = 2*(width+length);
                    System.out.println("diện tích hình chữ nhật là "+ area);
                    System.out.println("chu vi hình chữ nhật là "+ chuvi);
                    break;
                case 2:
                    System.out.println("bắt đầu trương trình tính chu vi, diện tích hình chữ nhật ");
                    System.out.println("nhập độ dài cạnh A");
                    int a = sc.nextInt();
                    System.out.println("nhập độ dài cạnh B");
                    int b = sc.nextInt();
                    System.out.println("nhập độ dài cạnh C");
                    int c = sc.nextInt();
                    int cvhtg = a+b+c;
                    int p = a+b+c/2;
                    float s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("chu vi hình tam giác " + cvhtg);
                    System.out.println("Diện tích  hình tam giác " + cvhtg);

                case 3:
                    System.out.println("bắt đầu trương trình tính chu vi, diện tích hình tròn ");
                    System.out.println("nhập vào bán kính");
                    int R = sc.nextInt();
                    final float PI = 3.14f;
                    float cvht = 2*PI*R;
                    float S = (float) (PI*Math.pow(R,2));
                    System.out.println("chu vi hình tròn là " + cvht + "Diện tích hình tròn " + S );

                default:
                    System.out.println("lưa chọn không hợp lệ, xin vui lòng lựa chọn lại");

            }
        }
        while (choise != 0);


    }


}
