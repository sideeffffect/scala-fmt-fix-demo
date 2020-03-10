package scalafmtfix

//import scala.{Array => Aray}
import scala.collection.immutable.List
import scala.{Array => Aray}

// case class WithoutFinal(x: Int)
final case class WithoutFinal(x: Int)

object Main {

  @SuppressWarnings(Array("scalafix:DisableSyntax.return"))
  def fun(x: Int, y: Int): Int = {
    return x + y
  }

//  def main(args: Aray[String]) {
  def main(args: Array[String]): Unit = {
    val y = List(
      1,
      2,
      3,
    )
//    y.head
    println("hello world!")
  }
}
