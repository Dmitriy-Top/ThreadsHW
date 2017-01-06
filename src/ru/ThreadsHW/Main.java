package ru.ThreadsHW;

import java.util.ArrayList;

public class Main {
    static CostumeArray array;

    public static void main(String[] args) {
        array = new CostumeArray();
        new WriterThread(array);
        new ReaderThread(array);
        new ReaderThread(array);
        new ReaderThread(array);
        new DispatcherThread(array);
    }
}
