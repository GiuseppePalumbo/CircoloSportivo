

/**
 * Specializza la classe Disciplina inserendo il codice del corso ed il numero di corsia
 *
 * @author Giuseppe Palumbo
 * @version 0.1
 */
public class Nuoto extends Disciplina{
    private String codiceCorso;
    public int corsia;
    
    /**
     * Metodo costruttore
     * 
     * @param codiceCorso codice del corso
     * @param corsia numero di corsia
     * @param mensile costo mensile
     * @param annuale costo annuale
     * @param nome nome del socio
     */
    public Nuoto(String codiceCorso, int corsia, float mensile, float annuale, String nome) {
        super(mensile, annuale, nome);
        this.codiceCorso = codiceCorso;
        this.corsia = corsia;
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
