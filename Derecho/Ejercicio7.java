import java.util.Scanner;
class Ejercicio6{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("======================");
System.out.println("|Tabla de multiplicar|");
System.out.println("======================");
System.out.println("ingrese un número");
int num=sc.nextInt();
System.out.println("La tabla de multiplicar del: "+num);
for(int i=1;i<=10;i++){
System.out.println(num+"x"+i+"="+(num*i));
}
}
}