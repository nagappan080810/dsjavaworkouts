# dsjavaworkouts
Project that contains programs about data structures, algorithms, coding interview solutions

Author : Nagappan Subramanian (SRN)

**Package Name : com.nagappans.dsalgolab.stacks**

**Class                         | TestClass**

IStack, Stack                   | StackTest   

    `Stack class implemented with pop, push, peek operation with isempty and isfull checks for a fixed number of elements.`
    
---------------------------------------------------------------
MinElementStack                 | MinElementStackTest

    `Using stack find minimum element at any point of time with time complexity O(1). Approach is to have another min stack
     with main stack which maintains the minimum element at every moment. But this requires extra space of O(n).`

---------------------------------------------------------------
MinStackWithoutExtraSpace       | MinStackWithoutExtraSpaceTest

    `Find minimum element with time and space complexity as O(1). This has been done by having min variable which holds
     the minimum value and stack element will hold transformed previous smaller value. 
     While push, current element(x) transformed with previous min element and y gets stored in stack: y = 2x - min while pop,
     2 times minimum element subtracted with popped element will have previous min element:    x = 2min - y`

------------------------------------------------------------------
PrevSmallerUtil                 | PrevSmallerUtilTest

    `In a input array, find the nearest smaller number, if not available have it as -1
    eg: i/p: [4, 5, 2, 10, 8]
     o/p: [-1, 4, -1, 2, 2]
    It is implemented with stack having previous smaller linked from each node in the stack. Time complexity O(n^2).`
 
------------------------------------------------------------------
RedudantBraces                  | RedudantBracesTest

    `Given a valid mathematical expression, check whether braces are redudant at any position.`

------------------------------------------------------------------
BoundlessStack                  | BoundlessStackTest

    `Stack is created with fixed size of internal array so if the limit is reached, it automatically expands the arr to 0
    .5 times more so that stack will not overflow and have any number of elements pushed.`
    
------------------------------------------------------------------
FindUniqueElementInArray        | FindUniqueElementInArrayTest

    `Find unique element in the array where all elements are repeated twice expect one
    O(n)`

------------------------------------------------------------------
NextGreatestUtil | NextGreatestUtilTest

    `Next greatest element in the array for each element in the array`

------------------------------------------------------------------
StockSpanProblem | StockSpanProblem

    `Stock price list for each day will be given. need to find the number of days it is lesser or equal to current day
    price. Implemented by stack with O(n) complexity.`

------------------------------------------------------------------
QueueWithStack | QueueWithStack

    `Implemented queue with two stacks, one stack used at the time of enqueue operation and another at the time of
    dequeue operation.`

------------------------------------------------------------------

SortStack | SortStackTest

    `Sort stack elements using recursive approach`

------------------------------------------------------------------

ReversableStack | ReversableStackTest
RecursiveReverseStack | RecursiveReverseStackTest

    `Pushing elements to the stack and then reverse will reverse the elements completely. It is done by linking the
    nodes`

------------------------------------------------------------------

BalancedParanthesis | BalancedParanthesisTest

    `BalancedParanthesis check whether expression have balanced paranthesis if not return false. It is implemented by
    pushing character to stack until closing paranthesis is seen.`

------------------------------------------------------------------

**Package Name : com.nagappans.dsalgolab.arrays**

**Class                         | TestClass**

BinarySearchSortedRotatedArray  | BinarySearchSortedRotatedArrayTest

    `Find elem in sorted rotated array  in logn complexity.`
    
------------------------------------------------------------------
MoveZeroesToEndInArray | MoveZeroesToEndInArrayTest

    `Move zeroes to the end in the array`
    
------------------------------------------------------------------
KnotsAndCrossStreak | KnotsAndCrossStreakTest

    `KnotsAndCross streak has to be counted and returned`

------------------------------------------------------------------
DutchManFlagProblem | DutchManFlagProblemTest

    `DutchMan flag problem to segregate 1,2 and 3's using linkelist without extra space`

------------------------------------------------------------------



**Package Name : com.nagappans.dsalgolab.queues**

**Class                         | TestClass**

IQueue|CircularQueue            | CircularQueueTest

    `Circular queue with array implementation if arr crosses the bound it goes to the front part of the array.`

------------------------------------------------------------------

IQueue|DynamicQueue            | DynamicQueueTest

    `Dynamic queue which enlarges the array automatically when the internal array becomes full.`

------------------------------------------------------------------


ReverseQueueUtil               | ReverseQueueUtilTest

    `Reverse queue util is to reverse the queue element by stack or recursion`

------------------------------------------------------------------

**Package Name : com.nagappans.dsalgolab.bitwiseoperations**

**Class                         | TestClass**

FindUniqueElementInArray        | FindUniqueElementInArrayTest

    `Find unique element in the array where all elements are repeated twice expect one.
    Hint : 1 ^ 1 = 0
    O(n)`
    
------------------------------------------------------------------

SpotUniqueRepeatedNTimes       | SpotUniqueRepeatedNTimesTest

    `Find unique element in the array where all elements are repeated N Times.
    Hint : Apply bitmask to each bit position and then sum and do a modulus to get the number back
    O(n)`

------------------------------------------------------------------

ArithmeticWithoutArithmeticOperators | ArithmeticWithoutArithmeticOperatorsTest

    `Arithmetic operations are add, multiply without arithmetic operators. It has been done by bitwise operations.`

------------------------------------------------------------------

**Package Name : com.nagappans.dsalgolab.trees**

**Class              | TestClass**

BinaryHeap           | BinaryHeapTest

    `Binary heap has two childrens which will be greater than the parent which will be min heap. This data structure
    has been created with add, delete, extractmin operations. So to use in Priority Queue`

------------------------------------------------------------------


BinarySearchTree     | BinarySearchTreeTest

    `Search an element in sorted array by looking at the mid of the element and then go left or right of the sub array.
    This search will happen with element lesser than k level of it`

------------------------------------------------------------------

**Package Name : com.nagappans.dsalgolab.strings**

**Class              | TestClass**

ReverseString        | ReverseStringTest

    `Reverse string by diving the string by two and then swap the characters.
    Time complexity: O(n)  | Space Complexity: O(1)`
    
------------------------------------------------------------------

**Class              | TestClass**

CheckAnagram         | CheckAnagramTest

    `Check given both strings are anagram - two implementations .
     1. HashMap Approach 2. Bitwise operations`

------------------------------------------------------------------

**Package Name : com.nagappans.dsalgolab.linkedlist**

**Class                              | TestClass**

LinkedList,HasCycleLinkedList        | LinkedList,HasCycleLinkedListTest

    `Detect a cycle in linked list - two implementations: one hashset approach to find the duplicates, other is floyd's
    cycle approach.
    Time complexity: O(n)  | Space Complexity: O(1)`

------------------------------------------------------------------


**Class                              | TestClass**

PrintNoOfOccurrences                 | PrintNoOfOccurrencesTest

    `Print no of occurences of each element in the linked list by iterating through the list`

------------------------------------------------------------------

**Class                              | TestClass**

ReverseLinkedList                    | ReverseLinkedListTest

    `Reverse linked list has two utility methods one to reverse the linked list by recursion and palindrome match by
    recursive approach in linked list`

------------------------------------------------------------------

**Class                              | TestClass**

SegregateOddEvenNodes                | SegregateOddEvenNodesTest

    `Segregate odd position nodes and even position nodes at the begining and end of the list`

------------------------------------------------------------------

**Package Name : com.nagappans.dsalgolab**

**Class              | TestClass**

LruCache             | LruCacheTest

    `Least recently used cache implementation done with hashmap and doubly linkedlist implementation
    Time complexity: O(1)  | Space Complexity: O(n)`

------------------------------------------------------------------







