package socialite.Absyn; // Java Package generated by the BNF Converter.

public class Func extends Function {
  public final String uident_;

  public Func(String p1) { uident_ = p1; }

  public <R,A> R accept(socialite.Absyn.Function.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof socialite.Absyn.Func) {
      socialite.Absyn.Func x = (socialite.Absyn.Func)o;
      return this.uident_.equals(x.uident_);
    }
    return false;
  }

  public int hashCode() {
    return this.uident_.hashCode();
  }


}
