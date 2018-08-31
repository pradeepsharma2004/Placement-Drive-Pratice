/*       *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************
*********************
***********************      */


public class {

	public static void main(String[] args) 
	{
		int star=1;
		int row;
		row=Integer.parseInt(args[0]);
		for(int i=0;i<row;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star+=2;
		}

	}

}
