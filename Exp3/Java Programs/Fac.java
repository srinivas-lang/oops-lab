import java.util.Scanner;

public class Fac{
public static void main(String[] args){
Scanner obj= new Scanner(System.in);
System.out.println("enter your number");
int num= obj.nextInt();
long fac=1;
for(int i=num;i>0;i--){
fac*=i;
}
System.out.println(fac);
obj.close();
}}