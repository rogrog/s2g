package socialite.Absyn; // Java Package generated by the BNF Converter.

public class CompOpEq extends CompOp {

  public CompOpEq() { }

  public <R,A> R accept(socialite.Absyn.CompOp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof socialite.Absyn.CompOpEq) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
