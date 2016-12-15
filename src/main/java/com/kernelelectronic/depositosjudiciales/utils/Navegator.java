package com.kernelelectronic.depositosjudiciales.utils;

import com.kernelelectronic.depositosjudiciales.model.Deposito;

import java.util.List;

public class Navegator {
    private List<Deposito> depositos;
    private int actual;
    private int size;

    public Navegator(List<Deposito> depositos) {
        this.depositos = depositos;
        this.actual = 0;
        size = depositos.size();
    }

    public Deposito getNext() {
        if (actual < size) {
            actual++;
            return depositos.get(actual);
        }
        return null;
    }

    public Deposito getPrevious() {
        if(actual > 0) {
            actual--;
            return depositos.get(actual);
        }
        return null;
    }

    public Deposito getFirst() {
        actual = 0;
        return depositos.get(actual);
    }

    public Deposito getLast() {
        actual = size - 1;
        return depositos.get(actual);
    }

    public void addDeposito() {
        size++;
    }

    public void removeDeposito(){
        size--;
    }
    
    public int getActual() {
        return actual;
    }
    
    public void setActual(int actual) {
        this.actual = actual;
    }
    
    public boolean isLast() {
        return (this.actual == this.size - 1 );
    }
    
    public boolean isFirst() {
        return (this.actual == 0);
    }
}
