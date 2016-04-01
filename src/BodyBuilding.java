

/**
 *Specializza la classe Disciplina inserendo il peso del socio
 * 
 * @author Giuseppe Palumbo
 * @version 0.1
 */
public class BodyBuilding extends Disciplina{
    private String peso;
    
    /**
     * Metodo costruttore
     * 
     * @param peso peso del socio
     * @param mensile costo mensile 
     * @param annuale costo annuale
     * @param nome nome del socio
     */
    public BodyBuilding(String peso, float mensile, float annuale, String nome) {
        super(mensile, annuale, nome);
        this.peso = peso;
    }
    
    /**
     * questo metodo ritorna il peso del socio
     * 
     * @return peso peso del socio
     */
    public String getPeso() {
        return peso;
    }
    
    /**
     * questo metodo consente di impostare il peso del socio
     * 
     * @param peso peso del socio
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
    
    
    
}
