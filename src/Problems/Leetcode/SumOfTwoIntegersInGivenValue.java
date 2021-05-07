package Problems.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIntegersInGivenValue {


public void bruteForce (int[] arr, int target){
    //        Brute Force Solution
    for (int j : arr) {
        for (int x = 1; x < arr.length; x++) {
            if ((target - j) == arr[x]) {
                System.out.println("[" + j + "," + arr[x] + "]");
            }
        }
    }
}

public int[] hashSolution (int[] arr, int target){
    //        Hash Map Solution

    Map<Integer,Integer> numMap = new HashMap<>();
    for(int  i = 0;i<arr.length;i++){
        numMap.put(arr[i],i);
        System.out.println(arr[i]);
    }

    for (int i = 0; i<arr.length;i++){
        int tempValue = target-arr[i];
        if(numMap.containsKey(tempValue) && numMap.get(tempValue)!=i){
//            System.out.println("["+arr[i]+","+tempValue+"]");
            return new int[] {i,numMap.get(tempValue)};

        }
    }

    return new int[] {-1,-1};
}





}
