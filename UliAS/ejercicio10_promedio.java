import java.util.Scanner;
class ejercicio10_promedio{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("------------------");
System.out.println("|Promedio general|");
System.out.println("------------------");
System.out.println("Ingrese la calificación de la primera materia: ");
double m1=sc.nextDouble();
System.out.println("Ingrese la calificación de la segunda materia: ");
double m2=sc.nextDouble();
System.out.println("Ingrese la calificación de la tercera materia: ");
double m3=sc.nextDouble();
double pg=(m1+m2+m3)/3;
System.out.println("------------------");
System.out.println("|PROMEDIO GENERAL|");
System.out.println("------------------");
System.out.println("Su promedio es: "+pg);
sc.close();
 }
}