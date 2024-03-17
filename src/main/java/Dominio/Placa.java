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
@Table(name = "placa")
public class Placa implements Serializable {

    @Id
    @Column(name = "idPlaca")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String digitosPlaca;

    private Calendar fechaTramite;

    float costo;

    @ManyToOne
    @JoinColumn(name = "idAutomovil")
    private Automovil automovil;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    public Placa() {
    }

    public Placa(String digitosPlaca, Calendar fechaTramite, float costo, Automovil automovil, Persona persona) {
        this.digitosPlaca = digitosPlaca;
        this.fechaTramite = fechaTramite;
        this.costo = costo;
        this.automovil = automovil;
        this.persona = persona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDigitosPlaca() {
        return digitosPlaca;
    }

    public void setDigitosPlaca(String digitosPlaca) {
        this.digitosPlaca = digitosPlaca;
    }

    public Calendar getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Calendar fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Placa{" + "id=" + id + ", digitosPlaca=" + digitosPlaca + ", fechaTramite=" + fechaTramite + ", costo=" + costo + ", automovil=" + automovil + ", persona=" + persona + '}';
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
