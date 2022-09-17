import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        XMLHandler test1 = new XMLHandler();
        TXTHandler test2 = new TXTHandler();
        DOCHandler test3 = new DOCHandler();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите файл: ");

        String a = scanner.next();

        if (a.matches("\\w+.xml")) {
            test1.change();
            test1.open();
            test1.create();
            test1.save();
            System.out.println("Файл формата xml");
        } else if (a.matches("\\w+.txt")) {
            test2.change();
            test2.open();
            test2.create();
            test2.save();
            System.out.println("Файл формата txt");
        } else if (a.matches("\\w+.doc")) {
            test3.change();
            test3.open();
            test3.create();
            test3.save();
            System.out.println("Файл формата doc");
        } else {
            System.out.println("Файл такого формата нет");
        }
    }
}
