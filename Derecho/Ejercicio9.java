import java.util.Scanner;
class Ejercicio9{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("====================================");
System.out.println("|Calificaciones de seis estudiantes|");
System.out.println("====================================");
String alumnos[]={"1.Pedro","2.Juan","3.Santiago","4.Juanpi","5.Julian","6.Cesar"};
double calificacion[]= new double[6];
double suma=0;
for(int i=0;i<6;i++){
System.out.println("ingrese la calificación de "+alumnos[i]+": ");
calificacion[i]=sc.nextDouble();
suma += calificacion[i]; 
}
double promedio=suma/6;
System.out.println("\n========Resultados=======");
for(int i=0;i<6;i++){
System.out.println(alumnos[i] + ": " + calificacion[i]);
}
System.out.println("\nEl promedio general es: "+promedio);
sc.close();
}
}