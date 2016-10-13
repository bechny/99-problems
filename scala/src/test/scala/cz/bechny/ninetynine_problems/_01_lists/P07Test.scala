package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P07Test extends FunSpec with Matchers {

  describe("Pattern matching version") {
    runTestsForFunction(P07.flatten)
  }

  describe("FlatMap version") {
    runTestsForFunction(P07.flattenFlatMap)
  }

  def runTestsForFunction(fnc: List[_] => List[_]) {

    it("should return empty list when flatten an empty list") {
      val flatten: List[Any] = fnc(List())
      flatten shouldBe List()
    }

    it("should flatten nested lists") {
      val flatten: List[Any] = fnc(List("a", List("b", List("c", "d")), "e"))
      flatten should have size 5
      flatten should be(List("a", "b", "c", "d", "e"))
    }

    it("should flatten deep nested lists") {
      val flatten: List[Any] = fnc(List("a", List("b", List("c", List("d", List("e", List("f", "g"))))), "h"))
      flatten should have size 8
      flatten should be(List("a", "b", "c", "d", "e", "f", "g", "h"))
    }
  }

}
