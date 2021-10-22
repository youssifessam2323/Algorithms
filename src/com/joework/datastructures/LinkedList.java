package com.joework.datastructures;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;


    public LinkedList(){
        head = tail = null ;
        size = 0;
    }

    @SafeVarargs
    public LinkedList(T...elements){
        for (int i = 0; i < elements.length; i++) {
            T ele = elements[i];
            if(headIsUnavailable()){
                head = tail = new Node<>(ele, null);
            }else{
                tail.next = new Node<>(ele, null);
                tail = tail.next;
            }
            size++;
        }
    }

    public void insertLast(T ele){
        if(head == null) {
            head = tail = new Node<>(ele, null);
        }else {
            tail.next = new Node<>(ele,null);
            tail = tail.next;
        }
        size++;
    }

    public Node<T> get(int index){
        int i = 1;
        Node<T> curr = head;
        while(curr != null){
            if(i == index){
                return curr;
            }
            curr = curr.next;
            i++;
        }
        return null;
    }

    private boolean headIsUnavailable() {
        return head  == null;
    }

    public void reverseDisplay(){
       reverseDisplayFromHead(head);
    }

    private void reverseDisplayFromHead(Node<T> head) {
        if(head == null){
            return;
        }
        reverseDisplayFromHead(head.next);
        System.out.println(head.data);
    }

    public void habal(){
        var curr = head;
        curr = curr.next;

        System.out.println(curr);
        System.out.println(head);
    }

    public void reverseTheSecondHalfOfTheList(){
        int mid = (size / 2) + 1;
        int i = 1;
        var midNode = head;
        while(i != mid){
            i++;
            midNode = midNode.next;
        }
        var firstElementInSecondHalf = midNode.next ;
            //x_p  b,x x_n
            // mid 5 , 6 , 7
        var curr = firstElementInSecondHalf.next;
        var prev = firstElementInSecondHalf;

        while(mid <= size  && curr != null){
            var next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        midNode.next = prev;
        firstElementInSecondHalf.next = null;


    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head + "}";
    }

    private static class Node<T>{
        private T data;
        private Node<T> next;

        Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(1,2,3,4,5,6,7);

          list.reverseTheSecondHalfOfTheList();
        System.out.println(list);
    }
}
