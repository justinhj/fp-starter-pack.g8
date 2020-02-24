# fp starter pack 

[![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)

[Giter8](http://www.foundweekends.org/giter8/) template to get up and running with Cats, Zio, Monix, Fs2

As a bonus includes Li Haoyi's Ammonite REPL embedded into the test module so you can use `test:run` to play with FP on the command line 

```
g8 justinhj/fp-starter-pack.g8
```

or to use directly from sbt you can use:

`sbt new justinhj/fp-starter-pack.g8`

Reply to the questions to set each variable; the only one you have to change is the project name.

## Instructions

Install sbt

Create the project as above

You can start writing code in src/main/scala/YOU/YOURPROJECT/YourProject.scala

You can access an Ammonite REPL (Ammonite greatly improves the Scala REPL) by runnning the following at the sbt prompt: 

`test:run` 

## Main libraries included 

* Cats - Lighweight modular fp library (type classes and data types)
* ZIO - Typesafe composable async and concurrent programming  
* Fs2 - pure functional streams
* Monix - Reactive programming
* Shapeless - Generic programming

## What about Scalaz

Use the Scalaz branch to replace Cats with Scalaz

`sbt new justinhj/fp-starter-pack.g8 --branch scalaz`

## Origin

This is a fork of bneil/finch-skeleton.g8 

I used that excellent example of a g8 template and modified for my own ends by updating Scala, SBT, adding and removing libaries and plugins
