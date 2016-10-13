package cz.bechny.ninetynine_problems._01_lists

object P07 {

  def flatten(list: List[_]): List[_] = list match {
    case Nil => Nil
    case (x: List[_]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x :: flatten(xs)
  }

  def flattenFlatMap(list: List[_]): List[_] = list.flatMap( x => x match {
    case x1: List[_] => flattenFlatMap(x1)
    case _ => List(x)
  })

}
