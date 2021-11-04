/**
 * Name: Mohammed Ali kunda
 */
/**
 *
 * @author alamofun
 */
import java.util.Random;
public class labassignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[]intArray = new int[20];
        
        generateRandNum(intArray);
        System.out.println("Before selection sort");
        printArray(intArray);
        
        
        selectionSort(intArray);
       
        System.out.println("\nafter selection sort");
        printArray(intArray);
        System.out.println(" ");
        System.out.println(" ");
        
        generateRandNum(intArray);
        System.out.println("Before insertion sort");
        printArray(intArray);
        System.out.println(" ");
        
        insertionSort(intArray);
        
        System.out.println("after insertion sort");
        printArray(intArray);
        System.out.println(" ");
        System.out.println(" ");
        
        generateRandNum(intArray);
        System.out.println("Before bubble sort");
        printArray(intArray);
        System.out.println(" ");
        
        bubbleSort(intArray);
        System.out.println("after bubble sort");
        printArray(intArray);
        System.out.println(" ");
        System.out.println(" ");
        
        generateRandNum(intArray);
        System.out.println("Before merge sort");
        printArray(intArray);
        System.out.println(" ");
        
        mergeSort(intArray);
        
        System.out.println("after merge sort");
        printArray(intArray);
        System.out.println(" ");
        System.out.println(" ");
       
        
        
    }
    //method for generate numbers
    public static void generateRandNum(int[] randNum)
    {
        Random rand = new Random();
        for(int i =0; i<randNum.length;i++)
        {
            randNum[i]=rand.nextInt(100)+1;
        }
    }
    //method for print arrays
    public static void printArray(int[] array)
    {
        for(int num: array)
        {
            System.out.print(num+" ");
        }
    }
    //method for selection sort
    public static void selectionSort(int []list)
    {
        for(int i=0;i<list.length;i++)
        {
            int currentMin = list[i];
            int currentMinIndex = i;
            for(int j=i+1; j<list.length;j++)
            {
                if(currentMin>list[j])
                {
                    currentMin=list[j];
                    currentMinIndex = j;
                }
                
            }
            if(currentMinIndex != 1)
            {
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }
    //method for insertion sort
    public static void insertionSort(int[]list)
    {
        for(int i = 1; i < list.length; i++)
        {
            int currentElement = list[i];
            int k;
            for( k=i-1; k>=0&& list[k]> currentElement; k--)
            {
                list[k+1]=list[k];
                       
            }
            list[k+1]= currentElement;
        }
    }
    //bubble sort method
    public static void bubbleSort( int[] list)
    {
        boolean needNextPass = true;
        for(int k=1; k < list.length && needNextPass; k++)
        {
          
         for(int i =0; i<list.length - k; i++)
         {
             if(list[i]> list[i+1])
             {
                 int temp = list[i];
                 list[i]= list[i+1];
                 list[i+1]= temp;
                 needNextPass = true;
               
             }
         }
       }
    }
    //merge sort method
    public static void mergeSort(int[]list)
    {
        if(list.length > 1)
        {
            int[]firstHalf = new int[list.length/2];
            System.arraycopy(list, 0, firstHalf, 0, list.length/2);
            mergeSort(firstHalf);
            
            int secondHalfLength = list.length - list.length/2;
            int[]secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            
            merge(firstHalf,secondHalf,list);
            
        }
    }
    
    public static void merge(int[]list1, int[]list2, int[]temp)
    {
       int current1=0;
       int current2=0;
       int current3=0;
       while(current1< list1.length && current2 < list2.length)
       {
           if(list1[current1]< list2[current2])
           {
               temp[current3++]=list1[current1++];
           }
           else
           {
               temp[current3++]=list2[current2++];
           }
       }
       while(current1< list1.length)
       {
           temp[current3++]= list1[current1++];
       }
        while(current2< list2.length)
       {
           temp[current3++]= list2[current2++];
       }
      
    }
}
