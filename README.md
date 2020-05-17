# The FAANG Interview

## Data Structures & Algorithms
### `Big O Notation`
**O(1) - Constant time**
   - Same amount of time, regardless of the number of elements
`i.e. Random accesss array`

**O(log n) - Logarithmic**
   - When doubling the number of elements doesn't double the time (binary trees)
`i.e. Search algorithms`

**O(n) - Linear**
   - Adding element increases the runtime linearly
`i.e. Looping an array/list`

**O(n log n) - Quasilinear**
   - Every element has to be compared with every other element. Lots of comparisons
`i.e. Sorting algorithms`

**O(n^2) - Quadratic**
   - 2, 4, 8, 16, 32, 64 Increasing quadratically
`i.e. Nested loops`

**O(2^n) - Exponential. Recursion**
`i.e. Fibonacci series` 

### `How to identify patterns`
Operation takes same amoutn of time (regardless of the number of elements) `O(1)` i.e.
```
if(n = 10) {}
int j = 8*1000;
```

Iterating through a collection (for loop, while loop) `O(n)` i.e. 
```
for (...) {}
while (...) 
```

Looping through same collection x2 (nested) `O(n^2)` i.e.
```
for (int i) {
   for (int j) {
   }
}
```

Fibonacci series - recursion O(branch^depth) `2^n` i.e.
```
```

Searching sorted array (i.e. binary tree) `O(log n)` i.e.
```
```

Sorting `O(n log n)` i.e.
```
```

### `Rules of thumb`
*Drop the non-dominant terms*

`O(n^2 + n) -> O(n^2)`

*Drop the constants*

`O(3n) -> O(n)`

### Add Runtimes: O(n + m)
```
for (int n: arrayN) {
   print(n);
}
```

### `Multiply Runtimes: O(n * m)`
```
for (int n:arrayN) {
   for(int m: arrayM) {
      print(n + "," + n);
}
```

> :warning: **Note**: Not O(n^2)

### `Quick Quiz`
Reduce these
`O(n + log n)` -> ?<details><summary>Click to see **answer!**</summary>O(n)</details>

`O(7*2^n + 5000*n^99)` -> ?<details><summary>Click to see **answer!**</summary>O(2^n)</details>

Which is equivalent to O(n)?
`O(n + m)` where m < n/2 ?<details><summary>Click to see **answer!**</summary>Equivalent</details>

`O(2n)` ?<details><summary>Click to see **answer!**</summary>Equivalent</details>

`O(n + log n)` ?<details><summary>Click to see **answer!**</summary>Equivalent</details>

`O(n + m)` ?<details><summary>Click to see **answer!**</summary>Not Equivalent</details>


### `Primitive Data Structures (Array, LinkedList, Binary Tree)`
**Array** - *killer feature* is O(1) random access (get/set)

1. Can hold anything
2. Fixed size
3. Random access

Get `O(1)`

Set `O(1)`

Insert `O(n)`

Delete `O(n)`

<br>

**LinkedList** - *killer feature* is O(1) Add Front

1. No random access
2. No fixed capacity
3. Always the right size

getFirst `O(1)`

getLast `O(n)`

Add Front `O(1)`

Add Back `O(n)`

Delete `O(n)`

### `APIs (ArrayList, Stack/Queues, Binary Heap)`
**ArrayList** - Wrapper around array, offers convienance API. 

1. Dynamic resizing

Get `O(1)`

Set `O(1)`

Insert `O(n)`

Delete `O(n)`

**Stack** - *Killer feature* is O(1) push/pop

1. LIFO - Last in First Out (LIFO)

Access `O(n)`

Search `O(n)`

Push `O(1)`

Pop `O(1)`


**Queue** - *Killer feature* is O(1) add/remove

1.  First in First Out

Access `O(n)`

Search `O(n)`

Add `O(1)`

Remove `O(1)`<br/>


### `Videos`
**Top 10 Algorithms for the Coding Interview**

https://www.youtube.com/watch?v=r1MXwyiGi_U

**Binary Search**

https://www.youtube.com/watch?v=P3YID7liBug

**Depth First Search (DFS) / Breadth First Search (BFS)**

https://www.youtube.com/watch?v=zaBhtODEL0w

**Bubble Sort**

https://www.youtube.com/watch?v=6Gv8vg0kcHc

**Merge Sort**

https://www.youtube.com/watch?v=KF2j-9iSf4Q

**Quick Sort**

https://www.youtube.com/watch?v=SLauY6PpjW4

**Hashtables**

**Big O Notation**

https://www.youtube.com/watch?v=v4cd1O4zkGw

**Binary Tree Diameter**

https://www.youtube.com/watch?v=TQI_m32_AeU

### `Common Questions`
**Valid Parenthesis**

https://leetcode.com/problems/valid-parentheses/

**Longest Palindromic Substring**

https://leetcode.com/problems/longest-palindromic-substring/

**Reverse Linked List**

https://leetcode.com/problems/reverse-linked-list/

**Remove Duplicates Linked List**

https://leetcode.com/problems/remove-duplicates-from-sorted-list/

## Random Study Guides
https://github.com/mission-peace/interview/wiki

### `Coding University`
https://github.com/jwasham/coding-interview-university

## Systems Design 
### `System Design Primer`
https://github.com/donnemartin/system-design-primer

### `Grokking System Design Interview`
https://www.educative.io/courses/grokking-the-system-design-interview

## Academic Courses
### `CS 61B Berkeley Data Structures`
https://inst.eecs.berkeley.edu/~cs61b/fa19/

### `MIT Introductions to Algorithms 2011`
https://www.youtube.com/playlist?list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb

## References/Misc
### `Java Hashcode`
https://www.baeldung.com/java-hashcode
