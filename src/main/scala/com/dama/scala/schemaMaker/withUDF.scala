package com.dama.scala.schemaMaker
import java.text.SimpleDateFormat

import scala.io.Source
import scala.runtime.ScalaRunTime.stringOf
object withUDF {

  case class StructField(colName: String, colType: String, flag: Boolean)
  //case class StructType(schema: Array[StructField])
  case class StructType(str: String)
  def main(args: Array[String]): Unit = {

    println("hello world")
    var filePath = "H:\\Extras\\DaTA\\ipldata\\matches.csv"
    val rawData = Source.fromFile(filePath).getLines.toList
    val colNames = rawData(0).split(',').map(_.trim).toList
    var schema = SchemaConverter(rawData(1).split(',').toList,colNames)
    println(schema)
  }
  def SchemaConverter(row_data: List[String], colNames: List[String]) = {
    var schema = new Array[StructField](colNames.size)
    for(i <- 0 until row_data.size) {
      if(isDate(row_data(i))) {
        schema(i) = StructField(colNames(i),"DateType",false)
      } else if(isLong(row_data(i))) {
        schema(i) = StructField(colNames(i),"LongType",false)
      } else if(isFloat(row_data(i))) {
        schema(i) = StructField(colNames(i),"FloatType",false)
      } else if(isBoolean(row_data(i))){
        schema(i) = StructField(colNames(i),"BooleanType",false)
      } else if(isString(row_data(i))){
        schema(i) = StructField(colNames(i),"StringType",false)
      } else {
        schema(i) = StructField(colNames(i),"StringType",false)
      }
    }
    //StructType(schema)
    StructType(stringOf(schema))      // used to show schema
  }
  def isDouble(s: String): Boolean = {
    var flag = false
    try {
      var v = s.trim()
      if (null != v && !v.isEmpty()) {
        v.toDouble.toString
      }
      v.toDouble
      flag = true
    } catch {
      case e: Throwable =>
        flag = false
    }
    flag
  }
  def isString(value: String): Boolean = {
    var flag = false
    try {
      if (null != value && !value.isEmpty()) {
        value.toString
        flag = true
      } else {
        " "
        flag = true
      }
    } catch {
      case e: Throwable =>
        flag = false
    }
    flag
  }
  def isFloat(value: String): Boolean = {
    var flag = false
    try {
      if (null != value && !value.isEmpty() && value.matches("[+-]?([0-9]*[.])?[0-9]+")) {
        value.toFloat
        flag = true
      }
    }
    catch {
      case e: Throwable =>
        flag = false
    }
    flag
  }
  def isDate(date: String): Boolean = {
    var flag = false
    try {
      var simpleDateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
      simpleDateFormat.setLenient(false)
      var dateValue = simpleDateFormat.parse(date)
      flag = true
    }
    catch {
      case e: Throwable =>
        flag = false
    }
    flag
  }
  def isLong(s: String): Boolean = {
    var flag = false
    try {
      var v = s.trim()
      if (null != v && !v.isEmpty()) {
        v.toLong
        flag = true
      }
      v.toLong
      flag = true
    } catch {
      case e: Throwable =>
        flag = false
    }
    flag
  }
  def isBoolean(s: String): Boolean = {
    var flag = false
    try {
      val v = s.trim()
      if (null != v && !v.isEmpty()) {
        v.toBoolean
        flag = true
      }
    }catch {
      case e: Throwable =>
        flag = false
    }
    flag
  }
}
