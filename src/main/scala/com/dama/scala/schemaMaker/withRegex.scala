package com.dama.scala.schemaMaker
import runtime.ScalaRunTime.stringOf
import scala.io.Source
object withRegex extends App {
    var filePath = "H:\\Extras\\DaTA\\ipldata\\matches.csv"
    val rawData = Source.fromFile(filePath).getLines.toList
    val colNames = rawData(0).split(',').map(_.trim).toList
    var schema = SchemaConverter(rawData(1).split(',').toList,colNames)
    println(schema)

  def SchemaConverter(row_data: List[String],colNames:List[String]) = {
    var schema = new Array[StructField](colNames.size)
    for(i <- 0 until row_data.size) {
      if(row_data(i).matches("[-+]?\\d+(\\.\\d+)?")) {
        schema(i) = StructField(colNames(i),"LongType",false)
      } else if (row_data(i).matches("[+-]?([0-9]*[.])?[0-9]+")) {
        StructField(colNames(i),"FloatType",false)
      } else if (row_data(i).matches("\\d{4}-\\d{2}-\\d{2}")) {
        schema(i) = StructField(colNames(i),"DateType",false)
      } else if (row_data(i).matches("^\\d{4}[-]?\\d{1,2}[-]?\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}[.]?\\d{1,6}$")) {
        schema(i) = StructField(colNames(i),"TimestampType",false)
      } else if(row_data(i).equals("true") || row_data(i).equals("false")) {
        schema(i) = StructField(colNames(i),"BooleanType",false)
      } else {
        schema(i) = StructField(colNames(i),"StringType",false)
      }
    }
    //StructType(schema)
    StructType(stringOf(schema))      // used to show schema
  }

  case class StructField(colName: String, colType: String, flag: Boolean)
  //case class StructType(schema: Array[StructField])
  case class StructType(str: String)
}