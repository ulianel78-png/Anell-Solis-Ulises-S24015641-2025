import java.util.Scanner;
class ejercicio20_promocion{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("------------------------------");
System.out.println("|Promoción de un supermercado|");
System.out.println("------------------------------");
System.out.println("Ingrese la cantidad que tiene que pagar:");
double pagar=sc.nextDouble();
System.out.println("Ahora diga el número que gano para su descuento:");
int numero=sc.nextInt();
double descuento=0, totalpagar=0;
if(numero<=74){
descuento=pagar*.15;
totalpagar=pagar-descuento;
System.out.println("Su número es "+numero+ " y tiene un descuento del 15%, lo que se le descuenta es "+descuento+", entonces lo que va a pagar incluyendo su descuento es: "+totalpagar);
}if(numero>=74){
descuento=pagar*.20;
totalpagar=pagar-descuento;
System.out.println("Su número es "+numero+ " y tiene un descuento del 15%, lo que se le descuenta es "+descuento+", entonces lo que va a pagar incluyendo su descuento es: "+totalpagar);
}
sc.close();
 }
}