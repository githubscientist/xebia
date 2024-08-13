'''
    1. Generate all possible pairs of the numbers.
    2. For each of the pair, check if the pair sum is equal to the target.
    3. If the sum is equal to the target, return the indices of the pair.
'''

# First Approach


# def two_sum(nums, target):
#     # Generate all possible pairs of the numbers.
#     for i in range(len(nums)):
#         for j in range(i+1, len(nums)):
#             # for each of the pair, check if the pair sum is equal to the target.
#             if nums[i] + nums[j] == target:
#                 # If the sum is equal to the target, return the indices of the pair.
#                 return [i, j]

# Second Approach

# def two_sum(nums, target):
#     # preserve the indices of the elements in nums
#     numsWithIndices = [[num, index] for index, num in enumerate(nums)]

#     # sort the numsWithIndices based on the element value
#     numsWithIndices.sort(key=lambda x: x[0])

#     # initialize two pointers
#     first = 0
#     last = len(nums) - 1

#     while first < last:
#         # check if the total sum of the elements at the first and last indices is equal to the target
#         pairSum = numsWithIndices[first][0] + numsWithIndices[last][0]
#         if pairSum == target:
#             # return the indices of the elements
#             return [numsWithIndices[first][1], numsWithIndices[last][1]]
#         elif pairSum < target:
#             first += 1
#         else:
#             last -= 1

# Third Approach

def two_sum(nums, target):
    # create a dictionary to store the indices of the elements
    numDict = {}

    # iterate through the list of numbers
    for index, num in enumerate(nums):
        # check if the difference between the target and the number is present in the dictionary
        if target - num in numDict:
            # return the indices of the elements
            return [numDict[target - num], index]
        # store the index of the number in the dictionary
        numDict[num] = index


if __name__ == "__main__":
    # test the function with the given testcases
    print(two_sum([2, 7, 11, 15], 9))  # Expected output: [0, 1]
    print(two_sum([3, 2, 4], 6))  # Expected output: [1, 2]
    print(two_sum([3, 3], 6))  # Expected output: [0, 1]
