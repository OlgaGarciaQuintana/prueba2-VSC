import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Esto es un hola mundo:
        System.out.println("Hello, World!");

        Scanner entrada = new Scanner(System.in);
		
		//Variables:
		double segundos, minutos, horas, días;
		System.out.println("Introduce segundos:");
		segundos = entrada.nextDouble();
		
		//Calcular minutos:
		double total_minutos = segundos / 60;
		System.out.println("Total minutos:" + total_minutos);
		
		//Calcular horas:
		double total_horas = total_minutos / 60;
		System.out.println("Total horas:" + total_horas);
		
		//Calcular días:
		double total_días = total_horas / 24;
		System.out.println("Total días:" + total_días);
    }
}
