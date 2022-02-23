package leetcode.easy.array

/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */
object FinalValueOfVariableAfterPerformingOperations {

  def finalValueAfterOperations(operations: Array[String]): Int = {
    operations.foldLeft(0) {
      case (value, operation) =>
        if (operation(1) == '+') value + 1 else value - 1
    }
  }
}
