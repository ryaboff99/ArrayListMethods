package com.company;

public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 5, 4); // задали параметри об*єкта "Cat"
        String barsikName = barsik.getName(); // назначаємо через геттер, бо не можемо викликати через "this.name" (private)
        int barsikAge = barsik.getAge(); // назначаємо через геттер, бо не можемо викликати через "this.age" (private)
        int barsikWeight = barsik.getWeight(); // назначаємо через геттер, бо не можемо викликати через "this.weight" (private)

        System.out.println("Cats name: " + barsikName); // не можемо викликати через "this.name" бо він "private"
        System.out.println("Cats age: " + barsikAge);   // не можемо викликати через "this.age" бо він "private"
        System.out.println("Cats weight: " + barsik.getWeight()); /** так викликати теж можна, тоді не тереба писати
         int barsikWeight = barsik.getWeight(); */
        System.out.println("First Cats name — " + barsik.getName());
        barsik.setName("Charik"); // через сеттер присвоюэмо нове ім*я коту
        barsik.setAge(-1000); // пробуємо присвоїти неправильний вік коту
        System.out.println("New Cats nameа — " + barsik.getName());
    }
}
