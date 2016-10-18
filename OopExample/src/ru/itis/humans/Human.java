package ru.itis.humans;

public class Human {
    private final String DEFAULT_NAME = "DEFAULT_NAME";
    private final int DEFAULT_AGE = 0;
    // члены класса - поля
    // отвечают за состояние объекта
    // представляют собой переменные
    // private - потому что инкапсуляция
    // сокрытие внутренних данных от некорректного
    // использования
    private int age;
    private String name;

    // конструктор - инциализирует объект
    // задает начальные значения полям объекта
    public Human() {
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
    }

    // конструктор с параметрами
    public Human(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    // методы доступа
    // предоставляют контролируемую возможность
    // работы с состоянием объекта

    //методы-сеттеры, они кладут значение в поле
    public void setAge(int age) {
        if (age >= DEFAULT_AGE) {
            this.age = age;
        } else this.age = DEFAULT_AGE;
    }

    public void setName(String name) {
        this.name = name;
    }

    // методы-геттеры, они возвращают значение поля
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
