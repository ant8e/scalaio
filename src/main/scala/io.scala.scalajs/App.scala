package io.scala.scalajs

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react._

import scala.scalajs.js.JSApp
import org.scalajs.dom


object DemoApp extends JSApp {
  def main(): Unit = {


    val Counter = ReactComponentB[String]("Counter")
      .initialState(0)
      .render(scope => <.div(
        <.div(s"${scope.props} : ${scope.state}"),
        <.button("Inc"))
      )
      .build

    ReactDOM.render(Counter("scala.io"), dom.document.getElementById("app"))
  }
}