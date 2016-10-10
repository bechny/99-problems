package cz.bechny.ninetynine_problems._01_lists

object P06 {

  def isPalindrome[T](list: List[T]): Boolean = list == P05.reverse(list)

}
