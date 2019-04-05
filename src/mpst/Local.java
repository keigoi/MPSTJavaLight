package mpst;

public class Local {
	public static interface Send<L> {}
	public static interface Recv<L> {}
	public static interface End {}
	
	public static interface Msg<T> {}
	public static interface Left<T> {}
	public static interface Right<T> {}
	public static interface LeftOrRight<TL, TR> extends Left<TL>, Right<TR> {}
	
	public static <TL,TR> Merge<LeftOrRight<TL,TR>, Left<TL>, Right<TR>> mergeLeftRight() {
		return null;
	}	
	public static interface Merge<T, T1, T2> {
		public T merge(T1 T1, T2 T2);
	}
	
	static <T> T sendMsg(Send<Msg<T>> ep) {
		return null;
	}
	
	static <T, LR extends Left<T>> T sendLeft(Send<LR> ep) {
		return null;
	}
	
	static <T, LR extends Right<T>> T sendRight(Send<LR> ep) {
		return null;
	}
	
	static void close(End ep) {
	}
	
	// receiveMsg, receiveLeftOrRight, ...
	

}
