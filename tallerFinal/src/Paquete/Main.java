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
        System.out.println("5) Cerrar session.");
		System.out.println("6) Salir.");
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
	
	
private static void change() {
		
		Scanner key2 = new Scanner(System.in);
		Scanner cambio = new Scanner(System.in);
		int modificar = Integer.valueOf(key2.nextLine());
		
		switch(modificar) {
		
		case 0:
			
			
			
			break;
			
		case 1:
			
			System.out.print("Fecha: ");
			String fecha = cambio.nextLine();
			System.out.println();
			
			break;
			
			
		case 2:
			
			System.out.print("Duracion: ");
			int hora = Integer.valueOf(cambio.nextLine());
			System.out.println();
			
			break;
			
			
			
		case 3:
			
			System.out.print("Actividad: ");
			String activ = cambio.nextLine();
			System.out.println();
			
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
		
		change();
		
		
		
	}
	
    public static void main(String[] args) throws FileNotFoundException {

		int a = 0;

        File usuarios = new File("Usuarios.txt");

        File registros = new File("Registros.txt");

        Scanner sc = new Scanner(System.in);

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
						}
						lector.close();
						break;
						case 2:
							menuTres();
							Scanner key2 = new Scanner(System.in);
							int op = Integer.valueOf(key2.nextLine());
							System.out.println();

							switch (op) {
								case 1:
									
									break;
							
								case 2:


									break;


								case 3:
									break;

								case 4:
									System.out.println("Todas las actividades");
									System.out.println();
									Scanner lector3 = new Scanner(registros);
									while (lector3.hasNextLine()){
										String line3 = lector3.nextLine();
										System.out.println(line3);




									}


									break;

							}

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

							case 1: //registrar acticidad | Listeke

								int contadorActividades = 0;
								do {
									int falso = 0;

									System.out.println();
									System.out.println("Ingrese la fecha de la actividad (dd/mm/aaaa)");
									System.out.print("> ");
									String fechaNueva = sc.nextLine();

									try {
										String[] partes = fechaNueva.split("/");
										if (partes.length != 3) {
											System.out.println("Formato de fecha no válido. Use dd/mm/aaaa.");
										}else {
											try {
												int diaFechaNueva = Integer.valueOf(partes[0]);
												int mesFechaNueva = Integer.valueOf(partes[1]);
												int anioFechaNueva = Integer.valueOf(partes[2]);

												if (diaFechaNueva < 1 || diaFechaNueva > 31 || mesFechaNueva < 1 || mesFechaNueva > 12 || anioFechaNueva < 1900) {
													System.out.println("Fecha no válida. Asegúrese de que el día esté entre 1 y 31, el mes entre 1 y 12 y el año sea mayor a 1900");
												} else {

													falso++;
												}
										}catch (Exception e) {
											System.out.println("Formato de fecha no válido. Use dd/mm/aaaa.");
										}
										}
									} catch (Exception e) {
										System.out.println("Error. Intentelo de nuevo");
									}
									if (falso == 1) {
										System.out.println("Ingrese la cantidad de horas en la actividad (En numeros enteros)");
										System.out.print("> ");
										try {
											int horas = Integer.valueOf(sc.nextLine());

											falso++;

											if (falso == 2) {
												System.out.println("Ingrese la actividad realizada");
												System.out.print("> ");
												String actividad = sc.nextLine();
												

												FileWriter creador = new FileWriter("tempRegistros.txt");
												Scanner lector = new Scanner(registros);
												
												while (lector.hasNextLine()) {
													String linea = lector.nextLine();
													creador.write(linea + "\n");
												}
												creador.write(usuarioCorrecto + ";" + fechaNueva + ";" + horas + ";" + actividad);
												creador.close();
												lector.close();
												
												File tempRegistros = new File("tempRegistros.txt");

												if (registros.delete() && tempRegistros.renameTo(registros)) {
													System.out.println("Actividad registrada con exito!");
													contadorActividades++;
												} else {
													System.out.println("Error al registrar la actividad.");
												}
												
											}
										} catch (Exception e) {
											System.out.println("Error. Intentelo de nuevo");
										}
									}
								} while (contadorActividades == 0);

								break;

							case 2: //modificar actividad trabajandose

                        		System.out.println("Cual actividad desea modificar?");
                        		System.out.println();
                        		int i=0;
                        		System.out.println("0) Regresar.");
                        				
                        		int cont=0;
                        		Scanner lector2 = new Scanner(registros);
                        		while(cont<8) {
                        					
                        			String line2 = lector2.nextLine();
                        			String[] sep = line2.split(";");
                        					
                        			String id = sep[0];
                        			
                        					
                        					
                        			if (id.equals(usuarioCorrecto)) {
                        						
                        				System.out.println((++i) + ") "+line2);
                        				cont++;
                        			}



                        		}

								lector2.close();
								Scanner sc3 = new Scanner(System.in);
                        		
                        		System.out.println();
                        		System.out.print("> ");
                        		int selector = Integer.valueOf(sc3.nextLine());
                        		int cont1 = 0;
                        		Scanner lector2_1 = new Scanner(registros);
                        		
                        		while (cont1<selector) {
                        			
                        			String line2_1 = lector2_1.nextLine();
                        			String[] sep1 = line2_1.split(";");
                        			String id = sep1[0];
                        			if (id.equals(usuarioCorrecto)) {
                        				
                        				
                        				cont1++;


										if (cont1==selector){

											System.out.println();
                        			System.out.println("Que deseas modificar?");
                        			System.out.println();
                        			System.out.println("1) Fecha");
                        			System.out.println("2) Duracion");
                        			System.out.println("3) Actividad");
                        			System.out.print("> ");
                        			int key1 = Integer.valueOf(sc3.nextLine());
									
									switch (key1) {
										case 1:
											String new_date = "";
											System.out.println();
											System.out.print("nueva fecha: ");

											String fecha = sc3.nextLine();

											FileWriter creador = new FileWriter("tempRegistros.txt");
											Scanner lectura3_0 = new Scanner(registros);
											int cont2_0 = 0;
											while(cont2_0<selector){
												String line3 = lectura3_0.nextLine();
												String[] sep2 = line3.split(";");

												if (sep2[0].equals(usuarioCorrecto)){
													creador.write(sep2[0]+";"+fecha+";"+sep2[2]+";"+sep2[3]);
												} else {
												creador.write(line3);
												}
											
												if (lectura3_0.hasNextLine()) {
													creador.write("\n");
												}
												cont2_0++;
											}




											creador.close();
											lectura3_0.close();


											File temp = new File("tempUsuarios.txt");
										
										if (registros.delete() && temp.renameTo(registros)) {

											System.out.println("Fecha cambiada con exito!");
											new_date = fecha;
											

										} else {

											System.out.println("Error al actualizar la contraseña.");
										}
											break;
								
										case 2:

											System.out.println();
											System.out.print("Duracion: ");

											int horas = Integer.valueOf(sc3.nextLine());
											int new_horas = 0;
											FileWriter creator = new FileWriter("tempRegistros.txt");
											Scanner lectura3_1 = new Scanner(registros);
											int cont2_1 = 0;
											while(cont2_1<selector){
												String line3_1 = lectura3_1.nextLine();
												String[] sep2 = line3_1.split(";");

												if (sep2[0].equals(usuarioCorrecto)){
													creator.write(sep2[0]+";"+sep2[1]+";"+horas+";"+sep2[3]);
												} else {
												creator.write(line3_1);
											}
											
											if (lectura3_1.hasNextLine()) {
												creator.write("\n");
											}
												cont2_1++;
											}
											creator.close();
											lectura3_1.close();

											File temp_1 = new File("tempUsuarios.txt");
										
										if (registros.delete() && temp_1.renameTo(registros)) {

											System.out.println("Hora(s) cambiada con exito!");
											new_horas = horas;
											

										} else {

											System.out.println("Error al actualizar la contraseña.");
										}


											break;

										case 3:
											
											System.out.println();
											System.out.print("Actividad: ");
											String actividad = sc3.nextLine();
											FileWriter creat = new FileWriter("tempRegistros.txt");
											Scanner lectura3 = new Scanner(registros);
											int cont2 =0;
											while(cont2<selector){
												String line3 = lectura3.nextLine();
												String[] sep2 = line3.split(";");

												if (sep2[0].equals(usuarioCorrecto)){
													creat.write(sep2[0]+";"+sep2[1]+";"+sep2[2]+";"+actividad);
												} else {
													creat.write(line3);
												}
											
												if (lectura3.hasNextLine()) {
													creat.write("\n");
												}
												cont2++;
											}

											creat.close();
											lectura3.close();

										File temp_2 = new File("tempUsuarios.txt");
										
										if (registros.delete() && temp_2.renameTo(registros)) {

											System.out.println("Actividad cambiada con exito!");
											

										} else {

											System.out.println("Error al actualizar la contraseña.");
										}



											break;

											}

										}
                        			}
                        			
                        			
                        		}
                        		
                        		
                        		
								lector2_1.close();
								break;
							
							case 3: //eliminar actividad
								
								System.out.println("Registros de "+ usuarioCorrecto);
								System.out.println("----------------");
								
								Scanner lectorRegistros = new Scanner(registros);

								while (lectorRegistros.hasNextLine()) {
									String linea = lectorRegistros.nextLine();
									String[] part = linea.split(";");

									if (part[0].equals(usuarioCorrecto)) {
										System.out.println(linea);
									}
								}

								lectorRegistros.close();
								
								System.out.println("Cual desea eliminar? (Fecha)");

								System.out.print("> ");
								
								String fechaEliminar = sc.nextLine();

								Scanner lectorRegistros2 = new Scanner(registros);

								int contador = 0;
								while (lectorRegistros2.hasNextLine()) {
									String linea = lectorRegistros2.nextLine();
									String[] part = linea.split(";");

									if (part[1].equals(fechaEliminar) && part[0].equals(usuarioCorrecto)) {
										System.out.println(linea);
										contador++;
									}
								}

								if (contador <= 0) {
									System.out.println("No se encontro la actividad");
								} else if (contador == 1) {
									FileWriter creador = new FileWriter("tempRegistros.txt");
									Scanner lector = new Scanner(registros);

									while (lector.hasNextLine()) {
										String linea = lector.nextLine();
										String[] part = linea.split(";");

										if (part[1].equals(fechaEliminar) && part[0].equals(usuarioCorrecto)) {
											//pass xd
										} else {
											creador.write(linea);
										}
										if (lector.hasNextLine()) {
											creador.write("\n");
										}
									}


									creador.close();
									lector.close();

									File tempRegistros = new File("tempRegistros.txt");

									if (registros.delete() && tempRegistros.renameTo(registros)) {
										System.out.println("Actividad eliminada con exito!");
									} else {
										System.out.println("Error al eliminar la actividad.");
									}

								} else {
										System.out.println("Se enontraron varias actividades con esa fecha, cual desea eliminar? (Escriba la actividad)");
										System.out.print("> ");
										String actividadEliminar = sc.nextLine();


										FileWriter creador = new FileWriter("tempRegistros.txt");
									Scanner lector = new Scanner(registros);

									while (lector.hasNextLine()) {
										String linea = lector.nextLine();
										String[] part = linea.split(";");

										if (part[1].equals(fechaEliminar)&& part[3].equals(actividadEliminar) && part[0].equals(usuarioCorrecto)) {
											//pass xd
										} else {
											creador.write(linea);
										}
										if (lector.hasNextLine()) {
											creador.write("\n");
										}
									}


									creador.close();
									lector.close();

									File tempRegistros = new File("tempRegistros.txt");

									if (registros.delete() && tempRegistros.renameTo(registros)) {
										System.out.println("Actividad eliminada con exito!");
									} else {
										System.out.println("Error al eliminar la actividad.");
									}


									}



								break;


							case 4: //cambiar contraseña | LISTO!
							
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
										
										if (usuarios.delete() && temp.renameTo(usuarios)) {

											System.out.println("Contraseña cambiada con exito!");
											contrtaseña = nuevaContra;
											y++;

										} else {

											System.out.println("Error al actualizar la contraseña.");
										}
										
										
										
									}else if (respuesta.equals("n")) {
										System.out.println("Contraseña no cambiada");
										y++;

									} else {
										System.out.println("Ingrese una respuesta valida");
										System.out.println();
									}
								} while (y == 0);
								
								break;

								case 5: //cerrar session | Listo
								
								usuarioCorrecto = "";
								contrtaseña = "";
								System.out.println("Session cerrada");
								
								break;

							case 6: //salir | listo
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