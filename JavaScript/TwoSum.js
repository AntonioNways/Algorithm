// Problem:
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let record = {}
    for(var i= 0; i<nums.length; i++){
        if(record[target - nums[i]] !== undefined) return [record[target - nums[i]],i];
        record[nums[i]]=i;
    }
    return "No solution";  
};