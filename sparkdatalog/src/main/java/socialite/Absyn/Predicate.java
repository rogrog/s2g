package socialite.Absyn; // Java Package generated by the BNF Converter.

public abstract class Predicate implements java.io.Serializable {
  public abstract <R,A> R accept(Predicate.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(socialite.Absyn.PredicateSingle p, A arg);

  }

}
