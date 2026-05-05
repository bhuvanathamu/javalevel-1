import java.io.*;
class Fact
{
public static void main(String args[])throws Exception
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Factorial Program");
System.out.println("-----------------");
System.out.println("Enter the Number");
String s1 = br.readLine();
int n=Integer.parseInt(s1);
System.out.println("Report");
int i;
int fact=1;
for(i=1; i<=n; i++)
{
System.out.print("*" +i);
fact=fact*i;
}
System.out.println("fact" + fact);
}
}