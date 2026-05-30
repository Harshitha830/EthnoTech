// Store temperatures of 30 days and print 
// (i) highest temperature
// (ii) lowest temperature
// (iii) avg temperatures 
// (iv) number of hot days (> 35degrees)

class Temperature
{
	public static void main(String[] args)
	{
		int[] arr={31,23,45,36,33,27,29,30,37,
		40,44,32,34,22,19,35,39,43,27,39,
		22,25,39,28,43,19,32,20,18,45};
		int hot=0,max=0,sum=0;
		double avg=0.0;
		int low=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			avg=sum/arr.length;
			max=arr[0];
			if(max<=arr[i])
			{
				max=arr[i];
			}
			if(low>=arr[i])
			{
				low=arr[i];
			}
			if(arr[i]>35)
			{
				hot+=1;
			}
		}
		System.out.println("Highest temperature : "+max);
		System.out.println("lowest temperature : "+low);
		System.out.println("Average temperatures : "+avg);
		System.out.println("Number of hot days : "+hot);
	}
}

			