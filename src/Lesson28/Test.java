package Lesson28;

import Lesson28.PackageOne.Person;

public class Test extends Person {
    //private int id;
    protected int id;

    public Test() {
        name = "Boby";
    }


    public static void main(String[] args) {
        // public,
        // private,
        // default - по умолчанию модификатор доступа или называется package laval модификатор доступа пакета,
        // Все что default - доступно в пределах пакета
        // protected  - доступны в пределах 1 пакета, но эти поля или методы доступны вне этого пакета при условии, что
        // эти поля или методы были декларированы
        /*Person pr = new Person();
        pr.setName("Alisterj");*/

    }
    private void technicalMethod() {

    }
}
