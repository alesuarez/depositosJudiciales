package com.kernelelectronic.depositosjudiciales.model;

import java.io.Serializable;

public class Deposito implements Serializable{
    
    private String nroCuenta;
    private String nroExpediente;
    private int anio;
    private double importe;
    private String ordenJuzgado;
    private String nominacion;
    private String juicio;
    private String nroCheque;

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getNroExpediente() {
        return nroExpediente;
    }

    public void setNroExpediente(String nroExpediente) {
        this.nroExpediente = nroExpediente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getOrdenJuzgado() {
        return ordenJuzgado;
    }

    public void setOrdenJuzgado(String ordenJuzgado) {
        this.ordenJuzgado = ordenJuzgado;
    }

    public String getNominacion() {
        return nominacion;
    }

    public void setNominacion(String nominacion) {
        this.nominacion = nominacion;
    }

    public String getJuicio() {
        return juicio;
    }

    public void setJuicio(String juicio) {
        this.juicio = juicio;
    }

    public String getNroCheque() {
        return nroCheque;
    }

    public void setNroCheque(String nroCheque) {
        this.nroCheque = nroCheque;
    }
    
}
 