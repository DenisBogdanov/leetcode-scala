package leetcode.easy.array

/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
object ConcatenationOfArray {

  def getConcatenation(nums: Array[Int]): Array[Int] = {
    nums ++ nums
  }
}
