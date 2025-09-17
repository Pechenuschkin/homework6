//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task # 1
        System.out.println(" Task # 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        // Task # 2
        System.out.println();
        System.out.println(" Task # 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(" i = " + i);
        }
        //Task # 3
        System.out.println();
        System.out.println(" Task # 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(" i = " + i);
        }
        // Task # 4
        System.out.println();
        System.out.println(" Task # 4 ");
        for (int i = 10; i >= -10; i--) {
            System.out.println(" i = " + i);
        }
        //Task # 5
        System.out.println();
        System.out.println(" Task # 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + "  год является високосным ");
        }
        // Task # 6
        System.out.println();
        System.out.println(" Task # 6 ");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(" i = " + i);
        }
        // Task # 7
        System.out.println();
        System.out.println(" Task # 7 ");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(" i = " + i);
        }
        // Task # 8
        System.out.println();
        System.out.println(" Task # 8 ");
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total + "  рублей ");
        }
        // Task # 9
        System.out.println();
        System.out.println(" Task # 9 ");
        int contribution1 = 29000;
        double total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + (total1 * 1 / 100);
            total1 = total1 + contribution1;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total1 + "  рублей ");
        }
        // Task # 10
        System.out.println();
        System.out.println(" Task # 10");
        int a = 2;
        int b = 1;
        for (int i = 1; i <= 10; i++) {
            a = b * 2;
            b = b + 1;
            System.out.println(" 2 * " + i + " = " + a);
        }
    }
}