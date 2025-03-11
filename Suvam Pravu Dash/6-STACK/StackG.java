//stock span problem

//Span = current index - top index in stack
//Stop if current index has a smaller value than value at top index
//If current value is higher than value at top index of stack, pop the stack

import java.util.Stack;

public class StackG {

    public static void stocksSpan(int[] stocks, int[] span) {

        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        //starting from the second day (index 1)
        for (int i = 1; i < stocks.length; i++) {
            int currentPrice = stocks[i];

            /* It checks if the stack is not empty and if the currentPrice
            is greater than the stock price at the index on the top of the
            stack (stocks[s.peek()]). */
            /*If the condition is true, it means the previous stock price
            was lower than the currentPrice, so it's not part of the span.
            We pop the index from the stack.*/
            /*We keep popping until we find a stock price that is greater
            than or equal to the currentPrice or the stack becomes empty.*/
            while (!s.isEmpty() && currentPrice > stocks[s.peek()]) {
                s.pop();
            }

            /* If the stack is empty after the while loop, it means all
            previous stock prices were lower than the currentPrice.
            In this case, the span is i + 1 (the number of days from the
            beginning to the current day)*/
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {

                /*int prevHigh = s.peek();We get the index of the previous higher price from the top of the stack.span[i] = i - prevHigh;The span is calculated as the difference between the current index i and the index of the previous higher price prevHigh.*/
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
            /* After calculating the span for the current day, we push the current index i onto the stack */
        }

    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];
        stocksSpan(stocks, span);

        for (int i : span) {
            System.out.println(i + " ");
        }
    }
}

/*Let's walk through the stocks array {100, 80, 60, 70, 60, 85, 100}:

Day 0: Price = 100

Initialization:
span[0] = 1 (The span of the first day is always 1).
s.push(0) (Push the index 0 onto the stack).
Stack State: s = {0}
Span: span = {1, 0, 0, 0, 0, 0, 0}
Day 1: Price = 80

Comparison: 80 < 100 (Current price is less than the price at the top of the stack).
Span Calculation: span[1] = 1 - 0 = 1 (Current index - top of stack index).
Stack Update: s.push(1)
Stack State: s = {0, 1}
Span: span = {1, 1, 0, 0, 0, 0, 0}
Day 2: Price = 60

Comparison: 60 < 80 (Current price is less than the price at the top of the stack).
Span Calculation: span[2] = 2 - 1 = 1
Stack Update: s.push(2)
Stack State: s = {0, 1, 2}
Span: span = {1, 1, 1, 0, 0, 0, 0}
Day 3: Price = 70

Comparison: 70 > 60 (Current price is greater than the price at the top of the stack).
Stack Pop: s.pop() (Pop the top of the stack).
Comparison: 70 < 80 (Current price is less than the new top of the stack).
Span Calculation: span[3] = 3 - 1 = 2
Stack Update: s.push(3)
Stack State: s = {0, 1, 3}
Span: span = {1, 1, 1, 2, 0, 0, 0}
Day 4: Price = 60

Comparison: 60 < 70 (Current price is less than the price at the top of the stack).
Span Calculation: span[4] = 4 - 3 = 1
Stack Update: s.push(4)
Stack State: s = {0, 1, 3, 4}
Span: span = {1, 1, 1, 2, 1, 0, 0}
Day 5: Price = 85

Comparison: 85 > 60 (Current price is greater than the price at the top of the stack).
Stack Pop: s.pop()
Comparison: 85 > 70
Stack Pop: s.pop()
Comparison: 85 > 80
Stack Pop: s.pop()
Comparison: 85 < 100
Span Calculation: span[5] = 5 - 0 = 5
Stack Update: s.push(5)
Stack State: s = {0, 5}
Span: span = {1, 1, 1, 2, 1, 5, 0}
Day 6: Price = 100

Comparison: 100 > 85 (Current price is greater than the price at the top of the stack).
Stack Pop: s.pop()
Comparison: 100 < 100
Span Calculation: span[6] = 6 - 0 = 6
Stack Update: s.push(6)
Stack State: s = {0, 6}
Span: span = {1, 1, 1, 2, 1, 5, 6}
Output: The span array: {1, 1, 1, 2, 1, 5, 6}*/