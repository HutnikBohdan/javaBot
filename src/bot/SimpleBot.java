package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a language - for English write eng!");
        System.out.println("Выберете язык - для русского напишите rus!");

        String lang = input.next();
        while (!lang.equalsIgnoreCase("ENG") && !lang.equalsIgnoreCase("RUS")) {
            lang = input.next();
        }
        // Variable
        String name;
        int remainder3;
        int remainder5;
        int remainder7;
        int age;

        if (lang.equalsIgnoreCase("ENG")) {
            System.out.println("Hello! My name is Eva. \nI was created in 2024.");
            System.out.println("Please, remind me your name.");
            name = input.nextLine();
            System.out.printf("What a great name you have, %s!", name);
            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
            remainder3 = input.nextInt();
            remainder5 = input.nextInt();
            remainder7 = input.nextInt();
            age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
            System.out.printf("Your age is %d, that's a good time to start programming!", age);
            System.out.println("Now I will prove to you that I can count to any number you want.");
            int count = input.nextInt();
            for (int i = 0; i <= count; i++) {
                System.out.println(i +"!");
            }
            // System.out.println("Completed, have a nice day!");
            System.out.println("Let's test your programming knowledge.");
            System.out.println("Why do we use methods?");
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");
            int answer = input.nextInt();
            if (answer == 2) {
                System.out.println("Congratulations, have a nice day!");
            } else {
                System.out.println("Please, try again.");
            }


        } else {
            System.out.println("Привет! Меня зовут Ева. \nЯ была создана в 2024 году.");
            System.out.println("Пожалуйста, напомни мне свое имя.");
            name = input.nextLine();
            System.out.printf("Какое у тебя прекрасное имя, %s!", name);
            System.out.println("Дай угадаю твой возраст.");
            System.out.println("Введите остатки от деления вашего возраста на 3, 5 и 7.");
            remainder3 = input.nextInt();
            remainder5 = input.nextInt();
            remainder7 = input.nextInt();
            age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
            System.out.printf("Ваш возраст — %d, это хорошее время, чтобы начать программировать!", age);
            System.out.println("Сейчас я докажу вам, что могу считать до любого числа, которое вы захотите. Напишите ниже число до какого мне посчитать!");
            int count = input.nextInt();
            for (int i = 0; i <= count; i++) {
                System.out.println(i +"!");
            }
            // System.out.println("Готово, хорошего дня!");
            System.out.println("Давайте проверим ваши знания в области программирования.");
            System.out.println("Почему мы используем методы?");
            System.out.println("1. Для многократного повторения оператора.");
            System.out.println("2. Чтобы разложить программу на несколько небольших подпрограмм.");
            System.out.println("3. Определить время выполнения программы.");
            System.out.println("4. Прервать выполнение программы.");
            int answer = input.nextInt();
            if (answer == 2) {
                System.out.println("Поздравляем, хорошего дня!");
            } else {
                System.out.println("Пожалуйста, попробуйте еще раз.");
            }
        }

    }
}

/*package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        int answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("Congratulations, have a nice day!");
        } else {
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}*/
