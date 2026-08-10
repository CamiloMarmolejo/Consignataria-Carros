/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umariana.consignataria;

/**
 *
 * @author marmota
 */
public class Carro {
    
    private String marca; 
    private String color; 
    private String placa; 
    private int cilindraje; 
    private int modelo; 
    private double precio; 

    public Carro() {
    }

    public Carro(String marca, String color, String placa, int cilindraje, int modelo, double precio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getColor() {
        return color;
    }

   public String getPlaca() {
        return placa;
    }

   public int getCilindraje() {
        return cilindraje;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
}
