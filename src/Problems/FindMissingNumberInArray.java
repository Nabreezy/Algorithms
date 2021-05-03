package Problems;

public class FindMissingNumberInArray {


    public int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int sum1 = 0;

        for (int j : arr) {
            sum1 += j;
        }
        int missing = sum-sum1;

        if((sum+sum1)== 0){
            System.out.println("There is no missing numbers");
            return -1;
        }

        System.out.println("missing number is "+ missing);
        return missing;
    }
}
