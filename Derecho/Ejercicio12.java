import java.util.Scanner;
class Ejercicio12{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("=================================");
System.out.println("|Registro de ventas de la semana|");
System.out.println("=================================");
double ventas[]=new double[7];
String dias[]={"Lunes","Martes","Miércoles","Jueves","Viernes","Sabado","Domingo"};
double total=0, mayor=0;
int MayorVenta=0;
for(int i=0;i<7;i++){
System.out.println("ingresa la venta del día "+dias[i]+": ");
ventas[i]=sc.nextDouble();
total +=ventas[i];
if(ventas[i]>mayor){
mayor=ventas[i];
MayorVenta=i;
 }
}
System.out.println("\n|RESULTADOS|");
System.out.println("La venta total de la semana: "+total);
System.out.println("El dia con mayor venta es: "+dias[MayorVenta]+" ($"+mayor+")");
sc.close();
 }
}