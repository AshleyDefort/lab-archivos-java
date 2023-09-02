/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LabArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class UtilityClass {
        // Función para verificar si una cédula existe en el archivo de empleados
    public static boolean cedulaExistente(String cedula) {
        try {
            FileReader fileReader = new FileReader("Empleados.txt");
            BufferedReader empleados = new BufferedReader(fileReader);

            String line;
            while ((line = empleados.readLine()) != null) {
                String[] empleadoData = line.split("\t");
                if (empleadoData.length >= 1 && empleadoData[0].equals(cedula)) {
                    empleados.close();
                    return true; // La cédula ya existe en el archivo
                }
            }

            empleados.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de empleados", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false; // La cédula no existe en el archivo
    }
    public static boolean cedulaNombre(String cedula, String nombre){
        try {
            FileReader fileReader = new FileReader("Empleados.txt");
            BufferedReader empleados = new BufferedReader(fileReader);

            String line;
            while ((line = empleados.readLine()) != null) {
                String[] empleadoData = line.split("\t");
                if (empleadoData.length >= 1 && empleadoData[0].equals(cedula) && empleadoData[1].equals(nombre)) {
                    empleados.close();
                    return true; //Existe un registro con ese nombre y cédula
                }
            }

            empleados.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de empleados", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false; //En el archivo de empleados, no hay un registro con ese nombre y cédula
    }
    public static boolean codigoExistente(String codigo){
        try {
            FileReader fileReader = new FileReader("Ventas.txt");
            BufferedReader ventas = new BufferedReader(fileReader);

            String line;
            while ((line = ventas.readLine()) != null) {
                String[] ventaData = line.split("\t");
                if (ventaData.length >= 1 && ventaData[0].equals(codigo)) {
                    ventas.close();
                    return true; // El código ya existe en el archivo
                }
            }

            ventas.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de ventas", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false; // El código no existe en el archivo
    }
}
