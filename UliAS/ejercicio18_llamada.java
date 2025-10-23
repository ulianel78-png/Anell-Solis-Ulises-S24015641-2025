import java.util.Scanner;
class ejercicio18_llamada{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("--------------------------------");
System.out.println("|Programa de llamada telefonica|");
System.out.println("--------------------------------");
System.out.println("Ingrese el tiempo en minutos:");
double t=sc.nextDouble(), tp;
if(t<=3){
tp=10.0;
}else{
tp=10.0+(t-3)*1.0;}
System.out.println("El total a pagar es: "+tp);
sc.close();
 }
}