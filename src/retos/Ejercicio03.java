package retos;

import java.util.*;

/*
 EJERCICIO:
 - Muestra ejemplos de creación de todas las estructuras soportadas por defecto en tu lenguaje.
 - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 
 DIFICULTAD EXTRA (opcional):
 Crea una agenda de contactos por terminal.
 - Debes implementar funcionalidades de búsqueda, inserción, actualización y eliminación de contactos.
 - Cada contacto debe tener un nombre y un número de teléfono.
 - El programa solicita en primer lugar cuál es la operación que se quiere realizar, y a continuación
 los datos necesarios para llevarla a cabo.
 - El programa no puede dejar introducir números de teléfono no númericos y con más de 11 dígitos.
 (o el número de dígitos que quieras)
 - También se debe proponer una operación de finalización del programa.
 */
public class Ejercicio03 {
/*
Array, matriz o arreglo, es una coleccion de elementos almacenados en ubicaciones de memoria contiguas.
		Cada elemento se puede identificar de forma unica mediante el valor del indice.
	Array: tienen un mismo tipo, tamaño fijo, se acceden a traves de un indice y no pueden ser eliminadas
	
List, estructura de datos lineal donde cada nodo apunta al siguiente por que no se almacena en la
		ubicacion de memoria contigua. Esto proporciona que pueda ampliar o reducir su tamaño durante la
		ejecucion del programa. 
	ArrayList, permite insertar (add), eliminar (remove), modificar por el indice (set) y ordenar (sort)
		los elementos.
	LinkedList, Añade métodos adicionales y permite disponer de una lista doblemente enlazada, cada nodo 
		apunta al anterior y al posterior. Permite insertar (add), eliminar (remove), modificar por indice
		(set) y ordenar (sort).

Stack, estructura de datos lineal que representa una pila (último en entrar, primero en salir). Permite
		agregar (push y add), eliminar (pop), modificar (set) y ordenar (sort) aun no siendo necesario.

Queue, cola abierta de patron lineal. Pueden ser de varios tipos. Primero en entrar, primero en salir.
		Permite agregar (offer), obtener el primer elemento (peek), obtener el primer elemento y 
		eliminarlo (poll), pero no se puede modificar por indice, ni ordenar.

Set, permite añadir elementos no repetidos a una collection
	HashSet, Se almacenan desordenados por lo cual no se podran modificar tampoco. Permite elementos nulos.
		Permite agregar (add) y eliminar (remove)
	TreeSet, se almacenan ordenados los elementos en un orden natural o con un comparador explicito. 
		No permite elementos nulos. Se pueden insertar (add), eliminar (remove) y ya esta ordenada. 
	
Map, Un diccionario es una colección de pares clave-valor, no se puede repetir nunca la clave.
	HashMap, se almacenan desordenados. Te permite agregar (put), modificar desde la clave (put), obtener
		un valor desde una clave (get) y eliminarlo (remove). Puede tener una clave nula y múltiples 
		valores nulos
	TreeMap, Se almacena ordenado de forma natural o personalizado. Te permite agregar (put), modificar 
		desde la clave (put) y eliminarlo (remove). No puede tener una clave nula, pero puede tener varios 
		valores nulos. Implementa la interfaz NavigableMap y extiende la clase AbstractMap.
	
Properties, gestiona pares clave-valor, diseñada para cadenas de texto. Usada para configuraciones y 
		archivos de propiedades en aplicaciones Java. Para agregar (setProperty) modificar (setProperty) y
		eliminar (remove), pero no se garantiza un orden.	*/
	
	// Arrays 
	    //array 
	public void arrays() {
		int[] enteros = {10,20,30,40,50};
		for (int n : enteros) {
			if ( n == enteros[enteros.length - 1 ]) {
				System.out.print(n+"\n");
			}else {
				System.out.print(n+", ");				
			}
		}
	}
	    //bidimensional o mas dimensiones si fuese necesario
	public void matriz() {
		String[][] casilla = new String[3][3];
		casilla[0][0]="0-0";
		casilla[0][1]="0-1";
		casilla[0][2]="0-2";
		casilla[1][0]="1-0";
		casilla[1][1]="1-1";
		casilla[1][2]="1-2";
		casilla[2][0]="2-0";
		casilla[2][1]="2-1";
		casilla[2][2]="2-2";
		for (int i=0;i<casilla.length;i++) {
			for(int j=0;j<casilla[i].length;j++) {
				if (casilla[i][j]==casilla[casilla.length - 1][casilla[i].length - 1]) {
					System.out.println(casilla[i][j]+"\n");
				}else {
					System.out.print(casilla[i][j]+" : ");
				}	
			}
		}
	}
    // Listas
	    //arrayList pueden cambiar de tamaño durante la ejecución del programa
	public void arrayList() {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("primero");
		lista.add("segundo");
		lista.add("tercero");
		System.out.println("Elementos iniciales: "+lista);
			//almacenar un elemento de la ArrayList en una variable
		String uno = lista.get(0);
		System.out.println("elemento de indice 0: "+ uno);
			//modificar por el indice
		lista.set(2, "tercero modificado");
		System.out.println("tras la modificacion: "+lista);
			//borrar elemento existente y añadir nuevo elemento modificando la longitud de la 
				//arrayList dos veces.
		lista.add("cuarto");
		lista.remove(1);
		System.out.println("borrado el indice 1 y añadido un indice nuevo queda: \n"+"indice 0: "
				+lista.get(0)+"\n"+"indice 1: "+lista.get(1)+"\n"+"indice 2: "+lista.get(2)+"\n");
	}
	    //linkedList 
	public void linkedList() {
		 LinkedList<String> link = new LinkedList<>();
		 	System.out.println("LinkedList es basicamente lo mismo que ArrayList pero con enlaces al "
		 			+ "indice anterior y posterior \n");
	}
	    //stack representa una pila en la que el último elemento agregado es el primero en ser eliminado
	public void stack() {
		Stack<String> stack = new Stack<>();
			//almacenar en la pila, stackear que decimos en los juegos, apilar.
		stack.push("Pedro");
		stack.add("Juan");
		stack.push("Pepe");
		stack.add("Francisco");
		System.out.println("Elementos iniciales del stack: "+stack);
			//modificar por el indice
		stack.set(0, "Pedro F");
		System.out.println("tras la modificacion: "+stack);
			//borrar el ultimo en entrar.
		stack.pop();
		System.out.println("Contenido modificado de la pila: " + stack);
			// ordenar. es posible ordenar pero no es necesario
        stack.sort(Comparator.naturalOrder());
        System.out.println("Ordenado: " + stack+ "\n");
	}
		// Queue para manejar colas, primero en entrar, primero en salir
	public void deQueue() {
		Queue<String> cola = new ArrayDeque<>();
			//almacenar a la fila
		cola.offer("Milagros");
		cola.offer("Carlos");
		cola.offer("Jose");
		cola.offer("Paco");
		System.out.println("Elementos iniciales de la queue (cola): "+cola);
			// Obtener y eliminar el primer elemento de la cola
		String primerElemento=cola.poll();
		System.out.println("Primer elemento obtenido y eliminado: " + primerElemento);
			// Mostrar la cola después de la operación de poll
        System.out.println("Cola después de poll: " + cola);
        	// Obtener el primer elemento sin eliminarlo
        String primerElementoPeek = cola.peek();
        System.out.println("Primer elemento obtenido sin eliminar: " + primerElementoPeek);
        	// Mostrar la cola después de peek
        System.out.println("Cola después de peek: " + cola + "\n");
        cola.remove();
	}
    // Sets
	    //hashSet, añade elementos no repetidos al grupo
	public void hashSet() {
		HashSet<String> setEjemplo =new HashSet<>();
		setEjemplo.add("Arancha");
		setEjemplo.add("Marcos");
		setEjemplo.add("Noelia");
		setEjemplo.add("Dimitru");
		setEjemplo.add("Marcos"); //se intenta duplicar
		System.out.println("Lista inicial HashSet: "+ setEjemplo);
			//no se puede modificar, pero si se puede eliminar e insertar eliminacion.
		setEjemplo.remove("Marcos");
		System.out.println("Lista tras la eliminación: " + setEjemplo + "\n");
			//no se guardan ordenados, se utiliza hash para facil acceso
	}
	    //treeSet permite añadir elementos no repetidos al grupo pero ordenados.
	public void treeSet() {
		TreeSet<String> setTree = new TreeSet<>();
		setTree.add("Federico");
		setTree.add("Francisco");
		setTree.add("Maria");
		setTree.add("xavier"); 
		setTree.add("Maria");  //se intenta agregar duplicado
		System.out.println("Lista inicial TreeSet:" + setTree);
			//no es posible la modificacion, pero si eliminar e insertar
			//eliminar
		setTree.remove("Maria");
		System.out.println("Lista PostEliminación " + setTree + "\n");
			// Siempre se guardan en desorden, java usa hash para fácil acceso
	}
    
    // --Map (mapas)
	    //hashMap, un diccionario es un ejemplo de coleccion de pares clave-valor
    		// No mantiene ningun orden, para mantener un orden de inserccion se utiliza LinkedHashMap 
	 public void hashMap() {
	    HashMap<String, Integer> hashMap = new HashMap<>();
	    hashMap.put("Uno", 1);
	    hashMap.put("Dos", 2);
	    hashMap.put("Tres", 3);
	    	// Imprimir todos los elementos del HashMap
	    System.out.println("Elementos del HashMap iniciales " + hashMap);
	        // Modificar un elemento del HashMap
	    hashMap.put("Uno", 4);
	    System.out.println("Elementos del HashMap modificados" + hashMap);
	        // Eliminar un elemento del HashMap
	    hashMap.remove("Uno");
	    System.out.println("Elementos del HashMap post Eliminación " + hashMap);
	    	// Obtener un valor usando una clave
	    int valorDos = hashMap.get("Dos");
	    System.out.println("Valor asociado a 'Dos': " + valorDos + "\n");
	    }
	    //treeMap
	 public void treeMap() {
		 TreeMap<String, Integer> treeMap = new TreeMap<>();
		 treeMap.put("Uno", 1);
		 treeMap.put("Dos", 2);
		 treeMap.put("Tres", 3);
		 treeMap.put("Cero", 0);
	        // Mostrar todo los elementos
		 System.out.println("Mostrar todo los elementos " + treeMap);
	        // Modificar
		 treeMap.put("Cero", 9);
		 System.out.println("Mostrar todo los elementos modificados " + treeMap);
	        // Eliminar elemento del TreeMap
		 treeMap.remove("Cero");
		 System.out.println("Mostrar elementos post eliminación " + treeMap +"\n");
		 	// Es lo mismo que HashMap, pero mantiene un orden ascendente (Ordenado usando el orden 
		 		//natural de su clave ).
	}
	    //properties, gestiona pares clave-valor, diseñada para cadenas de texto. Usada para 
	 		//configuraciones y archivos de propiedades en aplicaciones Java.
	public void properties() {
		 Properties properties = new Properties();
	        // Agregar elementos a properties
		 properties.setProperty("app-name", "App");
		 properties.setProperty("app-language", "ES");
		 System.out.println("Mostrar elementos " + properties);
	        // Modificar
		 properties.setProperty("app-name", "App Gestion");
		 System.out.println("Mostrar modificado " + properties);
	        // Eliminar
		 properties.remove("app-name");
		 System.out.println("Mostrar post eliminación " + properties + "\n");
	}
} //llave de clase