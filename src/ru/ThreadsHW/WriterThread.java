package ru.ThreadsHW;

import java.util.ArrayList;

/**
 * Created by дима on 04.01.2017.
 */
public class WriterThread implements Runnable {
    private CostumeArray array;

    public WriterThread(CostumeArray array) {
        this.array = array;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int i = 0;
        int nummOfAddElm;

        while (true) {
            nummOfAddElm = (int) (Math.random() * 5);
            for (int j = 0; j <= nummOfAddElm; j++) {
                System.out.println(i + " was add to collection");
                array.put(i);
                i++;
            }

            try {
                Thread.sleep(randomeSleepTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    private long randomeSleepTime(){
        int sleepTime = (int) (Math.random() * 4) + 2;
        return (long)sleepTime*1000;
    };
}
