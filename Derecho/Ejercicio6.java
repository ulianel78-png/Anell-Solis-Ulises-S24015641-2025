import java.util.Scanner;
class Ejercicio6{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
String reporte="";
int aprobado=0, reprobado=0;
double suma=0;
System.out.println("===================================================");
System.out.println("|Programa que lee la calificación de cinco alumnos|");
System.out.println("===================================================");
for(int i=1;i<6;i++){
System.out.print("Ingrese la calificación del alumno "+i+": ");
double calificacion=sc.nextDouble();
suma += calificacion;
if(calificacion>=6){
aprobado++;
}else{
reprobado++; 
  }
}
double promedio=suma/5;
System.out.println("\n|==========|");
System.out.println("|REPORTE!!!|");
System.out.println("|==========|");
System.out.println("El número total de aprobados es: "+aprobado);
System.out.println("El número total de reprobado es: "+reprobado);
System.out.println("La calificación promedio del grupo: "+promedio);
sc.close();
}
}