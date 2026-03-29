package Paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File usuarios = new File("Usuarios.txt");

        File registros = new File("Registros.txt");

        Scanner sc = new Scanner(System.in);

        int x = 0;
        //int usuarioCargado = 0;

        String usuarioCorrecto = "";
        
        do {
            System.out.println();
            
            /*if (usuarioCargado == 1) {
                System.out.println("Bienvenido " + usuarioCorrecto);
                System.out.println();

            }*/
            System.out.println("1) Menu de Usuarios");
            System.out.println("2) Menu de Analisis");
            System.out.println("3) Salir");
            System.out.print("> ");

            try {

                int opcion = Integer.valueOf(sc.nextLine());
                System.out.println();
                switch (opcion) {
                    case 1:
                        System.out.print("Usuario: ");
                        String usuario = sc.nextLine();
                        System.out.print("");

                        System.out.print("Contraseña: ");
                        String password = sc.nextLine();
                        System.out.print("");

                        //usuarioCorrecto = usuario; //hace vo la pega de cargar el usuario nico
                        //usuarioCargado = 1;
                        
                        Scanner lector = new Scanner(usuarios);
                        
                        System.out.println(" ");
                        while (lector.hasNextLine()) {
                        	String line = lector.nextLine();
                        	String[] part = line.split(";");
                        	
                        	String user = part[0];
                        	String contra = part[1];
                        	
                        	
                        	if (user.equals(usuario) && password.equals(contra)) {
                        		
                        		System.out.println("Acceso correcto!");
                        		System.out.println();
                        		System.out.println("Bienvenido "+ user);
                        		System.out.println();
                        		System.out.println("Que desea realizar?");
                        		System.out.println();
                        		System.out.println("1) Registrar actividad.");
                        		System.out.println("2) Modificar actividad.");
                        		System.out.println("3) Eliminar actividad.");
                        		System.out.println("4) Cambiar contraseña.");
                        		System.out.println("5) Salir.");
                        		System.out.print("> ");
                        		
                        		int op = Integer.valueOf(sc.nextLine());
                        		
                        		switch (op) {
                        			case 1:
                        				
                        				
                        				
                        				
                        				
                        				break;
                        				
                        			
                        			case 2:
                        				
                        				System.out.println();
                        				System.out.println("Cual actividad desea modificar?");
                        				System.out.println();
                        				int i=0;
                        				System.out.println("0) Regresar.");
                        				
                        				
                        				Scanner lector2 = new Scanner(registros);
                        				while(lector2.hasNextLine()) {
                        					
                        					String line2 = lector2.nextLine();
                        					String[] sep = line2.split(";");
                        					
                        					String id = sep[0];
                        					String date = sep[1];
                        					int horas = Integer.valueOf(sep[2]);
                        					String actividad = sep[3];
                        					//System.out.println(date);
                        					
                        					
                        					if (id.equals(usuario)) {
                        						
                        						System.out.println((++i) + ") "+line2);
                        						
                        					}
                        				}
                        				System.out.println("Que deseas modificar?");
                        				
                        				
                        				break;
                        				
                        			
                        				
                        			case 3:
                        				
                        				
                        				
                        				
                        				
                        				
                        				break;
                        				
                        				
                        				
                        			case 4:
                        				
                        				
                        				
                        				
                        				
                        				
                        				break;
                        				
                        				
                        				
                        			case 5:
                        				
                        				
                        				
                        				
                        				
                        				
                        				break;
                        				
                        				
                        			
                        		
                        		
                        		
                        		
                        		}
                        		

                        		
                        		
                        		
                        		
                        		
                        		System.out.println();
                        		
                        		
                        		
                        		
                        		break;
                        	} 
                        	//System.out.println(user);
                        
                        }
                        
                        
                        
                        
                        
                        
                        lector.close();
                        break;

                    case 2:
                        System.out.println("Test opcion 2"); //para el menu nececito que puedas cargar bien el archivo


                        break;

                    case 3:
                        System.out.println("Adios");
                        x++;
                        break;

                    default:
                        System.out.println("Opcion no valida, intente de nuevo");
                        break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println("Por favor ingrese un numero");
            }
        } while (x == 0);
    }

}
/*
if (check == false) {
					System.out.println("Ingrese el nombre de el archivo");
					String nombre = String.valueOf(sc.nextLine());
					
					try {
						File arch = new File("uni/ayudantia2/archivos/"+nombre+".txt");
						Scanner Sarch = new Scanner(arch);
					
						while(Sarch.hasNextLine()) {
							String linea = Sarch.nextLine();
						
							String[] partes = linea.split(",");
						
						}
						
						check = true;
						Sarch.close();
					
				
					} catch (Exception e) {
						System.out.println("No existe el archivo");
						
						check = false;
					}
*/