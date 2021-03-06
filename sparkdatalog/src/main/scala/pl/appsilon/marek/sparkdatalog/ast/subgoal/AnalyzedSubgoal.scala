package pl.appsilon.marek.sparkdatalog.ast.subgoal

import org.apache.spark.rdd.RDD
import pl.appsilon.marek.sparkdatalog.eval.RelationInstance
import pl.appsilon.marek.sparkdatalog.{DatabaseRepr, Database, Valuation}

trait AnalyzedSubgoal {
  def getLocation: Option[Int]

  def solveOn(valuation: Valuation, relations: Map[String, RelationInstance]): Seq[Valuation]
  def solveOnSet(valuations: Seq[Valuation], relations: Map[String, RelationInstance]): Seq[Valuation]

  def solveRDD(valuations: RDD[Valuation], database: DatabaseRepr): Option[RDD[Valuation]]
  def selectRDD(database: DatabaseRepr): Option[RDD[Valuation]]

  def evaluateStatic(valuation: Valuation): Option[Valuation]
}
