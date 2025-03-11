/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 * Escribir un programa que calcule la velocidad de un proyectil que recorre 2 Km en 5 minutos.
 * Expresar el resultado en metros/segundo. Velocidad = espacio/tiempo
 */
public class Class_03 {
    public double Velocidad;
    public String ms;

    
    public void Distancia_Proyectil(int distanciaKm, int Tiempominutos) {
        ms = "ms";
        double distanciaMetros = distanciaKm * 1000;
        double tiemposegundos = Tiempominutos * 60; 
        this.Velocidad =  distanciaMetros / tiemposegundos ; // Asigna el resultado a la variable de clase
        
        
        /** Deep shark 
        // Datos del problema
        double distanciaKm = 2.0;   // Distancia en kilómetros
        double tiempoMinutos = 5.0; // Tiempo en minutos

        // Convertir la distancia a metros
        double distanciaMetros = distanciaKm * 1000;

        // Convertir el tiempo a segundos
        double tiempoSegundos = tiempoMinutos * 60;

        // Calcular la velocidad en metros por segundo
        double velocidadMetrosSegundo = distanciaMetros / tiempoSegundos;

        // Imprimir el resultado
        System.out.println("La velocidad del proyectil es: " + velocidadMetrosSegundo + " m/s");*/ 
    }
}
