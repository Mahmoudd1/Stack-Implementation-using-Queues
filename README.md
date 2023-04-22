# Stack-Implementation-using-Queues
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 

## Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]

[[], [1], [2], [], [], []]

Output

[null, null, null, 2, 2, false]

## Explanation
MyStack myStack = new MyStack();

myStack.push(1);

myStack.push(2);

myStack.top(); // return 2

myStack.pop(); // return 2

myStack.empty(); // return False
 

## Constraints:

1 <= x <= 9

At most 100 calls will be made to push, pop, top, and empty.

All the calls to pop and top are valid.

# Solution 
## Push operation:

In the push() method, we will use the first queue (q1) to store the elements. First, we need to move all the elements from q1 to q2, then add the new element to q1, and finally move all the elements from q2 back to q1.

## Pop operation:
In the pop() method, we simply remove the first element from q1 and return it.

Top operation:
In the top() method, we simply return the first element of q1 without removing it.

Empty operation:
In the empty() method, we check if q1 is empty.
That's it! With these five methods, we can use two queues to implement a stack in Java
