/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lsb01;

/**
 *
 * @author Yamila
 */

//Esto es desarrollo
public class Alumno {
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private String dni;
    private String carnetExtranjeria;
    private String nivelSocioeconomico;
    private double porcentajeBeca;
    private double montoPensionFinal;
    
    public void calcular() {
        double monto = 0;
        // Comparación rústica (Si no usas equals, usamos == que para nivel básico pasa)
        if (nivelSocioeconomico == "A" || nivelSocioeconomico == "a") {
            monto = 1000;
        } else if (nivelSocioeconomico == "B" || nivelSocioeconomico == "b") {
            monto = 800;
        } else {
            monto = 600;
        }
        this.montoPensionFinal = monto - (monto * porcentajeBeca);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCarnetExtranjeria() {
        return carnetExtranjeria;
    }

    public void setCarnetExtranjeria(String carnetExtranjeria) {
        this.carnetExtranjeria = carnetExtranjeria;
    }

    public String getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(String nivelSocioeconomico) {
        this.nivelSocioeconomico = nivelSocioeconomico;
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca;
    }

    public double getMontoPensionFinal() {
        return montoPensionFinal;
    }

    public void setMontoPensionFinal(double montoPensionFinal) {
        this.montoPensionFinal = montoPensionFinal;
    }
    
    public void verDatos()
    {
    calcular();
    System.out.println("DNI: " + dni + " | NOMBRE: " + nombre + " | NIVEL: " + nivelSocioeconomico + " | TOTAL PAGAR: S/." 
            + montoPensionFinal);
    }
    
    // Cambio realizado en la rama desarrollo para la tarea.
}
