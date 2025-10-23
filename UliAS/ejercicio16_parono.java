import java.util.Scanner;
class ejercicio16_parono{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("----------------------------------------------");
System.out.println("|Programa que lee si un número es par o impar|");
System.out.println("----------------------------------------------");
System.out.println("\tIngrese el número: ");
double no=sc.nextDouble();
if(no%2==0){
System.out.println("El número es par: "+no);
}else{
System.out.println("El número es impar: "+no);}
sc.close();
 }
}
