/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja07clinicaveterinaria;

import java.awt.SystemColor;
import java.util.ArrayList;
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
        VacunaPerro vp = null;
        Calendar fecha = Calendar.getInstance();
        Perro perro;
        Perro perroActivo;
        String nombre = null;
        String raza = null;
        int opc = 0;
        ArrayList<Perro> arrayperros =null;
        do {
            menu();
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 9:
                    cli = new Clinica("asd");
                    v = new Vacuna(1, 2, "3", 4);
                    Vacuna v1 = new Vacuna(2, 3, "4", 5);
                    cli.addVacuna(v);
                    cli.addVacuna(v1);
                    perro = new Perro("pepet", "raza", null);
                    cli.addPerro(perro);
                    perro = new Perro("juanet", "fullhd", null);
                    cli.addPerro(perro);
                    break;

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
                    cli.addPerro(perro);

                    break;
                case 4:
                    int año,
                     mes,
                     dia;

                    System.out.println("introduce nombre perro");
                    nombre = teclado.nextLine();
                    perroActivo = cli.buscarPerro(nombre);
                    if (perroActivo == null) {
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

                    fecha.set(año, mes, dia);

                    vp = new VacunaPerro(fecha, vacunaActiva);

                    if (perroActivo.buscarVacunaPerro(vp)) {
                        perroActivo.addVacuna(vp);
                    } else {
                        System.out.println("no ser posible vacunar al ser vivo");
                    }

                    break;
                case 5:
                    System.out.println("introduce nombre perro");
                    nombre = teclado.nextLine();
                    perroActivo = cli.buscarPerro(nombre);
                    System.out.println("clinica " + cli.getNombre());
                    perroActivo.mostrarVacunaPerro();
                    break;
                case 6:
                    System.out.println("introduce nombre perro");
                    nombre = teclado.nextLine();
                    perroActivo = cli.buscarPerro(nombre);
                    if (perroActivo != null) {
                        System.out.println("clinica " + cli.getNombre());
                        perroActivo.mostrarVacunaPerro();

                        perroActivo.ajustarFecha();

                        System.out.println(perroActivo.getFechaProx().getTime());
                    } else {
                        System.out.println("el perro no existe");
                    }

                    break;
                case 7:
                    arrayperros = new ArrayList<>();
                    System.out.println("Que vacuna quieres buscar (id)");
                    cli.mostrarVacunas();
                    id = teclado.nextInt();
                    vacunaActiva = cli.obtenerVacuna(id);
                    arrayperros = cli.listadoVacunasPerro(v);
                    mostrarListado(arrayperros);

                    break;
                case 8:
                    arrayperros = new ArrayList<>();
                    System.out.println("introduce mes");
                    mes=teclado.nextInt();
                    arrayperros=cli.buscarPerroMes(mes);
                    mostrarListado(arrayperros);
                    break;
            }
        } while (opc != 0);

    }

    private static void menu() {
        System.out.println("1.crear veterinaria");
        System.out.println("2.crear vacuna");
        System.out.println("3.crear perros");
        System.out.println("4.insertar vacuna al perro");
        System.out.println("5.");
    }

    private static void mostrarListado(ArrayList<Perro> arrayperros) {
        for (Perro arrayperro : arrayperros) {
            if (arrayperro!=null) {
                 System.out.println(arrayperro);
            }
           
        }
    }

}
