package leetcode.easy.array

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
object RunningSumOfArray {

  def runningSum(nums: Array[Int]): Array[Int] = {
    nums
      .scan(0)((a, b) => a + b)
      .tail
  }
}
