package ru.itis.humans.other;

import static ru.itis.humans.other.A.sum;

public class Main {
    public static void main(String[] args) {

        System.out.println(A.a);
        A a = new A();
        A b = new A();

        a.setA(100);
        System.out.println(b.getA());
        b.setA(50);
        System.out.println(a.getA());

        System.out.println(A.a);

        // статичный метод вызывается непосредственно из класса
        int r = A.sum(6, 7);
        // можно из объекта
        r = a.sum(5,8);

        // благодаря статичному импорту можно вызывать только метод
        r = sum(3, 5);


    }
}
