

/**
 * Specializza la classe Disciplina inserendo il codice del corso
 *
 * @author Giuseppe Palumbo
 * @version 0.1
 */
public class Aerobica extends Disciplina{
    private String codiceCorso;
    
    /**
     * Metodo costruttore
     * 
     * @param codiceCorso codice del coso
     * @param mensile costo mensile
     * @param annuale costo annuale
     * @param nome  nome del socio
     */
    public Aerobica(String codiceCorso, float mensile, float annuale, String nome) {
        super(mensile, annuale, nome);
        this.codiceCorso = codiceCorso;
    }
    
    /**
     * questo metodo ritorna il codice del corso
     * 
     * @return codice del corso
     */
    public String getCodiceCorso() {
        return codiceCorso;
    }
    
    /**
     * questo metodo consente di impostare il codice del corso
     * 
     * @param codiceCorso codice del corso
     */
    public void setCodiceCorso(String codiceCorso) {
        this.codiceCorso = codiceCorso;
    }
    
    
    
    
}
