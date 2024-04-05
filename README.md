# Java GC Playground
1. Exposes an endpoint for simulating a mixed GC object creation.
2. Exposes an endpoint for creating objects of a specific size.

# Instructions
1. Java 9+ for G1GC
2. VM Options
```dtd
-Xms200m
-Xmx200m
-XX:-G1UseAdaptiveIHOP
-XX:InitiatingHeapOccupancyPercent=20
-XX:G1HeapWastePercent=0
-verbose:gc
```
3. Adjust the Java version and flags to play around different GC scenarios.