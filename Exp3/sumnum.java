import java.util.Scanner;
public class sumnum{
static int n1;
static int n2;
static int n3;
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.println("enter first num");
n1=obj.nextInt();
System.out.println("enter second num");
n2=obj.nextInt();
System.out.println("enter third num");
n3=obj.nextInt();
int n4=n1+n2+n3;
System.out.println("the sum of three numbers is"+ n4);
}
}