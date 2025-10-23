import java.util.Scanner;
class ejercicio17_primo{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("\t----------------------------------------------");
System.out.println("\t|Programa que lee si un número es primo o no|");
System.out.println("\t----------------------------------------------");
System.out.println("\tIngrese un número: ");
int n=sc.nextInt();
String mensaje;
if (n <= 1)
mensaje = ("No es primo");
else if (n == 2 || n == 3 || n == 5 || n == 7)
mensaje = ("Es primo");
else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
mensaje = ("No es primo");
else
mensaje = ("Es primo");
System.out.println("\tEl número "+mensaje);
sc.close();
 }
}
