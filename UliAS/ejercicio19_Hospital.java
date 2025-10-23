import java.util.Scanner;
class ejercicio19_Hospital{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("------------------------------------------------------------");
System.out.println("|Programa para saber el presupuesto de un area del hospital|");
System.out.println("------------------------------------------------------------");
System.out.println("A.Ginecología");
System.out.println("B.Traumatología");
System.out.println("C.Pediatría");
System.out.println("Elija una opción de las que se le presentan");
char opc=sc.next().charAt(0);
System.out.println("Ingrese el monto total del presupuesto: ");
double m=sc.nextDouble(), p=0;
switch (opc){
case 'A':
case 'a':
p=m*.40;
System.out.println("La cantidad que recibirá Ginecología es: $"+p);
break;
case 'B':
case 'b':
p=m*.30;
System.out.println("La cantidad que recibirá Traumatología es: $"+p);
break;
case 'C':
case 'c':
p=m*.30;
System.out.println("La cantidad que recibirá Pediatría es: $"+p);
break;
default:
System.out.println("xErrorx: Elija de acuerdo a lo que pide");}
sc.close();
 }
}