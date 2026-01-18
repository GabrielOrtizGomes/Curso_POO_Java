package Section_12_Enumeracoes_Composicao.src.Entities.Ex01;

import Section_12_Enumeracoes_Composicao.src.Entities.Ex01.Enum.WorkerLevel;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalary;
    private Departament departament;
    private ArrayList<HourContract> hourContracts;

    public Worker() {
    }

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Departament departament) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.departament = departament;
        this.hourContracts = new ArrayList<HourContract>();
    }

    public void addContract(HourContract contract){
        hourContracts.add(contract);
    }

    public void removeContract(HourContract contract){
        hourContracts.remove(contract);
    }

    public Double income(Integer year, Integer month){
        double income = baseSalary;


        for (HourContract contract : hourContracts){
            /*String contactDateString = contract.getDate().toString();
            String[] contactDateStringArray = contactDateString.split("-");
            Integer ano =  Integer.parseInt(contactDateStringArray[0]);
            Integer mes = Integer.parseInt(contactDateStringArray[1]);
            if(ano.equals(year) && mes.equals(month) ){
                income += contract.totalValue();
            }*/
            if( year.equals(contract.getDate().getYear()) &&  month.equals(contract.getDate().getMonthValue()) ){
                income += contract.totalValue();
            }

        }
      return income;
    };

    public Departament getDepartament() {
        return departament;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", workerLevel=" + workerLevel +
                ", baseSalary=" + baseSalary +
                ", departament=" + departament +
                ", hourContracts=" + hourContracts +
                '}';
    }
}
