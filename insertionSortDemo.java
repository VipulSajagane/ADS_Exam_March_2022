  import java.util.Scanner;
  
  class insertionSortDemo{
    
	
	void printArray(int arr[]){
		
		for (int i = 0; i<arr.length; i++){
			//System.out.println("Element at index : "+i+" is : "+arr[i]);
			System.out.print(arr[i]);
		}
		System.out.println();
	}
    
	void sort(int arr[]){
		
		int n = arr.length;
		
		for(int i = 1; i < n; i++){   //unsorted 
		
			int temp = arr[i];
			int j = i-1;              //sorted part
		
		
		while(j >=0 && arr[j] > temp){
			arr[j+1] = arr[j];       //shifting larger elements to temp
			j = j-1;
			
			printArray(arr);
		}
		
		arr[ j + 1 ] = temp;
		
	}
}
	
	
  public static void main(String [] args){
  
    insertionSortDemo isd = new insertionSortDemo();
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the size of an Array : ");
    int N = sc.nextInt();
	System.out.print("Enter the elements of an Array : ");
	
	int arr[]    = new int [N];
	if (1 <=N && N <=1000){           //Constrain #1. 1<=n<=1000
	//int arr[]    = new int [N];
   
    for (int i = 0; i < N; i++){
		if(-1000>arr[i] && arr[i]>10000){  //Constrain #2. -1000<=a1[i]<=10000
		   return;
		}
		else{
			arr[i] = sc.nextInt();
		}
	}
	}
	else{
		System.out.println("Entered array is not within given limits");
		return;
	}
	System.out.println("Before sorting : ");
	isd.printArray(arr);
	System.out.println("insertionSort : ");
	isd.sort(arr);
	isd.printArray(arr);
   
  }  
  
}