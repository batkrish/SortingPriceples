import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		Mergesort mer= new Mergesort();
		int [] arr = {23,12,56,34,67,32,45,26,42,89};
		mer.sort(arr, 0, arr.length-1);
		
	}
	
	public void sort(int[]arr ,int begin, int end) {
		
		if (begin<end)
		{
			int mid = (begin+end)/2;
			sort (arr,begin,mid);
			sort(arr,mid+1,end);
			merge(arr,begin,mid,end);
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	public void merge(int[] arr,int begin,int middle,int end)
	{
		int leftarraylength = middle-begin+1 ;
		int Rightarraylength = end-middle ;
		
		int leftarray[] = new int [leftarraylength];
		int Rightarry[] =  new int[Rightarraylength];
		
		for (int i=0;i<leftarraylength;i++)
		{
			leftarray[i] = arr[begin+i];
		}
		
		for (int j= 0; j<Rightarraylength;j++)
		{
			Rightarry[j] = arr[middle+1+j];
		}
	
		int i=0;
		int j=0;
		int k = begin;
		
		while(i<leftarraylength && j<Rightarraylength)
		{
			if (leftarray[i]<Rightarry[j])
			{
				arr[k]= leftarray[i] ;
				i++;
				k++;
			}
			
			else {
				arr[k] = Rightarry[j];
				j++;
				k++;
			}
		}
		
		while(i<leftarraylength)
		{
			arr[k] = leftarray[i];
			i++;
			k++;
		}
		
		while(j<Rightarraylength)
		{
			arr[k] = Rightarry[j];
			j++;
			k++;
		}
		
	}
		
	

}
