import java.util.Scanner;
class ejercicio14_comisiones{
public static void main(String []arg){
Scanner sc=new Scanner(System.in);
double venta, comision = 0, total = 0;
System.out.println("======================");
System.out.println("=Comisiones de ventas=");
System.out.println("======================");
System.out.println("|Valor de Venta Comisión para el Vendedor|");
System.out.println("Hasta 10,000,000 2%");
System.out.println("Más de 10 y Menos de 15");
System.out.println("Millones 4%");
System.out.println("Más de 15 millones 10%");
System.out.println("\nCalculo de las cuatro ventas");
System.out.println("Ingresa el valor de la venta 1:");
venta=sc.nextDouble();
switch (1){
case 1:
if (venta <= 10000000) {
comision = venta * 0.02;
} else {
if (venta < 15000000) {
comision = venta * 0.04;
} else {
comision = venta * 0.10;
}
}
break;
}
System.out.println("Comisión venta 1: $" + comision);
total = total + comision;
System.out.println("\nIngresa el valor de la venta #2:");
venta = sc.nextDouble();
switch (2){
case 2:
if (venta <= 10000000) {
comision = venta * 0.02;
} else {
if (venta < 15000000) {
comision = venta * 0.04;
} else {
comision = venta * 0.10;
}
}
break;
}
System.out.println("Comisión venta 2: $" + comision);
total = total + comision;
System.out.println("\nIngresa el valor de la venta #3:");
venta = sc.nextDouble();
switch (3){
case 3:
if (venta <= 10000000) {
comision = venta * 0.02;
} else {
if (venta < 15000000) {
comision = venta * 0.04;
} else {
comision = venta * 0.10;
}
}
break;}
System.out.println("Comisión venta 3: $" + comision);
total = total + comision;
System.out.println("\nIngresa el valor de la venta #4:");
venta = sc.nextDouble();
switch (4) {
case 4:
if (venta <= 10000000) {
comision = venta * 0.02;
} else {
if (venta < 15000000) {
comision = venta * 0.04;
} else {
comision = venta * 0.10;
}
}
break;
}
System.out.println("Comisión venta 4: $" + comision);
total = total + comision;
System.out.println("Comisiones total de mes: "+total);
sc.close();
}
}
