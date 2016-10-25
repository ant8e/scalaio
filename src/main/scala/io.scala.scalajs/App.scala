package io.scala.scalajs

import scala.scalajs.js.JSApp

import org.scalajs.dom
import dom.document

object DemoApp extends JSApp {
  def main(): Unit = {
    val hello= document.createTextNode("Hello Scala.io")
    val para = document.createElement("p")
    para.appendChild(hello)
    document.body.appendChild(para)
  }
}