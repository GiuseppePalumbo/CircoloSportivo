

/**
 *Queta classe rappresenta un socio del circolo sportivo
 * 
 * @author Giuseppe Palumbo
 * @version 0.1
 */

public class Socio {
    private String nome;
    private String cognome;
    private String cf;
    private Disciplina[] disciplina;
    
    /**
     * Metodo costruttore
     * 
     * @param n nome socio
     * @param c cognome del socio
     * @param codF codice ficale del socio
     */
    public Socio(String n, String c, String codF){
        nome = n;
        cognome = c;
        cf = codF;
    }
    
    /**
     * Calcola la retta 
     * 
     * @param isAnnuale 
     */
    public float calcoloRetta(boolean isAnnuale){
        return 0;
    }
    
    /**
     * restituisce il nome del socio
     * 
     * @return nome del socio
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * questo metodo consente di impostare il nome del socio
     * 
     * @param nome nome del socio
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * questo metodo restituisce il cognome del socio 
     * 
     * @return cognome del socio
     */
    public String getCognome() {
        return cognome;
    }
    
    /**
     * questo metodo consente di impostare il cognome del socio
     * 
     * @param cognome del socio
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    /**
     *  questo metodo restituisce il codice fiscale del socio 
     * 
     * @return ritorna il codice fiscale del socio
     */
    public String getCf() {
        return cf;
    }
    /**
     * questo metodo consente di impostare il codice fiscale del socio
     * 
     * @param cf codice fiscale del socio
     */
    public void setCf(String cf) {
        this.cf = cf;
    }
}
