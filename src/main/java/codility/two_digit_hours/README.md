In this task we will investigate interesting patterns that could be observed on a digital clock. Such a clock represents a point in time using the format "HH:MM:SS" where:

"HH" is the hour of the day (00 through 23), as two decimal digits;
"MM" is the minute within the hour (00 through 59), as two decimal digits;
"SS" is the second within the minute (00 through 59), as two decimal digits.
We say that a point in time is interesting if it uses at most two different digits to print. The goal is to count the number of interesting points that can be observed on the clock in a given period of time.

Write a function:

class Solution { public int solution(String S, String T); }

that, given strings S and T specifying points in time in the format "HH:MM:SS", returns the number of interesting points in time between S and T (inclusive). You can assume that S indicates a point in time before T on the same day.

For example, given "15:15:00" and "15:15:12", your function should return 1, because there is only one interesting point in time between these points (namely "15:15:11"), Given "22:22:21" and "22:22:23", your function should return 3; interesting points in time are "22:22:21", "22:22:22", and "22:22:23".

Assume that:

strings S and T follow the format "HH:MM:SS" strictly;
string S describes a point in time before T on the same day.
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.