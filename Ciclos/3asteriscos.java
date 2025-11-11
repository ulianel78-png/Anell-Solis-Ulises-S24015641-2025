import java.util.Scanner;
class 3asteriscos{
public static void main (String []args){
Scanner sc=new Scanner (System.in);
System.out.printl("--------------------------");
System.out.printl("|Piramide de Asteristicos|");
System.out.printl("--------------------------");
System.out.printl("Ingresa un número para la altura");
int N=sc.nextInt();
for(int i=1;i<=N;i++){
for(int j=i;j<N;j++){
System.out.printl("");
}
for(int b=1;b<=(2*i-1);b++){
System.out.printl("*");
}
System.out.printl();
}
sc.close();
}
}