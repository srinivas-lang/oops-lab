import java.util.Scanner;

public class vote{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.println("enter your age");
int age = obj.nextInt();
if(age<18){
System.out.println("not eligible to vote");
}
else{
System.out.println("eligible to vote");
}}}
