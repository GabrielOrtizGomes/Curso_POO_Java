package Section_8__IntroducaoPOO.src.Entities;

public class Student {
    private String name;
    private Double firstSemesterGrade;
    private Double secondSemesterGrade;
    private Double thirdSemesterGrade;

    public Double calcAnnualGradesSum(){
        return this.firstSemesterGrade+this.secondSemesterGrade+this.thirdSemesterGrade;
    }

    public String passResult(Double annualAverage){
        String passResult = String.format("FINAL GRADE = %.2f%n", annualAverage);
        if(annualAverage < 60){
            Double missingPoints = 60 - annualAverage;
            passResult = passResult + String.format("FAILED %nMISSING %.2f POINTS",missingPoints);
        }else {
            passResult = passResult + "PASS";
        }

        return passResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFirstSemesterGrade() {
        return firstSemesterGrade;
    }

    public void setFirstSemesterGrade(Double firstSemesterGrade) {
        if(firstSemesterGrade > 30 || firstSemesterGrade<0){
            System.out.println("As notas do primeiro semestre devem ser apenas entre 0 e 30");
        }else {
            this.firstSemesterGrade = firstSemesterGrade;
        }
    }

    public Double getSecondSemesterGrade() {
        return secondSemesterGrade;
    }

    public void setSecondSemesterGrade(Double secondSemesterGrade) {
        if(secondSemesterGrade > 35 || secondSemesterGrade<0){
            System.out.println("As notas do segundo semestre devem ser apenas entre 0 e 35");
        }else {
            this.secondSemesterGrade = secondSemesterGrade;
        }

    }

    public Double getThirdSemesterGrade() {
        return thirdSemesterGrade;
    }

    public void setThirdSemesterGrade(Double thirdSemesterGrade) {
        if(thirdSemesterGrade > 35 || thirdSemesterGrade<0){
            System.out.println("As notas do terceiro semestre devem ser apenas entre 0 e 35");
        }else {
            this.thirdSemesterGrade = thirdSemesterGrade;
        }
    }
}
