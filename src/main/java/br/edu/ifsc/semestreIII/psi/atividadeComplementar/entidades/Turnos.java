package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.HashMap;
import java.util.Map;



public class Turnos {
    private Map<String, Turno> turnos;

    public Turnos() {
        this.turnos = new HashMap();
        turnos.put("M", new Turno("Matutino"));
        turnos.put("V", new Turno("Vespertino"));
        turnos.put("N", new Turno("Noturno"));
    }

    public Map<String, Turno> turnos() {
        return turnos;
    }
    
    public Turno turno(String turno_id){
        return this.turnos.get(turno_id);
    }
}
