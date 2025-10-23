import java.util.Scanner;
class ejercicio12_pagoempleado{
public static void main(String []arg){
Scanner sc=new Scanner(System.in);
System.out.println("---------------------");
System.out.println("|Pagar a un empleado|");
System.out.println("---------------------");
System.out.println("Categoria 1");
System.out.println("Categoria 2");
System.out.println("Categoria 3");
System.out.println("Categoria 4");
System.out.println("Ingrese el número de la categoria del empleado: ");
int ca=sc.nextInt();
System.out.println("Ingrese La cantidad de horas trabajadas: ");
double ht=sc.nextInt();
double pagohora=0;
switch (ca){
case 1:
pagohora=20000; 
break;
case 2:
pagohora=15000;
break;
case 3:
pagohora=10000;
break;
case 4:
pagohora=7500;
break;
default:
System.out.println("ERROR: debe de elegir una de las cuatro categoria");
return;}
double sueldobruto=ht*pagohora;
double descuentosalud=sueldobruto*.072;
double subsidio=0;
if(sueldobruto<1000000){
subsidio=sueldobruto*.15;}
double sueldoneto=sueldobruto-descuentosalud+subsidio;
System.out.println("\n------------");
System.out.println("|RESULTADOS|");
System.out.println("------------");
System.out.println("Categoria: "+ca);
System.out.println("Horas trabajadas :"+ht);
System.out.println("Sueldo bruto: "+sueldobruto);
System.out.println("Pago por hora: "+pagohora);
System.out.println("Descuento por salud(7.2%): "+descuentosalud);
System.out.println("El subsidio aplicado es: "+subsidio);
System.out.println("El sueldo neto a pagar es: "+sueldoneto);
sc.close();
   }
  }