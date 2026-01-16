package Section_10__ComportamentoMemoria_Arrays_Listas;

import java.util.Locale;
import java.util.Scanner;

public class MainSection10 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EX01 NEGATIVOS
        /*System.out.print("Quantos números voce vai digitar?");
        int n = sc.nextInt();
        if (n>10){
            System.out.println("Devem ser no máximo 10 números");
        }else {
            int[] negativeNumbers = new int[n];
            for (int i = 0; i<n;i++){
                System.out.print("Digite um número:");
                int number = sc.nextInt();
                negativeNumbers[i] = number;
                }
            System.out.println("NUMEROS NEGATIVOS:");
            for (int negativeNumber : negativeNumbers){
                if(negativeNumber < 0){
                    System.out.println(negativeNumber);
                }
            }

        }*/

        //EX02 SOMA_VETOR

        /*System.out.print("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        Double[] numbers = new Double[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um número:");
            Double number = sc.nextDouble();
            numbers[i] = number;
        }
        Double soma = 0.0;
        for (Double number : numbers){
            soma += number;
        }
        Double media = soma/ numbers.length;
        StringBuilder sb = new StringBuilder("VALORES = ");
        for (double number : numbers){
            sb.append(String.format("%.1f ",number));
        }


        System.out.println(sb);
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f", media);*/

        //EX03 ALTURAS

        /*System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        People[] peoples = new People[n];
        int peopleUnderAge16Count = 0;

        for (int i = 0; i<n; i++){
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            if(age <16){
                peopleUnderAge16Count++;
            }
            People people = new People(name,age,height);
            peoples[i] = people;
        }
        double sumHeights = 0.0;
        for (People people : peoples){
            sumHeights += people.getHeight();
        }
        double averageHeights = sumHeights/ peoples.length;
        double peopleUnderAge16Percentage = (peopleUnderAge16Count * 100)/ (double) peoples.length;
        System.out.printf("%nAltura média: %.2f%n",averageHeights);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", peopleUnderAge16Percentage);
        for (People people : peoples){
            if (people.getAge() < 16){
                System.out.println(people.getName());
            }
        }*/

        //EX04 NUMEROS_PARES

        /*System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int countEvenNumbers = 0;

        Integer[] numbers = new Integer[n];
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<n; i++){
            System.out.print("Digite um número: ");
            int number = sc.nextInt();;
            numbers[i] = number;
            if (number%2 == 0){
                sb.append(String.format("%d ", number));
                countEvenNumbers++;
            }
        }

        System.out.println("NUMEROS PARES:");
        System.out.println(sb);
        System.out.printf("QUANTIDADE DE PARES = %d", countEvenNumbers);*/

        //EX05 MAIOR_POSICAO

        /*System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        System.out.print("Digite um número: ");
        numbers[0] = sc.nextDouble();

        double highestValue = numbers[0];
        int highestValuePosition = 0;
        for (int i = 1; i < n; i++){
            System.out.print("Digite um número: ");
            double number = sc.nextDouble();
            numbers[i] = number;
            if(number > highestValue){
                highestValue = number;
                highestValuePosition = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n" , highestValue);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", highestValuePosition);*/


        //EX06 SOMA_VETORES

        /*System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] ABsum = new int[n];

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < n; i++){

            A[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            ABsum[i] = A[i] + B[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int value : ABsum){
            System.out.println(value);
        }*/

        //EX07 ABAIXO_DA_MEDIA

        /*System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] values = new double[n];

        for (int i = 0; i< n;i++){
            System.out.print("Digite um número: ");
            values[i] = sc.nextDouble();
        }
        double sumValues = 0;
        for (double value :values){
            sumValues += value;
        }
        double average = sumValues / values.length;

        System.out.printf("MEDIA DO VETOR = %.3f%n", average);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (double value :values){
            if (value < average){
                System.out.println(value);
            }
        }*/

        //EX08 MEDIA_PARES

        /*System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] values = new int[n];


        for (int i = 0; i< n;i++){
            System.out.print("Digite um número: ");
            values[i] = sc.nextInt();
        }

        double evenNumbersSum = 0;
        int evenNumberscount = 0;

        for (int number : values){
            if(number%2 == 0){
                evenNumbersSum += number;
                evenNumberscount++;
            }
        }

        double average = evenNumbersSum / evenNumberscount;

        if (evenNumberscount == 0){
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            System.out.printf("MÉDIA DOS PARES = %.1f", average);
        }*/


        //EX09 MAIS_VELHO

        /*System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        People[] peoples = new People[n];

        System.out.printf("Dados da %da pessoa:%n", 1);
        System.out.print("Nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Idade: ");
        int age = sc.nextInt();
        People people = new People(name,age);
        peoples[0] = people;
        People oldestPeople = people;

        for (int i = 1; i< n; i++){
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();

            people = new People(name,age);
            peoples[i] = people;
            if (oldestPeople.getAge() < people.getAge()){
                oldestPeople = people;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", oldestPeople.getName());*/

        //EX10 APROVADOS

        /*System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i<n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i+1);
            sc.nextLine();
            String name = sc.nextLine();
            double[] grades = new double[2];
            grades[0] = sc.nextDouble();
            grades[1] = sc.nextDouble();

            Student student = new Student(name,grades);
            students[i] = student;
        }

        System.out.println("Alunos aprovados:");
        for (Student student : students){
            if(student.averageGrade() >= 6){
                System.out.println(student.getName());
            }
        }*/

        //EX11 DADOS_PESSOAIS

        /*System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        People[] peoples = new People[n];

        System.out.printf("Altura da %da pessoa: ",1);
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Gênero da %da pessoa: ",1);
        char gender = sc.next().charAt(0);

        People people = new People(height, gender);

        peoples[0] = people;

        People minHeightPeople = people;
        People maxHeightPeople = people;

        for (int i = 1; i<n; i++){
            System.out.printf("Altura da %da pessoa: ",i+1);
            height = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ",i+1);
            gender = sc.next().charAt(0);

            people = new People(height, gender);
            if (people.getHeight() < minHeightPeople.getHeight()){
                minHeightPeople = people;
            }
            if (people.getHeight() > maxHeightPeople.getHeight()){
                maxHeightPeople = people;
            }

            peoples[i] = people;
        }

        double sumWomanHeights = 0;
        int womansCount = 0;

        for (People p : peoples){
            if(Character.toUpperCase(p.getGender())  == 'F'){
                sumWomanHeights += p.getHeight();
                womansCount++;
            }
        }
        double averageWomanHeights = sumWomanHeights / womansCount;

        System.out.printf("Menor altura = %.2f%n" , minHeightPeople.getHeight());
        System.out.printf("Maior altura = %.2f%n" , maxHeightPeople.getHeight());
        System.out.printf("Média das alturas das mulheres = %.2f%n", averageWomanHeights);
        System.out.printf("Número de homens = %d", peoples.length - womansCount);*/


        //PART 02
        //EX PENSIONATO

        /*System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Student[] rooms = new Student[10];
        if(n >10) {
            System.out.println("There are only 10 rooms");
        } else {
            for (int i= 0; i<n; i++){
                System.out.printf("Rent #%d:%n", i+1);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Room: ");
                int numberRoom = sc.nextInt();
                if(numberRoom<1 || numberRoom > rooms.length){
                    System.out.println("Invalid room number. Choose between 1 and 10.");
                    i--;
                    continue;
                }
                if (rooms[numberRoom -1] == null){
                    rooms[numberRoom -1] = new Student(name, email, numberRoom);
                } else {
                    System.out.printf("Room %d is already occupied%n", numberRoom);
                    i--;
                    continue;
                }
            }

            System.out.println("Busy rooms:");
            for (Student student : rooms){
                if (student != null) {
                    System.out.printf("%d: %s, %s%n",student.getRoom(),student.getName(), student.getEmail());
                }
            }

        }*/

        //PART 03
        //EX Enterprise

        /*System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<Employee>();

        for (int i =0; i<n; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            sc.nextLine();
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary= sc.nextDouble();

            Employee employee = new Employee(id, name,salary);
            employees.add(employee);
        }

        System.out.print("Enter the employee id tha will have salary increase: ");
        int idEmployee = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double increaseSalaryPercent = sc.nextDouble();
        employees.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null).increaseSalary(increaseSalaryPercent);

        System.out.println("List of employees:");
        for (Employee employee : employees){
            System.out.print(employee);
        }*/

        //PART 04
        //EX Enterprise

        String matrizSize = sc.nextLine();
        String[] matrizSizeParts = matrizSize.split(" ");
        int m = Integer.parseInt(matrizSizeParts[0]);
        int n = Integer.parseInt(matrizSizeParts[1]);


        int[][] matriz = new int[m][n];

        for (int i = 0; i<m; i++){
            String matrizValues = sc.nextLine();
            String[] matrizValuesParts = matrizValues.split(" ");
            for (int j=0; j<n;j++){
                matriz[i][j]  = Integer.parseInt(matrizValuesParts[j]);
            }
        }

        for (int[] value : matriz){
            for (int v: value){
                System.out.print(v + " ");
            }
            System.out.printf("%n");
        }

        int positionValue = sc.nextInt();
        int positionValue01= 0;
        int positionValue02 = 0;
        boolean found = false;
        for (int i = 0; i<m && !found; i++){
            for (int j=0; j<n;j++){
                if (matriz[i][j] == positionValue){
                    positionValue01 = i;
                    positionValue02 = j;
                    System.out.printf("Position %d, %d%n", positionValue01, positionValue02);
                    if (positionValue02 >0){
                        System.out.printf("Left: %d%n", matriz[positionValue01][positionValue02-1]);
                    }

                    if(positionValue02< matriz.length){
                        System.out.printf("Right: %d%n", matriz[positionValue01][positionValue02+1]);
                    }

                    if (positionValue01 >0){
                        System.out.printf("Up: %d%n", matriz[positionValue01 -1][positionValue02]);
                    }

                    if(positionValue01< matriz[0].length){
                        System.out.printf("Down: %d%n", matriz[positionValue01 +1][positionValue02]);
                    }
                }
            }
        }






    }
}
