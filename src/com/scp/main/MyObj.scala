package com.scp.main
import com.scp.io._
import com.scp.obj.ObjStore

/**
  * Created by Cloud on 16/02/2016.
  */
object MyObj extends App {
//  ObjStore.setupData()
  println(ObjStore.fcList.head)
  println(ObjStore.fcList(2))
}
