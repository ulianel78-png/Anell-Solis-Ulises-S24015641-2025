import java.util.Scanner;
class Ejercicio11_valores{
public static void main(String []arg){
Scanner sc=new Scanner(System.in);
System.out.println("-----------------------");
System.out.println("|Comparar tres valores|");
System.out.println("-----------------------");
System.out.println("Ingrese el primer valor: ");
double v1=sc.nextDouble();
System.out.println("Ingrese el segundo valor: ");
double v2=sc.nextDouble();
System.out.println("Ingrese el tercer valor: ");
double v3=sc.nextDouble();{
if(v1==v2 && v2==v3){
System.out.println("Los tres valores son iguales");
}else{
double mayor=v1;
if(v2>mayor) mayor=v2;
if(v3>mayor) mayor=v3;
double menor=v1;
if(v2<menor) menor=v2;
if(v3<menor) menor=v3;
double promedio=v1+v2+v3;
System.out.println("\n------------");
System.out.println("|RESULTADOS|");
System.out.println("------------");
System.out.println("El número mayor es: "+mayor);
System.out.println("El número menor es: "+menor);
System.out.println("El promedio es: "+promedio);
sc.close();
   }
  }
 }
}