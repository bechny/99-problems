package cz.bechny.ninetynine_problems._01_lists

object P08 {

  def compress[T](list: List[T]): scala.List[T] = {
    def compressAccum(source: List[T], compressed: List[T]): List[T] = source match {
      case x :: xs if compressed.lastOption.contains(x) => compressAccum(xs, compressed)
      case x :: xs => compressAccum(xs, compressed :+ x)
      case Nil => compressed
    }

    compressAccum(list, List())
  }

  def compressFold[T](list: List[T]): scala.List[T] = {
    list.foldLeft(List[T]()) ((l, el) => if (l.lastOption.contains(el)) l else l :+ el)
  }
}
