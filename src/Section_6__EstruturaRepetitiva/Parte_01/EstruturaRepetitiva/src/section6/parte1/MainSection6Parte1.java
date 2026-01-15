package section6.parte1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainSection6Parte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //EX01
    /*System.out.println("Digite a senha:");
    int senha = sc.nextInt();
    while(senha != 2002){
        System.out.println("Senha Invalida");
        System.out.println("Digite a senha:");
        senha = sc.nextInt();
    }
    System.out.println("Acesso Permitido");*/

    //EX02
    /*String entrada = sc.nextLine();
    String[] partes = entrada.split(" ");
    int part01 = Integer.parseInt(partes[0]);
    int part02 = Integer.parseInt(partes[1]);
    while (part01 != 0 && part02 != 0){
       if(part01 > 0 && part02>0){
           System.out.println("primeiro");
       } else if(part01 < 0 && part02 > 0){
           System.out.println("segundo");
       } else if (part01 < 0 && part02 < 0) {
           System.out.println("terceiro");
       } else {
           System.out.println("quarto");
       }
        System.out.println("Digite os quadrantes:");
        entrada = sc.nextLine();
        partes = entrada.split(" ");
        part01 = Integer.parseInt(partes[0]);
        part02 = Integer.parseInt(partes[1]);
        System.out.println(part01+" "+ part02);*/

        //EX03
        System.out.println("Digite o número do combustível");
        int entrada = sc.nextInt();
        int alcoolQtd = 0;
        int gasolinaQtd = 0;
        int dieselQtd = 0;
        while(entrada !=4) {
            switch (entrada) {
                case 1:
                    alcoolQtd++;
                    break;
                case 2:
                    gasolinaQtd++;
                    break;
                case 3:
                    dieselQtd++;
                    break;
                default:
                    break;
            }
            System.out.println("Digite o número do combustível");
            entrada = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO%n" + "Alcool: %d%n"+ "Gasolina: %d%n"
                + "Diesel: %d",alcoolQtd,gasolinaQtd,dieselQtd);

    }
}
