package com.queue.examplesqueue.queueclasses;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class AbstractQueueExample {

    public static void main(String[] args) {

        AbstractQueue<Integer> aq= new LinkedBlockingDeque<Integer>();
        aq.add(10);
        aq.add(20);
        aq.add(30);
        aq.add(40);

        System.out.println("abstract  : "+aq);
    }



}
