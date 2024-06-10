import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String menuChoice;
        do {
            System.out.println("1. Задача 1");
            System.out.println("2. Задача 3");
            System.out.println("3. Задача 3");
            System.out.println("4. Задача 4");
            System.out.println("5. Задача 5");
            System.out.println("6. Задача 6");
            System.out.println("7. Задача 7");
            System.out.println("8. Задача 8");
            System.out.println("9. Задача 9");
            System.out.println("10. Задача 10");
            System.out.print("Выберете пункт меню (выход - q) ");

            menuChoice = new Scanner(System.in).nextLine().toLowerCase();
            switch (menuChoice) {
                case "1":
                    task1();
                    pause();
                    break;
                case "2":
                    task2();
                    pause();
                    break;
                case "3":
                    task3();
                    pause();
                    break;
                case "4":
                    task4();
                    pause();
                    break;
                case "5":
                    task5();
                    pause();
                    break;
                case "6":
                    task6();
                    pause();
                    break;
                case "7":
                    task7();
                    pause();
                    break;
                case "8":
                    task8();
                    pause();
                    break;
                case "9":
                    task9();
                    pause();
                    break;
                case "10":
                    task10();
                    pause();
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Введено некорректное значение.");

            }
        } while (!menuChoice.equals("q"));
        System.out.println("Хорошего дня. Спасибо за проверку ДЗ");

    }

    private static void pause() throws IOException {
        System.out.println("Press Enter to continue...");
        while ((char) System.in.read() != '\n') ;
    }

    private static void task1() {
        for (int i = 1; i <= 10; i++) System.out.println(i);
        System.out.println();
    }

    private static void task2() {
        for (int i = 10; i > 0; i--) System.out.println(i);
        System.out.println();
    }

    private static void task3() {
        for (int i = 0; i <= 17; i += 2) System.out.println(i);
        System.out.println();
    }

    private static void task4() {
        for (int i = 10; i >= -10; i--) System.out.println(i);
        System.out.println();
    }

    private static void task5() {
        /* правильнее конечно делать полноценную проверку на високосный год
        if (i%4==0&&i/100!=0)||(i%400==0) ..
        но в условиях задачи такой "спорный" год только один - 2000, который является високосным
        поскольку делится на 400. Ни и посольку он так же само собой делится на 4, то
        делать дополнительную проверку не имеет смысла. Если бы интревал был не определен заранее,
        а вводился, например, пользователем, то такая проверка была бы обязательна.
         */
        for (int i = 1904; i <= 2096; i += 4) System.out.printf("%d год является високосным%n", i);
        System.out.println();
    }

    private static void task6() {
        for (int i = 7; i <= 98; i += 7) System.out.print(i + " ");
        System.out.println();
    }

    private static void task7() {
        for (int i = 1; i <= 512; i *= 2) System.out.print(i + " ");
        System.out.println();
    }

    private static void task8() {
        int deposit = 29_000;
        for (int i = 1; i <= 12; i++)
            System.out.printf("Месяц %d, сумма накоплений равна %,d рублей%n", i, i * deposit);
        System.out.println();
    }

    private static void task9() {
        int deposit = 29_000;
        double incomePercent = 0, sum = 0;
        float percent = 0.01f;
        for (int i = 0; i < 12; i++) {
            incomePercent += sum * percent;
            sum += deposit + incomePercent;
            System.out.printf("В конце месяца %2d, сумма накопленных процентов - %,9.2f рублей, сумма накоплений - %,10.2f рублей%n", i + 1, incomePercent, sum);
        }
        System.out.println();
    }

    // скучно было выводить таблицу умножения только для 2 :)
    private static void task10() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("\t%d*%d=%d", j, i, j * i);
            }
            System.out.println();
        }
    }
}