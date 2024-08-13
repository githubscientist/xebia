// first approach

// function twoSum(nums, target) {
//     // generate all possible pairs
//     for (let i = 0; i < nums.length; i++){
//         for (let j = i + 1; j < nums.length; j++){
//             // check if the sum of the pair is equal to the target
//             if (nums[i] + nums[j] === target){
//                 return [i, j];
//             }
//         }
//     }
// }

// second approach
// function twoSum(nums, target) {
//     // create an array with the original indexes
//     const numsWithIndex = nums.map((num, index) => ([num, index]));
    
//     // sort the array
//     numsWithIndex.sort((a, b) => a[0] - b[0]);

//     // create two pointers
//     first = 0
//     last = nums.length - 1

//     while (first < last) {
//         // check if the sum of the two numbers is equal to the target
//         if (numsWithIndex[first][0] + numsWithIndex[last][0] === target) {
//             return [numsWithIndex[first][1], numsWithIndex[last][1]];
//         } else if (numsWithIndex[first][0] + numsWithIndex[last][0] < target) {
//             first++;
//         } else {
//             last--;
//         }
//     }
// }

// third approach
function twoSum(nums, target) {
    const map = new Map();

    for (let i = 0; i < nums.length; i++) {
        // find the complement of the current number
        const complement = target - nums[i];

        // check if the complement is in the map
        if (map.has(complement)) {
            return [map.get(complement), i];
        }

        // add the current number to the map
        map.set(nums[i], i);
    }
}

console.log(twoSum([2, 7, 11, 15], 9)); // [0, 1]
console.log(twoSum([3, 2, 4], 6)); // [1, 2]
console.log(twoSum([3, 3], 6)); // [0, 1]