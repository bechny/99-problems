package cz.bechny.ninetynine_problems._01_lists

object P02 {

  def secondLast[T](list: List[T]): T = list match {
    case x :: _ :: Nil => x
    case _ :: xs => secondLast(xs)
    case _ => throw new IllegalArgumentException("Empty list")
  }

  def secondLastLibBased[T](list: List[T]): T =
    if (list.isEmpty)
      throw new IllegalArgumentException("Empty list")
    else
      list.init.last
}
