package ru.netology.javaqa44;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(3000, false);
        System.out.println("Бонусный балл: " + bonus);
    }
}