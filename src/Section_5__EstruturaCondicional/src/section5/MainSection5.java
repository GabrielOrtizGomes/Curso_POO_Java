package Section_5__EstruturaCondicional.src.section5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Locale;

public class MainSection5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    //EX01
    /*int n = sc.nextInt();

    if (n > 0) {
        System.out.println("Positivo");
    } else {
        System.out.println("Negativo");
    }*/

    //EX02
    /*int n = sc.nextInt();
    if(n % 2 == 0) {
        System.out.println("Par");
    } else if( n == 0){
            System.out.println("Nulo");
    }else {
        System.out.println("Impar");
    }*/

    //EX03
    /*int valorA = sc.nextInt();
    int valorB = sc.nextInt();
    int restoInicioAlgEuclides = 0;
    //Algoritmo de Euclides
    int valorInicialA = valorA;
    int valorInicialB = valorB;

    while (valorB != 0){
        restoInicioAlgEuclides = valorA % valorB;
        valorA = valorB;
        valorB = restoInicioAlgEuclides;
    }
    int mdc = valorA ;

    int mmc = (valorInicialA * valorInicialB)/mdc;

    System.out.printf("MDC: %d %n",mdc);
    System.out.printf("MMC: %d",mmc);*/

    /*String valores = sc.nextLine();
    String[] partes = valores.split(" ");
    int valorA = Integer.parseInt(partes[0]);
    int valorB = Integer.parseInt(partes[1]);
    int resto = 0;
    if (valorA> valorB){
        resto = valorA % valorB;
    }else{
        resto = valorB % valorA;
    }
    if(resto != 0){
        System.out.println("Não são múltiplos");
    }else {
        System.out.println("São múltiplos");
    }*/

    //EX04
    /*String valores = sc.nextLine();
    String[] partes = valores.split(" ");
    int horaInicio = Integer.parseInt(partes[0]);
    int horaFim =Integer.parseInt(partes[1]);
    int duracao = 0;
    if (horaFim > horaInicio){
        duracao = Math.abs(horaInicio - horaFim);
    } else {
        duracao = Math.abs((24 - horaInicio) + horaFim);
    }
    System.out.printf("O JOGO DUROU %d HORA(S)", duracao);*/

    //EX05
    /*String entrada = sc.nextLine();
    String[] partes = entrada.split(" ");
    int codigo = Integer.parseInt(partes[0]);
    int quantidade = Integer.parseInt(partes[1]);
    double totalAPagar = 0.0;

    switch (codigo){
        case 1:
            totalAPagar = quantidade * 4.00;
            break;
        case 2:
            totalAPagar = quantidade * 4.50;
            break;
        case 3:
            totalAPagar = quantidade * 5.00;
            break;
        case 4:
            totalAPagar = quantidade * 2.00;
            break;
        case 5:
            totalAPagar = quantidade * 1.50;
            break;
        default:
            System.out.println("Código inválido");
            break;
    }

    System.out.printf("Total: R$ %.2f", totalAPagar);*/

    //EX06
    /*sc.useLocale((Locale.US));
    double entrada = sc.nextDouble();

    if(entrada < 0.00 || entrada > 100.00){
        System.out.println("Fora de intervalo");
        return;
    }
    if (entrada <= 25.00){
        System.out.println("Intervalo [0,25]");
    } else if (entrada <= 50.00){
        System.out.println("Intervalo (25,50]");
    } else if (entrada <= 75.00){
        System.out.println("Intervalo (50,75]");
    } else {
        System.out.println("Intervalo (75,100]");
    }*/

    //EX07
    /*Locale.setDefault(Locale.US);

    String entrada = sc.nextLine();
    String[] partes = entrada.split(" ");
    double valorX = Double.parseDouble(partes[0]);
    double valorY = Double.parseDouble(partes[1]);
    if(valorY == 0 && valorX ==0){
        System.out.println("Origem");
    } else if (valorX == 0){
        System.out.println("Eixo X");
    } else if (valorY == 0){
        System.out.println("Eixo Y");
    } else if(valorY > 0 && valorX > 0){
        System.out.println("Quadrante 01");
    } else if(valorY > 0  && valorX < 0){
        System.out.println("Quadrante 02");
    } else if (valorY < 0 && valorX < 0){
        System.out.println("Quadrante 03");
    } else {
        System.out.println("Quadrante 04");
    }*/

    //EX08
    Locale.setDefault(Locale.US);
    double renda = sc.nextDouble();
    double imposto = 0.0;
    if(renda <= 2000.0){
        System.out.println("Isento");
    } else if(renda <= 3000.0){
        imposto = (renda - 2000) * 0.08;
    } else if (renda <= 4500) {
        imposto = (1000 * 0.08 )+((renda - 3000) * 0.18);
    } else{
        imposto = ((1000) * 0.08 )+(1500 * 0.18) +((renda - 4500) *0.28);
    }
    System.out.println(imposto);

    }
}
