# Kotlin NullPointerException in Collection Processing

This repository demonstrates a common Kotlin bug related to null values in collections and shows how to mitigate it. The original code (`bug.kt`) processes a list of integers, doubling each element and filtering for even numbers.  However, it's prone to `NullPointerExceptions` if the input list unexpectedly contains null values.

The solution (`bugSolution.kt`) addresses the problem by adding null safety checks before performing operations on each element.