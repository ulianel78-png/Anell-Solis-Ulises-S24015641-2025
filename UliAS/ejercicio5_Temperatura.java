import java.util.Scanner;
class ejercicio5_Temperatura{
public static void main(String[] args){
Scanner leer = new Scanner(System.in);
System.out.println("==Convertir la temperatura de grados centigrados a Fahrenheit y Temperatura absoluta==");
System.out.println("Ingresa la temperatura en grados centigrados: ");
double celsius=leer.nextDouble();
double fh=(celsius*9/5)+32, k=celsius+273.15;
System.out.println("Fahrenheit: "+fh);
System.out.println("Temperatura absoluta: "+k+" °K");
leer.close();
 }
}