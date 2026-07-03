## 4 DIVIDE AND CONQUER

In divide and conquer, we solve a problem recursively, applying three steps at each level 
of recursion.

1. **Divide**: the problem into a number of subproblems that are smaller instances of the
same problem.
2. **Conquer**: the subproblems by solving them recursively. If the subproblem sizes are
small enough, however, just solve the subproblems in a straightforward manner.
3. **Combine**: the solutions to the subproblems into the solution for the original problem.

----
> **Recurrences**
> 
> A recurrence is an equation or inequality that describes a function in terms of
> its value on smaller inputs.

There's three methods to solving recurrences:
1. In the **substitution method**, we guess a bound and then use mathematical induction
to prove our guess correct. 
2. The **recursion-tree method** converts the recurrence into a tree whose nodes
represent the costs incurred at various levels of the recursion. We use techniques
for bounding summations to solve the recurrence. 
3. The **master method** provides bounds for recurrences of the form __T(n)=aT(n/b)+f(n)__ 
where a > 1, b > 1, and f(n) is a given function. Such recurrences arise frequently.
A recurrence of the form in equation characterizes a divide-and-conquer algorithm 
that creates a subproblems, each of which is 1=b the size of the original problem,
and in which the divide and combine steps together take f(n) time.

----

## 4.1 The maximum-subarray problem

