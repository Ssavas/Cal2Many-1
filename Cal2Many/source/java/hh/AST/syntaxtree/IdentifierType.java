package hh.AST.syntaxtree;
import hh.common.translator.VisitorType;



public class IdentifierType extends Type {
  public String s;

  public IdentifierType(String as) {
    s=as;
  }


    public <T,E>T accept(VisitorType<T,E> v, E env) {
	return v.visit(this,env);
  }
}
