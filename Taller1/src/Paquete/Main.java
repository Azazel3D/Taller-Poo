package Paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File usuarios = new File("Taller-Poo/Taller1/src/archivos/Usuarios.txt");

        File registros = new File("Taller-Poo/Taller1/src/archivos/Registros.txt");

        Scanner sc = new Scanner(System.in);

        int x = 0;
        
        do {
            System.out.println();

            System.out.println("1) Menu de Usuarios");
            System.out.println("2) Menu de Analisis");
            System.out.println("3) Salir");
            System.out.print("> ");

            try {
                int opcion = Integer.valueOf(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Test opcion 1");
                        break;

                    case 2:
                        System.out.println("Test opcion 2");
                        break;

                    case 3:
                        System.out.println("Adios");
                        x++;
                        break;

                    default:
                        System.out.println("Opcion no valida, intente de nuevo");
                        break;
                }

            } catch (Exception e) {
                System.out.println();
                System.out.println("Por favor ingrese un numero");
            }
        } while (x == 0);
    }

}
