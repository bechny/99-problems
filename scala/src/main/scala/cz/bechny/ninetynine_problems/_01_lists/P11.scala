package cz.bechny.ninetynine_problems._01_lists

object P11 {

  def encode_modified[T](list: List[T]): List[Any] = {
    P09.pack(list).map(sublist => if (sublist.length == 1) sublist.head else (sublist.length, sublist.head))
  }

}
