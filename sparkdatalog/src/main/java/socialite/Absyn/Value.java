package socialite.Absyn; // Java Package generated by the BNF Converter.

public abstract class Value implements java.io.Serializable {
  public abstract <R,A> R accept(Value.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(socialite.Absyn.ValueInt p, A arg);
    public R visit(socialite.Absyn.ValueVar p, A arg);
    public R visit(socialite.Absyn.ValueDouble p, A arg);
    public R visit(socialite.Absyn.ValueConst p, A arg);

  }

}
