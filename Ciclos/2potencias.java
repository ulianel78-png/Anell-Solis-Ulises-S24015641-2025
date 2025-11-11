import java.util.Scanner;
class 2potencias{
public static void main (String []args){
Scanner sc=new Scanner (System.in);
System.out.println("-----------------------");
System.out.println("|Potencia de un número|");
System.out.println("-----------------------");
System.out.println("Ingresa el primer número base");
int num1=sc.nextInt();
System.out.println("Ingresa el segundo número que va a ser la potencia");
int num2=sc.nextInt();
for(int i=1;i<=num2;i++){
double res=res*num1;
}
System.out.println(num1+" elevado a la potencia "+num2+ " es: "+res);
sc.close();
 }
}

