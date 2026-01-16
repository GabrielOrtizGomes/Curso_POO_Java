package Section_10__ComportamentoMemoria_Arrays_Listas.Entities;



public class People {
    private String name;
    private int age;
    private double height;
    private char gender;

    public People(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People( double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
}
