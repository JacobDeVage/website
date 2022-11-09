public class TestQueues{
        public static void main(String[] args){

        

        ArrayBoundedQueue myArrayBoundedQueue = new ArrayBoundedQueue(5);

       myArrayBoundedQueue.enqueue("Daredevil"); // first in so therefore first out when Dequeues is set
         myArrayBoundedQueue.enqueue("Captain America");
       
        System.out.println(myArrayBoundedQueue.toString());
        myArrayBoundedQueue.enqueue("Thor");
        myArrayBoundedQueue.dequeue();
         System.out.println(myArrayBoundedQueue.toString());
         myArrayBoundedQueue.enqueue("Spiderman");
         System.out.println(myArrayBoundedQueue.toString());


}
}