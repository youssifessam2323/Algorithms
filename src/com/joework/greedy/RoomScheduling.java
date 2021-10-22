
package com.joework.greedy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class RoomScheduling{

    enum Type{
        START,FINISH
    }

    class Event implements Comparable<Event>{

        
        Type type;
        int time;

        Event(Type type, int time){
            this.type = type;
            this.time = time;
        }

        public Type getType() {
            return type;
        }

        public int getTime() {
            return time;
        }

        @Override
        public int compareTo(Event o) {

            if(this.time == o.time) { 
                if(this.type == Type.START && o.type == Type.FINISH){
                    return 1;
                }
            }
            return time - o.getTime();
        }

        @Override
        public String toString() {
            return this.type.name() + " " + this.time;
        }
        
    }

    public int roomScheduling(int[] startTime, int[] finishTime, int numOfRoom){
        

        Event[] events = new Event[startTime.length + finishTime.length];
        boolean[] roomUsed = new boolean[numOfRoom];
        int roomIndex = 0;

        for (int i = 0; i < roomUsed.length; i++) {
            roomUsed[i]  = false;
        }

        for (int i = 0; i < startTime.length; i++) {
        events[i] = new Event(Type.START,startTime[i]);
        }

        for (int i = startTime.length; i < (startTime.length + finishTime.length); i++) {
            events[i] = new Event(Type.FINISH,finishTime[Math.abs(finishTime.length - i)]);
        }

        Collections.sort( Arrays.asList(events));

        Arrays.asList(events)
            .forEach(System.out::println);
        return 0;
    }


    public static void main(String[] args) {
 
        RoomScheduling r = new RoomScheduling();

        r.roomScheduling(new int[]{1,4,2,6}, new int[]{4,8,5,7}, 4);


    }
}