import java.util.Scanner;
class Ejercicio11{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
int numeros[]={4,10,67,9,8,7,11,80};
System.out.println("Introduce un número para saber si existe o no dentro del arreglo");
int num=sc.nextInt();
for(int i=0;i<numeros.length;i++){
if(numeros[i]==num){
System.out.println("\nEl número si existe en el arreglo");
sc.close();
return;
}
}
System.out.println("\nEl número no existe en el arreglo.");
sc.close();
}
}