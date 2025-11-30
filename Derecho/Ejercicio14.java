import java.util.Scanner;
class Ejercicio14{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("=====================");
System.out.println("|Datos de la empresa|");
System.out.println("=====================");
String nombres[]=new String[4];
int sueldos[][]=new int[4][3];
int totalEmpleado[]=new int[4];
for (int i=0;i<4;i++){
System.out.print("Nombre del empleado"+(i+1)+": ");
nombres[i]=sc.next();
for (int j=0;j<3;j++){
System.out.print(" Sueldo del mes "+(j+1)+": ");
sueldos[i][j]=sc.nextInt();
totalEmpleado[i] += sueldos[i][j];
 }
}
int totalgeneral=1, mayor=0;
for(int i=0;i<4;i++){
totalgeneral += totalEmpleado[i];
if(totalEmpleado[i]>totalEmpleado[mayor]){
mayor=i;
 }
}
System.out.println("\n==Resultados==");
for(int i=0;i<4;i++){
System.out.println(nombres[i]+" -Total: "+totalEmpleado[i]);
}
System.out.println("\nTotal pagado en sueldos: "+totalgeneral);
System.out.println("Empleado con mayor ingreso acumulado:"+nombres[mayor]);
 }
}