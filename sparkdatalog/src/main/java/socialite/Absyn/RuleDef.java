package socialite.Absyn; // Java Package generated by the BNF Converter.

public class RuleDef extends Rule {
  public final Head head_;
  public final RuleBody rulebody_;

  public RuleDef(Head p1, RuleBody p2) { head_ = p1; rulebody_ = p2; }

  public <R,A> R accept(socialite.Absyn.Rule.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof socialite.Absyn.RuleDef) {
      socialite.Absyn.RuleDef x = (socialite.Absyn.RuleDef)o;
      return this.head_.equals(x.head_) && this.rulebody_.equals(x.rulebody_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.head_.hashCode())+this.rulebody_.hashCode();
  }


}
