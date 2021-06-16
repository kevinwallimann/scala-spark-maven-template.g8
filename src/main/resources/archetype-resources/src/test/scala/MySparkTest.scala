package ${package}

import org.apache.spark.sql.functions._
import org.scalatest.flatspec.AnyFlatSpec
import za.co.absa.commons.spark.SparkTestBase

class MySparkTest extends AnyFlatSpec with SparkTestBase {
  behavior of "Spark"

  it should "calculate the sum of all numbers between 1 and 100" in {
    import spark.implicits._
    val df = spark.sparkContext.parallelize(1 to 100).toDF()
    val columnSum = df.select(sum(col("value")))
    val result = columnSum.map(_ (0).asInstanceOf[Long]).collect().head
    assert(result === 5050)
  }
}