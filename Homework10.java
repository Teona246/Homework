package Homework;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Collections.replaceAll;

public class Homework10 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        System.out.println("Task 1");

        int[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее значение: " + sum / nums.length);
        System.out.println();
    }

    static void task2() {
        System.out.println("Task 2");
        double[] minMax = {4.5, -2.4, 1.3, -3.5, 5.3, 4.1};
        double min;
        double max;
        max = Arrays.stream(minMax).max().getAsDouble();
        min = Arrays.stream(minMax).min().getAsDouble();
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println();
        // это читерство? Я случайно нашла это, когда играла со словами типа max/min
    }

    static void task3() {
        System.out.println("Task 3");
        char[] letters = {'G', 'r', 'E', 'a', 'T', 'd', 'A', 'y'};
        int countVowels = 0;

        for (char i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u'
                    || letters[i] == 'A' || letters[i] == 'E' || letters[i] == 'I' || letters[i] == 'O' || letters[i] == 'U') {
                countVowels++;
            }
        }
        System.out.println("Количество гласных букв = " + countVowels);
        System.out.println();
    }

    static void task4() {
        System.out.println("Task 4");

        String text = "It was a hard day";
        char[] text1 = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            text1[i] = text.charAt(i);
        }
        System.out.println(Arrays.toString(text1));
        System.out.println(Arrays.toString(text1).replaceAll(" ", "_"));
        System.out.println();
    }
    static void task5() {
        System.out.println("Task 5");

        String sentence = "Pen,Pineapple,Apple,Pen";
        String [] sentenceSplit = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceSplit));
    }
}
