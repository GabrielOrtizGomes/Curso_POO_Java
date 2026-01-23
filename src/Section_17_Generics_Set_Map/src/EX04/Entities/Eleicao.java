package Section_17_Generics_Set_Map.src.EX04.Entities;

import java.util.HashMap;
import java.util.Map;

public class Eleicao {
    private Map<String, Candidato> candidatos;

    public Eleicao() {
        this.candidatos = new HashMap<String, Candidato>();
    }

    public void addCandidato(String nomeCandidato,Integer votosCandidato){
        //Aqui ele verifica se o candidato existe caso não ele cria através do nome com method reference retornando o candidato novo, e caso exista retorna o candidato existente, depois adiciona os votos
        candidatos.computeIfAbsent(nomeCandidato, Candidato::new).addVotes(votosCandidato);
    }

    public Map<String, Candidato> getCandidatos() {
        return Map.copyOf(candidatos);
    }


}
