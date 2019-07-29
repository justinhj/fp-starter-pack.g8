package $organization$

// Created by https://github.com/justinhj/fp-starter-pack.g8
// Simple ZIO App

import zio.App
import zio.console._

object $name;format="Camel"$ extends App {

  def run(args: List[String]) =
    myAppLogic.fold(_ => 1, _ => 0)

  val myAppLogic =
    for {
      _ <- putStrLn("Hello! What is your name?")
      n <- getStrLn
      _ <- putStrLn(s"Hello, \${n}, welcome to ZIO!")
    } yield ()
}
