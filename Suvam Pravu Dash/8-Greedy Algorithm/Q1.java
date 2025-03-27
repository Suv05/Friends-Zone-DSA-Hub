/*
Activity Selection
You are given n activities with their start and end times. Select the maximum number of activities
that can be performed by a single person, assuming that a person can only work on a single
activity at a time. 'Activities are sorted according to end time'.

start = {1,3,0,5,8,5}
end = {2,4,6,7,9,9}

*/

//Goal: select the maximum number of non-overlapping activities that a single person can perform
//Greedy Approach: always selecting the activity that finishes earliest

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        //end time is already sorted so we don't need to sort them
        ArrayList<Integer> task = new ArrayList<>();
        int maxNoActivities = 0;

        //step-1 select first activity (1,2) & Last selected activity end time = 2
        maxNoActivities = 1;
        task.add(0);// take for (1,2) task 0
        int lastEndTime = end[0];

        //Step 2: Iterate through the remaining activities
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEndTime) {
                //activity select
                maxNoActivities++;
                task.add(i);
                lastEndTime = end[i];
            }
        }

        System.out.println("Maximum no of activities a single person can do is " + maxNoActivities);
        for (int i = 0; i < task.size(); i++) {
            System.out.print("Task " + task.get(i) + " ");
        }
        System.out.println();
    }
}

//output :-
// Selected activities: (1,2), (3,4), (5,7), (8,9)
//
//Total activities selected: 4

/*
Step 2: Iterate through the remaining activities
(3,4) → start(3) >= last_end(2) → Select it

Last selected activity end time = 4

(0,6) → start(0) < last_end(4) → Ignore it

(5,7) → start(5) >= last_end(4) → Select it

Last selected activity end time = 7

(8,9) → start(8) >= last_end(7) → Select it

Last selected activity end time = 9

(5,9) → start(5) < last_end(9) → Ignore it
*/