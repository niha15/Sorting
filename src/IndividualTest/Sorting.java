package IndividualTest;

public class Sorting {
//bubble sort
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={13,5,65,6,3,0};
		
		System.out.println("Initial array:");
		for(int i=0;i<6;i++)
		System.out.print(arr[i]+" ");
		System.out.print("\nCalling bubble sort");
		bubbleSort(arr);
		int[] arr1={13,5,65,6,3,0};
		System.out.print("\nCalling selection sort");
		selectionSort(arr1);
		int[] arr2={13,5,65,6,3,0};
		System.out.print("\nCalling insertion sort");
		insertionSort(arr2);
	}
	public static void display(int[] arr)
	{
		for(int k=0;k<6;k++)
			System.out.print(arr[k]+" ");
	}
	public static void bubbleSort(int[] arr)
		{int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print("\nIteration "+i+": ");
			display(arr);
		}
		System.out.println("\nAfter bubble sort");
		display(arr);
}
	public static void selectionSort(int[] arr)
	{int temp,pos;
	for(int i=0;i<5;i++)
	{
		temp=arr[i];
		pos=i;
		for(int j=i;j<5;j++)
		{
			if(arr[j+1]<temp)
			{
				temp=arr[j+1];
				pos=j+1;
			}
		}
		arr[pos]=arr[i];
		arr[i]=temp;
		
		
		System.out.print("\nIteration "+i+": ");
		display(arr);
	}
	System.out.println("\nAfter selection sort");
	display(arr);
		
	}
	public static void insertionSort(int[] arr)
	{
		int temp,j;
		for(int i=1;i<6;i++)
		{
			temp=arr[i];
			for(j=i;j>0;j--)
			{
				if(arr[j-1]<temp)
					break;
				else
				{
					arr[j]=arr[j-1];
				}
			}
			arr[j]=temp;
			System.out.print("\nIteration "+i+": ");
			display(arr);
		}
		System.out.println("\nAfter insertion sort");
		display(arr);
	}

}
