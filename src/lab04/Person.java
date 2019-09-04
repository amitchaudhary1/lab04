package lab04;

public class Person {

    private String name;
    private int age;
    private char gender;

/*
class Test {
    public static void main(String[] args) {
        Person p1=new Person();

 }*/

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("\nName: " + getName());
        response.append("\nAge: " + getAge());
        response.append("\nGender: " + getGender());
        return response.toString();
    }
}





