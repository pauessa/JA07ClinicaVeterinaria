/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja07clinicaveterinaria;

import java.awt.SystemColor;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author pauessa
 */
public class AplicacionClinicaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Clinica cli = null;
        Vacuna v = null;
        Vacuna vacunaActiva = null;
        Calendar fecha = null;
        Perro perro;
        Perro perroActivo;
        String nombre = null;
        String raza = null;
        int opc = 0;
        do {
            menu();
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Introduce nombre para la Veterinaria");
                    nombre = teclado.nextLine();
                    cli = new Clinica(nombre);
                    break;
                case 2:
                    int id,
                     recuerdo;
                    double precio;

                    System.out.println("introduce id");
                    id = teclado.nextInt();
                    System.out.println("introduce recuerdo");
                    recuerdo = teclado.nextInt();
                    System.out.println("introduce precio");
                    precio = teclado.nextDouble();
                    v = new Vacuna(id, recuerdo, nombre, precio);
                    cli.addVacuna(v);
                    break;
                case 3:
                    do {
                        System.out.println("introduce nombre perro");
                        nombre = teclado.nextLine();
                        perroActivo = cli.buscarPerro(nombre);
                    } while (perroActivo != null);
                    System.out.println("introduce raza perro");
                    raza = teclado.nextLine();

                    perro = new Perro(nombre, raza, null);

                    break;
                case 4:
                    int año,
                     dia,
                     mes,
                     hora,
                     min;

                    System.out.println("introduce nombre perro");
                    nombre = teclado.nextLine();
                    perroActivo = cli.buscarPerro(nombre);
                    if (perroActivo != null) {
                        System.out.println("introduce raza perro");
                        raza = teclado.nextLine();

                        perroActivo = new Perro(nombre, raza, null);
                    }

                    System.out.println("Que vacuna quieres introducir (id)");
                    cli.mostrarVacunas();
                    id = teclado.nextInt();
                    vacunaActiva = cli.obtenerVacuna(id);
                    System.out.println("introduce Año");
                    año = teclado.nextInt();
                    System.out.println("introduce mes");
                    mes = teclado.nextInt();
                    System.out.println("introduce dia");
                    dia = teclado.nextInt();
                    System.out.println("introduce horas");
                    hora = teclado.nextInt();
                    System.out.println("introduce minutos");
                    min = teclado.nextInt();

                    fecha.set(año, mes, dia, hora,min, 0);

                    break;
            }
        } while (opc != 0);

    }

    private static void menu() {
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
    }

}
