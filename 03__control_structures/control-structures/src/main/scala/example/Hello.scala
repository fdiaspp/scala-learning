package example

object Hello extends Greeting with App {
  println(greeting);

  /* FOR */
  for (c <- greeting) println(c); //first way  
  greeting.foreach(println);      //second way (expression oriented)

  if (greeting(0) == 'h') println("First letter is H")
}

trait Greeting {
  lazy val greeting: String = "hello"
}
