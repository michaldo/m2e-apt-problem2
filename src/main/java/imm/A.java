package imm;

import org.immutables.value.Value;

@Value.Immutable
public abstract class A {
	
	public abstract String getInternalId();
	
	public static A create(){
		Class c = ImmutableA.class;
		return null;
	}


}
