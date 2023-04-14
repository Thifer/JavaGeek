package Sem1;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите количество долек по высоте");
        int chocolateH = myScanner.nextInt();
        System.out.println("Введите количество долек по ширине");
        int chocolateL = myScanner.nextInt();
        System.out.println("Введите количество долек, которые надо отломить");
        int chocolateQ = myScanner.nextInt();
        result(args, chocolateH, chocolateL, chocolateQ);
    }
    static void result(Object[] args,int chocolateH, int chocolateL, int chocolateQ){
        int sqareChoco = chocolateL * chocolateH;
        if (chocolateQ < sqareChoco & chocolateQ % chocolateL == 0 | chocolateQ % chocolateH == 0){
            System.out.println("отламывай смело");}
        else{
            System.out.println("Не катит, попробуй другой кусок");
        }
    }
}