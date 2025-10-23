import java.util.Scanner;
class ejercicio3_Pulsaciones{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("==Pulsaciones de una persona==");
System.out.println("Dame tu edad: ");
double edad=sc.nextDouble();
double np=(220-edad)/10;
System.out.println("Sus pulsaciones son: "+np);
sc.close();
 }
}