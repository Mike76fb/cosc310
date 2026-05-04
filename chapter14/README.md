# Cycling GPS Data Analysis Project

---

 Part 1: Problem Formulation

Problem 1 – Sorting (Power Analysis)

Question: 
How can we identify the top 10 highest power output moments during cycling activity?

Goal:
Sort all track points by power (watts) to identify peak performance efforts.

---

Problem 2 – Searching (Speed Analysis)

**Question:**  
How can we find all timestamps where the rider exceeded 5 m/s speed?

**Goal:**  
Search through all records to extract high-speed cycling events.

---

Part 2: Methods

 Sorting (Merge Sort)
Merge Sort was used to rank all records by power in descending order.

- Time Complexity: O(n log n)
- Suitable for large datasets
- Produces fully ordered ranking of performance

---

Searching (Linear Search)
A linear scan was used to filter all records where speed > 5 m/s.

- Time Complexity: O(n)
- Direct filtering of dataset
- No preprocessing required

---

Part 3: Results

 Problem 1 Results – Top Power Outputs

After sorting the dataset by power, the highest recorded power values were:

- 265 watts (timestamp 1141877648)
- 234 watts (timestamp 1141877651)
- 225 watts (timestamp 1141877647)
- 214 watts (timestamp 1141877639)
- 210 watts (timestamp 1141877638)

**Interpretation:**  
These represent peak exertion periods during cycling, likely sprint efforts or climbs.

---

Problem 2 Results – High-Speed Events (Speed > 5 m/s)

The following timestamps exceeded 5 m/s:

- 1141877646 → 5.10 m/s
- 1141877647 → 5.13 m/s
- 1141877648 → 5.33 m/s
- 1141877649 → 5.54 m/s
- 1141877653 → 6.08 m/s

**Interpretation:**  
These intervals represent high-intensity cycling segments where the rider was accelerating or sprinting.
