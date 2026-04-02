package Paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;


public class Main {
	
	public static void menuUno() {
		
		System.out.println();
		
		System.out.println("1) Menu de Usuarios");
		System.out.println("2) Menu de Analisis");
		System.out.println("3) Salir");
		System.out.print("> ");
	}

	public static void menuDos() {
		System.out.println();
        System.out.println("Que desea realizar?");
        System.out.println();
		System.out.println("1) Registrar actividad.");
        System.out.println("2) Modificar actividad.");
        System.out.println("3) Eliminar actividad.");
        System.out.println("4) Cambiar contraseña.");
        System.out.println("5) Salir.");
        System.out.print("> ");
	}
	
	private static void menuTres() {
		System.out.println();
		System.out.println("Bienvenido al menu de analisis!");
		System.out.println();
		System.out.println("Que desea realizar?");
		System.out.println();
		System.out.println("1) Actividad más realizada");
		System.out.println("2) Actividad más realizada por cada usuario");
		System.out.println("3) Usuario con mayor procastinacion");
		System.out.println("4) Ver todas las actividades");
		System.out.println("5) Salir");
		System.out.print("> ");
		
	}
	
	
	private static void menuCuatro() {
		System.out.println();
		System.out.println("Que desea agregar?");
		System.out.println();
		System.out.print("fecha: ");
		Scanner key = new Scanner(System.in);
		String fecha = key.nextLine();
		System.out.print("actividad: ");
		String ac = key.nextLine();
		System.out.println();
		System.out.println("Actvidad agregada!");
		
		
	}
	
	private static void menuCinco() {
		
		System.out.println();
		System.out.println("Que desea eliminar?");
		System.out.println();
		
		
		
	}
	
	private static void menuMod() {
		
		System.out.println();
		System.out.println("Que actividad deseas modificar?");
		Scanner llave = new Scanner(System.in);
		System.out.print("> ");
		int op = Integer.valueOf(llave.nextLine());
		switch(op) {
		case 0:
			
			
			
			break;
		case 1:
			
			Mod();
			
			
			
			break;
		case 2:
			
			Mod();
			
			
			break;
		case 3:
			
			
			Mod();
			
			
			break;
		case 4:
			
			
			Mod();
			
			break;
		case 5:
			
			Mod();
			
			break;
		case 6:
			
			Mod();
			
			break;
		case 7:
			
			
			Mod();
			
			break;
		case 8:
			
			
			
			Mod();
			
			break;
			
		}
		
		
		
		
		
	}
	
	private static void Mod() {
		
		System.out.println();
		System.out.println("Que deseas modificar?");
		System.out.println();
		System.out.println("0) Regresar.");
		System.out.println("1) Fecha");
		System.out.println("2) Duracion");
		System.out.println("3) Tipo de actividad");
		System.out.print("> ");
		Scanner llave3 = new Scanner(System.in);
		int cambio = Integer.valueOf(llave3.nextLine());
		
		
		
		
	}
	
	
	private static void change() {
		
		Scanner key2 = new Scanner(System.in);
		
		int modificar = Integer.valueOf(key2.nextLine());
		
		
		
		
		
	}
	
	
	
    public static void main(String[] args) throws FileNotFoundException {
    	
    	
    	
    	

		int a = 0;

        File usuarios = new File("Usuarios.txt");

        File registros = new File("Registros.txt");

        Scanner sc = new Scanner(System.in);
        
        
        Scanner sc2 = new Scanner(System.in);
        
        

		String contrtaseña = "";

        int x = 0;

        String usuarioCorrecto = "";
        
        do {
			if (usuarioCorrecto.equals("")) {

				menuUno();

				
				try {

				
                	int opcion = Integer.valueOf(sc.nextLine());

                	System.out.println();
                	switch (opcion) {
                    	case 1:
                        	System.out.print("Usuario: ");
                        	String usuario = sc.nextLine();
							usuario = usuario.toLowerCase();
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
                        	
                        	
                        	if (user.toLowerCase().equals(usuario.toLowerCase()) && password.equals(contra)) {
                        		usuarioCorrecto = user;
								contrtaseña = contra;
								break;
							}
							lector.close();
						}
						break;
						case 2:
							
							
							menuTres();
							int option = Integer.valueOf(sc2.nextLine());
							
							
							
							

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
				if (a == 0) {
					System.out.println("Acceso correcto!");
					System.out.println();
					System.out.println("Bienvenido "+ usuarioCorrecto);
					a++;
				}
                menuDos();

					try {
						int opcion = Integer.valueOf(sc.nextLine());

						System.out.println();

						switch (opcion) {

							case 1: //registrar acticidad | trabajandose
								
								menuCuatro();
								
								

								break;

							case 2: //modificar actividad | trabajandose

                        		System.out.println("Cual actividad desea modificar?");
                        		System.out.println();
                        		int i=0;
                        		System.out.println("0) Regresar.");
                        				
                        				
                        		Scanner lector2 = new Scanner(registros);
                        		for (int j=0;j<8;j++) {
                        					
                        			String line2 = lector2.nextLine();
                        			String[] sep = line2.split(";");
                        					
                        			String id = sep[0];
                        			String date = sep[1];
                        			int horas = Integer.valueOf(sep[2]);
                        			String actividad = sep[3];
                        					
                        					
                        			if (id.equals(usuarioCorrecto)) {
                        						
                        				System.out.println((++i) + ") "+line2);
                        				j= j-2;
                        						
                        			}
                        		}
                        		
                        		menuMod();
                        		

								break;
							
							case 3: //eliminar actividad
								//System.out.println("Test 3");
								
								menuCinco();
								
								
								
								
								
								
								break;


							case 4: //cambiar contraseña | trabajandose
							
							int y =	 0;
							do { 
									System.out.println("Desea cambiar la contraseña? (s/n)");
									String respuesta = sc.nextLine();
									respuesta = respuesta.toLowerCase();

									if (respuesta.equals("s")) {
										System.out.println("Ingrese la nueva contraseña: ");
										System.out.print("> ");
										String nuevaContra = sc.nextLine();

										FileWriter creador = new FileWriter("tempUsuarios.txt");
										
										Scanner lector = new Scanner(usuarios);
										
										while (lector.hasNextLine()) {
											String linea = lector.nextLine();
											String[] part = linea.split(";");
											
											if (part[0].equals(usuarioCorrecto)) {
												creador.write(part[0] + ";" + nuevaContra);
											} else {
												creador.write(linea);
											}
											
											if (lector.hasNextLine()) {
												creador.write("\n");
											}
											
										}
										creador.close();
										lector.close();

										File temp = new File("tempUsuarios.txt");
										
										usuarios.delete();
										temp.renameTo(usuarios);

										System.out.println("Contraseña cambiada con exito!");
										contrtaseña = nuevaContra;
										y++;

									}else if (respuesta.equals("n")) {
										System.out.println("Contraseña no cambiada");
										y++;

									} else {
										System.out.println("Ingrese una respuesta valida");
										System.out.println();
									}
								} while (y == 0);
								
								break;

							case 5: //salir | listo
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