import java.util.Arrays;

public class SortingPriceples {

	public int[] BubbleSort(int[]a,String SortType)
	{
		int count  = a.length;
		boolean isswap = false;
		for(int i=0;i<count-1;i++)
		{
			if (isswap==false)
			{
			for (int j=0 ;j<=count-2;j++)
				{
					if (SortType.equalsIgnoreCase("ASC"))
					{
						if (a[j]>a[j+1])
						{
							int Swapval = 0 ;
							Swapval = a[j+1];
							a[j+1]= a[j] ;
							a[j] = Swapval ;
						}
					}
					else if (SortType.equalsIgnoreCase("DSC"))
					{
						if (a[j]<a[j+1])
						{
							int Swapval = 0 ;
							Swapval = a[j];
							a[j]= a[j+1] ;
							a[j+1] = Swapval ;
						}
					}
					
				}
					
					
			}
		}
		return a;
	}

	void merge(int arr[], int beg, int mid, int end)  
	{  
	  
	int l = mid - beg + 1;  
	int r = end - mid;  
	  
	int LeftArray[] = new int [l];  
	int RightArray[] = new int [r];  
	  
	for (int i=0; i<l; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	while (i<l&&j<r)  
	{  
	if (LeftArray[i] <= RightArray[j])  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}  
	  
	void Mergesort(int arr[], int beg, int end)  
	{  
	if (beg<end)  
	{  
	int mid = (beg+end)/2;  
	Mergesort(arr, beg, mid);  
	Mergesort(arr , mid+1, end);  
	merge(arr, beg, mid, end);  
	}  
	}
	
	public static void main(String[] args) {
		
		SortingPriceples Mysort = new SortingPriceples();
		int[]MyArray = {19,45,23,16,29,89,113,70,34,54,12,14,56,70}; 
		//int[]MyArray = {12, 14, 16, 19, 23, 29, 34, 45, 54, 56, 70, 70, 89, 113}; 
		int[] MyArray1 = Mysort.BubbleSort(MyArray, "DSC");
		System.out.println(Arrays.toString(MyArray1));
		Mysort.Mergesort(MyArray, 0, MyArray.length-1);
		System.exit(0);

}
}
