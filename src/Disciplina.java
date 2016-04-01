

/**
 * Questa classe implementa le caratteristiche di una disciplina.
 * E' una classe di tipo astratta
 *
 * @author Giuseppe Palumbo
 * @version 0.1
 */
public abstract class Disciplina {
    private float mensile;
    private float annuale;
    public String nome;
    
    /**
     * Metodo costruttore
     * 
     * @param mensile costo mensile
     * @param annuale costo annuale
     * @param nome nome del socio
     */
    public Disciplina(float mensile, float annuale, String nome) {
        this.mensile = mensile;
        this.annuale = annuale;
        this.nome = nome;
    }
    
    /**
     * questo metodo ritorna il costo mensile della disciplina
     * 
     * @return costo mensile
     */
    public float getMensile() {
        return mensile;
    }
    
    /**
     * questo metodo consente di impostare il costo mensile della disciplina
     * 
     * @param mensile costo mensile
     */
    public void setMensile(float mensile) {
        this.mensile = mensile;
    }
    
    /**
     * questo metodo ritorna il costo annuale della disciplina
     * 
     * @return costo annuale della disciplina
     */
    public float getAnnuale() {
        return annuale;
    }
    
    /**
     * questo metodo consente di impostare il costo annuale della disciplina
     * 
     * @param annuale costo annuale della disciplina
     */
    public void setAnnuale(float annuale) {
        this.annuale = annuale;
    }
    
    
    
}


