package ru.sorokin.lessons.Regexp;

public class Test {
    public static void main(String[] args) {

        /*
        \\d- одна цифра
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до
        (x|y|z) - одна строка из множества строк

        [a-zA-Z] - все английские буквы



        */


        String a="-1122";
        String b="1222";
        String c="+1234";
        System.out.println(a.matches("(-|\\+)?\\d+"));
        System.out.println(b.matches("(-|\\+)?\\d+"));
        System.out.println(c.matches("(-|\\+)?\\d+"));

        String d="ghrh1324464";
        System.out.println(d.matches("[a-zA-Z]*\\d+"));
    }
}
