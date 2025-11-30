import java.util.Scanner;
class Ejercicio13{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("===============================================");
System.out.println("|Programa que almacena el número de 12 alumnos|");
System.out.println("===============================================");
int alumnos[][]=new int[3][4];
for (int i=1;i<=12;i++){
System.out.println("\nEstudiante "+i);

System.out.print("Ingrese el nivel (0=ingles,1=Francés,2=Aleman,3=Ruso): ");
int nivel=sc.nextInt();

System.out.print("Ingrese el idioma (0=ingles,1=Francés,2=Aleman,3=Ruso): ");
int idioma=sc.nextInt();
alumnos [nivel][idioma]++;
}
System.out.println("\n=====Conclusión=====");
System.out.println("Filas=niveles | Columnas=idiomas");
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
System.out.print(alumnos[i][j]+" ");
}
System.out.println();
}
sc.close();
 }
}