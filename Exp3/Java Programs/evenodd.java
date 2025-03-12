import java.util.Scanner;

public class evenodd{
public static void main(String[] args){
Scanner obj= new Scanner(System.in);
System.out.println("enter your number");
int num= obj.nextInt();
if(num%2==0){
System.out.println("the number"+num+"is even");
}
else{
System.out.println("the number"+num+"is odd");
}
obj.close();
}}