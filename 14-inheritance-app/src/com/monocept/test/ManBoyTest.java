package com.monocept.test;

import com.monocept.model.Boy;
import com.monocept.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		Man man=new Man();
		man.eat();
		man.play();
		man.work();
		
		Boy boy = new Boy();
		boy.eat();
		boy.play();
		boy.work();
		boy.sleep();
		
		
		Man bigman=new Boy();
		bigman.eat();
		bigman.work();
		bigman.play();

	}

}
