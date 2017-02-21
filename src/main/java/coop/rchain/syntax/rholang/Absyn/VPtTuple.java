package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class VPtTuple extends ValPattern {
  public final ListPPattern listppattern_;
  public VPtTuple(ListPPattern p1) { listppattern_ = p1; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.ValPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.VPtTuple) {
      coop.rchain.syntax.rholang.Absyn.VPtTuple x = (coop.rchain.syntax.rholang.Absyn.VPtTuple)o;
      return this.listppattern_.equals(x.listppattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.listppattern_.hashCode();
  }


}
