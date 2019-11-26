//Problem:
//The string "SAYPALIQHITING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
// S   A   H   N
// A P L Q I I G
// Y   I   T
//And then read line by line: "SAHNAPLQIIGYIT"


/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */

var convert = function(s, numRows) {
    if(s.length <= numRows) return s;
    let rowObj = {};
    let ans = '';
    let counter = 1;
    let m = 1;
    for(var n = 0; n < s.length; n++){
        if(!rowObj[counter]) rowObj[counter] =''
        rowObj[counter] = rowObj[counter] + s.substr(n,1)
        counter = counter + 1* m; 
        if(counter == numRows || counter == 1 ){
            m = m*(-1);
        }
    }
    Object.keys(rowObj).forEach(function(key){
        ans = ans + rowObj[key];
    })
    return ans;
};