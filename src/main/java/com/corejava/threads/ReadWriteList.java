package com.corejava.threads;
import java.util.concurrent.locks.*;
import java.util.*;


/*
Implementing Read Write Lock using underlying ArrayList<String> to demonstrate Many Readers are granted
Access together and writer gets access when all readers exit.
*/
public class ReadWriteList <E> {

  private ArrayList<E> names;

  private final ReentrantReadWriteLock rw = new ReentrantReadWriteLock();

  private final Lock r = rw.readLock();
  private final Lock w = rw.writeLock();

  public ReadWriteList(ArrayList<E> l) {
    	this.names = l;
  }

  public void add(E element) {
    System.out.println("Requesting Write lock > "+ Thread.currentThread());
  	w.lock();
  	try{
		System.out.println("Write lock acquired > "+ Thread.currentThread());
  	   names.add(element);
  	}finally {
		System.out.println("Releasing Write lock > "+ Thread.currentThread());
  	   w.unlock();
  	}
  }

  public E get(int i) {
    	System.out.println("Requesting Read lock  > "+ Thread.currentThread());
    	r.lock();
        try{
			System.out.println("Read lock acquired > "+ Thread.currentThread());
    	    if(names.size() <=0)
    	    	return null;
    	    return names.get(i);
    	}finally {
			System.out.println("Releasing Read lock  > "+ Thread.currentThread());
    	   r.unlock();
    	}
  }



    private static class ThreadWrite<T> extends Thread {
    	ReadWriteList<T> rw ;
    	T t;

    	public ThreadWrite(ReadWriteList<T> rw, T t) {
    		this.rw = rw;
    		this.t = t;
    	}

    	public void run() {
			while(true){
				rw.add(t);
				try {
					System.out.println("Writer Sleeping");
					Thread.sleep(3000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
    	}

    }


    private static class ThreadRead<P> extends Thread{
      	ReadWriteList<P> rw ;

      	public ThreadRead(ReadWriteList<P> rw) {
      		this.rw = rw;
      	}
      	public void run() {
			while(true) {
      			System.out.println(rw.get(0));
      			try {
      				Thread.sleep(300);
      			}catch(Exception e) {}

			}
      	}
  }


  public static void main(String args[]) {
	  ReadWriteList<String> rwl = new ReadWriteList<String>(new ArrayList<String>());
	  ThreadWrite<String> writer = new ThreadWrite<String>(rwl, new String("Nits"));
	  ThreadRead<String> reader1 = new ThreadRead<String>(rwl);
	  ThreadRead<String> reader2 = new ThreadRead<String>(rwl);
	  ThreadRead<String> reader3 = new ThreadRead<String>(rwl);
	  writer.start();
	  reader1.start();
	  reader2.start();
	  reader3.start();

  }

}