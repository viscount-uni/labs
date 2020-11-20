package ru.mirea.lab4;

public class Main {

    public static void main(String[] args) {
        Nameable nameable = new Person("Вася", "Пупкин");
        System.out.println(nameable.getName());
        nameable = new Pet("Нига");
        System.out.println(nameable.getName());
    }
}
