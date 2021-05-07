import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        QuickSort Algorithm
//        int[] nums = {5,1,1,2,0,0};
//
//        Algorithms.Quicksort quick = new Algorithms.Quicksort();
//        quick.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        *********************************************


//        Find the missing number in an array
//        int[] sortedArr = {5,3,1,2};
//        Problems.Leetcode.FindMissingNumberInArray find = new Problems.Leetcode.FindMissingNumberInArray();
//        find.findMissingNumber(sortedArr);


//        Sum  of two Integers in given arrays
//        int[] arr = {2,7,11,15};
//        int target = 18;
//
//        Problems.Leetcode.SumOfTwoIntegersInGivenValue findSum = new Problems.Leetcode.SumOfTwoIntegersInGivenValue();
//        System.out.println(Arrays.toString(findSum.hashSolution(arr,target)));


        // Repeating 'a' in a string
//        String s = "a";
//        long n = 10;
//
//        RepeatingAInString repeat = new RepeatingAInString();
//
//        repeat.repeatedString(s,1000);

//        int tip_percent = 20;
//        double meal_cost = 12;
//        int tax_percent = 8;
//
//        int  total =0 ;
//        total = (tip_percent * (int)meal_cost) / 100;
//        total = total + ((tax_percent * (int)meal_cost) / 100);
//        total = total + (int)meal_cost;
//        System.out.println(total);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        ArrayList<Integer> arr5 = new ArrayList<>();
        ArrayList<Integer> arr6 = new ArrayList<>();
        arr1.add(-9);
        arr1.add(-9);
        arr1.add(-9);
        arr1.add(1);
        arr1.add(1);
        arr1.add(1);

        arr2.add(0);
        arr2.add(-9);
        arr2.add(0);
        arr2.add(4);
        arr2.add(3);
        arr2.add(2);

        arr3.add(-9);
        arr3.add(-9);
        arr3.add(-9);
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);

        arr4.add(0);
        arr4.add(0);
        arr4.add(8);
        arr4.add(6);
        arr4.add(6);
        arr4.add(0);

        arr5.add(0);
        arr5.add(0);
        arr5.add(0);
        arr5.add(-2);
        arr5.add(0);
        arr5.add(0);

        arr6.add(0);
        arr6.add(0);
        arr6.add(1);
        arr6.add(2);
        arr6.add(4);
        arr6.add(0);

        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
        arr.add(arr4);
        arr.add(arr5);
        arr.add(arr6);

        System.out.println(arr.size());
        System.out.println(arr.get(0).size());
        System.out.println(arr.size()-4);
        System.out.println(arr.get(0).size()-4);
        int rows = arr.size();
        int column = arr.get(0).size();



    }



    }






