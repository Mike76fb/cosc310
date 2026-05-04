# Cycling GPS Data Analysis Project

## Problem 1: 

**Question:**  
How can we identify the top 10 highest cycling power outputs across the dataset?

**Approach:**  
I implemented Merge Sort to sort all track points based on power output in descending order.

**Why Merge Sort:**
- Time Complexity: O(n log n)
- Stable and efficient for large datasets
- Suitable for ranking operations

**Result:**  
The highest power outputs represent peak cycling performance moments.

---

## Problem 2: Searching (Speed Threshold Detection)

**Question:**  
How can we efficiently find all timestamps where speed exceeds 8 m/s?

**Approach:**  
I used a linear search algorithm to scan all records and filter values exceeding the threshold.

**Why Linear Search:**
- Simple and effective for unsorted data
- Time Complexity: O(n)

**Result:**  
This identifies high-intensity sprint sections of the ride.

---

## Conclusion

This project demonstrates how sorting and searching algorithms can be applied to real-world GPS cycling data to extract meaningful performance insights such as peak power output and high-speed events.