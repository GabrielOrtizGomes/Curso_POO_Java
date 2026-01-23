package Section_17_Generics_Set_Map.src.EX03.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private Long id;
    private List<Curso> cursos;

    public Aluno(Long id) {
        this.id = id;
        this.cursos = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                '}';
    }
}
