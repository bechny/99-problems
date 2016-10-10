package cz.bechny.ninetynine_problems._01_lists

object P01 {

  def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new IllegalArgumentException("Empty list")
  }

}
