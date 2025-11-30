import java.util.Scanner;
class Ejercicio3{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("|================================================================|");
System.out.println("|Cajero automatico para el pago del servicio de energía eléctrica|");
System.out.println("|================================================================|");
char continuar;
do{
double adeudo=1000.00;
System.out.println("==Menu==");
System.out.println("1.-Consulta");
System.out.println("2.-Pago del mes");
System.out.println("3.-Pago de adeudo");
System.out.println("4.-Salir");
System.out.println("Elija un de las cuatro opciones");
int opc=sc.nextInt();
switch(opc){
case 1:
System.out.println("\nSu consulta del adeudo es: "+adeudo);
break;
case 2:
System.out.println("\nSu pago del mes con el adeudo es: "+adeudo);
break;
case 3:
System.out.println("\nSu pago del adeudo es: "+adeudo);
break;
case 4:
System.out.println("\nGracias por usar el cajero");
break;
default:
System.out.println("\nOpcion no valida");}
System.out.println("¿Desea realizar otro servicio?(s/n):");
continuar=sc.next().charAt(0);
}while(continuar=='s'||continuar=='S');
sc.close();
}
}