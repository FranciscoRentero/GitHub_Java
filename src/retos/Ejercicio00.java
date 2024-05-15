package retos;
/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */
public class Ejercicio00 {
// https://docs.oracle.com/en/java/javase/22/index.html
	
/*	Cuando defines una clase, declaras las características y comportamientos de una instancia.
		Las características son variables de instancia.
		Los comportamientos son métodos.
	Java no reconocerá una instrucción que esté por fuera de sus estándares.
*/
	private int variable = 10;
	
/*	constantes
	es un espacio en la memoria donde se almacena un valor que no puede cambiarse durante la ejecucion del programa.
	se utilizan constantes en datos fijos. su formula es: */
	final double a_pulgadas = 2.54;		

	
	public Ejercicio00 () {
/*	
DATOS PRIMITIVOS
	valores enteros
			byte de -128 a 127
			short de -32768 a 32767
			int de -2147483648 a 2147483647 es el mas normalizado
			long de -9223372036854775808 a 9223372036854775807 con el sufijo L		*/
	byte myByte = 127;
	short myShort = 32767;
	int myInt = 2147483647;
	long myLong = 9223372036854775807L;
	
/* 	Decimales (coma flotante)
		los dos valores decimales son:
			float con 7 decimales y con el sufijo F
			Double con 15 decimales siendo el que esta normalizado
 			Char caracteres unicode
 			Boolean			*/
	float myFloat = 0.1234567F;
	double myDouble = 0.123456789012345;
	char MyChar = '~';
	boolean funcion = true;
 
	System.out.println("hola, Java");
	}//cierre del constructor
}//cierre de la clase
