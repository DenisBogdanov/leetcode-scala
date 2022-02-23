package leetcode.easy.array

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
object RichestCustomerWealth {

  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts
      .map(_.sum)
      .max
  }
}
