package mpst;

import static mpst.Local.*;

import java.util.Random;

import static mpst.Global.*;

public class HelloWorld {
	public static void main(String[] args) {
		var g = a2b(msg(), finish());
		
		var ea = g.A;
		close(sendMsg(ea));
		
		var g1 = choiceAtA(mergeLeftRight(), a2b(left(), finish()), a2b(right(), finish()));
		
		var ea2 = g1.A;
		if (new Random().nextBoolean()) {
			close(sendLeft(ea2));
		} else {
			close(sendRight(ea2));
		}
	}
}
