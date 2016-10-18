package ru.itis.humans.other;

public class A {
    // а - статичное поле
    // глобально для всех объектов
    public static int a ;

    public int b;
    // статичный инициализатор
    static {
        a = 100;
    }

    public int getA() {
        // this.a - можно, потому а - статично, но бесполезно
        return a;
    }

    public void setA(int A) {
        a = A;
    }

    // статичный метод
    public static int sum(int x, int y) {
        // b - нестатичное поле, в статичном контексте использовать нельзя
        // return x + y + b;
        return x + y;
    }
}
