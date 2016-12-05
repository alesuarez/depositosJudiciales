package com.kernelelectronic.depositosjudiciales.utils;

/* *
 * NumeroCastellano - Convierte un n�mero a castellano
 * Copyright (c) 2006 Alexander Hristov .
 * 
 * Este programa es Software Libre; usted puede redistribuirlo
 * y/o modificarlo bajo los t�rminos de la "GNU General Public
 * License" como lo publica la "FSF Free Software Foundation",
 * o (a su elecci�n) de cualquier versi�n posterior.
 *
 * Este programa es distribuido con la esperanza de que le ser�
 * �til, pero SIN NINGUNA GARANTIA; incluso sin la garant�a
 * impl�cita por el MERCADEO o EJERCICIO DE ALGUN PROPOSITO en
 * particular. Vea la "GNU General Public License" para m�s
 * detalles.
 * 
 * Usted debe haber recibido una copia de la "GNU General Public
 * License" junto con este programa, si no, escriba a la "FSF
 * Free Software Foundation, Inc.", 59 Temple Place - Suite 330,
 * Boston, MA  02111-1307, USA.
 * 
 */
public class NumeroLetra {

    private static String[] _grupos
            = {"", "millon", "billon", "trillon"};

    private static String[] _unidades
            = {"", "un", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

    private static String[] _decena1
            = {"", "once", "doce", "trece", "catorce", "quince",
                "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
    private static String[] _decenas
            = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta",
                "sesenta", "setenta", "ochenta", "noventa"};

    private static String[] _centenas
            = {"", "cien", "doscientos", "trescientos", "cuatrocientos",
                "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

    public static String millarATexto(int n) {
        if (n == 0) {
            return "";
        }

        int centenas = n / 100;
        n = n % 100;
        int decenas = n / 10;
        int unidades = n % 10;

        String sufijo = "";

        if (decenas == 0 && unidades != 0) {
            sufijo = _unidades[unidades];
        }

        if (decenas == 1 && unidades != 0) {
            sufijo = _decena1[unidades];
        }

        if (decenas == 2 && unidades != 0) {
            sufijo = "VEINTI" + _unidades[unidades];
        }

        if (unidades == 0) {
            sufijo = _decenas[decenas];
        }

        if (decenas > 2 && unidades != 0) {
            sufijo = _decenas[decenas] + " Y " + _unidades[unidades];
        }

        if (centenas != 1) {
            return _centenas[centenas] + " " + sufijo;
        }

        if (unidades == 0 && decenas == 0) {
            return "CIEN";
        }

        return "CIENTO " + sufijo;
    }

    public static int contarPalabras(String cadena) {
        cadena += " ";
        // toma como cero empezando por la izquierda
        int i;
        for (i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '.') {
                break;
            }
        }
        return i;
    }

    public static String numeroALetra(String Plata) {
        String resultado = "";
        int grupo = 0;
        long n;
        String Pesos;
        String Centavos;
        String TodoMayuscula;
        Pesos = Plata.substring(0, contarPalabras(Plata));
        Centavos = Plata.substring(1 + contarPalabras(Plata), Plata.length());
        n = Long.valueOf(Pesos);

        while (n != 0 && grupo < _grupos.length) {
            long fragmento = n % 1000000;
            int millarAlto = (int) (fragmento / 1000);
            int millarBajo = (int) (fragmento % 1000);
            n = n / 1000000;

            String nombreGrupo = _grupos[grupo];
            if (fragmento > 1 && grupo > 0) {
                nombreGrupo += "ES";
            }

            if ((millarAlto != 0) || (millarBajo != 0)) {
                if (millarAlto > 1) {
                    resultado = millarATexto(millarAlto) + " MIL "
                            + millarATexto(millarBajo) + " "
                            + nombreGrupo + " "
                            + resultado;
                }

                if (millarAlto == 0) {
                    resultado = millarATexto(millarBajo) + " "
                            + nombreGrupo + " "
                            + resultado;
                }

                if (millarAlto == 1) {
                    resultado = "MIL " + millarATexto(millarBajo) + " "
                            + nombreGrupo + " "
                            + resultado;
                }
            }
            grupo++;
        }
        TodoMayuscula = resultado + "PESOS CON " + Centavos + "/100 CENTAVOS";
        return TodoMayuscula.toUpperCase();
    }

}
