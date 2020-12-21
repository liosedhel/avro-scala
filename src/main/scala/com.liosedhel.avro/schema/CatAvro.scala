package com.liosedhel.avro.schema

import com.sksamuel.avro4s.SchemaFor
import com.liosedhel.avro.model.Cat

object CatAvro {
  implicit val catSchema = SchemaFor.gen[Cat]
}
