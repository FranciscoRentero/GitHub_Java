package retos;

import java.awt.Menu;
import java.util.Scanner;

/*
  EJERCICIO:
  - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
    Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
    (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
  - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
    que representen todos los tipos de estructuras de control que existan
    en tu lenguaje:
    Condicionales, iterativas, excepciones...
  - Debes hacer print por consola del resultado de todos los ejemplos.
 
  DIFICULTAD EXTRA (opcional):
  Crea un programa que imprima por consola todos los números comprendidos
  entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 
  Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */
public class Ejercicio01 {
	public Ejercicio01() {
		int a=10;// # 1010
		int b=3;// # 0011
/*  operadores aritmeticos
		Suma: +
		Resta: -
		Multiplicación: *
		División: /
		Módulo: %			 Este operador calcula el resto después de dividir el primer operando por el segundo
		Incremento: ++
		Decremento: --		*/
	System.out.println("operador suma: 5 + 10 = "+(5+10));
	System.out.println("operador resta: 10 - 5 = "+(10-5));
	System.out.println("operador multiplicación: 5 * 10 = "+(5*10));
	System.out.println("operador división: 5 / 10 = "+(5/10));
	System.out.println("operador módulo: 51 % 10 = "+(51%10));
	System.out.println(a++ +"operador incremento: 10 + 1 = "+ a--);
	System.out.println(a-- +"operador decremento: 10 - 1 = "+ a++);
	
/*	asignación
		Asignación: =
		Asignación con suma: +=
		Asignación con resta: -=
		Asignación con multiplicación: *=
		Asignación con división: /=
		Asignación con módulo: %=		*/
	System.out.println("\noperador de asignacion = declara variables"+" a="+a+" b="+b);
	a+=5;//suma y asignacion
	System.out.println("operador de asignacion con suma += en un bucle for, i+=3 incrementa de tres en tres la i"+" a="+a+" b="+b);
	a-=4;//resta y asignacion
	System.out.println("operador de asignacion con resta -= en un bucle for, i-=3 decrece de tres en tres la i"+" a="+a+" b="+b);
	a*=3;//multiplica y asignacion
	System.out.println("operador de asignacion con multiplicaciones *= en un bucle for, i*=3 multiplica por tres la i"+" a="+a+" b="+b);
	a/=2;//divide y asignacion
	System.out.println("operador de asignacion /= en un bucle for, i/=3 divide por tres la i"+" a="+a+" b="+b);
	a%=5;//modulo y asignacion
	System.out.println("operador de asignacion %= muestra el resto"+" a="+a+" b="+b);
	a=10;//operador de asignacion
	
/*	comparación
		Igualdad: ==
		Desigualdad: !=
		Mayor que: >
		Menor que: <
		Mayor o igual que: >=
		Menor o igual que: <=
		<> mayor o menor que		*/
	System.out.println("\nigualdad == si son iguales el resultado es true. ejemplo: 10==3"+(10==3));
	System.out.println("igualdad != si son diferentes el resultado es true. ejemplo: 10!=3"+(10!=3));
	System.out.println("mayor que > si es mayor (y solo mayor) el resultado es true. ejemplo: 10>3"+(10>3));
	System.out.println("mayor o igual que >= si es mayor o igual, el resultado es true. ejemplo: 10>=3"+(10>=3));
	System.out.println("menor que < si es menor (y solo menor) el resultado es true. ejemplo: 10<3"+(10<3));
	System.out.println("menor o igual que <= si es menor o igual, el resultado es true. ejemplo: 10<=3"+(10<=3));

/*	logicos
		AND lógico (y ademas...): &&
		OR lógico cortocircuito: ||		evalua una expresión booleana y devuelve true si al menos una de las expresiones es verdadera
		OR lógico simple:	|			el simbolo | se escribe: alt gr + 1
		NOT lógico: !		*/
	System.out.println("\nAND logico && (y ademas...) evalua una expresion y devuelve true si las dos (AMBAS) son verdaderas. ejemplo: 10+3==13 && 5-1==4 es "+(10+3==13 && 5-1==4));
	System.out.println("OR lógico cortocircuito || (parcial) evalua una expresión y si una de las expresiones es verdadera, no evalua la siguiente, puesto que la primera ya es verdadera. El resultado es true. ejemplo: 10+3==13 || 5-1==4 es "+(10+3==13 || 5-1==4));
	System.out.println("OR logico simple | (completa) evalua una expresion completa y devuelve true si una de las dos son verdaderas, habiendo evaluado las dos o mas partes. ejemplo: 10+3==13 | 5-1==4 es "+(10+3==13 | 5-1==4));
	System.out.println("NOT lógico ! negación de 'lo que acompañe'. ejemplo: 10+3!=24 && 5-1==4 es "+(10+3!=24 || 5-1==4));
  	
/*	bit a bit
		AND bit a bit: &
		OR bit a bit: |
		XOR bit a bit: ^
		Desplazamiento a la izquierda: <<
		Desplazamiento a la derecha: >>
		Desplazamiento a la derecha con extensión de signo: >>>
		NOT bit a bit: ~	(alt + 126)	*/
	
	System.out.println("\nAND bit a bit & compara los bits de los caracteres introducidos, si todos son 1 por posicion, el resultante es 1 "+(a&b)); // # 0010
	System.out.println("OR bit a bit | compara bit a bit y si al menos uno es 1 da de resultado 1 "+(a|b)); // # 1011
	System.out.println("XOR bit a bit ^ compara bit a bit y si son diferentes da de resultado 1 "+(a^b)); // # 1001
	System.out.println("<< bit a bit << desplaza los bit de 'a' hacia la izquierda 2 puestos "+(a<<2)); // # 101000
	System.out.println(">> bit a bit >> desplaza los bit de 'a' hacia la derecha 3 puestos manteniendo el signo + ó - que tuviese a "+(a>>3)); // # 0001
	System.out.println(">>> bit a bit >>> desplaza los bit de 'a' hacia la derecha 2 puestos sin considerar el signo, rellenando con 0 el bit mas significativo (el de la izquierda) "+(a>>>2)); // #
	System.out.println("~ bit a bit ~ compara bit a bit e invierte cada uno de los bits "+(~b)); // # 1100
		
/*	concatenacion
		+ une partes o concatena
        \n salta de linea
        \t mete espacio tabulado.
        \b borra el ultimo char de una cadena String		*/
	String textoUno = "texto uno";
	String textoDos = "texto dos";
	System.out.println(textoUno + "\n\t" + textoDos);
	
/* instancia (pertenencia)
		instanceof determina si un objeto pertenece a una clase especificada.
		new se utiliza para crear instancias de una clase en otras clases.
 */		
		Scanner scan = new Scanner (System.in);	//importar java.util.Scanner, creo un objeto de tipo Scanner y cerrar scan al terminar.
		//bucle if-else sencillo, si scan es instancia de Scanner entra
		if(scan instanceof Scanner) {	
			System.out.println("scan es una instancia de la clase Scanner. Es un objeto de tipo Scanner.");
		}else {	//si no se cumple el boolean de if, dando false, entra aqui.
			System.out.println("scan no es instancia de Scanner");
		}
		
		//declaro e inicializo dos variables que necesitaré
		int c = 10;
		String menu = "";
		
		//bucle if - else if - else
		if(a == b && b == c) {		//si se cumple entro aqui
			System.out.println("a == b && b == c ha sido true. a b y c tienen el mismo valor entero");
		}else if(a == b && b != c) {	//si salta el primer boolean como false, comprueba este otro, si diera true entra aqui
			System.out.println("a == b && b != c ha salido true. c es diferente de a y de b que son iguales");
		}else{		//si los otros anteriores fuesen false, entra aqui
			System.out.println("los dos booleans anteriores salieron false y este 'else' recoge las demas opciones");
		}
		
		
		// bucle do-while con un switch-case interno
		do {
			System.out.println("escribe por consola la opcion 1, 2 o 3");
			menu = scan.next();
			switch (menu){
		 	case "1":
		 		System.out.println("case a es "+a);
		 	break;
		 	case "2":
		 		System.out.println("case b es "+b);
		 	break;
		 	case "3":
		 		System.out.println("case c es "+c);
		 	break;
		 	default:
		 		System.out.println("ni es 1, ni 2, ni 3, es otra opcion cualquiera");
		 }
		}while(!menu.equals("1")&&!menu.equals("2")&&!menu.equals("3"));
		
		//bucle while
		while(menu != "tiene que ser distinto por que es un ejemplo para aprobechar y cerrar el objeto scan") {
			scan.close();
			System.out.println("si el while es true, entra aqui y crea un bucle infinito. Para evitarlo, cambiare el valor de la variable menu en la siguiente sentencia");
			menu = "tiene que ser distinto por que es un ejemplo para aprobechar y cerrar el objeto scan";
		}System.out.println("si el while fuera false, entraria aqui");
		
		//control de excepciones try-catch-finally
		try {
		    // Código que podría lanzar una excepción
		    int resultado = 5 / 0; // Esto lanzará una ArithmeticException
		} catch (ArithmeticException e) {
		    // Manejo de la excepción ArithmeticException
		    System.out.println("Error aritmético: " + e.getMessage());
		} catch (NullPointerException e) {
		    // Manejo de la excepción NullPointerException
		    System.out.println("Error de puntero nulo: " + e.getMessage());
		} catch (Exception e) {
		    // Manejo de cualquier otra excepción no manejada
		    System.out.println("Ocurrió una excepción: " + e.getMessage());
		    //finally se ejecuta siempre.
		} finally {
			System.out.println("tras lanzar una excepcion, el programa no colapsa y continuara ejecutandose la siguiente sentencia");
		}
		
		//bucle for
		for (int i=0;i<5;i++) {
			//recorre la posicion de i de 0 a 4
			for (int j=0;j<5;j++) {
			//recorre la posicion de j de 0 a 4
				if(i==3 & j==2) {
					System.out.println("llego a la posicion i=3 y j=2 y rompo los bucles");
					return; 	//continue; me mandaria a la siguiente sentencia continuando el bucle
								//break; romperia el bucle for de j, pero continuaria el de i reanudando j en el siguiente valor de i.
								//return; me saca del constructor, funcion o metodo.
				}System.out.println("posicion: "+ i + ","+ j);
			}
		}
		System.out.println("return; me saca del constructor y esto jamas aparecera");
		
	}//cierre de constructor
	public static int extra() {
		for(int i=10;i<56;i+=2) {
			if (( i != 16 ) && ( i % 3 != 0)) {
				System.out.print(i + ", ");
			}
		}
		return 0;
	}
}//cierre de clase
