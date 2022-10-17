package $organization$

import fs2._
import cats.implicits._
import cats.effect.{ExitCode, IO, IOApp}
import cats.effect.unsafe.implicits.global

/*
 * fs2 - https://fs2.io/
 * "Fs2 is a library for purely functional, effectful, and polymorphic stream processing
 * library in the Scala programming language. Its design goals are compositionality,
 * expressiveness, resource safety, and speed. The name is a modified acronym for
 * Functional Streams for Scala (FSS, or FS2)."
 *
 * In this example I generate two infinite streams of Option[String] that implement the
 * famous Fiz Buzz problem. The two streams are zipped together, and finally converted
 * to stream that emits values of type Unit and evaluates side effects (printing the
 * non-empty strings that make up the correct Fizz Buzz output.
 *
 * This example belies the true power of fs2 that can be used in many applications
 * that involve streaming or, less obviously, any application that can benefit from
 * declarative control flow. (cf: This talk by Fabio Labella https://youtu.be/81I_nzjUYy4)
*/

object Fs2FizzBuzz extends IOApp {

  val fizzBuzz =
    Stream.emits(List(None, None, "Fizz".some)).repeat.
      zip(
        Stream.emits(List(None, None, None, None, "Buzz".some)).repeat).
          map{
            case (a,b) =>
              a |+| b
          }

  def fizBuzzStream(n: Long) =
    fizzBuzz.
    zipWithIndex.
    evalMap[IO,Unit]{
      case (Some(a), i) => IO(println(s"\${i + 1}. \$a"))
      case (None, _) => IO.pure(())
        }.take(n)

  override def run(args: List[String]): IO[ExitCode] = fizBuzzStream(20).compile.drain.as(ExitCode.Success)
}
