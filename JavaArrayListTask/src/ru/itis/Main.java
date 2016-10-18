package ru.itis;

public class Main {

    public static void main(String[] args) {
	    IntegerArrayList integerArrayList = new IntegerArrayList();

        // добавление элементов в список
        integerArrayList.add(5);
        integerArrayList.add(3);
        integerArrayList.add(6);
        integerArrayList.add(7);

        // удаление элемента по индексу
        integerArrayList.removeByIndex(2);
        // удаление элемента по значению, true - если элемент найден и удален
        boolean removeResult = integerArrayList.remove(6);

        if (removeResult) {
            System.out.println("Success removed");
        }

        // количество элементов в списке
        System.out.println(integerArrayList.getCount());

        IntegerArrayList sortedIntegerArrayList = IntegerArrayList.sort(integerArrayList);

        int a[] = {3, 2, 1, -6};

        IntegerArrayList byArrayList = IntegerArrayList.createByArray(a);

    }
}
