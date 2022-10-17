import java.util.Random;

public class FiveAlgTestingDriver 
{
	public static void main(String[] args) 
	{
		int swaps = 0;
		long time = 0L;
		Random random = new Random();
		
		int[] og = new int[10000];
		for(int i =0; i < og.length; i++)
		{
			og[i] = random.nextInt(10000);
		}
		
		int[] Bubblecopy = new int[10000];
		
		for(int i = 0; i < og.length; i++)
		{
			Bubblecopy[i] = og[i];
		}
		
		int[] Insertioncopy = new int[10000];
		
		for(int i = 0; i < og.length; i++)
		{
			Insertioncopy[i] = og[i];
		}
		
		int[] Selectioncopy = new int[10000];
		
		for(int i = 0; i < og.length; i++)
		{
			Selectioncopy[i] = og[i];
		}
		
		int[] Shellcopy = new int[10000];
		
		for(int i = 0; i < og.length; i++)
		{
			Shellcopy[i] = og[i];
		}
		
		int[] Quickcopy = new int[10000];
		
		for(int i = 0; i < og.length; i++)
		{
			Quickcopy[i] = og[i];
		}
		
		
		
		
		
		
		

		System.out.println("Bubble Sort");
		System.out.println("PRE SORT");
		for(int k = 0; k < 20; k++)
        {
        	System.out.print(og[k] + ", ");
        } 
		time = System.currentTimeMillis();
		int[] result = BubbleSort(Bubblecopy);
		time = System.currentTimeMillis() - time;
		System.out.println("POST SORT");

		for(int k = 0; k < 20; k++)
        {
        	System.out.print(Bubblecopy[k] + ", ");
        }
		System.out.println(" ");
		System.out.println("Execution time: " + time + " milliseconds");
		System.out.println(" ");
		
		
		
		
		
		System.out.println(" ");

		System.out.println(" ");
		System.out.println("Insertion Sort");
		System.out.println("PRE SORT");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(og[i] + ", ");
		}
		time = System.currentTimeMillis();
		int[] result2 = InsertionSort(Insertioncopy);
		time = System.currentTimeMillis() - time;		
		System.out.println("POST SORT");

		for(int i = 0; i < 20; i++)
		{
			System.out.print(Insertioncopy[i] + ", ");
		}
		
		System.out.println(" ");
		System.out.println("Execution time: " + time + " milliseconds");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		
		
		
		
		System.out.println(" ");
		System.out.println("Selection Sort");
		System.out.println("PRE SORT");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(Selectioncopy[i] + ", ");
		}
		System.out.println(" ");
		time = System.currentTimeMillis();
		int[] result3 = SelectionSort(Selectioncopy);
		time = System.currentTimeMillis() - time;
		System.out.println("POST SORT");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(result3[i] + ", ");
		}
		System.out.println(" ");
		System.out.println("Execution time: " + time + " milliseconds");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		
		
		
		System.out.println(" ");
		System.out.println("Shell Sort");
		System.out.println("PRE SORT");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(Shellcopy[i] + ", ");
		}
		time = System.currentTimeMillis();
		int[] result4 = ShellSort(Shellcopy);
		time = System.currentTimeMillis() - time;
		System.out.println("POST SORT");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(result4[i] + ", ");
		}
		System.out.println(" ");
		System.out.println("Execution time: " + time + " milliseconds");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		
		
		
		System.out.println(" ");
		System.out.println("Quick Sort");
		System.out.println("PRE SORT");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(og[i] + ", ");
		} 
		System.out.println(" ");
		System.out.println("POST SORT");
		time = System.currentTimeMillis();
		quickSort(Quickcopy, 0, og.length-1);
		time = System.currentTimeMillis() - time;
		for(int i = 0; i < 20; i++)
		{
			System.out.print(Quickcopy[i] + ", ");
		} 
		System.out.println(" ");
		System.out.println("Execution time: " + time + " milliseconds");
		System.out.println(" ");
	}
	
	
	
	
	
	
	public static int[] BubbleSort(int[] array) 
	{
		int temp;
		int swaps = 0;
		int[] result = array;
		for (int i = 0; i < result.length - 1; i++) 
		{
			for (int j = 0; j < result.length - i - 1; j++) 
			{
		         if (result[j] > result[j+1]) 
		         {
		        	 temp = result[j];
		        	 result[j] = result[j + 1];
		        	 result[j + 1] = temp;
			         swaps++;
		         }
		      }
		   }
        System.out.println(" ");
		System.out.println("Swaps: " + swaps);
		return result;
	}
	
	public static int[] InsertionSort(int[] array)
	{
		int swaps1 = 0;
		int[] numbers2 = array;
		for(int i = 1; i < numbers2.length; i++)
		{
			int currentIndex = i;
			while(currentIndex > 0 && numbers2[currentIndex] < numbers2[currentIndex - 1])
			{
				int temp = numbers2[currentIndex];
				numbers2[currentIndex] = numbers2[currentIndex - 1];
				numbers2[currentIndex - 1] = temp;
				currentIndex--;
				swaps1++;
			}
			
		}
        System.out.println(" ");
        System.out.println("Swaps: " + swaps1);
        return numbers2;

	}
	
	public static int[] SelectionSort(int[] array)
	{
		int swaps2 = 0;
		int[] numbers3 = array;
		for(int i = 0; i < numbers3.length - 1; i++)
		{
			int smallestIndex = i;
			
			
			for(int j = i + 1; j < numbers3.length; j++)
			{
				if(numbers3[j] < numbers3[i])
				{
					int temp = numbers3[smallestIndex];
					numbers3[smallestIndex] = numbers3[j];
					numbers3[j] = temp;
					swaps2++;
				}
			}
		}
		System.out.println("Swaps: " + swaps2);
		return numbers3;
	}
	
	public static int[] ShellSort(int arr[])
    {
		int swaps3 = 0;
        int n = arr.length;
        int[] result = arr;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
            	int temp = result[i];
                int j;
                for (j = i; j >= gap && result[j - gap] > temp; j -= gap)
                {
                    result[j] = result[j - gap];
                }
                result[j] = temp;
                swaps3++;
            }
        }
        System.out.println(" ");
        System.out.println("Swaps: " + swaps3);
        return result;
    }
	
	public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low -1 );
        for (int j = low; j < high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
 
        return i + 1;
    }

 
    public static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
