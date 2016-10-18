package ru.itis.humans;

public class Main {

    public static void main(String[] args) {
        // объектная переменная
        Human human;
        // создаю объект и теперь human -
        // указывает на объект

        // new - оператор выделения памяти
        // Human() - конструктор

        human = new Human();
        System.out.println(human.getName());
        // задаю состояние объекта
        //human.name = "Marsel";
        //human.age = 22;
        human.setAge(22);
        human.setName("Marsel");
        // теперь обе объектные переменные указывают
        // на один объект
        // Human human1 = human;
        // human1.age = 50;

        // human.age = -78;

        System.out.println(human.getAge());

        Human human1 = new Human("Almaz", 21);
    }
}
