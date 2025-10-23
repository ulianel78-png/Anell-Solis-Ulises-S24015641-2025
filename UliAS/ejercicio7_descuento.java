import java.util.Scanner;
class ejercicio7_descuento{
public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.out.println("==DESCUENTO DE LA TIENDA==");
System.out.println("Ingresa el total de la compra: ");
double tc=sc.nextDouble();
double dt=tc*.15;
double tp=tc-dt;
System.out.println("------------");
System.out.println("--Resultados--");
System.out.println("------------");
System.out.println("Total de la compra: "+tc);
System.out.println("Uso del descuento: "+dt);
System.out.println("Total a pagar: "+tp);
sc.close();
 }
}