package com.scp.io

import scala.io.StdIn
import scala.swing.FileChooser

/**
  * Created by Squall on 28/02/2016.
  */
object FCWriter {
  def saveGame(): Unit = {
    val chooser = new FileChooser
    println("Where would you like to Save this File?")
    val b = StdIn.readLine()
    val response = chooser.showSaveDialog(null)
    if (response == FileChooser.Result.Approve) { /*Write */ }
  }
}
