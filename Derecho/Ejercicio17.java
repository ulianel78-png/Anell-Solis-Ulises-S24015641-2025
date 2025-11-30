import java.util.Scanner;
class Ejercicio17{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("===============================================================================================================");
System.out.println("|información de los atletas que participaron en las pruebas de control para la selección nacional de atletismo|");
System.out.println("===============================================================================================================");
String atletas[]=new String[N][4];
double tiempos[]=new double[N];
int mejor=0, N=5;
for(int i=0;i<N;i++){
System.out.println("Atleta "+(i+1));
System.out.println("Nombre: ");
atletas[i][0]=sc.next();
System.out.print("Apellido: ");
atletas[i][1]=sc.next();
System.out.print("Especialidad (100m,200,400,etc): ");
atletas[i][2]=sc.next();
System.out.print("Tiempo registrado (segundos)");
tiempos[i]=sc.nextDouble();
atletas[i][3]=String.valueOf(tiempos[i]);
System.out.println();
}
for (int i=1;i<N;i++){
if (tiempos[i]<tiempos[mejor]){
mejor=i;
 }
}
System.out.println("\n====TABLA DE ATLETAS====");
System.out.println("Nombre\tApellidos\tEspecialidad\tTiempo");
for (int i=0;i<N;i++){
String linea=atletas[i][0]+"\t"+
             atletas[i][1]+"\t\t"+
	     atletas[i][2]+"\t\t"+
	     atletas[i][3];
if(i==mejor){
System.out.println(linea+" <--Mejor tiempo");
}else{
System.out.println(linea);
 }
}
System.out.println("\nEl mejor tiempo fue: "+tiempos[mejor]+" s");
System.out.println("Atletas: "+atletas[mejor][0]+" "+atletas[mejor][1]);
sc.close();
 }
}