package com.example.basicfunctions

import java.lang.String.valueOf
import java.math.RoundingMode.valueOf
import java.util.*



val start = Date.valueOf("2020-01-01")
val end = Date.valueOf("2025-12-31")
print(Date.valueOf("2022-05-11") in start..end})
//Output: true

for (i in 8 downTo 1) print(i)
//Output: 87654321

for (i in 8 downTo 1 step 2) print(i)
//Output: 8642
