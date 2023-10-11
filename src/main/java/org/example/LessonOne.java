package org.example;

import java.util.Date;

public class LessonOne {
    // проверить на переполнение
    public static void l1e1(int a, int b){
        assert Integer.MAX_VALUE - a >= b;
        System.out.println(a+b);
    }

    // с НГ проверить
    public static void l1e2(){
        Date date1 = new Date();
        Date date2 = new Date(2024);
        int result = date1.compareTo(date2);
        assert date1.compareTo(date2) < 0 : "Еще 2023 год ;(";
        System.out.println("С новым 2024!");
    }
}
