package Section_17_Generics_Set_Map.src;

import Section_17_Generics_Set_Map.src.EX03.Entities.Aluno;
import Section_17_Generics_Set_Map.src.EX03.Entities.Curso;
import Section_17_Generics_Set_Map.src.EX03.Entities.Instrutor;
import Section_17_Generics_Set_Map.src.EX04.Entities.Candidato;
import Section_17_Generics_Set_Map.src.EX04.Entities.Eleicao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainSection17 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EX01

        /*List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14,6.28);
        List<Object> myObjects = new ArrayList<Object>();

        System.out.println(copy(myInts));
        System.out.println(copy(myDoubles));
        System.out.println(copy(myObjects));

        copy1(myInts,myObjects);
        copy1(myDoubles,myObjects);

        System.out.println(myObjects);*/

        //EX02

        /*String path = "C:\\Users\\Gabriel Ortiz\\Desktop\\CursoPOOJava\\src\\Section_17_Generics_Set_Map\\src\\EX02\\in.txt";

        Set<LogAcess> logAcesses = new HashSet<LogAcess>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineParts = line.split(" ");

                LogAcess logAcess = new LogAcess(lineParts[0], Instant.parse(lineParts[1]));
                logAcesses.add(logAcess);
            }
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        for (LogAcess logAcess : logAcesses){
            System.out.println(logAcess);
        }
        System.out.printf("Total users: %d", logAcesses.size());*/

        //EX03

        /*long nextId = 1L;
        Instrutor instrutor = new Instrutor(nextId);
        System.out.print("How many students for course A: ");
        int courseAQuantityStudents = sc.nextInt();
        sc.nextLine();
        Curso cursoA = new Curso(1L);
        for (int i = 0; i< courseAQuantityStudents; i++){
            long studentId = Long.parseLong(sc.nextLine());
            cursoA.addAluno(new Aluno(studentId));
        }
        instrutor.addCurso(cursoA);

        System.out.print("How many students for course B: ");
        int courseBQuantityStudents = sc.nextInt();
        sc.nextLine();
        Curso cursoB = new Curso(2L);
        for (int i = 0; i< courseBQuantityStudents; i++){
            long studentId = Long.parseLong(sc.nextLine());
            cursoB.addAluno(new Aluno(studentId));
        }
        instrutor.addCurso(cursoB);

        System.out.print("How many students for course C: ");
        int courseCQuantityStudents = sc.nextInt();
        sc.nextLine();
        Curso cursoC = new Curso(3L);
        for (int i = 0; i< courseCQuantityStudents; i++){
            long studentId = Long.parseLong(sc.nextLine());
            cursoC.addAluno(new Aluno(studentId));
        }
        instrutor.addCurso(cursoC);


        System.out.println("Total students: " + instrutor.allStudentsOfCurses().size());*/

        //EX04

        String path = "C:\\Users\\Gabriel Ortiz\\Desktop\\CursoPOOJava\\src\\Section_17_Generics_Set_Map\\src\\EX04\\Entities\\electronicBallotBoxes.csv";
        Eleicao eleicao = new Eleicao();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null){
                String[] fields = line.split(",");
                eleicao.addCandidato(fields[0], Integer.parseInt(fields[1]));
            }


        }catch (IOException e){
            System.out.println("Erro de carregamento de arquivo: " + e);
        }

        for (Map.Entry<String, Candidato> entry: eleicao.getCandidatos().entrySet()){
            String candidatoName = entry.getKey();
            int votes = entry.getValue().getVotes();
            System.out.println("Nome: " + candidatoName + " -- Votos: " + votes);
        }



    }

    public static List<? super Object> copy(List<? extends Object> list){
        List<? super Object> myGenericList = new ArrayList<>();

        myGenericList.addAll(list);

        return myGenericList;
    }
    public static void copy1(List<? extends Object> source, List<? super Object> destiny){

        for (Object object : source){
            destiny.add(object);
        }


    }


}
