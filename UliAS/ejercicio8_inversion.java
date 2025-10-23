import java.util.Scanner;
class ejercicio8_inversion{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("==Ganancia de la inversión==");
System.out.println("Ingrese la cantidad con la que invirtio: ");
double cd=sc.nextDouble();
double in=cd*.02;
double gt=cd+in;
System.out.println("----------------------------");
System.out.println("|Resultados de la inversión|");
System.out.println("----------------------------");
System.out.println("Cantidad con la que ingreso: "+cd);
System.out.println("Su inversion mensual es: "+in);
System.out.println("Su ganancia mensual es: "+gt);
sc.close();
 }
}