package mpst;

import static mpst.Local.*;

public class Global {
	public static class ThreeParty<T1, T2, T3> {
		public T1 A;
		public T2 B;
		public T3 C;
	}
	
	// Global labels
	
	public static interface GlobalLabel<T1, T2, T11, T22> {
	}
	
	public static <T1, T2> GlobalLabel<Msg<T1>, Msg<T2>, T1, T2> msg() {
		return null;
	}
	public static <T1, T2, TX> GlobalLabel<Left<T1>, LeftOrRight<T2, TX>, T1, T2> left() {
		return null;
	}
	public static <T1, T2, TX> GlobalLabel<Right<T1>, LeftOrRight<TX, T2>, T1, T2> right() {
		return null;
	}
	
	// Global combinators
	
	public static ThreeParty<End, End, End> finish() {
		return null;
	}
	
	public static <L1, L2, T1, T2, T3> ThreeParty<Send<L1>, Recv<L2>, T3> a2b(GlobalLabel<L1, L2, T1, T2> l, ThreeParty<T1, T2, T3> gp) {
		return null;
	}

	public static <L1, L2, T1, T2, T3> ThreeParty<Recv<L1>, Send<L2>, T3> b2a(GlobalLabel<L2, L1, T2, T1> l, ThreeParty<T1, T2, T3> gp) {
		return null;
	}
	
	public static <L1, L3, T1, T2, T3> ThreeParty<Send<L1>, T2, Recv<L3>> a2c(GlobalLabel<L1, L3, T1, T3> l, ThreeParty<T1, T2, T3> gp) {
		return null;
	}
	
	public static <L1, L3, T1, T2, T3> ThreeParty<Recv<L1>, T2, Send<L3>> c2a(GlobalLabel<L3, L1, T3, T1> l, ThreeParty<T1, T2, T3> gp) {
		return null;
	}
	
	public static <L2, L3, T1, T2, T3> ThreeParty<T1, Send<L2>, Recv<L3>> b2c(GlobalLabel<L2, L3, T2, T3> l, ThreeParty<T1, T2, T3> gp) {
		return null;
	}
	
	public static <L2, L3, T1, T2, T3> ThreeParty<T1, Recv<L2>, Send<L3>> c2b(GlobalLabel<L3, L2, T3, T2> l, ThreeParty<T1, T2, T3> gp) {
		return null;
	}

	
	public static <L, LL, LR, T2, T3> ThreeParty<Send<L>, T2, T3> choiceAtA(Merge<L, LL, LR> m, ThreeParty<Send<LL>, T2, T3> lhs, ThreeParty<Send<LR>, T2, T3> rhs) {
		return null;
	}
	
	public static <L, LL, LR, T1, T3> ThreeParty<T1, Send<L>, T3> choiceAtB(Merge<L, LL, LR> m, ThreeParty<T1, Send<LL>, T3> lhs, ThreeParty<T1, Send<LR>, T3> rhs) {
		return null;
	}
	
	public static <L, LL, LR, T1, T2> ThreeParty<T1, T2, Send<L>> choiceAtC(Merge<L, LL, LR> m, ThreeParty<T1, T2, Send<LL>> lhs, ThreeParty<T1, T2, Send<LR>> rhs) {
		return null;
	}
}
