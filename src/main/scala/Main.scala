package com.liosedhel.avro

import com.sksamuel.avro4s.AvroSchema
import com.liosedhel.avro.model.Cat

object Main extends App {
  println(AvroSchema[Cat].toString(true))
}
