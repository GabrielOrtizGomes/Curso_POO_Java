package Section_16_Interfaces.src.EX01.Entities;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Locacao {
    private String modeloCarro;
    private Instant instanteInicial;
    private Instant finalDaLocacao;
    private Double valorHora;
    private Double valorDiaria;

    public Locacao(String modeloCarro, Instant instanteInicial, Instant finalDaLocacao, Double valorHora, Double valorDiaria) {
        this.modeloCarro = modeloCarro;
        this.instanteInicial = instanteInicial;
        this.finalDaLocacao = finalDaLocacao;
        this.valorHora = valorHora;
        this.valorDiaria = valorDiaria;
    }

    private Double calcValorLocacao(){
        Duration duration = Duration.between(instanteInicial, finalDaLocacao);
        double hours = duration.toMinutes() / 60.0;
        if(hours >= 24){
            return Math.ceil(hours / 24.0) * valorDiaria;
        } else {
            return Math.ceil(hours) * valorHora;
        }
    }

    private Double calcImposto(){
        Double valorLocacao = calcValorLocacao();
        if(valorLocacao>100){
            return valorLocacao *0.15;
        }else {
            return valorLocacao *0.20;
        }
    }

    private Double valorTotalLocacao(){
        return calcValorLocacao() + calcImposto();
    }

    public String geraNotaDePagamento(){
        StringBuilder sb = new StringBuilder("NOTA DE PAGAMENTO: ");
        sb.append(String.format("%nValor da locação: %.2f%n", calcValorLocacao()));
        sb.append(String.format("Valor do imposto: %.2f%n", calcImposto()));
        sb.append(String.format("Valor Total da locação: %.2f%n", calcValorLocacao()));
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DADOS DA LOCAÇÃO: ");
        LocalDateTime entradaLocalDateTime = LocalDateTime.ofInstant(instanteInicial, ZoneId.systemDefault());
        LocalDateTime saidaLocalDateTime = LocalDateTime.ofInstant(finalDaLocacao, ZoneId.systemDefault());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        sb.append(String.format("%nModelo veículo: %s%n", modeloCarro));
        sb.append(String.format("Data de entrada: %s%n", entradaLocalDateTime.format(dtf)));
        sb.append(String.format("Data de saída: %s%n", saidaLocalDateTime.format(dtf)));
        sb.append(geraNotaDePagamento());
        return sb.toString();
    }
}
