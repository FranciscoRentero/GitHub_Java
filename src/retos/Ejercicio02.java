package retos;
/*- Crea ejemplos de funciones básicas que representen las diferentes
    posibilidades del lenguaje:
    Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
  - Comprueba si puedes crear funciones dentro de funciones.
  - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
  - Pon a prueba el concepto de variable LOCAL y GLOBAL.
  - Debes hacer print por consola del resultado de todos los ejemplos.
    (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 
  DIFICULTAD EXTRA (opcional):
  Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
  - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
    - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
    - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
    - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
    - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 
  Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
  Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.*/
public class Ejercicio02 {
//campos de clase, variables GLOBALES
	private String txt="sin modificar con salto de linea\n";
//constructor
	public Ejercicio02() {
		//constructor por defecto
	}
//getters y setters
	//getter: sin parametro con retorno
	public String getTxt() {
		return txt;
	}
	//setter: con parametro sin retorno
	public void setTxt(String txt) {
		this.txt=txt;
	}
	
//funciones
	//sin parametros sin retorno y funcion dentro de funcion.
	public void saludo() {
		txt += "Saludo() sin parametro sin retorno";
		System.out.println(txt);	//esta sentencia imprime en pantalla
	}
	//con parametro, con retorno, sobrecarga de metodo y funcion interna
	public String saludo(String nombre) {
		setTxt("funcion con parametro, con retorno, sobrecarga de metodo y funcion interna");
		System.out.println(txt);
		txt = nombre;
		return txt;
	}
	//con parametros con retorno y sobrecargando el metodo
	public String saludo(String nombre, int edad) {
		txt = "metodo " + nombre + " con " + edad + " parametros, retorno y sobrecarga de metodos";
		return txt;
	}
	//estaticas, pertenece a la clase y no a una instancia particular de la clase.
	public static void saludar() {
		System.out.println("funcion estatica, llamando a la Clase.metodo");
	}
	/*(buscando mas informacion, en chatGPT encontre algunos que desconozco, llevan un - antes del metodo o modificador)
	 * tambien existen:
		metodos abstractos, declaran a la clase abstracta, su implementacion es en las subclases.
				abstract class Ejemplo {
				    abstract void metodoAbstracto();
				}
				
				class SubClase extends Ejemplo {
				    void metodoAbstracto() {
				        System.out.println("Implementación del método abstracto.");
				    }
				}
				// Crear una instancia de la subclase y llamar al método implementado
				SubClase obj = new SubClase();
				obj.metodoAbstracto();
		metodos sobreescritos, la subclase proporciona la implementacion del metodo que esta definido en la clase. En esto se parece al abstracto
				public class Ejemplo {
				    public void metodo() {
				        System.out.println("Método en la clase base.");
				    }
				}
				class SubClase extends Ejemplo {
				    @Override
				    public void metodo() {
				        System.out.println("Método sobrescrito en la subclase.");
				    }
				}
				// Llamada al método sobrescrito
				SubClase obj = new SubClase();
				obj.metodo();
		metodos finales, que no pueden ser sobreescritos por subclases
				public class Ejemplo {
				    public final void metodoFinal() {
				        System.out.println("Este es un método final.");
				    }
				}
		-metodo sincrono (Synchronized Methods), se utiliza para controlar el acceso a metodos criticos en un entorno multihilo. 
				public class Ejemplo {
    				public synchronized void metodoSincronizado() {
        				System.out.println("Este es un método sincronizado.");
    				}
				}
		todos ellos, pueden ser a su vez:
			public, es accesible desde cualquier otra clase
			protected, es accesible dentro de su propio paquete y por las subclases (incluso si están en diferentes paquetes).
			default, es accesible solo dentro de su propio paquete. 
			private, es accesible solo dentro de la clase en la que se define. 
		hay tambien otros modificadores de clase y metodo como:
			Static, pertenece a la clase en sí y no a una instancia específica de la clase.
	 		Final, Indica que el valor de la variable no puede cambiar (constante), un método no puede ser sobrescrito o una clase no puede ser heredada.
	 		Abstract,  Indica que un método no tiene implementación y debe ser implementado por una subclase, o una clase no puede ser instanciada directamente
	 		-Synchronized, Indica que un método puede ser accedido por un solo hilo a la vez.
	 		-Transient, Indica que una variable no debe ser serializada.
	 		-Volatile, Indica que el valor de una variable puede cambiar inesperadamente, y que siempre debe leerse desde la memoria principal.
	 		-Native, Indica que el método está implementado en lenguaje nativo (como C o C++).
	 		*/
	
//extra02
	public static int extra02(String primero, String segundo) {
		System.out.println("");
		int contador=0;
		for (int i=1; i<101; i++) {
			if( (i%3 ==0) & (i%5 !=0) ) {
				System.out.println( primero );
			}else if( (i%3 !=0) & (i%5 ==0) ) {
				System.out.println( segundo );
			}else if( (i%3 ==0) & (i%5 ==0) ){
				System.out.println( primero +" y "+ segundo );
			}else {
				System.out.println(i);
				contador++;
			}
		}
		return contador;
	}
}
