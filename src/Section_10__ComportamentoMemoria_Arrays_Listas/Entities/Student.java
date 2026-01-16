package Section_10__ComportamentoMemoria_Arrays_Listas.Entities;

public class Student {
    private String name;
    private double[] grades;
    private String email;
    private int room;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public double averageGrade(){
        double sumGrade = 0;
        for (double grade : this.grades){
            sumGrade += grade;
        }
        return sumGrade / this.grades.length;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }


}
