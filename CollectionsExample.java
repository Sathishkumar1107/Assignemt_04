package com.java.Demos;
import java.util.Stack;

class IntegerStack{
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop an element.");
        } else {
            int poppedElement = stack.pop();
            System.out.println("Popped " + poppedElement + " from the stack.");
        }
    }

    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }


}


public class CollectionsExample {
    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();
        integerStack.pushElement(10);
        integerStack.pushElement(20);
        integerStack.pushElement(30);

        // Test checking if the stack is empty
        integerStack.checkIfEmpty();

        // Test popping elements from the stack
        integerStack.popElement();
        integerStack.popElement();

        // Test popping from an empty stack
        integerStack.popElement();
        integerStack.popElement(); // This will handle empty stack scenario

        // Check if the stack is empty again
        integerStack.checkIfEmpty();
    }
}
