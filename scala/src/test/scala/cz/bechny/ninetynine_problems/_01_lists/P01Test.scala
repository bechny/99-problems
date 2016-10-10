package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P01Test extends FunSpec with Matchers {

  it("should find last element") {
    val last = P01.last(List("a", "b", "c", "d"))
    last  should be("d")
  }

}
