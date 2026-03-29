package Paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File usuarios = new File("Taller-Poo/Test_1/src/archivos/Usuarios.txt");

        File registros = new File("Taller-Poo/Test_1/src/archivos/Registros.txt");

        Scanner sc = new Scanner(System.in);

        int x = 0;

        String usuarioCorrecto = "";
        
        do {
			if (usuarioCorrecto == "") {

				System.out.println();
            
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

							Scanner lector = new Scanner(usuarios);
                        
                        System.out.println(" ");
                        while (lector.hasNextLine()) {
                        	String line = lector.nextLine();
                        	String[] part = line.split(";");
                        	
                        	String user = part[0];
                        	String contra = part[1];
                        	
                        	
                        	if (user.equals(usuario) && password.equals(contra)) {
                        		usuarioCorrecto = user;
								break;
							}
						}
						
						case 2:
							System.out.println("Primero inicie session");

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

						System.out.println("Error, intenttelo de nuevo");
					}



					

			}else {
				System.out.println("Acceso correcto!");
                    System.out.println();
                    System.out.println("Bienvenido "+ usuarioCorrecto);
                    System.out.println();
                    System.out.println("Que desea realizar?");
                    System.out.println();
                    System.out.println("1) Registrar actividad.");
                    System.out.println("2) Modificar actividad.");
                    System.out.println("3) Eliminar actividad.");
                    System.out.println("4) Cambiar contraseña.");
                    System.out.println("5) Salir.");
                    System.out.print("> ");

					try {
						int opcion = Integer.valueOf(sc.nextLine());

						System.out.println();

						switch (opcion) {

							case 1:
								
								System.out.println("Test 1");

								break;

							case 2:

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
                        					
                        					
                        			if (id.equals(usuarioCorrecto)) {
                        						
                        				System.out.println((++i) + ") "+line2);
                        						
                        			}
                        		}
                        		System.out.println("Que deseas modificar?");

								break;
							
							case 3:
								System.out.println("Test 3");

								break;


							case 4:
								System.out.println("Test 4");
								break;

							case 5:
								System.out.println("Adios!");
								x++;
								break;


							default:

								System.out.println("Ingrese una opcion valida");
								
								break;
						}
						


					} catch (Exception e) {

						System.out.println("Ingrese un valor numérico");
					}
					

			}
		} while (x == 0);
		sc.close();
	}
}