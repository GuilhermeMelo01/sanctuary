package io.github.guilhermemelo01.programming.introduction_to_algorithms.cap4_divide_and_conquer;

public class DivisaoEConquista {
    public static void main(String[] args) {

        Integer[] array = {2, 9, 4, 6, 8, 1, 3, 5};

        mergeSort(array, 0, array.length - 1);

        for (Integer i : array) {
            System.out.print(i + " ");
        }

    }

    public static void mergeSort(Integer[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2; // PEGA O MEIO DO ARRAY
            mergeSort(array, inicio, meio); // DIVIDE O ARRAY DO INICO AO MEIO
            mergeSort(array, meio + 1, fim); // DIVIDE O ARRAY DO MEIO+1 AO FIM
            merge(array, inicio, meio, fim); // JUNTA AS PARTES APLICANDO ORDENAÇÃO
        }
    }

    // METODO DE ORDENAÇÃO DO ARRAY
    public static void merge(Integer[] array, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        Integer[] left = new Integer[n1 + 1];
        Integer[] right = new Integer[n2 + 1];

        for (int i = 0; i < n1; i++) {
            left[i] = array[inicio + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = array[meio + 1 + j ];
        }

        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = inicio; k <= fim; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i += 1;
            } else {
                array[k] = right[j];
                j += 1;
            }
        }
    }
}
