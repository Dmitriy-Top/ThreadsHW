package ru.ThreadsHW;

import java.util.ArrayList;

/**
 * Created by дима on 04.01.2017.
 */
public class CostumeArray {
    private ArrayList<Integer> arrayList;
    private volatile boolean volumeIsSet=false;

    public CostumeArray() {
        this.arrayList = new ArrayList<Integer>();
    }

    public synchronized int get() {

        while (arrayList.size()==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return arrayList.remove(0);
    }

    public synchronized void put(int i) {
        arrayList.add(i);

    }

    public synchronized int size() {
        return arrayList.size();
    }

    public synchronized void startRead() {
        notifyAll();
    }


}
