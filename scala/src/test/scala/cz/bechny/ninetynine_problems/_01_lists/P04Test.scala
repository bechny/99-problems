package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P04Test extends FunSpec with Matchers {

  val numbers: List[Int] = List(1, 2, 3, 4, 5)

  describe("library based implementation") {

    it("should be zero when list is empty") {
      P04.lengthLibBased(List.empty) should be(0)
    }

    it("should be 5 when list has five elements") {
      P04.lengthLibBased(numbers) should be(5)
    }

  }

  describe("recursive implementation") {

    it("should be zero when list is empty") {
      P04.lengthRecursive(List.empty) should be(0)
    }

    it("should be 5 when list has five elements") {
      P04.lengthRecursive(numbers) should be(5)
    }

  }

}
