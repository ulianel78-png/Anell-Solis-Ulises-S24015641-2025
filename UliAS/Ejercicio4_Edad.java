import java.util.Scanner;
class Ejercicio4_Edad{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("==Programa que calcula la edad de una persona==");
System.out.println("Ingrese el año en que nacio: ");
int año=sc.nextInt();
System.out.println("Ahora ingrese el año en el que esta actualmente: ");
int actual=sc.nextInt();
int edad=actual-año;
System.out.println("Su edad actual es: "+edad);
sc.close();
 }
}