/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const  map = new Map();
    for(let i=0;i<strs.length;i++){
        const s =strs[i].split("").sort().join("");
        map[s] = [];
    }
    for(let i=0;i<strs.length;i++){
          const s =strs[i].split("").sort().join("");
           map[s].push(strs[i])
    }
    
    return Object.values(map);
    
};