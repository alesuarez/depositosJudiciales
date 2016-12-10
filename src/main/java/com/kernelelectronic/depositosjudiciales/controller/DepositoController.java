package com.kernelelectronic.depositosjudiciales.controller;

import com.kernelelectronic.depositosjudiciales.model.Deposito;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DepositoController {

    private static DepositoController instance = null;
    private static String FILE = "depositos.jrs";
    private List<Deposito> depositos = new ArrayList<>();

    protected DepositoController() {
        this.deserializar();
    }

    public static DepositoController getInstance() {
        return instance == null ? new DepositoController() : instance;
    }

    public boolean agregarDeposito(Deposito deposito) {
        if (checkDeposito(deposito) && deposito != null && !depositos.contains(deposito)) {
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
        } catch (FileNotFoundException fnte) {
            System.out.println("No existe el archivo " + FILE);
        } catch (NotSerializableException nse) {
            System.out.println("La clase Tipo no es serializable");
        } catch (IOException ioe) {
            System.out.println("Error al escribir en el archivo " + FILE);
        }
    }

    private boolean checkDeposito(Deposito deposito) {
        return !(deposito.getNroCuenta() == null || deposito.getJuicio() == null
                || deposito.getNroCheque() == null || deposito.getNroCuenta() == null
                || deposito.getNroExpediente() == null || deposito.getOrdenJuzgado() == null
                || deposito.getBanco() == null || deposito.getLocalDate() == null);
    }

    public List<Deposito> getDepositos() {
        return depositos;
    }

    public void setDepositos(List<Deposito> depositos) {
        this.depositos = depositos;
    }

    private static List<Deposito> readFile() {
        List<Deposito> depositos = new ArrayList<>();
        File file = new File(FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
                depositos = (ArrayList<Deposito>) ois.readObject();
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Error al leer del archivo " + FILE);
            } catch (IOException ioe) {
                System.out.println("Error al leer del archivo " + FILE);
            }
        }
        return depositos;
    }

    public static java.util.Collection getAllCollection() {

        java.util.Vector collection = new java.util.Vector();

        List<Deposito> depositos = readFile();

        for (Deposito deposito : depositos) {
            collection.add(deposito);
        }

        return collection;
    }
}
