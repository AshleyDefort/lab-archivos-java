/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LabArchivos;

/**
 *
 * @author ashle
 */
public class MarcaEstadistica {
    private String marca;
    private int cantidadVendida;
    private double gananciaTotal;

    public MarcaEstadistica(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public double getGananciaTotal() {
        return gananciaTotal;
    }

    public void incrementarCantidadVendida() {
        cantidadVendida++;
    }

    public void incrementarGananciaTotal(double ganancia) {
        gananciaTotal += ganancia;
    }
}
