import org.junit.jupiter.api.Test;

import java.util.*;

public class test {

    //region HASHMAPS
    @Test
    public static HashMap<Integer, Integer> countIntegers(int[] nums){

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num: nums){

            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num) + 1);
            }else{
                countMap.put(num , 1);
            }
        }

        return countMap;


    }



    @Test
    public boolean containsDuplicate(int[] nums) {

        //Set HashMap
        HashMap<Integer, Integer> numsHashMap = new HashMap<>();

        //loop through nums
        for(int num: nums){

            //if it has same keys, return false
            if(numsHashMap.containsKey(num)){
                return true;
            }
            numsHashMap.put(num, 1);
        }
        return false;
    }





    @Test
    public static void anotherTest(){
        int threshhold = 80;
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        int[] scores = {90, 75, 85, 95};

        HashMap<String, Integer> checkTH= new HashMap<>();
        checkTH.put("Alice", 90);
        checkTH.put("Bob", 75);
        checkTH.put("Charlie", 85);
        checkTH.put("David", 95);

        for(String checkScores: checkTH.keySet()){
            if(checkTH.values().equals(threshhold)){
                System.out.println(checkTH.containsValue(checkScores));
            }


        }
        System.out.println(names);


    }

    //endregion

    //regionCode Signal

    @Test
    int solution(int param1, int param2) {

        int sum = param1 + param2;

        return sum;
    }


    @Test
    int solution(int year) {
            int century =(year - 1) / 100 + 1;

            return century;

    }


    @Test
    boolean solution(String inputString) {

        String checkString = inputString;

        char[] checkArray = inputString.toCharArray();

        if(inputString.contains(checkString)){
            return true;
        }

        for (int i = checkArray.length -1; i> 0; i--) {
            for (int j = 0; j < checkArray.length ; j++) {
                if(checkArray[i] != checkArray[j]){
                    return true;
                }
            }

        }

        return false;
    }








    //endregion

    //region Leet Code
    @Test
    public int[] twoSum(int[] nums, int target) {

        //given the target, check int array to see if any numbers
        //will match up to the target


        //store the index of the array;
        int [] result = new int[2];

        //iterate through the array
        for (int i = 0; i <nums.length  -1 ; i++) {
            //iterate through the array twice and not compare elements twice.
            for (int j = i + 1; j < nums.length ; j++) {

                //check if the indexes of i and j equal the target.
                if(nums[i] + nums[j] == target){
                    //if so, store the index into result array

                    result [0] = i;
                    result [1] = j;
                    //return result
                    return result;

                }

            }

        }

        return result;



    }


    @Test
    public boolean isPalindrome(int x) {

        //put int in a variable

        //put checkInt into a variable
        for (int i = 0; i < x ; i++) {



        }

        return false;

    }

    @Test
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        //turn both strings to char array
        char[] checkS = s.toCharArray();
        char[] checkT = t.toCharArray();

        Arrays.sort(checkT);
        Arrays.sort(checkS);

        //check to see if they are equal
        return Arrays.equals(checkT, checkS);

    }




    //endregion

    //regionDATA STRUCTURES COURSE

    @Test
    public void testStack(){
        //stacks- LIFO- last-in first-out
        //stores objects into a sort of "vertical tower"
        //push() to add to te top
        //pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        //adds to the stack
        stack.push("MineCraft");
        stack.push("SpiderMan");
        stack.push("DOOM");
        stack.push("Red Dead 2");

        //removes from last entry first
//        String myFav = stack.pop();
//        System.out.println(myFav);

        //check last entry
//        System.out.println(stack.peek());

        //search inside stack
//        System.out.println(stack.search("MineCraft"));

        //loop through, can run out of memory
        for (int i = 0; i < 1000000; i++) {
            stack.push("SomeGame");
        }

    }



    @Test
    public void queueTest(){

        /*
        Queue = FIFO = First-in First-Out
        collection designed for holding elements prior to processing
        Linear Data structure
        add = enqueue/ add object to tail ,offer()
        remove = dequeue / remove object from head, poll()
        extended collections class.

        a interface
         */


        Queue<String> queue = new LinkedList<String>();

        //add
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Jason");

        ///check to see if queue is empty
//        System.out.println(queue.isEmpty());

        //check size of queue
        System.out.println(queue.size());

        //check first entry
//        System.out.println(queue.peek());

        //check to see if queue has certain object
//        System.out.println(queue.contains("Jason"));

        //remove first head
//        queue.poll();

        System.out.println(queue);

        /*
        Where Can Queues Be useful

        Keyboard Buffers(letters should appeared on the screen in the order they're passed
        Printer Queue(Print jobs should be completed inorder
        Used in LinkedList, PriorityQueues, Breadth-first-search
         */


    }

    @Test
    public void testPriorityQ(){
        // Priority Queue = FIFO  with highest priorities first before elements with low priority

        //to reverse order use Collections.reverseOrder()
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("b");
        queue.offer("a");
        queue.offer("c");
        queue.offer("d");
        queue.offer("f");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }


    @Test
    public void linkedListTest(){

        /*
        LinkedList = stores nodes in 2 parts (data + address)
        nodes are in non-consecutive memory location
        element are linked using pointers

        Pros:
        Dynamic data structures
        Insertion and deletion of nodes is easy
        no/low memory waste

        Cons:
        Greater memory usage
        no random access of element
        accessing/ searching element is more time consuming

        uses:
        implement Stacks/Queues
        GPS navigation
        music playlist

         */

        LinkedList<String> linkedList = new LinkedList<>();

        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
         */

        //LinkedList as Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        //add to list
        linkedList.add(4, "E");

        //remove from list
        linkedList.remove("E");

        //search
        System.out.println(linkedList.indexOf("F"));

        //peak at head or tail
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        //add to the head
        linkedList.addFirst("0");

        //add to the tail
        linkedList.addLast("G");

        String first = linkedList.removeFirst();

        String last = linkedList.removeLast();


        System.out.println(linkedList);


    }

    @Test
    public void dynamicArrayTest(){

        /*
        PROS:
        random access of elements 0(1)
        good locality of reference and data cache utilization
        easy to insert / delete at the end

        CONS:
        waste more memory
        shifting elements is time-consuming 0(n)
        expanding/ shrinking the array is time-consuming

         */

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println();



    }


    @Test
    public void LinkedListArrayListTest(){


        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime;
        long endtime;
        long elapsedTime;

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }


        //Linked List
        startTime = System.nanoTime();

        linkedList.get(0);

        //do something;

        endtime = System.nanoTime();

        elapsedTime = endtime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime+ " ns" );



        //ArrayList
        startTime = System.nanoTime();

        arrayList.get(0);

        //do something;

        endtime = System.nanoTime();

        elapsedTime = endtime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime+ " ns" );

    }


    //endregion



}
