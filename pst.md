# Problem Solving

Example Interview Problem:

Two Sum Problem: Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Test Case 1:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,

return [0, 1].

Test Case 2:

Given nums = [3, 2, 4], target = 6,

Because nums[1] + nums[2] = 2 + 4 = 6,

return [1, 2].

Test Case 3:

Given nums = [3, 3], target = 6,

Because nums[0] + nums[1] = 3 + 3 = 6,

return [0, 1].

First Approach:

Brute Force Approach:

Generate all the possible pairs of the numbers and check if the sum of any pair is equal to the target.

Time Complexity: O(n^2)

Second Approach:

Two pointers Approach:

Sort the array and use two pointers to find the sum of the two numbers.

Time Complexity: O(nlogn)

Third Approach:

Hashing Approach:

Use a hash table to store the elements and their indices.
