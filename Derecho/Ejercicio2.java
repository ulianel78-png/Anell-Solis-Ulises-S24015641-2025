import java.util.Scanner;
class Ejercicio2{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("==Números pares==");
int num=1;
while(num<21){
if(num%2==0){
System.out.println(num);
}
num++;
}
}
}
