import java.util.Scanner;
class ejercicio2_Circunferencia{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Ingresa el radio de la circunferencia: ");
double radio=sc.nextDouble();
double longitud=2*Math.PI*radio, area=Math.PI*Math.pow(radio,2);
System.out.println("La longitud de la circunferencia es: "+longitud);
System.out.println("La area del circulo es: "+area);
 }
}