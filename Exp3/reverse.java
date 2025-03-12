import java.util.Scanner;
import java.io.*;

public class reverse{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.println("enter your word");
String name= obj.nextLine();
String rev="";
for(int i=name.length()-1;i>=0;i--){
rev+=name.charAt(i);
}
System.out.println(rev);
}
}