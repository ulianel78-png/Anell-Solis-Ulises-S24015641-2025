import java.util.Scanner;
class ejercicio13_raices{
public static void main(String []arg){
Scanner sc=new Scanner(System.in);
System.out.println("----------------------------");
System.out.println("|Valor de las raíces reales|");
System.out.println("----------------------------");
System.out.println("Ingresa el valor del coeficiente A");
double a=sc.nextDouble();
System.out.println("Ingresa el valor del coeficiente B");
double b=sc.nextDouble();
System.out.println("Ingresa el valor del coeficiente C");
double c=sc.nextDouble();
if(a==0){
System.out.println("La ecuación no es cuadrática");
}else{
double di = (b * b) - (4 * a * c);
if(di<0){
System.out.println("La ecuación tiene raíces imaginarias");
}else{
double x1 = (-b + Math.sqrt(di)) / (2 * a);
double x2 = (-b - Math.sqrt(di)) / (2 * a);
System.out.println("\t--------------------");
System.out.println("\t|RAÍCES ENCONTRADAS|");
System.out.println("\t--------------------");
System.out.println("\tX1="+x1);
System.out.println("\tX2="+x2);
 }
}
sc.close();
 }
}
