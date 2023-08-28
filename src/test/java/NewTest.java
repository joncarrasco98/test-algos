import org.junit.jupiter.api.Test;

import java.util.*;

public class NewTest {

    //region Data structures and algorithm

    //regionHashSet
    @Test
    public void setAndHashSet(){

        //USEFULLY FOR COLLECTION OF ITEMS WITH NO DUPLICATES
        //AND DOESN'T MATTER WHAT ORDER THEY ARE IN

        Set<String> name = new HashSet<>();

        //add objects
        name.add("Walter");
        name.add("Jason");
        name.add("Jonathan");
        name.add("Elia");

        //remove from a set
        name.remove("Walter");


        System.out.println(name);

        //Hashset has no order and do not allow Duplicates
        //use contains() to search set
        //use name.clear tyo remove everything

        //this checks the whole set

//        name.forEach(System.out::println);
//        Iterator<String> namesIter = name.iterator();
//
//        while (namesIter.hasNext()){
//            System.out.println(namesIter.next());
//        }


        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(3);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);



    }

    //endregion

    //regionDATA STRUCTURES

    //ARRAYS
    @Test
    public void arraysExample (){

        //empty array with 5 spaces
        String[] colors = new String[5];

        //this calls the index of the array and starts at 0
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";

        //sets the array.toString to read the string
        System.out.println(Arrays.toString(colors));
        System.out.println("=======================");

        //checks the index of the array with []
        System.out.println(colors[0]);
        System.out.println("=======================");

        /*
        this would be a lot of repeating so instead
        use example below to insert values

        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;
         */

        int[] numbers = {100, 200};

        //ways to loop through arrays

            //for loop goes through everything and then sout what ever
            //index you would like
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
            System.out.println("=======================");
        }

            //look in reverse
        for (int i = colors.length -1 ;i >= 0 ; i--) {
            System.out.println(colors[i]);
            System.out.println("=======================");
        }

        //check the length of the array
        System.out.println(colors.length);
        System.out.println("=======================");


        //for each loop
        for(String color: colors){
            System.out.println(color);
        }

        //using stream
        Arrays.stream(colors).forEach(System.out::println);




    }



    //2d Arrays
    @Test
    public void workingWith2DArrays(){

        //ANYTIME YOU NEED TO WORK WITH A GRID USE 2D ARRAYS

            //use two [][] to form a 2d array to use in the for loop
        char[][] board = new char[3][3];


            //use two for loops because
            //its horizontal and vertical so 3 X 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

            //This is the same thing as above but setting default values
        char[][] boardTwo = new char[][]{
          new char[]{'0', '-', '-'},
          new char[]{'0', '-', '-'},
          new char[]{'0', '-', '-'},
        };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

            //Use deepToString to access both arrays
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));



    }


    //LIST AND ARRAYLIST
    @Test
    public void workingWithListAndArrayList(){

        /*
        An ordered collection aka sequence
        Allows duplicates
        Not fixed in size like arrays
        Fast for data retrievals
        Various implementations:
            ArrayList
            Stack
            Vector

         */


            //this tpe of list creation is immutable
        List<String> colorsUnmodifiable = List.of("Blue", "Yellow");
        //colorsUnmodifiable.add("Pink");

        List<String> colors = new ArrayList<>();

            //to add into the list
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");

            //checks size of the list
        System.out.println(colors.size());

            //checks to see if it contains element
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("Pink"));

        System.out.println(colors);

            //for loop through each value
        for (String color : colors){
            System.out.println(color);
        }


        colors.forEach(System.out::println);

            //for i loop but wouldn't use
            //unless you need access to the index itself
        for (int i = 0; i < colors.size(); i++) {

            System.out.println(colors.get(i));
        }



    }


    //STACK
    @Test
    public void workingWithStacks(){

        /*
        stacks-LIFO:last-in first-out
        stores objects into a sort of "vertical tower"

        pop()
        peek()
         */

        Stack<Integer> stack = new Stack<>();

            //push() puts it in the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

            //peek() will show you whats on top of the stack
        System.out.println(stack.peek());

            //check the size
        System.out.println(stack.size());

            //pop() to remove from the top and replace
        System.out.println(stack.pop());

        System.out.println(stack.size());

            //this will give boolean
        System.out.println(stack.empty());

    }


    //QUEUE
    @Test
    public void workingWithQueues(){
        /*
        First in First Out
        A collection designed for holding-
        - elements prior to processing
        INTERFACE
         */

            //
        Queue<Person> superMarker = new LinkedList<>();

            //add to the linked list
        superMarker.add(new Person("Alex", 21));
        superMarker.add(new Person("Jonathan", 25));
        superMarker.add(new Person("Elia", 24));

        System.out.println(superMarker.size());

            //checks what entry is at the top: first in fist out
        System.out.println(superMarker.peek());

            //removes the entry
        System.out.println(superMarker.poll());

            //
        System.out.println(superMarker.size());


    }


    static record Person(String name, int age){

    }


    //LINKED LIST
    @Test
    public void workingWithLinkedList(){

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Jon", 41));

            //can look through the list
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }







    }


    //SETS
    @Test
    public void workingWithSets(){
        /*
        A collection that contains no duplicates elements
         */

        Set<Ball> balls = new HashSet<>();

            //to add
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Gray"));
        balls.add(new Ball("Red"));


        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    record Ball(String color){

    }

    //MAPS
    @Test
    public void workingWithMaps(){
        /*
        Map cannot contain duplicates
        Each key can map to at most one value
         */

        Map<Integer, PersonMap> map = new HashMap<>();

            //insert into map
        map.put(1, new PersonMap("Jonathan"));
        map.put(2, new PersonMap("Jason"));
        map.put(3, new PersonMap("Guy"));

        System.out.println(map);

            //check length
        System.out.println(map.size());

            //get an object by key
        System.out.println(map.get(1));

            //looks for the key
        System.out.println(map.containsKey(4));

            //
        System.out.println(map.keySet());

            //get all entries
        System.out.println(map.entrySet());


        map.entrySet().forEach(x ->
                System.out.println(x.getKey() + " " + x.getValue()))
        ;
            //another way to loop through a map with this way
        map.forEach((key, personMap) -> {
            System.out.println(key + " " + personMap);
        });


            //to remove
        map.remove(3);

        System.out.println(map.getOrDefault(3, new PersonMap("default")));
    }

    record PersonMap(String name){}

    //HASH FUNCTIONS & HASHCODE






    //endregion

    //endregion

    //regionNeetCode
    @Test
    public boolean containsDuplicate(int[] nums) {

        //create set
        Set<Integer> checkDuplicates = new HashSet<>();

        //loop through nums and get ther length
        for (int num : nums) {

            //check the hashset and compare to a nums array
            if (checkDuplicates.contains(num)) {
                return true;
            }

            //add numbers into the set
            checkDuplicates.add(num);
        }

        return false;



    }
     @Test
     public boolean isAnagram(String s, String t) {

         //set up char arrays
         char[] checkS = s.toCharArray();
         char[] checkT = t.toCharArray();


         //compare if both arrays have the same letters and return false
         if(checkT.length != checkS.length){
             return false;
         }

         Arrays.sort(checkT);
         Arrays.sort(checkS);

         //check to see if they are equal
         return Arrays.equals(checkT, checkS);
     }

    //endregion


}
