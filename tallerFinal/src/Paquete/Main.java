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
	
    public static void main(String[] args) throws FileNotFoundException {

		int a = 0;

        File usuarios = new File("Taller-Poo/tallerFinal/src/archivos/Usuarios.txt");

        File registros = new File("Taller-Poo/tallerFinal/src/archivos/Registros.txt");

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
												

												FileWriter creador = new FileWriter("Taller-Poo/tallerFinal/src/archivos/tempRegistros.txt");
												Scanner lector = new Scanner(registros);
												
												while (lector.hasNextLine()) {
													String linea = lector.nextLine();
													creador.write(linea + "\n");
												}
												creador.write(usuarioCorrecto + ";" + fechaNueva + ";" + horas + ";" + actividad);
												creador.close();
												lector.close();
												
												File tempRegistros = new File("Taller-Poo/tallerFinal/src/archivos/tempRegistros.txt");

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
									FileWriter creador = new FileWriter("Taller-Poo/tallerFinal/src/archivos/tempRegistros.txt");
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

									File tempRegistros = new File("Taller-Poo/tallerFinal/src/archivos/tempRegistros.txt");

									if (registros.delete() && tempRegistros.renameTo(registros)) {
										System.out.println("Actividad eliminada con exito!");
									} else {
										System.out.println("Error al eliminar la actividad.");
									}

								} else {
										System.out.println("Se enontraron varias actividades con esa fecha, cual desea eliminar? (Escriba la actividad)");
										System.out.print("> ");
										String actividadEliminar = sc.nextLine();


										FileWriter creador = new FileWriter("Taller-Poo/tallerFinal/src/archivos/tempRegistros.txt");
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

									File tempRegistros = new File("Taller-Poo/tallerFinal/src/archivos/tempRegistros.txt");

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

										
										FileWriter creador = new FileWriter("Taller-Poo/tallerFinal/src/archivos/tempUsuarios.txt");
										
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
										
										File temp = new File("Taller-Poo/tallerFinal/src/archivos/tempUsuarios.txt");
										
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