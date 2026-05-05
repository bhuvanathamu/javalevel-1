import java.io.*;
class Amstrong
{
public static void main(String args[])throws Exception
{
InputStreamReader isr=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Amstrong Number");
System.out.println("-------------------");
System.out.println("Enter the Number");
String s1=br.readLine();
int n=Integer.parseInt(s1);
System.out.println("Report");
int sum=0;
int num=n;
int r;
while(n>0)
{
r=n%10;
n=n/10;
sum=sum+(r*r*r);
}
if(num==sum)
{
System.out.println(num+"is an Amstrong Number");
}
else
{
System.out.println(num+"is a not Amstrong Number");
}
}
}