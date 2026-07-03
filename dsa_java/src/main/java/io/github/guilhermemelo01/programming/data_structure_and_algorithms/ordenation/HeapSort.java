package io.github.guilhermemelo01.programming.data_structure_and_algorithms.ordenation;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    public void sort(int[] array){
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // One by one extract an element from heap
        for(int i = n-1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    public void heapify(int[] array, int tamanho, int position){
       int largest = position;
       int left = 2 * position + 1;
       int right = 2 * position + 2;

       if(left < tamanho && array[left] > array[largest]){
           largest = left;
       }

       if (right < tamanho && array[right] > array[largest]){
           largest = right;
       }

       if (largest != position){
           int swap = array[position];
           array[position] = array[largest];
           array[largest] = swap;

           heapify(array, tamanho, largest);
       }
    }
}
