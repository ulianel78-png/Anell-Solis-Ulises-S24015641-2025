import java.util.Scanner;
class Ejercicio16{
public static void main (String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("=================================");
System.out.println("|Articulos de una tienda de ropa|");
System.out.println("=================================");
String datos[][]=new String[3][3];
String articulos[]={"camisa","Zapato","Pantalon"};
for (int i=0;i<3;i++){
System.out.println("Articulo: "+articulos[i]);
datos[i][0]=articulos[i];
System.out.println("Ingrese la talla: ");
datos[i][0]=sc.next();
System.out.println("Ingrese el color: ");
datos[i][2]=sc.next();
System.out.println();
}
System.out.println("\n=====TABLA DE ARTÍCULOS=====");
for(int i=0;i<3;i++){
System.out.println(
datos[i][0]+"\t"+
datos[i][0]+"\t"+
datos[i][2]);
}
sc.close();
}
}
