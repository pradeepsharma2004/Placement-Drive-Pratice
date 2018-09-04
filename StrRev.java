import java.util.*;
public class StrRev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str,str1;
str=sc.nextLine();
int n=str.length();
str1="";
for(int i=0;i<str.length();i++)
{
str1+=str.charAt(n-1);
n--;
}
System.out.print(str1);

}


}