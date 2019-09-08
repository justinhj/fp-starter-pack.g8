# Summary 

Giter8 template to get up and running with Zio, Scalaz, Fs2, Monix and includes Li Haoyi's Ammonite REPL

```
g8 justinhj/fp-starter-pack.g8
```

or to use directly from sbt you can use:

`sbt new justinhj/fp-starter-pack.g8 --branch scalaz`

Reply to the questions to set each variable; the only one you have to change is the project name.

## Instructions

Install sbt

Create the project as above

You can start writing code in src/main/scala/YOU/YOURPROJECT/YourProject.scala

You can access an Ammonite REPL (Ammonite greatly improves the Scala REPL) by runnning the following at the sbt prompt: 

`test:run` 

## Main libraries included 

* Scalaz - Pure fp library
* ZIO - Typesafe composable async and concurrent programming  
* Fs2 - pure functional streams
* Monix - Reactive programming
* Shapeless - Generic programming

## Origin

This is a fork of bneil/finch-skeleton.g8 

I used that excellent example of a g8 template and modified for my own ends by updating Scala, SBT, adding and removing libaries and plugins



