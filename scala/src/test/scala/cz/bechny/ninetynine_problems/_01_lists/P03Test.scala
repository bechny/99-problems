package cz.bechny.ninetynine_problems._01_lists

import org.scalatest.{FunSpec, Matchers}

class P03Test extends FunSpec with Matchers{

  val numbers: List[Int] = List(1, 2, 3, 4, 5)

  describe("library based implementation") {

    it("should be first element when k is 0") {
      P03.kthLibBased(numbers, 0) should be(1)
    }

    it("should be last element when k is equal to size of list minus one") {
      P03.kthLibBased(numbers, 4) should be(5)
    }

    it("should be (k+1)th element") {
      P03.kthLibBased(numbers, 2) should be(3)
    }

  }

  describe("recursive implementation") {

    it("should be (k+1)th element") {
      P03.kthRecursive(numbers, 2) should be(3)
    }

  }

}
