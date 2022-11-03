import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;

        System.out.println(Arrays.toString(selectionSort(arr, n)));
    }

    public static int[] selectionSort(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            int min = i;
            
            for(int j = i; j < n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            swap(arr, i, min);
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}