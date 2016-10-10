package cz.bechny.ninetynine_problems._01_lists

object P04 {

  def lengthLibBased[T](list: List[T]): Int = list.length

  def lengthRecursive[T](list: List[T]): Int = {
    def lengthAccumulator(list: List[T], length: Int): Int = list match {
      case Nil => length
      case _ :: xs => lengthAccumulator(xs, length + 1)
    }

    lengthAccumulator(list, 0)
  }

  def lengthFold[T](list: List[T]): Int = list.foldLeft(0) ((length, _) => length + 1)
}
