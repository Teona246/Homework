package Homework;

public class Homework9 {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
    }
    static void task1 () {
        System.out.println("task 1");
        String st = "umbrella";
        StringBuilder sb = new StringBuilder();

        for (int i = st.length() - 1; i >= 0; i--) {
            sb.append(st.charAt(i));
        }
        if (st.equals(sb.toString())) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
        System.out.println(sb);
        System.out.println();

    }
    static void task2 () {
        System.out.println("task 2");
        String str = "civic";
        boolean isPalindrome = true;
        char c;
        char c2;
        for (int i = 0; i < (str.length() / 2); i++) {
            c = str.charAt(i);
            c2 = str.charAt(((str.length() - 1) - i));
            if (c == c2) {
                continue;
            }
            isPalindrome = false;
            break;
        }
        if (isPalindrome) {
            System.out.print("Палиндром");
        } else {
            System.out.print("Не палиндром");
        }
        System.out.println();
    }
    static void task3 () {
        System.out.println();
        System.out.println("task 3");

        int num = 1234321;
        boolean isPalindrome = true;
        int reverse = 0;
        while (num != 0) {
            int num2 = num % 10;
            reverse = (reverse * 10) + num2;
            num /= 10;
        }
        for ( int i = num; i != 0; i /= 10) {
            int indexEnd = (i % 10);
            int indexBegin = reverse % 10;

            reverse /= 10;
            if(indexBegin != indexEnd) {
                isPalindrome = false;
            }
        }
        String answer = isPalindrome ? num + " - a palindrome" : num + " - not a palindrome";
        System.out.println(answer);

        // это задание выполнено совместно с Александром Шестаковым и Алексеем Юришиным.

    }
}
