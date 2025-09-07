// -------------------------------------------------------------------------------------

// Method - I :- Implementation of Stack Using Queue 

// Time Complexity :-    , for Push = O(n) , and for remaining all O(1)
// Space Comlpexity :-  It is dyanmic in nature so we cannot decide it

import java.util.*;

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {
        q.add(x);

        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }

    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        int temp = q.size();

        if (temp == 0)
            return true;

        return false;
    }
}
