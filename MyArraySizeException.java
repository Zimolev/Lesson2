package com.company;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException(){
        super("Массив не формата 4х4");
    }
}

