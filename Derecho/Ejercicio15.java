import java.util.Scanner;
class Ejercicio15{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("========================================================================");
System.out.println("|Programa que calcula la temperatura media trismestral de cuatro países|");
System.out.println("========================================================================");
String paises[]=new String[4];
double temperaturas[][]=new double[4][3];
double medias[]=new double[4];
for(int i=0;i<4;i++){
System.out.println("Nombre del país "+(i+1)+": ");
paises[i]=sc.next();
System.out.println("Ingrese las 3 temperaturas mensuales:");
for (int j=0;j<3;j++){
System.out.println("Mes "+(j+1)+": ");
temperaturas[i][j]=sc.nextDouble();
medias[i] += temperaturas[i][j];
}
System.out.println();
}
System.out.println("\n===TEMPERATURAS INGRESADAS===");
for(int i=0;i<4;i++){
System.out.println(paises[i]+": ");
for (int j=0;j<3;j++){
System.out.println(temperaturas[i][j]+"  ");
}
System.out.println();
}
System.out.println("\n===TEMPERATURA MEDIA TRIMESTRAL==");
int mayor=0;
for (int i=0;i<4;i++){
System.out.println(paises[i]+": "+medias[i]+"°C");
if(medias[i]>medias[mayor]){
mayor=i;
 }
}
System.out.println("\nEl país con la temperatura media trimestral más alta es:");
System.out.println("--> "+paises[mayor]+ " con "+medias[mayor]+"°C");
sc.close();
 }
}
