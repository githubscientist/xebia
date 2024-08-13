import java.util.ArrayList;
import java.util.HashMap;

class TwoSum {
    // third approach
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        // create an array list to store the result
        ArrayList<Integer> result = new ArrayList<Integer>();

        // create a hash map to store the numbers and their indexes
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // iterate through the numbers
        for (int i = 0; i < nums.length; i++) {
            // check if the complement of the current number is in the map
            if (map.containsKey(target - nums[i])) {
                // add the indexes of the pair to the result
                result.add(map.get(target - nums[i]));
                result.add(i);
                return result;
            }

            // add the number and its index to the map
            map.put(nums[i], i);
        }

        return result;
    }

    // second approach
    // public static ArrayList<Integer> twoSum(int[] nums, int target) {
    // // create an array list to store the result
    // ArrayList<Integer> result = new ArrayList<Integer>();

    // // prepare an array with the original indexes of the numbers
    // int[][] numsWithIndex = new int[nums.length][2];

    // for (int i = 0; i < nums.length; i++) {
    // numsWithIndex[i][0] = nums[i];
    // numsWithIndex[i][1] = i;
    // }

    // // sort the array based on the numbers
    // java.util.Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

    // // find the pair of numbers that sum up to the target
    // int left = 0;
    // int right = nums.length - 1;

    // while (left < right) {
    // int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
    // if (sum == target) {
    // result.add(numsWithIndex[left][1]);
    // result.add(numsWithIndex[right][1]);
    // return result;
    // } else if (sum < target) {
    // left++;
    // } else {
    // right--;
    // }
    // }

    // return result;
    // }

    // first approach
    // public static ArrayList<Integer> twoSum(int[] nums, int target) {
    // // create an array list to store the result
    // ArrayList<Integer> result = new ArrayList<Integer>();

    // // Generate all the possible pairs of numbers
    // for (int i = 0; i < nums.length - 1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // // check if the sum of the pair is equal to the target
    // if (nums[i] + nums[j] == target) {
    // // add the indexes of the pair to the result
    // result.add(i);
    // result.add(j);
    // return result;
    // }
    // }
    // }

    // return result;
    // }

    public static void main(String[] args) {
        // test the function twoSum here
        System.out.println(twoSum(new int[] { 2, 7, 11, 15 }, 9)); // [0, 1]
        System.out.println(twoSum(new int[] { 3, 2, 4 }, 6)); // [1, 2]
        System.out.println(twoSum(new int[] { 3, 3 }, 6)); // [0, 1]
    }
}