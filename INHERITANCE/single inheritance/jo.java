class Shape{
int area;
}

class rectangle extends Shape{

rectangle(int a, int b){
area=a*b;
System.out.println(area);
}}

public class jo{
public static void main(String[] args){
rectangle obj = new rectangle(5,6);
}}