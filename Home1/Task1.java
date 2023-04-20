//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Home1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления");
        int n = myScanner.nextInt();
        int sum = 0;
        int fact = 1;

        for (int i=1;i<=n;i++){
            sum+=i;
            fact*=i;
        }

        System.out.println(sum);
        System.out.println(fact);
    }
}
