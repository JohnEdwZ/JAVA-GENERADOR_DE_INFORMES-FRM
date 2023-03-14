/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.VO;

/**
 *
 * @author edwar
 */
public class Proyecto {
    private int id_proyecto, numero_habitaciones;
    private String constructora, ciudad;

    public Proyecto() {
    }

    public Proyecto(int id_proyecto, int numero_habitaciones, String constructora, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.numero_habitaciones = numero_habitaciones;
        this.constructora = constructora;
        this.ciudad = ciudad;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id_proyecto=" + id_proyecto + ", numero_habitaciones=" + numero_habitaciones + ", constructora=" + constructora + ", ciudad=" + ciudad + '}';
    }  
}
