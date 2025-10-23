import java.util.Scanner;
class ejercicio15_calificaciones{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("-------------------------");
System.out.println("|Sistema de calificación|");
System.out.println("-------------------------");
System.out.println("Ingresa tu nota númerica (0.0-5.0): ");
double na=sc.nextDouble();
String valoracion="";
if(na>=0.0 && na<=1.0){
valoracion=("Es Pesimo");
}else{
if(na>=1.1 && na<=2.0){
valoracion=("Es mal");
}else{
if(na>=2.1 && na<=2.9){
valoracion=("Es regular");
}else{
if(na>=3.0 && na<=4.0){
valoracion=("Bien");
}else{
if(na>=4.1 && na<=5.0){
valoracion=("Excelente");
}
}
}
}
}
System.out.println("\nLa valoración de la calificación es: "+valoracion);
sc.close();
}
}
