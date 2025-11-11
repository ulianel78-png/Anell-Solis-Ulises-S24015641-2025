import java.util.Scanner;
class 1FizzBuzz{
public static void main (String []args){
Scanner sc=new Scanner (System.in);
System.out.println("----------");
System.out.println("|FizzBuzz|");
System.out.println("----------");
for(int i=1;1<=100;i++)
if(i%3==0 && i%5==0){
System.out.println("FizzBuzz");
}else if (i%3==0){
System.out.println("Fizz");
}else if (i%5==0){
System.out.println("Buzz");
}else{
System.out.println(i);
  }
 }
}
}
}
