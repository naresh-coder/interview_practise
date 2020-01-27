package list;

import java.util.Stack;

public class QueusUsingStacks {
}


class Queue {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> reverStack = new Stack<>();

    public void enque(int val) {

        while (!mainStack.isEmpty()) {
            reverStack.push(mainStack.pop());
        }

        mainStack.push(val);

        while (!reverStack.isEmpty()) {
            mainStack.push(reverStack.pop());
        }


    }

    public int dequeue() {
        if (mainStack.isEmpty()) return -1;
        else
            return mainStack.pop();
    }

}