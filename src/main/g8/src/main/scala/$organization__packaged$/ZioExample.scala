package org.example

// Starter ZIO App

import zio.{App, ExitCode, ZIO}
import zio.console._

object ZioExample extends App {

  def nameEmpty(n: String): Boolean = n.size == 0

  def run(args: List[String]) =
    helloApp.fold(
      { _ =>
        ExitCode(1)
      },
      { _ =>
        ExitCode(0)
      }
    )

  val helloApp: ZIO[Console, Exception, Unit] =
    for {
      _ <- putStrLn("Hello! What is your name?")
      input <- getStrLn
      _ <-
        if (! nameEmpty(input))
          putStrLn(s"Hello, $input!")
        else {
          putStrLn(s"Name was empty!") *>
          ZIO.fail(new IllegalArgumentException("Name cannot be empty"))
        }
    } yield ()
}