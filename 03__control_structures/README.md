# Control Structures


## New .g8 pattern used
This time I chose to start the sbt project with the `scala/scala-seed.g8` template.

### What is .g8
.g8 is the extension behind Giter8. It's a CLI to generate file trees from templates present on any git repository.
To create a new template yourself, take a look on [this page](https://www.foundweekends.org/giter8/template.html)

## IF
Every if block on scala returns something. If it doesnt, this block is intended to put a side-effect to the program. This is cool because there isn't a specific ternary if sintaxe on the language. 

The scala tends to make your programs to be more expression oriented, because of the strong appeal to functional programming. The [expression-oriented programming](https://en.wikipedia.org/wiki/Expression-oriented_programming_language) is a good practice though.

```scala
// this...
val result = if (a > b) a else b

// is the same as this
if (a > b)
    val result = a
else
    val result = b
```

and, about side effects mentioned earlier

```scala
// this performs a side effect
if (a > b) doSomething()

// since the main goal of this program is to run 
// the following line
println("Hello World")
```

## FOR
The basic structure is 

```scala
for (v <- values) println(v)
```

but it's possible to use more expression oriented pattern with .foreach methods, available on most collection classes.

```scala
values.foreach(println)
```

Important to note that is possible to iterate over maps too
```scala
val map_test = Map(
    "description of value 1" -> 1,
    "description of value 2" -> 2
)

for ((description, value) <- map_test) println(s"Description = $description and value = $value")
map_test.foreach()
```

The keyword __yield__ is present here and can turn for loops into for loops expressions. 
```scala
val numbers = Seq(1,2,3)
val doubles = for (number <- numbers) yield number * 2
```



