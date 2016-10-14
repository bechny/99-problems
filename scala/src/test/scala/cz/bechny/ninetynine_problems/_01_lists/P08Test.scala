package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P08Test extends FunSpec with Matchers {

  describe("Pattern matching version") {
    runTests(P08.compress)
  }

  describe("Fold version") {
    runTests(P08.compressFold)
  }

  def runTests(fnc: List[String] => List[String]) {
    it("should remove consecutive duplicates in a list") {
      val compressedList: List[String] = fnc(List("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e"))
      compressedList should have size 5
      compressedList should be(List("a", "b", "c", "d", "e"))
    }

    it("should not remove non consecutive duplicates in a list") {
      val compressedList: List[String] = fnc(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
      compressedList should have size 6
      compressedList should be(List("a", "b", "c", "a", "d", "e"))
    }
  }
}
