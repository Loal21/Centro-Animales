/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Felino {

    private String nombre;
    private String raza;
    private String color;
    private String tx;
        private int edad;

    public Felino() {
        nombre = "";
        raza = "";
        color = "";
        edad = 0;
        tx = "";
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

      public String datos(){
        return "El gato se llama "+nombre+" es un "+raza+ " es de color " +color + " tiene "+edad+" años " +" y "+ tx + " vacuna contra la toxoplasmosis";
      }

}
