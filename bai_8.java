package BTVN_3;

import java.util.Scanner;

public class bai_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n");
        int n=sc.nextInt();
        System.out.println("nhap m");
        int m= sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i==0||i==n-1||j==0||j==m-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
