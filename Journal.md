# Phase 1
The `swap()` method will be useful in future phases because sorting algorithms like Selection Sort need to exchange elements to put them in the correct order. It also makes the sorting code easier to reuse.

# Phase 2 Journal
The number of comparisons does not change if the array is already sorted. Selection Sort still checks every element in the unsorted portion to find the minimum value, resulting in O(N²) time complexity.

# Phase 3 Journal
The main drawback of Merge Sort is that it requires additional memory for its temporary array. This can be a problem when working with extremely limited RAM, while Selection Sort sorts in place and requires very little extra memory.