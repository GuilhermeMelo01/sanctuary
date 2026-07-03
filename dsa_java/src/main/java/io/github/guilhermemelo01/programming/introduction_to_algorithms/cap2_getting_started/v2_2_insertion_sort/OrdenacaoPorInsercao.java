package io.github.guilhermemelo01.programming.introduction_to_algorithms.cap2_getting_started.v2_2_insertion_sort;

public class OrdenacaoPorInsercao {
    public static void main(String[] args) {
        Integer[] array = {12, 20, 10, 5, 9};

        Integer indexFinded = findV(array, 12);
        System.out.println(indexFinded);

//        Integer[] result = insertionSort(array);
        Integer[] resultReverse = insertionSortReverse(array);

        for(Integer res: resultReverse){
            System.out.print(res + " ");
        }
    }

    /*
     * 2.1-1 Reescreva o procedimento Insertion-Sort para ordenar em ordem não decrescent.
     */
    public static Integer[] insertionSort(Integer[] array){
        for(int i = 1; i < array.length; i++){
            int chave = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > chave){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = chave;
        }
        return array;
    }

    /*
    * 2.1-2 Reescreva o procedimento Insertion-Sort para ordenar em ordem não crescente, em vez da ordem não decrescente.
    */
    public static Integer[] insertionSortReverse(Integer[] array){
        for(int j = array.length-1; j >= 0; j--){
            int chave = array[j];
            int i = j + 1;
            while(i <= array.length-1 && array[i] > chave){
                array[i - 1] = array[i];
                i++;
            }
            array[i-1] = chave;
        }
        return array;
    }

    /*
    * 2.1-3 Considere o problema de busca:
    * Entrada: Uma sequência de n números A = 〈a1, a2, ..., an〉 e um valor v.
    * Saída: Um índice i tal que v = A[i] ou o valor especial NIL, se v não aparecer em A.
    * Escreva o pseudocódigo para busca linear, que faça a varredura da sequência, procurando por v. Usando um
    * invariante de laço, prove que seu algoritmo é correto. Certifique-se de que seu invariante de laço satisfaz
    * as três propriedades necessárias.
    */
    public static Integer findV(Integer[] arr, int v){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == v){
                return i;
            }
        }
        return null;
    }
}
