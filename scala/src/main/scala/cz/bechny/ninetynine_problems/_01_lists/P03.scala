package cz.bechny.ninetynine_problems._01_lists

object P03 {

  def kthLibBased[T](list: List[T], k: Int): T = list(k)

  def kthRecursive[T](list: List[T], k: Int): T = (list, k) match {
    case (x :: _, 0) => x
    case (x :: xs, _) => kthRecursive(xs, k - 1)
    case (_ , _) => throw new IllegalArgumentException("Empty list")
  }

}
