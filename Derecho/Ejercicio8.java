class Ejercicio8{
public static void main (String arg[]){
double ahorro=0, deposito=500, interes=0.09;
System.out.println("========");
System.out.println("|Ahorro|");
System.out.println("========");
for(int i=1;i<=12;i++){
ahorro +=deposito;
ahorro +=ahorro*interes;
System.out.println("El mes "+i+" su ahorro es: "+String.format("%.2f",ahorro));
}
System.out.println("\nEl total de ahorro al final de año es: "+String.format("%.2f",ahorro));
}
}