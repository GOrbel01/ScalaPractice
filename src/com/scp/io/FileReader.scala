package com.scp.io

import com.scp.obj.FuturamaCharacter

import scala.collection.mutable.ListBuffer
import scala.io.Source
import java.io.File
/**
  * Created by Squall on 28/02/2016.
  */
object FileReader {
  def initializeCharacters: List[FuturamaCharacter] = {
    val file = Source.fromFile("src/com/scp/res/Characters.txt")
    var chars: ListBuffer[FuturamaCharacter] = ListBuffer[FuturamaCharacter]()
    for (line <- file.getLines()) {
        val str = line.split(",")
        val fc: FuturamaCharacter = FuturamaCharacter(str(0), str(1).toInt, str(2).toInt, str(3).toInt)
        println(fc)
        chars += fc
    }
    println(chars.length)
    chars.toList
  }
}
