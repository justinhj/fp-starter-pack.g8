package org.example

import zio.test._
import ZioExample._
import zio.test.environment.TestConsole
import zio.test.Assertion.{equalTo, hasMessage, fails}

object ZioExampleSpec extends DefaultRunnableSpec {

  def spec =
    suite("ZioExampleSpec")(
      testM("helloApp correctly displays output") {
        for {
          _ <- TestConsole.feedLines("Mr Test")
          _ <- helloApp
          output <- TestConsole.output
        } yield assert(output(1))(equalTo("Hello, Mr Test!\n"))
      },
      testM("helloApp rejects empty name") {
        assertM(
          (for {
            _ <- TestConsole.feedLines("")
            _ <- helloApp
          } yield ()).run
        )(
          fails((hasMessage(equalTo("Name cannot be empty"))))
        )
      }
    )
}
