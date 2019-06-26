# dsjavaworkouts
Project that contains programs about data structures, algorithms, coding interview solutions
Author : Nagappan Subramanian (SRN)

Package Name : com.nagappans.dsalgolab

Class                           | TestClass
    Description
---------------------------------------------------------------
IStack, Stack                   | StackTest
    Stack class implemented with pop, push, peek operation with isempty and isfull checks for a fixed number of elements.

---------------------------------------------------------------
MinElementStack                 | MinElementStackTest
    Using stack find minimum element at any point of time with time complexity O(1). Approach is to have another min stack with main stack
    which maintains the minimum element at every moment. But this requires extra space of O(n).

---------------------------------------------------------------
MinStackWithoutExtraSpace       | MinStackWithoutExtraSpaceTest
    Find minimum element with time and space complexity as O(1). This has been done by having min variable which holds
    the minimum value and stack element will hold transformed previous smaller value.
    while push, current element(x) transformed with previous min element and y gets stored in stack: y = 2x - min
    while pop, 2 times minimum element subtracted with popped element will have previous min element:    x = 2min - y

------------------------------------------------------------------
PrevSmallerUtil                 | PrevSmallerUtilTest
    In a input array, find the nearest smaller number, if not available have it as -1
        eg: i/p: [4, 5, 2, 10, 8]
            o/p: [-1, 4, -1, 2, 2]
    It is implemented with stack having previous smaller linked from each node in the stack. Time complexity O(n^2).
------------------------------------------------------------------
RedudantBraces                  | RedudantBracesTest
    Given a valid mathematical expression, check whether braces are redudant at any position.
