import java.util.Scanner;

public class occurence {

	public static void main(String[] args) {
		//int arr[] = {1,2,2,3,3,4,4,4,4,5,5,6,6,6,10,10,50,50,50};
		int arr[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to get the occurence ");
		int Num= sc.nextInt();
		int First = Searchreasult(arr,Num,true);
		int last = Searchreasult(arr,Num,false);
		
		if(First !=-1)
		{
			System.out.println(last-First+1);
		}
		else
		{
			System.out.println(0);
		}
		
		sc.close();
		
		
	}
	
	public static int Searchreasult(int []arr, int Number, boolean Searchfirst)
	{
		int left = 0;
		int right = arr.length-1;
		int result = -1 ;
		while (left <=right)
		{
			int mid = (left + right) / 2;
			
			if (Number==arr[mid])
			{
				result = mid;
				if (Searchfirst)
				{
					right = mid-1;
				}
				else 
				{
					left = mid+1;
				}
			}
			
			else if (Number < arr[mid]) 
				{
					right = mid-1;
				}
				else
				{
					left = mid+1;	
				}
		}

					
		return result ;
	}

}
