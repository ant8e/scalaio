package io.scala.scalajs

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react._

import scala.scalajs.js.JSApp
import org.scalajs.dom


object DemoApp extends JSApp {
  def main(): Unit = {
   
  val Hello = ReactComponentB[String]("Hello")
                .render_P(name => <.div("Hello  ", name))
                .build

    ReactDOM.render(Hello("scala.io"), dom.document.getElementById("app"))
    }
}