package ru.sorokin.lessons.Regexp;

public class Test {
    public static void main(String[] args) {

        /*
        \\d- одна цифра
        \\w-  [a-zA-Z]одна английская буква
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до
        (x|y|z) - одна строка из множества строк

        [a-zA-Z] - все английские буквы
        [0-9] - \\d
        [^abc] все кроме abc
        . - любой символ
        {2} - 2 символа до (\\d{2})
        {2, } - 2 или более символов (\\d{2, })
        {2,4} - от 2 до 4 символов (\\d{2,4})



        */


        String a="-1122";
        String b="1222";
        String c="+1234";
        System.out.println(a.matches("(-|\\+)?\\d+"));
        System.out.println(b.matches("(-|\\+)?\\d+"));
        System.out.println(c.matches("(-|\\+)?\\d+"));

        String d="ghrh1324464";
        System.out.println(d.matches("[a-zA-Z31]*\\d+"));
        String e="helloc";
        System.out.println(e.matches("[^abc]*"));

        String url="http://www.google.com";
        String uri2="http://www.yundex.ru";
        String url3="Hello there";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(uri2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f="12";
        System.out.println(f.matches("\\d{2}"));
    }
}
