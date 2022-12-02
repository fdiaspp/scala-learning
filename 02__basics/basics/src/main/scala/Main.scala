

object Main extends App {
  val hello: String = "Hello"

  if (args.size == 0)
    println(s"$hello, you")
  else {
    println(s"$hello, ${args(0)}")
  }
}