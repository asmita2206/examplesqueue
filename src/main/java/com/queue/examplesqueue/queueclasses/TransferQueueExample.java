package com.queue.examplesqueue.queueclasses;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {

    public static void main(String[] args) {

        TransferQueue<Integer> transferQueue= new LinkedTransferQueue<>();
        transferQueue.add(123);
        transferQueue.add(324);
        transferQueue.add(456);

        System.out.println("transfer queue : "+ transferQueue);

        TransferQueue<Integer> tq=new LinkedTransferQueue<>(transferQueue);

        System.out.println("transfer queue2 : "+tq);


    }
}
