/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {
    const stack = [];
    const mySet = new Set(['+','-','/','*']);
    for(let i=0;i<tokens.length;i++){
        const token = tokens[i];
        if(mySet.has(token)){
            const a = Number(stack.pop());
            const b=Number(stack.pop());
            let result = 0;
            if(token == '+'){
                result = a+b;

            }
            else if(token == '-'){
                result = b-a;
            }
            else if(token =='*'){
                result = b*a;
            }else if(token === '/'){
              
                result = Math.trunc(b/a);
                
            }
            stack.push(result);
            
        

        }else{
            stack.push(token);
      
        }
    }
    return Number(stack.pop());
    
};