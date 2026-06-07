/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carnet_del_estudiante;

import javax.swing.JOptionPane;

/**
 * Clase carnet del estudiante.
 * @author Nelson Latino
 */
public class CARNET_DEL_ESTUDIANTE {

    /**
    * @param args Argumentos de linea de comandos.
     */
    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "Un Mundo Feliz",
                10000,
                "01/01/2026",
                311);

        Libro libro2 = new Libro(
                "Java Basico",
                8000,
                "05/02/2026",
                250);

        JOptionPane.showMessageDialog(null,
                "LIBRO 1\n"
                + "Nombre: " + libro1.getNombre()
                + "\nPrecio Final: " + libro1.calcularPrecio());

        JOptionPane.showMessageDialog(null,
                "LIBRO 2\n"
                + "Nombre: " + libro2.getNombre()
                + "\nPrecio Final: " + libro2.calcularPrecio());

        System.out.println(
                "El libro " + libro1.getNombre()
                + " tiene "
                + libro1.getNumeroPaginas()
                + " paginas. Los numeros primos son:");

        Recursividad.mostrarPrimos(
                2,
                libro1.getNumeroPaginas());

        System.out.println();

        System.out.println(
                "\nEl libro " + libro2.getNombre()
                + " tiene "
                + libro2.getNumeroPaginas()
                + " paginas. Los numeros primos son:");

        Recursividad.mostrarPrimos(
                2,
                libro2.getNumeroPaginas());

        Revista revista1 = new Revista(
                "PC World",
                5000,
                "01/01/2026",
                "mensual");

        Revista revista2 = new Revista(
                "Noticias CR",
                4500,
                "02/01/2026",
                "semanal");

        JOptionPane.showMessageDialog(null,
                "REVISTA 1\nPrecio Final: "
                + revista1.calcularPrecio());

        JOptionPane.showMessageDialog(null,
                "REVISTA 2\nPrecio Final: "
                + revista2.calcularPrecio());

        Periodico p1 = new Periodico(
                "La Nacion",
                1000,
                "01/01/2026",
                4);

        Periodico p2 = new Periodico(
                "Diario Extra",
                1200,
                "01/01/2026",
                3);

        Periodico p3 = new Periodico(
                "El Financiero",
                1500,
                "01/01/2026",
                5);

        JOptionPane.showMessageDialog(null,
                "PERIODICO 1\nPrecio Final: "
                + p1.calcularPrecio());

        JOptionPane.showMessageDialog(null,
                "PERIODICO 2\nPrecio Final: "
                + p2.calcularPrecio());

        JOptionPane.showMessageDialog(null,
                "PERIODICO 3\nPrecio Final: "
                + p3.calcularPrecio());
    }
}