# Goal

Arrange the numbers in ascending order.

# Principle

1. Start from the second element of the array (index 1).
2. Compare it with the elements before it.
3. Shift all larger elements one position to the right to make space.
4. Insert the current element into its correct position.
5. Repeat the process for all elements until the array is sorted.

# Complexity

* Worst case: O(n^2) — when the array is in descending order.
* Average case: O(n^2) — for a randomly ordered array.
* Best case: O(n^2 ) — when the array is already sorted.
