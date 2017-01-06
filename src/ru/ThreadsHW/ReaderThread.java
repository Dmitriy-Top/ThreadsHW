package ru.ThreadsHW;


/**
 * Created by дима on 04.01.2017.
 */
public class ReaderThread implements Runnable {
    private static volatile int  threadCount;
    private int getIndex;
    private CostumeArray array;

    public ReaderThread(CostumeArray array) {
        this.array = array;
        ReaderThread.threadCount++;
        this.getIndex=ReaderThread.threadCount;
        new Thread(this, "Thread #"+ReaderThread.threadCount).start();
    }

    @Override
    public void run() {
        while (true) {
            int i = array.get();
            System.out.println(Thread.currentThread().getName() + " get volume " + i);
        }
    }

    public static int getThreadCount() {
        return threadCount;
    }
}
