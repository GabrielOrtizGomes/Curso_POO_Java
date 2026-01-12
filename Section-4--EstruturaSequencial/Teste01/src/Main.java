//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main() {

    //EX01:

    Scanner scanner = new Scanner(System.in);
   /* int valor1 = scanner.nextInt();
    int valor2 = scanner.nextInt();

    int soma = valor1 + valor2;

    System.out.println("SOMA = " + soma);*/

    //EX02:

    /*int raio = scanner.nextInt();
    double pi = 3.14159;
    double area = pi * (raio * raio);
    System.out.printf("Area=%.4f%n", area);*/

    //EX03:
    /*int valorA = scanner.nextInt();
    int valorB = scanner.nextInt();
    int valorC = scanner.nextInt();
    int valorD = scanner.nextInt();

    int diferenca = (valorA * valorB) - (valorC * valorD);

    System.out.println("DIFERENCA = " + diferenca);
*/

    //EX04:
    /*System.out.println("Digite o número de registro do funcionário");
    int numeroRegistroFunc = scanner.nextInt();
    System.out.println("Digite o cpf do funcionári:");
    int cpfFunc = scanner.nextInt();
    System.out.println("Digite o número de horas trabalhadas:");
    int horasTrabalhadas = scanner.nextInt();
    System.out.println("Digite o valor que recebe por hora:");
    double valorPorHora = scanner.nextDouble();

    double salario = horasTrabalhadas * valorPorHora;

    System.out.printf("Funcionário:%n" + "Número:%d%n"+ "CPF:%d%n"+"Salário:%.2f",numeroRegistroFunc,cpfFunc,salario);*/

    //EX05:

    /*System.out.println("Digite os dados da peca 1");
    String entradaDadosPeca1 = scanner.nextLine();
    String[] dadosPeca1 = entradaDadosPeca1.split(" ");
    int codigoPeca1 = Integer.parseInt(dadosPeca1[0]);
    int quantidadePeca1 = Integer.parseInt(dadosPeca1[1]);
    double valorUnitarioPeca1 = Double.parseDouble(dadosPeca1[2]);
    System.out.println("Digite os dados da peca 2");
    String entradaDadosPeca2 = scanner.nextLine();
    String[] dadosPeca2 = entradaDadosPeca2.split(" ");
    int codigoPeca2 = Integer.parseInt(dadosPeca2[0]);
    int quantidadePeca2 = Integer.parseInt(dadosPeca2[1]);
    double valorUnitarioPeca2 = Double.parseDouble(dadosPeca2[2]);

    double valorTotalPeca1 = quantidadePeca1 * valorUnitarioPeca1;
    double valorTotalPeca2 = quantidadePeca2 * valorUnitarioPeca2;
    double valorAPagar = valorTotalPeca1 + valorTotalPeca2;
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);*/

    //EX06:

    String[] entradaValores = scanner.nextLine().split(" ");
    double valorA = Double.parseDouble(entradaValores[0]);
    double valorB = Double.parseDouble(entradaValores[1]);
    double valorC = Double.parseDouble(entradaValores[2]);
    double areaTriangulo = (valorA * valorC) / 2;
    double areaCirculo = 3.14159 * (valorC * valorC);
    double areaTrapezio = ((valorA + valorB) * valorC) / 2;
    double areaQuadrado = valorB * valorB;
    double areaRetangulo = valorA * valorB;

    System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
    System.out.printf("CIRCULO: %.3f%n", areaCirculo);
    System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
    System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
    System.out.printf("RETANGULO: %.3f%n", areaRetangulo);










}
