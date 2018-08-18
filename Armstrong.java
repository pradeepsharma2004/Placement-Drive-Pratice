//program to calculate armstrong number using scanner class
import java.util.*;
public class Armstrong
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0,no=num,rem,div;

while(no>0)
{
rem=no%10;
div=no/10;
sum+=rem*rem*rem;
no=div;
}
if(sum==num){System.out.println(num+" is a armstrong number");}
else{System.out.println(num+" is not a armstrong number");}

}
}
