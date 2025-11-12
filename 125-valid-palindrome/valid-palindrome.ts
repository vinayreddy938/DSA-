function isPalindrome(s: string): boolean {
      s = s.toLowerCase();
    let filteredString: string = "";
    let reverseString : string = "";
    for(let i=0;i<s.length;i++){
        if((s[i].charCodeAt(0)>="a".charCodeAt(0) && s[i].charCodeAt(0)<="z".charCodeAt(0)) || (s[i].charCodeAt(0)>="0".charCodeAt(0) && s[i].charCodeAt(0)<="9".charCodeAt(0))){
            filteredString+=s[i];
            reverseString = s[i]+reverseString

        }
    }
    console.log(filteredString);
    return filteredString  === reverseString;
    
};