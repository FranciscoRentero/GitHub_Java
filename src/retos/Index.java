package retos;
//clase principal desde la que se ejecutaran todos los ejercicios
public class Index {

	public static void main(String[] args) {
		//Ejercicio00 instancia00 = new Ejercicio00();
		
		//Ejercicio01 instancia01 = new Ejercicio01();
		//instancia01.extra01();
		
		Ejercicio02 instancia02 = new Ejercicio02();
		instancia02.getTxt();
		instancia02.saludo();
		System.out.println(instancia02.saludo("metodo saludo() con un parametro, retorno y sobrecarga de metodo, tambien funcion interna"));
		System.out.println(instancia02.saludo("saludo()",2));
		Ejercicio02.saludar();
		System.out.println("\n\t"+Ejercicio02.extra02("multiplo de tres", "multiplo de cinco"));
	}

}
