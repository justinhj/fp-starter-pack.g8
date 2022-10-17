package $organization$

// Starter ZIO App

import zio.{ZIOAppDefault, ZIO}
import zio.Console._

object ZioExample extends ZIOAppDefault {

  def nameEmpty(n: String): Boolean = n.size == 0

  def run =
    helloApp

  val helloApp = 
    for {
      _ <- printLine("Hello! What is your name?")
      input <- readLine
      _ <-
        if (! nameEmpty(input))
          printLine(s"Hello, $input!")
        else {
          printLine(s"Name was empty!") *>
          ZIO.fail(new IllegalArgumentException("Name cannot be empty"))
        }
    } yield ()
}
