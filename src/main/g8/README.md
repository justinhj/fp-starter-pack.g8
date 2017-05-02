# Scala Finch Boilerplate

A solid foundation to start a finch/fingle app using circe

## Installation

Make sure you have sbt installed, then its as simple as running

`sbt re-start`

You should be able to go to

`http://127.0.0.1:8080/hello`

which gives you a happy "Hello, World!"

## Libraries

typesafe-config : A really nice config handler

scalacheck: Property-based testing for Scala

shapeless-scalacheck: nice helpers for scalacheck

logback: everyones favorite logger

joda: everyones favorite datatime methods

finch-core: the main finch classes

finch-circe: the best json de/serializer (well argonaut and rapture-json are fairly good as well :)

scapegoat, scaliform, etc: clean code is good code
