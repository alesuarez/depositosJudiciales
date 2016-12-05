package com.kernelelectronic.depositosjudiciales.controller;

import com.kernelelectronic.depositosjudiciales.model.Deposito;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DepositoController {

    private static DepositoController instance = null;
    private static String FILE = "./depositos.jrs";
    private List<Deposito> depositos;

    protected DepositoController() {
        this.deserializar();
        depositos = new ArrayList<>();
    }

    public static DepositoController getInstance() {
        return instance == null ? new DepositoController() : instance;
    }

    public boolean agregarDeposito(Deposito deposito) {
        if (checkDeposito(deposito) && deposito != null) {
            depositos.add(deposito);
            serializar();
            return true;
        }
        return false;
    }

    public boolean modificarDeposito(Deposito deposito) {
        int i = 0;
        for (Deposito dpt : depositos) { //todo: mejorar con comodines
            if (dpt.getNroCuenta().equals(deposito.getNroCuenta())) {
                depositos.add(i, deposito);
                serializar();
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean eliminarDeposito(Deposito deposito) {
        try {
            for (Deposito dps : depositos) {
                if (dps.getNroCuenta().equals(deposito.getNroCuenta())) {
                    depositos.remove(dps);
                    serializar();
                    return true;
                }
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public Deposito buscarNroCuenta(String nroCuenta) {
        for (Deposito deposito : depositos) { //todo: mejorar con comodines
            if (deposito.getNroCuenta().equals(nroCuenta)) {
                return deposito;
            }
        }
        return null;
    }

    public Deposito buscarJuicio(String juicio) {
        for (Deposito deposito : depositos) {
            if (deposito.getJuicio().equals(juicio)) {
                return deposito;
            }
        }
        return null;
    }

    private void deserializar() {
        File file = new File(FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
                this.depositos = (ArrayList<Deposito>) ois.readObject();
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Error al leer del archivo " + FILE);
            } catch (IOException ioe) {
                System.out.println("Error al leer del archivo " + FILE);
            }
        }
    }

    public void serializar() {
        File file = new File(FILE);
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            oos.writeObject(this.depositos);
        } catch (NotSerializableException nse) {
            System.out.println("La clase Tipo no es serializable");
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el archivo " + FILE);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo " + FILE);
        }
    }

    private boolean checkDeposito(Deposito deposito) {
        return !(deposito.getNroCuenta() == null || deposito.getJuicio() == null
                || deposito.getNroCheque() == null || deposito.getNroCuenta() == null
                || deposito.getNroExpediente() == null || deposito.getOrdenJuzgado() == null);
    }

    public List<Deposito> getDepositos() {
        return depositos;
    }

    public void setDepositos(List<Deposito> depositos) {
        this.depositos = depositos;
    }
}
