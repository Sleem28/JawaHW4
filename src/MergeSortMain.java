import Classes.*;

import java.io.IOException;
import java.util.ArrayList;

public class MergeSortMain {
    public static void main(String[] args) throws IOException {

        ArrayCreator arrayCreator = new ArrayCreator();
        MergeSort mergeSort = new MergeSort();

        ArrayList<Integer> genList = arrayCreator.createIntegerArrayList();
        System.out.println("Сгенерированный лист имеет вид: " + genList);

        genList = mergeSort.sortArray(genList);
        System.out.println("Отсортированный лист имеет вид: " + genList);
    }
}
