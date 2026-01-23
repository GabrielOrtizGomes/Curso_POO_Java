package Section_17_Generics_Set_Map.src.EX04.Entities;

public class Candidato {
    private final String name;
    private int votes;

    public Candidato(String name) {
        this.name = name;
        this.votes = 0;
    }

    public void addVotes(int votes){
        this.votes += votes;
    }


    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }


    @Override
    public String toString() {
        return String.format("%s: %d", getName(), getVotes());
    }
}
