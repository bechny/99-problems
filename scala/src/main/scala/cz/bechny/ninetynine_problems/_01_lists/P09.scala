package cz.bechny.ninetynine_problems._01_lists

object P09 {

  def pack[T](list: List[T]): List[List[T]] = {
    def packAccum(source: List[T], packed: List[List[T]]): List[List[T]] = {
      source match {
        case x :: xs if packed.lastOption.exists(_.contains(x)) =>
          packAccum(xs, packed.slice(0, packed.length - 1) :+ (x :: packed.last))
        case x :: xs => packAccum(xs, packed :+ List(x))
        case Nil => packed
      }
    }

    packAccum(list, List())
  }

  def packSpanBased[T](list: List[T]): List[List[T]] = {
    list match {
      case x :: xs =>
        val splitted = xs.span(_ == x)
        (x :: splitted._1) :: packSpanBased(splitted._2)
      case Nil => Nil
    }
  }

}
