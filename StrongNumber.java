//program to calculate Strong Number using scanner class
import java.util.*;
public class StrongNumber
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0,no=num,rem,div,fact=1;

while(no>0)
{
rem=no%10;
div=no/10;
for(int i=1;i<=rem;i++)
{
fact*=i;
}
sum+=fact;
no=div;
fact=1; 
}
System.out.println(sum);
if(sum==num){System.out.println(num+" is a Strong number");}
else{System.out.println(num+" is not a Strong number");}

}
}
