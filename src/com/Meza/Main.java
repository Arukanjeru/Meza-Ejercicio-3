package com.Meza;

import com.Meza.Tipos.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        Scanner lector = new Scanner(System.in);

        boolean x = true;
        System.out.println("<><><> Agencia de vehiculos Aruka <><><>");
        while (x == true){
            System.out.println("(1) Ingresar un vehiculo");
            System.out.println("(2) Mostrar vehiculos");
            System.out.println("(3) Salir");
            int opcion = LectorDeDatos.solicitarEntero("Ingrese una opcion: ");

            switch (opcion){
                case 1:
                    System.out.println("\t(1) Ford");
                    System.out.println("\t(2) Toyota");
                    System.out.println("\t(3) Honda");
                    System.out.println("\t(4) Nissan");
                    int marca = LectorDeDatos.solicitarEntero("Especifique la marca del vehiculo:");
                    System.out.println("Color del vehiculo:");
                    String color = lector.nextLine();
                    int year = LectorDeDatos.solicitarEntero("Año del vehiculo: ");
                    double precio = LectorDeDatos.solicitarDouble("Precio del vehiculo: ");

                    if (marca == 1){
                        Ford nuevoVehiculo = new Ford();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Ingresado exitosamente");
                    } else if(marca == 2){
                        Toyota nuevoVehiculo = new Toyota();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Ingresado exitosamente");
                    } else if (marca == 3){
                        Honda nuevoVehiculo = new Honda();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Ingresado exitosamente");
                    } else if (marca == 4){
                        Nissan nuevoVehiculo = new Nissan();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Ingresado exitosamente");
                    } else {
                        System.out.println("Deja de estar chavacaneando ombe");
                    }
                    break;
                case 2:
                    if (vehiculos.isEmpty()) {
                        System.out.println("<><><> No hay vehiculos <><><>");
                    } else {
                        System.out.println("<><><> Mostrando vehiculos <><><>");
                    }
                    for (Vehiculo c : vehiculos){
                        if (c instanceof Toyota) {
                            System.out.println("Marca: Toyota");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.year);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        } else if (c instanceof  Nissan) {
                            System.out.println("Marca: Nissan");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.year);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    x = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}

