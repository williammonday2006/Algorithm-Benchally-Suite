# Phase 1
The `swap()` method will be useful in future phases because sorting algorithms like Selection Sort need to exchange elements to put them in the correct order. It also makes the sorting code easier to reuse.

# Phase 2 Journal
The number of comparisons does not change if the array is already sorted. Selection Sort still checks every element in the unsorted portion to find the minimum value, resulting in O(N²) time complexity.

# Phase 3 Journal
The main drawback of Merge Sort is that it requires additional memory for its temporary array. This can be a problem when working with extremely limited RAM, while Selection Sort sorts in place and requires very little extra memory.

# Phase 4 Journal
Selection Sort grew much slower than Merge Sort, as expected with O(N²) compared to O(N log N). Measuring time is not always consistent because hardware and other running processes affect results. I tested sorted, reverse-sorted, and identical-value arrays, and both algorithms handled them correctly. AI feedback helped identify the impractical runtime of Selection Sort with extremely large arrays.