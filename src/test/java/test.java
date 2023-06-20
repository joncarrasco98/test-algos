import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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

    //region


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
    //endregion


    //regionDATA STRUCTURES COURSE


    //stacks- LIFO- last-in first-out
    //stores objects into a sort of "vertical tower"
    //push() to add to te top
    //pop() to remove from the top

    @Test
    public void testStack(){
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





    }









    //endregion



}
