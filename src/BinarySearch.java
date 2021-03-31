import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		//int[] arr = {2,5,6,8,19,43,59,89,105,108,135};
		int[] arr = {50,42,32,28,23,18,16,12,8,7};
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your searched number");
		int searchElement= sc.nextInt();
		BinarySearch bs = new BinarySearch();
		bs.Search(arr, 0, arr.length-1,searchElement);
		sc.close();
		
	}
public void Search(int[] arr, int begin, int end, int searchelement)
{
	
	while(begin<=end)
	{
		int mid = (begin+end)/2 ;
		if (searchelement==arr[mid])
		{
			System.out.println("Searched elemet found at index--"+ mid);
			break;
		}
		
		else if(searchelement<arr[mid])
		{
			end = mid-1 ;
		}
		
		else if(searchelement>arr[mid])
		{
			begin = mid+1;
		}
	}
	
	if(begin>end)
	{
		System.out.println("the elememt searched element is not found");
	}
}
}
