package Home6;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int ans = 9;
        int ram = 0;
        int hdd = 0;
        String OS = "";
        String color = "";
        Scanner myScanner = new Scanner(System.in);
        Laptop laptop1 = new Laptop(2,128,"Windows","red");
        Laptop laptop2 = new Laptop(4,256,"Windows","black");
        Laptop laptop3 = new Laptop(8,512,"Linux","yellow");
        Laptop laptop4 = new Laptop(16,1024,"Linux","white");
        Laptop laptop5 = new Laptop(32,2048,"Windows","black");

        List<Laptop> laptopList = new ArrayList<>();

        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);

        while (ans != 0 ){
            ask();
            ans = myScanner.nextInt();
            switch (ans){
                case 1:
                    System.out.println("Введите минимальное значение Ram");
                    ram = myScanner.nextInt();
                    break;
                case 2:
                    System.out.println("Введите минимальное значение HDD");
                    hdd = myScanner.nextInt();
                    break;
                case 3:
                    System.out.println("Введите OS");
                    OS = myScanner.next();
                    break;
                case 4:
                    System.out.println("Введите цвет");
                    color = myScanner.next();
                    break;
                default:
                    break;
            }
        }
        for(Laptop lap:laptopList){
            if(ram!=0){
                if(lap.getRam()<ram){
                    continue;
                }
            }
            if(hdd!=0){
                if(lap.getHDD()<hdd){
                    continue;
                }
            }
            if(!OS.equals("")){
                if(!lap.getOs().equals(OS)){
                    continue;
                }
            }
            if(!color.equals("")){
                if(!lap.getColor().equals(color)){
                    continue;
                }
            }
            System.out.println(lap);
        }


    }


    private static void ask(){
        System.out.println("Выберете параметр для поиска");
        System.out.println("1 - Ram");
        System.out.println("2 - HDD");
        System.out.println("3 - OS");
        System.out.println("4 - Цвет");
        System.out.println("0 - Вывести результат");
    }
}
