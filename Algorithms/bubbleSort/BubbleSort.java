import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;

        System.out.println(Arrays.toString(bubbleSort(arr, n)));
    }

    public static int[] bubbleSort(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            boolean noSwap = true;
            
            for(int j = 0; j < n - i - 1; j ++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwap = false;
                }
            }     
            if(noSwap)
                break;
        }

        return arr;
    }
}