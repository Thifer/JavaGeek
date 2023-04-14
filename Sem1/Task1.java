package Sem1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите высоту");
        int h = myScanner.nextInt();

        System.out.println("Введите высоту");
        int a = myScanner.nextInt();
        System.out.println("Введите высоту");
        int b = myScanner.nextInt();

        System.out.println(gelLen(args,h,a,b));
    }

    static Integer gelLen(Object arg,int h,int a,int b){
        int sum = 0;
        int count = 0;
        while (sum<h){
            count++;
            sum+=a;
            if (sum<h){
               break;
            }
            else {
                sum-=b;
            }

        }
        return count;
    }
}
