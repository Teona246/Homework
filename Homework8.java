package Homework;

public class Homework8 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    static void task1 (){
        System.out.println();
        System.out.println("Задание 1");
        System.out.println();

        String text = "0123A456b789c";

        int countDigit1 = 0;
        int countDigit2 = 0;
        int countLetterUpper = 0;
        int countLetterLower = 0;


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isDigit(ch)) {
                if (ch >= '0' && ch < '5') {
                    countDigit1++;
                } else if (ch >= '5' && ch <= '9') {
                    countDigit2++;
                }
            }
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    countLetterUpper++;
                } else if (Character.isLowerCase(ch)) {
                    countLetterLower++;
                }
            }
        }
        System.out.println("Из них цифр от 0 до 4: " + countDigit1);
        System.out.println("Из них цифр от 5 до 9: " + countDigit2);
        System.out.println("Верхний регистр: " + countLetterUpper);
        System.out.println("Нижний регистр: " + countLetterLower);

    }
    static void task2 () {
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        String text = "I like Java!!!";
        System.out.println(text.length());
        System.out.println(text.charAt(13)); //отсчет от 0 до 13

        if (text.endsWith("!!!")) {
            System.out.println("Строка заканчивается на '!!!' ");
        } else {
            System.out.println("Строка не заканчивается на '!!!' ");
        }

        if (text.startsWith("I like")) {
            System.out.println("Строка начинается с 'I like' ");
        } else {
            System.out.println("Строка не начинается с 'I like' ");
        }

        if (text.contains("Java")) {
            System.out.println("Строка содержит подстроку 'Java' ");
        } else {
            System.out.println("Строка не содержит подстроку 'Java' ");
        }

        System.out.println("Позиция подстроки Java - " + text.indexOf("Java"));

        String replacedText = text.replace("a", "o");
        System.out.println("Replaced 'a' with 'o': " + replacedText);

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

    }
    static void task3 () {
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        String t1 = "Watermelon";
        int sub1 = t1.length() / 2;
        int sub11 = sub1 - 1;
        int sub12 = sub1 + 1;
        System.out.println("Watermelon substring: " + t1.substring(sub11, sub12));

        String t2 = "Apples";
        int sub2 = t2.length() / 2;
        int sub21 = sub2 - 1;
        int sub22 = sub2 + 1;
        System.out.println("Apple substring: " + t2.substring(sub21, sub22));

        String t3 = "Orange";
        int sub3 = t3.length() / 2;
        int sub31 = sub3 - 1;
        int sub32 = sub3 + 1;
        System.out.println("Orange substring: " + t3.substring(sub31, sub32));

    }

}