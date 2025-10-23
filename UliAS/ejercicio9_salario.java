import java.util.Scanner;
class ejercicio9_salario{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("--------------------");
System.out.println("|Aumento de salario|");
System.out.println("--------------------");
System.out.println("Ingrese la cantidad actual de su salario: ");
double cd=sc.nextDouble();
double s=cd*.25;
double ns=cd+s;
System.out.println("--------------------------");
System.out.println("|RESULTADOS DE SU SALARIO|");
System.out.println("--------------------------");
System.out.println("Su salario actual es: "+cd+ "$");
System.out.println("El aumento que se le da es de: "+s+ "$");
System.out.println("En total su salario nuevo es: "+ns+ "$");
sc.close();
 }
}