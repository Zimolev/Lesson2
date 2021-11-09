package com.company;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int i, int j){
        super("Не удалось преобразовать элемент массива к числу есть не числовые символы (" + i + "," + j + ")");
    }
}
