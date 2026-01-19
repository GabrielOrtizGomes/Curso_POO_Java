package Section_13_Heranca_Polimorfismo.src.Ex04.Entities;

public class PessoaFisica extends Pessoa{
    private Double gastosSaude;

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calcImpost(){
        double imposto = 0.0;
        double descontoGastosSaude = gastosSaude * 0.5;
        if (rendaAnual < 20000){
            imposto = (rendaAnual * 0.15);
        } else {
            imposto = (rendaAnual * 0.25);
        }
        return imposto - descontoGastosSaude;
    };

}
