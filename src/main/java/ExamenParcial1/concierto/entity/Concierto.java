
package ExamenParcial1.concierto.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Dayanna Rojas
 */ 
@Entity
@Table (name = "conciertos")
public class Concierto implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String artista;
    private int costo;
    private int capacidadpersonas;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name="lugar_id")
    private Lugar lugar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCapacidadpersonas() {
        return capacidadpersonas;
    }

    public void setCapacidadpersonas(int capacidadpersonas) {
        this.capacidadpersonas = capacidadpersonas;
    }
    
    public Date getFecha() {
        return fecha;
       
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

}
