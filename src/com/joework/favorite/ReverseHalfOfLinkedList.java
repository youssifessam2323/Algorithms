package com.joework.favorite;

import com.joework.datastructures.LinkedList;

public class ReverseHalfOfLinkedList {
    private LinkedList<Integer> elements;

    public ReverseHalfOfLinkedList(Integer... insertedElements){
        elements = new LinkedList<Integer>(insertedElements);
    }


    /**
     *  we have a linked list that is for example  1 => 3 => 1 => 5 => 4 => 7 => 3 => 1
     *  so we want to reverse the second half of this list
     *  OUR inputs is:
     *     - the head pointer of the list
     *     - the size of the list
     *
     *  SOLUTION:
     *      1)go to the middle element of the array and make it point to the last element in the array
     *      2) loop through the list elements and in every element make it's next pointer points to the
     *      previous element
     *      3) at the end of the loop make the middle element points to null
     */

    public void reverseLinkedList(){

    }


}
