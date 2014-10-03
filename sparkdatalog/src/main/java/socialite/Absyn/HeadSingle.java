package socialite.Absyn; // Java Package generated by the BNF Converter.

public class HeadSingle extends Head {
  public final String uident_;
  public final ListVariable listvariable_;

  public HeadSingle(String p1, ListVariable p2) { uident_ = p1; listvariable_ = p2; }

  public <R,A> R accept(socialite.Absyn.Head.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof socialite.Absyn.HeadSingle) {
      socialite.Absyn.HeadSingle x = (socialite.Absyn.HeadSingle)o;
      return this.uident_.equals(x.uident_) && this.listvariable_.equals(x.listvariable_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.uident_.hashCode())+this.listvariable_.hashCode();
  }


}
