package com.company;

public class Cat {

    private String name;   // <--- this name мається на увазі
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) { // тут параметр приймає задані аргументи при створені об*єкта
        this.name = name; /** впараметрі використовуємо "String name" як і в змінній екземпляру "private String name",
         тому коли ми пишемо "name =" программа не знає який саме "name" ми маємо на увазі, тому для
         позначеня змінної єкземпляру, використовується слово "this", яке має на увазі
         "private String name", тобто this.name = private String name, а "String name" викор. як параметр*/
        this.age = age;       // те саме і з "this.age"
        this.weight = weight; // те саме і з "this.weight"
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public String getName() {  // дає значення "name" саме в об*єкті
        return name;
    }

    public void setName(String name) { /** викликаємо сеттер "setName" у об*єкта "Cat" і передаємо йому у якості аргумента
     строку (String) і ця строка присвоюється в поле "name" (private String name;) нашого об*єкту */
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {      // не дає присвоїти неправильний вік коту
            this.age = age;
        } else {
            System.out.println("Error! Age can't be negative number!");
            this.age = age;
        }
    }

        public int getWeight () {
            return weight;
        }

        public void setWeight ( int weight){
            this.weight = weight;
        }
    }

