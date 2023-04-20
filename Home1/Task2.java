package Home1;

import java.util.Scanner;

//Реализовать простой калькулятор
//Минимум -- > Условия + Цикл
//Введите число
//Введите число
//Выберите операцию
//1 - сложить
//2 - умножить
public class Task2 {

    public static void sum(int a,int b){
        int ans = a+b;
        System.out.println("ответ: "+ ans);
    }
    public static void sub(int a,int b){
        int ans = a-b;
        System.out.println("ответ: "+ ans);
    }
    public static void mul(int a,int b){
        int ans = a*b;
        System.out.println("ответ: "+ ans);
    }
    public static void div(int a,int b){
        int ans = a/b;
        System.out.println("ответ: "+ ans);
    }

    public static void main(String[] args) {
        boolean step = true;
        while (step) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            int n = myScanner.nextInt();
            System.out.println("Введите второе число");
            int a = myScanner.nextInt();
            System.out.println("1 - умножение");
            System.out.println("2 - деление");
            System.out.println("3 - сложение");
            System.out.println("4 - вычитание");
            int k = myScanner.nextInt();
            switch (k){
                case 1:mul(n,a);
                    break;
                case 2:div(n,a);
                    break;
                case 3:sum(n,a);
                    break;
                case 4:sub(n,a);
                    break;
                default:break;
            }
            System.out.println("повторить? 1 - да");
            step = myScanner.nextInt() == 1;
        }
    }
}
