import java.util.Scanner;
class ejercicio1_MetrosPies{
public static void main (String []arg){
Scanner sc=new Scanner(System.in);    
System.out.println("Conversión de metros a pies y pulgadas");
System.out.println("ingresa el metro que deseas convertir:");
int num=sc.nextInt();
double pies, pulgadas;
pies=num*3.28084;
pulgadas=num*39.3701;    
System.out.println("La comversión a pies es: "+pies);
System.out.println("La conversión a pies es: "+pulgadas);
}   
}