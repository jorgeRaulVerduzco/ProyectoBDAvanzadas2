/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author INEGI
 */
@Entity
@Table(name = "Licencia")
public class Licencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLicencia;

    @Column(name = "vigencia", nullable = false)
    private int vigencia;

    @Column(name = "tipoLicencia", nullable = false)
    private TipoLicencia tipoLicencia;

    @Column(name = "FechaExpedicion", nullable = false)
    Calendar fechaExpedicion;

    @Column(name = "costo", nullable = false)
    float costo;
    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    public Licencia(int vigencia, TipoLicencia tipoLicencia, Calendar fechaExpedicion, float costo, Persona persona) {
        this.vigencia = vigencia;
        this.tipoLicencia = tipoLicencia;
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
        this.persona = persona;
    }

    public Long getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Long idLicencia) {
        this.idLicencia = idLicencia;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Licencia{" + "idLicencia=" + idLicencia + ", vigencia=" + vigencia + ", tipoLicencia=" + tipoLicencia + ", fechaExpedicion=" + fechaExpedicion + ", costo=" + costo + ", persona=" + persona + '}';
    }
    
    
    

}
