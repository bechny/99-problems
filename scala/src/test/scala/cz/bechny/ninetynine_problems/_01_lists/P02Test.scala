package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P02Test extends FunSpec with Matchers{

  val numbers: List[Int] = List(1, 2, 11, 4, 5, 8, 10, 6)
  val secondLastNum = 10

  it("should give second last element when list has more than two elements") {
    P02.secondLast(numbers) should be(secondLastNum)
  }

  an [IllegalArgumentException] should be thrownBy P02.secondLast(List.empty)

  it("library version should give second last element when list has more than two elements") {
    P02.secondLastLibBased(numbers) should be(secondLastNum)
  }

  an [IllegalArgumentException] should be thrownBy P02.secondLastLibBased(List.empty)

}
