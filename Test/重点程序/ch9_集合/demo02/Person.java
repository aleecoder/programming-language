package Java.Test.重点程序.ch9_集合.demo02;

public class Person {

    private String name;

    private long id_card;

    public Person(String name, long id_card) {
        this.name = name;
        this.id_card = id_card;
    }

    public long getId_card() {
        return id_card;
    }

    public void setId_card(long id_card) {
        this.id_card = id_card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

