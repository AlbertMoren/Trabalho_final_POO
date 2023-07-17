package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe usada para realizar a manipulação de vetores.
 *
 * @author Victor Medeiro Martins
 */
public class ArraysManipulation {

    /**
     * Transforma um vetor primitivo de inteiros em uma Arraylist (uma lista de vetores).
     *
     * @param arr Um vetor primitivo
     * @return arraylist Uma Arraylist
     */
    public static List<Integer> primArrayToArrayList(int[] arr){
        List<Integer> arrayList = new ArrayList<>();
        for (int elemento : arr) {
            arrayList.add(elemento);
        }
        return arrayList;
    }

    /**
     * Transforma um vetor primitivo de um objeto genérico em uma Arraylist.
     *
     * @param arr Um vetor primitivo
     * @return arraylist Uma Arraylist
     */
    public static List<Object> primArrayToArrayList(Object[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

    /**
     * Transforma uma Arraylist em um vetor primitivo de inteiros.
     * @param arrayList Uma Arraylist de inteiros
     * @return um vetor primitivo de inteiros
     */
    public static int[] arrayListToPrimArray(List<Integer> arrayList){
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
