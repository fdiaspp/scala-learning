# Basics


## Running a program part 2

Another way to compile is using the natural tools made available by the environment. I'm talking about `scalac` and `scala` ones. To compile the scala program, you must do the follow:

```sh
cd basics

scalac src/main/scala/Main.scala    # this compiles the program and generates the Main.class on your current path
scala Main [args]                   # this executes Main.class compiled file
```

I told that this is an alternative way, because it way more simple to go with SBT tool. To use SBT, do the follow:
```sh
cd basics
sbt
~run [args]
```

## Variables
As Scala docs says, there are only two types of variables

```scala
val variable_x = 'value here'   // it CANT be reassinged
var variable_y = 'value here'   // it CAN be reassigned
```

> The best practice is to use val whenever it's possible. Perhaps, force the use of it. This will help you through the process of getting used to functional programming.

The compiler is smart enough to infer the type of the variable, if the value is passed on the right side o equal sign. But, for readability, is possible to specify the type of it explicitly. The golden rule about it is "explicit is better than implicit". For cases when you are creating an object and assigning to an variable right away, annotating the type will turn the code more verbose. 

```scala
val variable_x: String = 'value here'   // it CANT be reassinged
var variable_y: String = 'value here'   // it CAN be reassigned
```

## String Interpolation

Interpolate a string is a very common stuff one can do while developing something. So, this is an important topic. In scala it's possible to use the plus operator.

```scala
val v1 = "Hello"
val v2 = "World"

print(v1 + ", " + v2)
```

or use this second, way better, sintax. One thing to note, It's possible to use with or without curly braces. This helps in cases where to perform an operation is needed, like accessing an array position or a calculation.

```scala
val v1 = "Hello"
val v2 = "World"

print(s"$v1, ${v2}")
```

Needless to say which I'll prefere. =D


## Key Takeaways   

1) It's important to know how to run a program without sbt, in case of a need
2) When defining a new variable, use `val` whenever is possible
3) Interpolate strings with `s"your $variable"` structure