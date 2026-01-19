package Section_13_Heranca_Polimorfismo.src.Ex04.Entities;

public class PessoaJuridica extends Pessoa{
    private int numeroFuncionarios;

    public PessoaJuridica(String name, Double rendaAnual, int numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double calcImpost(){
        double imposto = 0.0;
        if (numeroFuncionarios < 10){
            imposto = (rendaAnual * 0.16);
        } else {
            imposto = (rendaAnual * 0.14);
        }
        return imposto;
    };
}
