package BTVN_3;

import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap h");
        int h=sc.nextInt();
        for (int i=1;i<=h;i++){
            for (int j=1;j<=h-i;j++){
                System.out.print(" ");
            }
        for (int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
            System.out.println();
        }
        sc.close();
    }
}
