package PriorityQueues.Strings;

import java.util.*;

 class Heap<T extends Comparable<T>> {

        private List<T> l;

        public Heap(){
            l = new ArrayList<>();
     }

     private void swap(int first , int second)
     {
         T temp = l.get(first);
         l.set(first , l.get(second));
         l.set(second , temp);
     }

     public void insert(T val)
     {
         l.add(val);
         unHeap(l.size()-1);
     }
     private void unHeap(int index)
     {
         if(index == 0) return;

         if(l.get(index).compareTo(parent(index)) < 0){
             swap(index , (index-1)/2);
             unHeap((index-1)/2);

         }
     }
     private T remove() throws Exception{
            if(l.isEmpty())
                    throw new Exception("List is empty");

            T temp = l.get(0);

            T last = l.remove(l.size()-1);

            if(!l.isEmpty())
            {
                l.set(0 , last);
            }
            downHeap(0);
            return temp;
     }
     private void downHeap(int index)
     {
         int min  = index;
         int left = 2*index+1;
         int right = 2*index+2;



     }
     private T parent(int index)
     {
         return l.get((index-1)/2);
     }
     private T leftChild(int index)
     {
         return l.get((2*index)+1);
     }
     private T rightChild(int index)
     {
         return l.get((2*index)+2);
     }

}
