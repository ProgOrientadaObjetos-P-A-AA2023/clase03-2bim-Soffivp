/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String cod, ArrayList<Estudiante> estudiante) {
        super(cod);
        lista = estudiante;

    }
    
     public void establecerPromedioMatriculas(){
        double suma = 0;
        for(int i=0; i<lista.size(); i++){
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma/lista.size();
    }
    
    public void establecerLista(ArrayList<Estudiante> miLista){
        lista = miLista;
    }
    
    public ArrayList<Estudiante> obtenerLista(){
        return lista;
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }
    
    @Override
    public String toString(){
        String cadena = "Reporte Estudiante\n";
        cadena = String.format("%sCódigo: %s\n", cadena, codigo);
        cadena = String.format("%sLista estudiantes\n", cadena);
        
        for(int i=0; i<obtenerLista().size(); i++){
            Estudiante e = obtenerLista().get(i);
            cadena = String.format("%sDocente(%d)\n"
                    + "Nombre: %s %s\n"
                    + "Matricula: %.2f\n" , 
                cadena,i+1, e.getNombre(),e.getApellido()
                    , e.getMatricula());
        }
        
        cadena = String.format("%s\nEl promedio de la matricula es: %.2f\n", 
                cadena, obtenerPromedioMatriculas());
        
        return cadena;
    }

}
