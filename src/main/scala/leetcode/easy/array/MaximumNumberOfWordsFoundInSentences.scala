package leetcode.easy.array

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
object MaximumNumberOfWordsFoundInSentences {

  def mostWordsFound(sentences: Array[String]): Int = {
    sentences
      .map(_.split(" ").length)
      .max
  }
}
