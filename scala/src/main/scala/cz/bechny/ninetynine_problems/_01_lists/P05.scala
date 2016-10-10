package cz.bechny.ninetynine_problems._01_lists

object P05 {

  def reverse[T](list: List[T]): List[T] = {
    def reverseAccum(originalList: List[T], reversedList: List[T]) : List[T] = originalList match {
      case Nil => reversedList
      case x :: xs => reverseAccum(xs, x :: reversedList)
    }

    reverseAccum(list, List())
  }

}
