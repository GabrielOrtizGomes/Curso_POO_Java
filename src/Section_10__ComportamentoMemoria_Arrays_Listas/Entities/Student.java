package Section_10__ComportamentoMemoria_Arrays_Listas.Entities;

public class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double averageGrade(){
        double sumGrade = 0;
        for (double grade : this.grades){
            sumGrade += grade;
        }
        return sumGrade / this.grades.length;
    }

    public String getName() {
        return name;
    }
}
