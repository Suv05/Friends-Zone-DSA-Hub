# Stack Implementations and Applications

This document showcases various implementations and applications of the Stack data structure, including solutions to problems commonly asked in technical interviews at companies like Amazon, OYO, Netflix, and Microsoft.

## Table of Contents

- [A: Stack Implementation using ArrayList](#a-stack-implementation-using-arraylist)
- [B: Stack Implementation using LinkedList (Amazon, OYO)](#b-stack-implementation-using-linkedlist-amazon-oyo)
- [C: Stack Implementation using Collection Framework](#c-stack-implementation-using-collection-framework)
- [D: Push Element to the Bottom of a Stack (Netflix)](#d-push-element-to-the-bottom-of-a-stack-netflix)
- [E: Reverse a String using Stack (Microsoft)](#e-reverse-a-string-using-stack-microsoft)
- [F: Reverse a Stack](#f-reverse-a-stack)

---

## D: Push the element at the bottom of the stack (Netflix)

```java
public static void pushAtTheBottom(Stack<Integer> s, int data) {
        //base case when stack is empty at one stage
        if (s.isEmpty()) {
            s.push(data);
            return;

        }
        int top = s.pop(); //first remove items from stack
        pushAtTheBottom(s, data); //recursion call
        s.push(top); //push the deleted item again when data is already at bottom

    }
```

## E: Reverse a string using stack(Microsoft)
```java
public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        //store all charters in stack
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr = new StringBuilder();
        while (!s.isEmpty()) {
            Character c = s.pop(); //store remove chars
            newStr.append(c); // append them here
        }

        return newStr.toString(); //covert StringBuilder to string
    }
```

## F: Reverse a stack
```java
public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);

    } 
```