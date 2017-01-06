package ru.ThreadsHW;

/**
 * Created by дима on 04.01.2017.
 */
public class DispatcherThread implements Runnable{
    CostumeArray array;
    public DispatcherThread(CostumeArray array) {
        this.array=array;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true){
            if (array.size()>0){
                System.out.println("ReaderThreads wake up");
                array.startRead();
            }
        }
    }
}
