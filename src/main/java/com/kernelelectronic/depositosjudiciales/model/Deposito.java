package com.kernelelectronic.depositosjudiciales.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Deposito implements Serializable {

    private String nroCuenta;
    private String nroExpediente;
    private String banco;
    private String anio;
    private String importe;
    private String pesos;
    private String ordenJuzgado;
    private String nominacion;
    private String juicio;
    private String nroCheque;
    private LocalDate localDate;

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

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getPesos() {
        return pesos;
    }

    public void setPesos(String pesos) {
        this.pesos = pesos;
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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

} 