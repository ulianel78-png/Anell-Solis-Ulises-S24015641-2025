import java.util.Scanner;
class ejercicio6_estudiantes{
public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.out.println("==Saber el porcentaje que hay en un grupo de estudiantes==");
System.out.println("Ingresa la cantidad de hombre que hay: ");
int h=sc.nextInt();
System.out.println("Ingresa la cantidad de mujeres que hay: ");
int m=sc.nextInt();
int tt=h+m;
double ph=(h*100.0)/tt;
double pm=(m*100.0)/tt;
System.out.println("El porcentaje de hombres es: "+ph);
System.out.println("El porcentaje de mujeres es: "+pm);
sc.close();
 }
}