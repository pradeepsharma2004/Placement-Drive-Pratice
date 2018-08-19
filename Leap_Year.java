//Program to calculate whether the provided year is leap year or not using command line argument
public class Leap_Year
{
public static void main(String args[])
{
int year=Integer.parseInt(args[0]);
if(year%4==0 ||year%400==0 &&year%100!=0)
{
System.out.println(year+" is a leap year");
}
else
{
System.out.println(year+" is not a leap year");
}
}
}
