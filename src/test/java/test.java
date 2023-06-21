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
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> complements = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer complementIndex= complements.get(nums[i]);
            if(complementIndex != null){
                return new int[]{i, complementIndex};
            }

            complements.put(target - nums[i], i);

        }

        return nums;


        /*
        {5, 2, 4}
        6
         */

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

    //regionTest


    //using Arrays to check if its equal
    @Test
    public boolean isAnagram(String s, String t) {

        // check if they arent equal to each other
        if(s.length() != t.length()){
            return false;
        }

        //set both strings as arrays
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        //sort the two arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        //check to see if they are equal
        return Arrays.equals(a1, a2);

    }

    @Test
    public int[] getConcatenation(int[] nums) {


//         int counter= 0;
//        int[] newResult = new int[nums.length * 2];
//
//        for(int i =0; i < 2; i++ ){
//            for(int num: nums){
//                newResult[counter] = num;
//                counter++;
//            }
//        }


        List<Integer> newList = new ArrayList<>();

        int count = 0;


        for(int i = 0; i < 2; i++){
            //loops twice
            for(int num: nums){
                //loops through every num in nums array
                newList.add(num);
            }
        }

        int[] check = new int[newList.toArray().length];

        for(int numsss: newList){
            check[count] = numsss;
            count++;
        }




        return check;


    }

    @Test
    public void replaceElements() {
        int[] arr = {17,18,5,4,6,1};

        int length = arr.length;
        int counter = 0;

        List<Integer> newList = new ArrayList();

        for(int arrs: arr){
            if(counter ==  0){
               continue;
            }

        }


    }


    @Test
    public boolean isSubsequence(String s, String t) {

        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }

    @Test
    public int lengthOfLastWord(String s) {


        String[] parts = s.split(" ");
        String lastWord = parts[parts.length -1];

        if(parts.length == 0){
            return 0;
        }


        String lastWordIndex = parts[parts.length -1];

        return lastWordIndex.length();



    }

    @Test
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length() -1;
        int j = b.length()-1;

        int carry =0;

        while(i >= 0 || j>=0){
            int sum = carry;
           if(i >= 0)sum += a.charAt(i) - '0';
            if(j >= 0)sum += b.charAt(j)- '0';

            sb.append(sum % 2);
            carry = sum / 2;


            i--;
            j--;


        }
        if(carry !=0){
            sb.append(carry);
        }

        return sb.reverse().toString();



    }




    @Test
    public int mySqrt(int x) {

        double d = x;


        if(d == 0 || d == 1){
            return x;
        }else{
           d = Math.sqrt(d);
        }

        x = (int) d;

        return x;


    }



    @Test
    public int climbStairs(int n) {

        //given the number, we would check to see how many times we could add 1 or 2 together to get that number
        if(n == 1){
            return 1;
        }

        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n ; i++) {
            dp[i] = dp[ i- 1] + dp[i -2];
        }

        return dp[n];


    }


    @Test
    public boolean isSameTree(int p, int q) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(p);
        linkedList.add(q);

        if(!linkedList.contains(p) && !linkedList.contains(q)){
            return false;
        }



        return true;

    }

    @Test
    public boolean isIsomorphic(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChar = t.toCharArray();

        for (int i = 0; i < sChars.length ; i++) {
            for (int j = 0; j < tChar.length ; j++) {
                if(sChars[i] == tChar[j]){
                    return true;
                }
            }
        }

        return false;


    }

    @Test
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

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
