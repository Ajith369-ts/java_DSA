import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;

        System.out.println(Arrays.toString(insertionSort(arr, n)));
    }

    public static int[] insertionSort(int[] arr, int n)
    {
        for(int i = 1; i < n; i++)
        {
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp)
            {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

}