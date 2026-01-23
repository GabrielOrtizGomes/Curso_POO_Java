package Section_17_Generics_Set_Map.src.EX03.Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
    private Long id;
    private Set<Aluno> alunos;

    public Curso(Long id) {
        this.id = id;
        this.alunos = new HashSet<Aluno>();
    }

    public void addAluno (Aluno aluno){
        alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Set.copyOf(alunos);
    }
}
