import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class TaskLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo IdealPad 330", 8, 1000, "Windows 10", 17.3, "серебристый");
        Laptop laptop2 = new Laptop("ASUS X751LAV", 6, 512, "Free DOS", 15.6, "чёрный");
        Laptop laptop3 = new Laptop("Huawei MateBook D 15", 16, 512, "Windows 11", 15.6, "серебристый");
        Laptop laptop4 = new Laptop("Apple MacBook Pro", 32, 1000, "MacOs", 13.3, "золотой");
        Laptop laptop5 = new Laptop("MSI Sword 17", 16, 512, "Free DOS", 17.3, "белый");
        Laptop laptop6 = new Laptop("Samsung Galaxy Book 3", 16, 512, "Windows 11", 15.6, "тёмно-серый");
        Laptop laptop7 = new Laptop("Acer Aspire 5", 16, 512, "Eshell", 15.6, "серый");

        // создание можества и добавление в него ноутбуков
        HashSet<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);

        // создание списка критериев
        Map<Integer, String> criterias = new HashMap<>();
        criterias.put(1, "ОЗУ");
        criterias.put(2, "Объём жёсткого диска");
        criterias.put(3, "Операционная система");
        criterias.put(4, "Диагональ");
        criterias.put(5, "Цвет");

        // запрос на пользовательский ввод
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. ОЗУ: ");
        int ramOfUser = scan.nextInt();
        System.out.println("Объём жёсткого диска: ");
        int capacityHDOfUser = scan.nextInt();
        scan.close();

        for (Laptop laptop : laptopSet) {
            if (laptop.getRam() == ramOfUser && laptop.getCapacityHD() == capacityHDOfUser) {
                System.out.println(laptop);
            } else {
                System.out.println("Подходящих параметрам ноутбуков нет.");
                break;
            }
        }        
    }
}
