package rikkeiAcademy;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("giải phương trình bậc nhất có dạng a*x + b= c");
        System.out.println("Nhập vào a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b=scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c=scanner.nextDouble();

        if (a!=0) {
            System.out.println("Phương trình có nghiệm duy nhất x= " + (c - b) / a);
        } else if (a==0) {
            if (b==c){
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
