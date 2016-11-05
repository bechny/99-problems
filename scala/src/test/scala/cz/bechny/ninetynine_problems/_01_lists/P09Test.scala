package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P09Test extends FunSpec with Matchers {

  describe("Naive pattern matching version") {
    runTests(P09.pack)
  }

  describe("Span-based version") {
    runTests(P09.packSpanBased)
  }

  def runTests(fnc: List[String] => List[List[String]]) = {
    it("should pack unique elements in their own list") {
      val list = List("a", "b", "c")
      val packedList: List[List[String]] = fnc(list)
      packedList should have size 3
      packedList(0) should equal(List("a"))
      packedList(1) should equal(List("b"))
      packedList(2) should equal(List("c"))
    }

    it("should pack only consecutive duplicates in their own list") {
      val list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
      val packedList: List[List[String]] = fnc(list)
      packedList should have size 6
      packedList(0) should equal(List("a", "a", "a", "a"))
      packedList(1) should equal(List("b"))
      packedList(2) should equal(List("c", "c"))
      packedList(3) should equal(List("a", "a"))
      packedList(4) should equal(List("d"))
      packedList(5) should equal(List("e", "e", "e", "e"))
    }
  }



}
