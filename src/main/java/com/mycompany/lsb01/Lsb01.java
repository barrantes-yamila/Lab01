/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lsb01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Yamila
 */
public class Lsb01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ControladorAlumno objetoControl = new ControladorAlumno();
        String opcion = "s";

        while (opcion.equals("s") || opcion.equals("S")) {
            Alumno nuevo = new Alumno();

            System.out.println("Escriba el Nombre:");
            nuevo.setNombre(leer.nextLine());

            System.out.println("Escriba el Apellido:");
            nuevo.setApellido(leer.nextLine());

            System.out.println("Escriba el DNI (8 caracteres):");
            String dniTemporal = leer.nextLine();

            if (dniTemporal.length() == 8) {
                nuevo.setDni(dniTemporal);
                
                System.out.println("Nivel (A, B o C):");
                nuevo.setNivelSocioeconomico(leer.nextLine());

                System.out.println("Porcentaje de beca (ej: 0.15):");
                try {
                    nuevo.setPorcentajeBeca(Double.parseDouble(leer.nextLine()));
                    
                    objetoControl.agregarEstudiante(nuevo);
                    System.out.println("Guardado con éxito.");
                } catch (InputMismatchException e) {
                    System.out.println("Error en el número de beca.");
                }
                
            } else {
                System.out.println("DNI incorrecto, no se guardó el alumno.");
            }

            System.out.println("¿Desea continuar? s/n");
            opcion = leer.nextLine();
        }

        System.out.println("--- RESULTADOS FINALES ---");
        objetoControl.listarEstudiantes();
    }   
}
