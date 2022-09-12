package Classes;

import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> sortArray(ArrayList<Integer> list){

        if(list.size() < 2){return list;}

        ArrayList<Integer> rightPart = new ArrayList<>(list.subList(list.size() / 2, list.size()));

        ArrayList<Integer> leftPart = new ArrayList<>(list.subList(0, list.size() / 2));

        leftPart = sortArray(leftPart);
        rightPart = sortArray(rightPart);

        return mergeArray(leftPart, rightPart);
    }

    static ArrayList<Integer> mergeArray(ArrayList<Integer> leftPart, ArrayList<Integer> rightPart){

        ArrayList<Integer> mergedList = new ArrayList<>();


        while (leftPart.size() > 0 || rightPart.size() > 0){    // Пока в массивах есть элементы

            if(leftPart.size() == 0){
                // Переберем правую часть
                while (rightPart.size() > 0){
                    if(rightPart.size() > 1){
                        if(rightPart.get(0) <= rightPart.get(1)) mergedList.add(rightPart.remove(0));
                        else mergedList.add(rightPart.remove(1));
                    } else mergedList.add(rightPart.remove(0));
                }
            }else if(rightPart.size() == 0) {
                // Переберем левую часть
                while (leftPart.size() > 0){
                    if(leftPart.size() > 1){
                        if(leftPart.get(0) <= leftPart.get(1)) mergedList.add(leftPart.remove(0));
                        else mergedList.add(leftPart.remove(1));
                    } else mergedList.add(leftPart.remove(0));
                }
            }else{
                if(leftPart.get(0) <= rightPart.get(0)){
                    mergedList.add(leftPart.remove(0));
                }else {
                    mergedList.add(rightPart.remove(0));
                }
            }
        }
        return mergedList;
    }
}
