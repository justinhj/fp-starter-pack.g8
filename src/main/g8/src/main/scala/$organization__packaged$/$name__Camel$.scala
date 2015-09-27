package $organization$

import io.finch.route._
import com.twitter.finagle.Httpx

object $name;format="Camel"$ extends App {
  val api: Router[String] = get("hello") { "Hello, World!" }

  Httpx.serve(":8080", api.toService)
}
