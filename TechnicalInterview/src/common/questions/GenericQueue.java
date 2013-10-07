package common.questions;

public class GenericQueue<E>{
	private java.util.LinkedList<E> list = new java.util.LinkedList<E>();
	public void enqueueFirst(E e){
		list.addFirst(e);
	}
	public void enqueue(E e){
        list.addLast(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public int getSize(){
        return list.size();
    }
    public String toString(){
        return "Queue; " + list.toString();
    }
}
