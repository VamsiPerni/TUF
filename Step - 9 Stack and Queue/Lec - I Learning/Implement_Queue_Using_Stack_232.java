// -------------------------------------------------------------------------------------
// Implementation of Queue Using Stack

// Method - I :- Approach - I , (By assuming we are equally doing all the operations , it is the best one )

// Time Complexity :- For push O(2n) , for remaining all
// Space Comlpexity :- O(2*Dynamic_space)

import java.util.*;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {

        int temp1 = s1.size();

        for (int i = 0; i < temp1; i++) {
            s2.push(s1.pop());
        }

        s1.push(x);

        int temp2 = s2.size();

        for (int i = 0; i < temp2; i++) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.empty();
    }
}

// -------------------------------------------------------------------------------------
// Implementation of Queue Using Stack

// Method - I :- Approach - II , (By assuming we are equally doing all the
// operations , it is the best one )

// Time Complexity :- For push O(2n) , for remaining all
// Space Comlpexity :- O(2*Dynamic_space)
