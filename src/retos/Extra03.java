package retos;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Extra03 {
	// variables
	private TreeMap<String, Long> listin = new TreeMap<>();
	Scanner sc = new Scanner(System.in);
	String name = "";
	Long number;
	Long antiguo;

	// constructor
	public Extra03() {

	}

	// getter y setter
	public TreeMap<String, Long> getlistin() {
		return listin;
	}

	public void setListin(TreeMap<String, Long> listin) {
		this.listin = listin;
	}

	public Long getAntiguo() {
		return antiguo;
	}

	// funciones
	public int insertar(String nombre, Long telefono) {
		try {
			final boolean once = Long.toString(telefono).length() == 11;
			final boolean positivo = Long.toString(telefono).charAt(0) != '-';
			if (once && positivo) {
				listin.put(nombre, telefono);
				return 0;
			} else if (once && !positivo) {
				return 1;
			} else {
				return 2;
			}
		} catch (Exception e) {
			System.err.print("ocurrió una escepción " + e.getMessage() + e.getStackTrace());
			return -1;
		}
	} // fin de insertar()

	public int actualizar(String nombre, Long telefonoNuevo) {
		try {
			antiguo = listin.get(nombre);
			final boolean once = Long.toString(telefonoNuevo).length() == 11;
			final boolean positivo = Long.toString(telefonoNuevo).charAt(0) != '-';
			if (once && positivo) {
				listin.replace(nombre, telefonoNuevo); // de los metodos que tiene la clase TreeMap, parece el mas
				return 0;
			} else if (once && !positivo) {
				return 1;
			} else {
				return 2;
			}
		} catch (Exception e) {
			System.err.print("ocurrió una escepción " + e.getMessage() + e.getStackTrace());
			return -1;
		}
	}// fin de actualizar()

	public int eliminar(String nombre) {
		try {
			if (listin.containsKey(nombre)) {
				listin.remove(nombre);
				return 0;
			} else {
				return 1;
			}
		} catch (Exception e) {
			System.err.print("ocurrió una escepción " + e.getMessage() + e.getStackTrace());
			return -1;
		}
	}// fin de eliminar()

	public int buscar(String nombre) {
		try {
			if (listin.containsKey(nombre)) {
				return 0;
			} else {
				return 1;
			}
		} catch (Exception e) {
			System.err.print("ocurrió una escepción " + e.getMessage() + e.getStackTrace());
			return -1;
		}
	}// fin de busqueda()

	enum OpcionMenu {
		S("Salir"), M("Mostrar"), I("Insertar"), B("Buscar"), A("Actualizar"), E("Eliminar");

		private final String opciones;

		private OpcionMenu(String opciones) {
			this.opciones = opciones;
		}

		public String getOpciones() {
			return opciones;
		}
	} // fin de declaracion type enum

	public void menu() {
		OpcionMenu option = null;
		do {
			System.out.println(" _______________ ");
			System.out.println("|               |");
			System.out.println("| S-Salir       |");
			System.out.println("| M-Mostrar     |");
			System.out.println("| I-Insertar    |");
			System.out.println("| B-Buscar      |");
			System.out.println("| A-Actualizar  |");
			System.out.println("| E-Eliminar    |");
			System.out.println("|_______________|");
			String scan = sc.next().toUpperCase();
			try {
				option = Enum.valueOf(OpcionMenu.class, scan);
			} catch (IllegalArgumentException e) {
				System.out.println("Opción no válida. Inténtelo de nuevo.");
				continue; // Volver al principio del bucle do-while
			}
			boolean salida = true;
			switch (option) {
			case A:
				System.out.println("Procedemos a Actualizar un contacto existente");
				System.out.println("introduzca el nombre del contacto a modificar: ");
				name = sc.next();
				do {
					System.out.println("introduzca un teléfono válido");
					if (sc.hasNextLong()) {
						number = sc.nextLong();
						switch (actualizar(name, number)) {
						case -1:
							break;
						case 0:
							System.out
									.println(name + ": el telefono " + getAntiguo() + " sera modificado por " + number);
							actualizar(name, number);
							salida = false;
							break;
						case 1:
							System.out.println("el telefono ingresado no puede ser negativo");
							break;
						case 2:
							System.out.println("no se pudo modificar el numero " + number + " por contener " + ""
									+ Long.toString(number).length() + " digitos y no 11");
							break;
						default:
							break;
						}
					} else {
						System.out.println("Por favor, introduzca un teléfono válido");
						sc.next(); // Descarta la entrada no válida
					}
				} while (salida == true);
				break; // de case A:
			case B:
				System.out.println("Introduzca el nombre del contacto que desea Buscar: ");
				name = sc.next();
				if (buscar(name) == 1) {
					System.out.println("el contacto no existe");
				} else if (buscar(name) == 0) {
					System.out.print("el numero telefonico de " + name + " es: ");
					System.out.println(listin.get(name));

				}
				break;
			case E:
				System.out.println("Introduzca el nombre del contacto que desea Eliminar: ");
				name = sc.next();
				switch (eliminar(name)) {
				case -1:
					break;
				case 0:
					eliminar(name);
					System.out.println("el contacto " + name + " ha sido eliminado correctamente.");
					break;
				case 1:
					System.out.println("el contacto " + name + " no existe o ya ha sido eliminado.");
					break;
				default:
					break;
				}
				break;
			case I:
				System.out.println("Procedemos a Insertar un usuario nuevo.");
				System.out.println("introduzca un nombre: ");
				name = sc.next();
				do {
					System.out.println("introduzca un teléfono valido");
					if (sc.hasNextLong()) {
						number = sc.nextLong();
						switch (insertar(name, number)) {
						case -1:
							break;
						case 0:
							insertar(name, number);
							salida = false;
							System.out.println("añadido: " + name + " " + number);
							break;
						case 1:
							System.out.println("el telefono ingresado no puede ser negativo");
							break;
						case 2:
							System.out.println("no se pudo añadir el numero " + number + " por contener " + ""
									+ Long.toString(number).length() + " digitos y no 11");
							break;
						default:
							break;
						}
					} else {
						System.out.println("Los caracteres añadidos no son validos");
						sc.next(); // Descarta la entrada no válida
					}
				} while (salida == true);
				break; // de case I:
			case M:
				System.out.println("a continuacion se mostrara el listado de contactos añadidos: ");
				if (listin.isEmpty()) {
					System.out.println("No hay contactos almacenados.");
				} else {
					for (Map.Entry<String, Long> i : listin.entrySet()) {
						String nombres = i.getKey();
						Long telefono = i.getValue();
						System.out.println(nombres + "\t" + telefono);
					}
				}
				break;
			case S:
				System.out.println("cerrando sistema y saliendo...");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			} // fin switch-case de option
		} while (option != OpcionMenu.S); // cierra el bucle con la opcion S
		sc.close();
		System.out.println("Puede usted apagar el equipo.");
		System.exit(0);
	} // fin metodo menu()
}// fin Class Extra03
