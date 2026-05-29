import java.util.Scanner;
class ProductArr
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int prod=1;
		/*
		for(int i=0;i<n;i++)
		{
			prod=arr[i];
			for(int j=i+1;j<n;j++)
			{
				prod*=arr[j];
				
			}arr[i]=prod;
		}
		*/
		for(int i=0;i<n;i++)
		{
			prod=1;
			for(int j=0;j<n;j++)
			{
				if(i !=j)
				{
					prod=prod*arr[j];
				}
			}
			System.out.print(prod+" ");
			
		}
	}
}