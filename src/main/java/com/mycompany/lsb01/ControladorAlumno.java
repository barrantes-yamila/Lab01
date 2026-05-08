/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lsb01;

import java.util.ArrayList;

/**
 *
 * @author Yamila
 */
public class ControladorAlumno {
    private ArrayList<  Alumno> listaAlumnos = new ArrayList<>();

    public void agregarEstudiante(Alumno nuevo) {
        listaAlumnos.add(nuevo);
    }

    public void listarEstudiantes() {
        System.out.println("\n--- REPORTE DE ESTUDIANTES INNOVA ---");
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno e : listaAlumnos) {
                e.verDatos();
            }
        }
    }
}
