package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P05Test extends FunSpec with Matchers {

  it("should reverse a list") {
    P05.reverse(List(1, 2, 3, 4, 5)) should equal(List(5, 4, 3, 2, 1))
  }

}
