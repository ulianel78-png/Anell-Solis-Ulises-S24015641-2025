import java.util.Scanner;
class Ejercicio4{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("|================================================|");
System.out.println("|Cajero automatico, que realiza retiros de dinero|");
System.out.println("|================================================|");
double saldo=5000.00, can;
char continuar;
do{
System.out.println("Saldo disponible: $"+saldo);
System.out.println("Ingrese la cantidad que va a retirar");
can=sc.nextDouble();
if(can<=saldo){
saldo-=can;
System.out.println("Retiro exitoso");
System.out.println("Su saldo actual es: $"+saldo);
}else{
System.out.println("Saldo insuficiente");
}
System.out.println("¿Desea volver a hacer otro retiro?(s/n):");
continuar =sc.next().charAt(0);
}while(continuar=='s'||continuar=='S');
System.out.println("Gracias por elegirnos :)");
sc.close();
}
}