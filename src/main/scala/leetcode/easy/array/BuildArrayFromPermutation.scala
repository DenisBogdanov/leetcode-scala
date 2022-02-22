package leetcode.easy.array

/**
 * https://leetcode.com/problems/build-array-from-permutation/
 */
object BuildArrayFromPermutation {
  def buildArray(nums: Array[Int]): Array[Int] = {
    nums.map(i => nums(i))
  }
}
