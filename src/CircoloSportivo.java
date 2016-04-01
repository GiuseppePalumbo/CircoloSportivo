

/**
 * Questa classe implementa un Circolo Sportivo
 *
 * @author Giuseppe Palumbo
 */
public class CircoloSportivo {
    public String Nome;
    public Socio[] elencoSoci;
    
    /**
     * Metodo costruttore
     * 
     * @param n nome del circolo
     */
    public CircoloSportivo(String n){
        Nome = n;
    }
    
    /**
     * elenca i soci iscritti al circolo
     */
    public void ElencoIscritti(){
        
    }
    
    /**
     * Elenca i soci iscritti ad una determinata disciplina
     * 
     * @param disc nome della disciplina 
     */
    public String ElencoIscrittiPerDisciplina(String disc){
        return "Elenco";
    }
}
