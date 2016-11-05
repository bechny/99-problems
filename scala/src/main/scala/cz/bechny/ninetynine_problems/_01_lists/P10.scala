package cz.bechny.ninetynine_problems._01_lists

object P10 {

  def encode[T](list: List[T]): List[(Int, T)] = {
    P09.pack(list).map(sublist => (sublist.length, sublist.head))
  }
}
