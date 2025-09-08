// -------------------------------------------------------------------------------------

//  155 Min Stack (Leetcode)

// Method - I :- Brute Force (with some huge space complexity)

// Time Complexity :- O(1)  for all the operations
// Space Comlpexity :- O(2n)   here we are storing pair of integers so we are getting 2*n time complexity

// import java.util.*;

// class Pair {
//     int x, y;

//     Pair(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
// }

// class MinStack {

//     Stack<Pair> st;

//     public MinStack() {
//         st = new Stack<>();
//     }

//     public void push(int val) {
//         int min = Integer.MIN_VALUE;

//         if (st.empty()) {
//             min = val;
//         } else {
//             min = Math.min(st.peek().y, val);
//         }
//         st.push(new Pair(val, min));   // {***} remember this line 
//     }

//     public void pop() {
//         st.pop();
//     }

//     public int top() {
//         return st.peek().x;
//     }

//     public int getMin() {
//         return st.peek().y;
//     }
// }

// -------------------------------------------------------------------------------------

//  155 Min Stack (Leetcode)

// Method - II :- Optimal Approach (with reducing the extra space usage)

// Time Complexity :- O(1)  for all the operations
// Space Comlpexity :- O(n) 

// ------------------------
// It is working for most of the testcases except few of them because , some are very large numbers which we need long to store the number for that 

// import java.util.*;   

// class MinStack {
//     int min = Integer.MIN_VALUE;
//     Stack<Integer> stack = new Stack<>();

//     public MinStack() {
//     }

//     public void push(int val) {
//         if (stack.empty()) {
//             min = val;
//             stack.push(val);
//             return;
//         }

//         if (min < val) {
//             stack.push(val);
//             return;
//         } else {
//             int newVal = (2 * val) - min;
//             stack.push(newVal);
//             min = val;
//             return;
//         }
//     }

//     public void pop() {
//         if (stack.empty())
//             return;

//         if (stack.peek() < min) {
//             min = (2 * min) - stack.peek();
//             stack.pop();
//             return;
//         }
//         stack.pop();
//         return;
//     }

//     public int top() {

//         if (stack.peek() < min)
//             return min;

//         return stack.peek();
//     }

//     public int getMin() {
//         return min;
//     }
// }

// -------------------------------------------------------------------------------------

//  155 Min Stack (Leetcode)

// Method - II :- Optimal Approach (with reducing the extra space usage)

// Time Complexity :- O(1)  for all the operations
// Space Comlpexity :- O(n) 

import java.util.*;

class MinStack {
    Long min = Long.MAX_VALUE;
    Stack<Long> stack = new Stack<>();

    public MinStack() {
    }

    public void push(int value) {
        Long val = Long.valueOf(value);

        if (stack.empty()) {
            min = val;
            stack.push(val);
            return;
        }

        if (min < val) {
            stack.push(val);
            return;
        } else {
            Long newVal = (2 * val) - min;
            stack.push(newVal);
            min = val;
            return;
        }
    }

    public void pop() {
        if (stack.empty())
            return;

        if (stack.peek() < min) {
            min = (2 * min) - stack.peek();
            stack.pop();
            return;
        }
        stack.pop();
        return;
    }

    public int top() {

        if (stack.peek() < min)
            return min.intValue();

        return stack.peek().intValue();
    }

    public int getMin() {
        return min.intValue();
    }
}