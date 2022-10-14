package semana10;

import java.util.Iterator;
import javax.swing.JOptionPane;

public class ArraylisTperro extends PerrosGato {

    public String Input(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public int Input2(String Ne) {
        return Integer.parseInt(JOptionPane.showInputDialog(Ne));
    }

    public void addCa() {
        Canino Cani = new Canino();
        String nombre = Input("Ingrese el nombre del Perro");
        Cani.setNombre(nombre);
        String raza = Input("Ingrese el nombre de la raza");
        Cani.setRaza(raza);
        String color = Input("Ingrese el color del Perro");
        Cani.setColor(color);
        int edad = Input1("Ingrese la edad del Perro");
        Cani.setEdad(edad);
        int Ne = Input2("Ingrese El nivel de 1 a 10 de entrenamiento del perro");
        Cani.setNe(Ne);
        if (Ne > 10) {
            JOptionPane.showMessageDialog(null, "Solo de 1 a 10");
        }
        Can.add(Cani);
    }

    public void getCanino() {
        Iterator it = Can.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Canino cani = (Canino) objeto;
            JOptionPane.showMessageDialog(null, cani.datos());
        }

    }

    public void limpiar() {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la posicion a eliminar, recuerde que la primer posicion del arraylist es 0"));
        Can.remove(opcion);
    }
}
