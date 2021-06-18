/*
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package ${package}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}


object MySparkApp extends App {
  override def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("${artifactId} Spark Job").getOrCreate()
    val rows = (1 to 100).map(Row(_, "hello world"))
    val schema = StructType(List(
      StructField("number", IntegerType, nullable = true),
      StructField("word", StringType, nullable = true)
    ))

    val df = spark.createDataFrame(
      spark.sparkContext.parallelize(rows),
      schema
    )

    val columnSum = df.select(sum(col("number")))
    import spark.implicits._
    val result = columnSum.map(_ (0).asInstanceOf[Long]).collect().head
    println("Column Sum:")
    println(result)
    spark.stop()
  }
}
