package s2g.ast.subgoal

import s2g.eval.{TableStates, Context, EvaluationState, PartialSolution}
import s2g.ast.exp.Exp
import s2g.ast.comparisonoperator.ComparisonOperator

case class GoalComparison(left: Exp, right: Exp, operator: ComparisonOperator) extends Subgoal {
  override def solveOn(context: Context, tableStates: TableStates): Set[PartialSolution] = {
    val leftValue = left.evaluate(context)
    val rightValue = right.evaluate(context)
    val comparison = leftValue.typ.compare(leftValue, rightValue)
    if (operator.decide(comparison)) {
      Set(context.partialSolution)
    } else {
      Set()
    }
  }

  override def getInputs(context: Context): Set[String] =
    left.tryToEvaluate(context).getFreeVariables ++ right.tryToEvaluate(context).getFreeVariables

  override def getOutputs(context: Context): Set[String] = Set()
}