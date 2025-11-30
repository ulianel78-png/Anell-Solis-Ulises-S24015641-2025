import java.util.Scanner;
class nombres1{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
int contador=1;
while(contador<=10){
System.out.print("Ingresa el nombre "+contador+": ");
String nom=sc.nextLine();
System.out.println("Nombre "+contador+": "+nom);
contador++;
}
}
}