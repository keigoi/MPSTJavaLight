package mpst;

import static mpst.Local.*;

import java.util.Random;

import static mpst.Global.*;

public class HelloWorld {
	public static void main(String[] args) {
		// ThreeParty<Send<Msg<End>>, Recv<Msg<End>>, End>
		var g1 = a2b(msg(), finish());
		var ea = g1.A;
		// g1.validate(); // Scribble will check deadlock-freeness
		
		close(sendMsg(ea));
		
		// ThreeParty<Send<LeftOrRight<End, End>>, Recv<LeftOrRight<End, End>>, End>
		var g2 = choiceAtA(mergeLeftRight(), a2b(left(), finish()), a2b(right(), finish()));
		// g2.validate();
		
		var ea2 = g2.A;
		if (new Random().nextBoolean()) {
			close(sendLeft(ea2));
		} else {
			close(sendRight(ea2));
		}
	}
}
