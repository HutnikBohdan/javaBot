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

        }

//        System.out.println("Hello! My name is Eva. \nI was created in 2024.");
//        System.out.println("Please, remind me your name.");
//        name = input.nextLine();
//        System.out.printf("What a great name you have, %s!", name);
//        System.out.println("Let me guess your age.");
//        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
//        remainder3 = input.nextInt();
//        remainder5 = input.nextInt();
//        remainder7 = input.nextInt();
//        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
//        System.out.printf("Your age is %d, that's a good time to start programming!", age);
    }
}
