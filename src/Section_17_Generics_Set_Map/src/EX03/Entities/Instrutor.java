package Section_17_Generics_Set_Map.src.EX03.Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instrutor {
    private Long id;
    //private Set<Aluno> alunos;
    private List<Curso> cursos;




    public Instrutor(Long id) {
        this.id = id;
        //this.alunos = new HashSet<>();
        this.cursos = new ArrayList<>();
    }
    public Instrutor() {
        //this.alunos = new HashSet<>();
        this.cursos = new ArrayList<>();
    }

    /*public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }*/

    public void addCurso(Curso curso){
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return List.copyOf(cursos);
    }

    public Set<Aluno> allStudentsOfCurses(){
        Set<Aluno> allStudentsOfCurses = new HashSet<Aluno>();
        for (Curso curso : getCursos()){
            allStudentsOfCurses.addAll(curso.getAlunos());
        }
        return allStudentsOfCurses;
    }


}
