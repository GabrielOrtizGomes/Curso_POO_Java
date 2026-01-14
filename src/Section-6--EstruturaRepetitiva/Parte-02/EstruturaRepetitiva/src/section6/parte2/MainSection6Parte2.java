package section6.parte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainSection6Parte2 {
    public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    //EX01
    /*int entrada = sc.nextInt();

    for (int i = 0; i <= entrada; i++ ){
        if(i%2 !=0){
            System.out.println(i);
        }
    }*/

    //EX02
    /*int n = sc.nextInt();
    int x = 0;
    int in = 0;
    int out =0;

    for(int i =1; i <= n;i++){
        x = sc.nextInt();
        if(x >= 10 && x <= 20){
            in++;
        }else {
            out++;
        }
    }
    System.out.printf("%d in %n" + "%d out",in,out);*/

    //EX03

    /*int n = sc.nextInt();
    ArrayList<Double> mediasPonderadas = new ArrayList<Double>();
    sc.nextLine(); // consome a quebra de linha após o número
    for (int i = 1; i <= n; i++){
        String entrada = sc.nextLine();

        String[] partes = entrada.split(" ");
        double casoTeste01 = Double.parseDouble(partes[0]);
        double casoTeste02 = Double.parseDouble(partes[1]);
        double casoTeste03 = Double.parseDouble(partes[2]);

        double soma = ((casoTeste01*2)+(casoTeste02*3)+(casoTeste03*5));
        double mediaPonderada = soma / 10;
        mediasPonderadas.add(mediaPonderada);
    }
    for (Double media : mediasPonderadas) {
        System.out.printf("%.1f%n", media);
    }
    sc.close();*/


        //04
        /*int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Double> resultados = new ArrayList<Double>();

        for(int i = 0; i< n; i++){
            String entrada = sc.nextLine();
            String[] entradaPartes = entrada.split(" ");
            Double numerador = Double.parseDouble(entradaPartes[0]);
            Double denominador = Double.parseDouble(entradaPartes[1]);
            Double resultado;
            if(denominador == 0){
                resultado = Double.NaN; //Converte o tipo Double em um not a number que é uma abordagem melhor para ser usado do que o "null" pois não gera excessões se usado em calculos.
            }else{
                resultado = numerador / denominador;
            }
            resultados.add(resultado);

        }
        for(Double resultado : resultados){
            if (Double.isNaN(resultado)){
                System.out.println("divisao impossivel");
            }else {
                System.out.println(resultado);
            }
        }*/

        //05

        /*int n = sc.nextInt();
        int fatorial = 1;
        for (int i =0; i<n; i++) {
            fatorial *= (n-i);
        }
        System.out.println(fatorial);*/

        //06
        /*int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }*/

        //07

        /*int n = sc.nextInt();

        for (int i = 1; i<=n;i++){
            System.out.printf("%d %d %d%n", i, (int)(Math.pow(i,2)),(int)(Math.pow(i,3)));
        }*/

    }
}
