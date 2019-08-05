# Top 100 liked

##  Array 

- [x] 1 Two Sum
- [ ] 4 Median of Two Sorted Arrays
- [x] 11 Container With Most Water
- [x] 15 3Sum
- [x] 31 Next Permutation
- [ ] 33 Search in Rotated Sorted Array
- [x] 34 Find First and Last Position of Element in Sorted Array
- [x] 39 Combination Sum



## TODO
- [ ] 33 Search in Rotated Sorted Array



## 一些比较难的题的题解

- 31 Next Permutation

  [Single Pass Aproach](https://leetcode.com/problems/next-permutation/solution/)

    时间复杂度O(n)， 空间复杂度O(1)

- 33 Search in Rotated Sorted Array

  从左向右，如果左边的点比右边的点小，说明这两个点之间是有序的。如果左边的点比右边的点大，说明中间有个旋转点，所以一分为二后，肯定有一半是有序的。所以还可以用二分法。不过先要判断左边有序还是右边有序，如果左边有序，则直接将目标与左边的边界比较，就知道目标在不在左边，如果不在左边肯定在右边。


