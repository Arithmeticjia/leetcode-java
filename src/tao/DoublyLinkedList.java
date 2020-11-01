package tao;

/**
 *
 * @File Doubly LinkedList
 * @Author Weilan Tao
 * @Date  2020-10-31
 * @Description This is the implementation for DoublyLinkedList, java version.
 * @Since version-1.0
 * @Copyright Copyright (c) 2020
 */


public class DoublyLinkedList<T> {

    /**
     * 头节点 head 始终为空
     */
    private Node<T> head;
    private Node<T> tail;
    private static int length = 0;

    /**
     * Inner Class Node
     * @param <T>
     */
    private class Node<T>{
        private T data;
        private Node<T> next=null;
        private Node<T> pervious=null;

        public Node (T data, Node<T> pervious, Node<T> next){
            this.data =data;
            this.next=next;
            this.pervious=pervious;
        }
        public Node(){
            this.data=null;
            this.next=null;
            this.pervious=null;
        }
    }

    /**
     * Constructor
     */
    public DoublyLinkedList(){
        this.head = new Node<T>();
        this.tail = new Node<T>();
        //  tail.pervious=head;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int getLength() {
        return length;
    }



    public void addHead(T val){
        if(isEmpty()){
            head.next=new Node<T>(val, head, null);
        }else{
            Node  <T> node=new Node<T>(val, head, head.next);
        }
        length++;
    }

    /**
     * Add a node after a certain value
     * @param val
     * @param key
     */
    public void insertAfter(T val, T key){
        if(key==null){
            throw new NullPointerException("the key value can't be empty");
        }else {
            length++;
            int index=indexOf(key);
            Node <T> temp=new Node<T>();
            temp=head.next;
            for (int i=0; i<index;i++){
                temp=temp.next;
            }
            Node<T> node=new Node<T>(val,temp,temp.next);
        }
    }

    public void insertBefore(T val, T key){
        if(key==null){
            throw new NullPointerException("the key value can't be empty");
        }else {
            length++;
            int index=indexOf(key);
            Node <T> temp=new Node<T>();
            temp=head.next;
            for (int i=0; i<index;i++){
                temp=temp.next;
            }
            Node<T> node=new Node<T>(val,temp.pervious.next,temp);
            //这里能不能写成 temp.pervious=new Node<T>(val,temp.pervious.next,temp);
        }

    }

    public void add(T val){

        if(isEmpty()){
            Node<T> node = new Node<T>(val, head, null);
            head.next = node;
            tail = node;
        }else{
            Node<T> temp = this.tail;
            Node<T> node = new Node<T>(val, temp,null);
            this.tail = node;
            temp.next = node;
        }
        length++;



    }

    public void transversalFromHead(){
        if(isEmpty()) {
            System.out.println("Empty Doubly LinkedList. Cannot print.");
        } else{
            Node<T> temp = head.next;
            //System.out.println(temp.next.data);
            while (temp.next != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }

    public void transversalFromTail(){
        if(isEmpty()) System.out.println("Empty Doubly LikedList. Cannot print.");
        else{
            Node <T> temp= tail;

            while(temp.pervious!=head){ //temp.pervious!=null means the address is not null; head's address is not null!

                System.out.print(temp.data+" -> ");
                temp=temp.pervious;

            }
            System.out.println(temp.data);

        }
    }

    public boolean contains(T val){
        return indexOf(val) != -1;
    }

    public int indexOf(T val){
        int index=-1;
        Node<T> temp = new Node<T>();
        temp=head.next;
        for (int i =0; i<length;i++){
            if(val==temp.data){
                index=i;
            }
        }
        return index;
    }

    public void removeAt(int index){
        Node<T> temp = new Node<T>();
        temp=head.next;
        for (int i =0; i<index;i++){
            temp=temp.next;
        }
        temp.pervious.next=temp.next;
        length--;
    }

    /**
     * Delete the DLL
     */
    public void clean(){
        if(isEmpty()) {
            System.out.println("Empty Doubly LikedList. Cannot clean.");
        } else{
            Node<T> node;
            for(Node<T> temp = head; temp.next != null; temp = node){
                temp.data = null;
                node = temp.next;
                temp.next = null;
                temp.pervious = null;
                length--;
            }
            System.out.println("Cleaning finished");
        }

    }


}

class testDoublyLinkedList{
    public static void main(String [] args){
        DoublyLinkedList<Integer> list =new DoublyLinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.transversalFromHead();
        list.clean();
        System.out.println("The length is "+list.getLength());

    }

}