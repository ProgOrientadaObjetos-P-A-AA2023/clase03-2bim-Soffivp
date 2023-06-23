/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String cod, ArrayList<Docente> docente) {
        super(cod);
        lista = docente;
    }

    public void establecerPromedioSueldos() {
        double suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }

        promedioSueldos = suma / lista.size();
    }

    public void establecerLista(ArrayList<Docente> docente) {
        lista = docente;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Docente";
        cadena = String.format("%s\nCódigo: %s\n"
                + "Lista Docentes\n", cadena, codigo);

        for (int i = 0; i < lista.size(); i++) {
            Docente d = obtenerLista().get(i);
            cadena = String.format("%sDocente(%d)\n"
                    + "Nombre: %s %s\n"
                    + "Sueldo: %.2f\n", cadena, i + 1, d.getNombre(),
                    d.getApellido(), d.getSueldo());
        }

        cadena = String.format("%s\nEl promedio de los sueldos es: %.2f\n",
                cadena, promedioSueldos);
        return cadena;
    }
}
