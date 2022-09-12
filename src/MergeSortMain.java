import Classes.*;

import java.io.IOException;
import java.util.ArrayList;

public class MergeSortMain {
    public static void main(String[] args) throws IOException {

        ArrayCreator arrayCreator = new ArrayCreator();
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> genList = arrayCreator.createIntegerArrayList();

        ArrayList<Integer> sortList = mergeSort.sortArray(genList);

        System.out.println("Сгенерированный лист имеет вид: " + genList);
        System.out.println("Отсортированный лист имеет вид: " + sortList);
    }
}
