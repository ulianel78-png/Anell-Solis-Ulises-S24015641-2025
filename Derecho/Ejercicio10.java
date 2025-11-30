import java.util.Scanner;
class Ejercicio10{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("============================================================");
System.out.println("|Programa que lee 10 números y los muestra en orden inverso|");
System.out.println("============================================================");
int numeros[]= new int[10];
for(int i=0;i<10;i++){
System.out.println("ingresa el número "+(i+1)+": ");
numeros[i]= sc.nextInt();
}
System.out.println("\nNUMEROS EN ORDEN INVERSO");
for(int i=9;i>=0;i--){
System.out.println(numeros[i]);
}
sc.close();
 }
}