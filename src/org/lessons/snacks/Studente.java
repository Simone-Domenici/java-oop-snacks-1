package org.lessons.snacks;

public class Studente {
    private String name;
    private String surname;
    private int age;

    public Studente()  {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    public Studente(String name, String surname, int age)  {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    // metodi aggiuntivi

    public String fullInfo() {
        return this.name + " " + this.surname + ", " + this.age + " anni";
    }

}
