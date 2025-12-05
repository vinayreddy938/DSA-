var MyQueue = function() {
    this.s1 = [];
    this.s2 = [];
};

/** 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function(x) {
    this.s1.push(x);
};

/**
 * @return {number}
 */
MyQueue.prototype.pop = function() {
    
    // Move all elements except one into s2
    while (this.s1.length > 1) {
        this.s2.push(this.s1.pop());
    }

    // This is the real front element
    let number = this.s1.pop();

    // Move all back to s1
    while (this.s2.length != 0) {
        this.s1.push(this.s2.pop());
    }

    return number;
};

/**
 * @return {number}
 */
MyQueue.prototype.peek = function() {
    
    // Move all except last
    while (this.s1.length > 1) {
        this.s2.push(this.s1.pop());
    }

    // Front element
    let number = this.s1.pop();

    // Put it back (because peek should NOT remove)
    this.s1.push(number);

    // Move remaining back
    while (this.s2.length != 0) {
        this.s1.push(this.s2.pop());
    }

    return number;
};

/**
 * @return {boolean}
 */
MyQueue.prototype.empty = function() {
    return this.s1.length == 0;
};
