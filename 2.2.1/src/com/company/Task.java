package com.company;

//7.Удалить из списка все элементы, индекс которых (отсчет начинаем с 0) соответствует какому-либо числу Фибоначчи.

public class Task {
    public static SimpleLinkedList<Integer> Process(SimpleLinkedList<Integer> list) throws Exception{
        int k = 0;
        int[] arr = new int[list.size()];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        int size = list.size();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    list.remove(k);
                    k--;
                    break;
                }
            }
            k++;
        }
        return list;
    }
