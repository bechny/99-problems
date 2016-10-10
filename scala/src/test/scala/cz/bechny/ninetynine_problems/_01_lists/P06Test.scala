package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P06Test extends FunSpec with Matchers {

  it("should return true when list is palindrome") {
    P06.isPalindrome(List("x", "a", "m", "a", "x")) should be(true)
  }

  it("should return false when list is not palindrome") {
    P06.isPalindrome(List(1, 2, 3, 4, 5)) should be(false)
  }

}
