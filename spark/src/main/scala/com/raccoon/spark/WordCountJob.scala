package com.raccoon.spark

import org.apache.spark.SparkContext

object WordCountJob {

  def main(args: Array[String]) {

    // Run the word count
    WordCount.execute(
      master = None,
      args = args.toList,
      jars = List(SparkContext.jarOfObject(this).get))

    // Exit with success
    System.exit(0)
  }
}