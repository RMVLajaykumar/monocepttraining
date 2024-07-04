package com.monocept.commandpattern.test;

import com.monocept.commandpattern.model.ICommand;
import com.monocept.commandpattern.model.OnCommand;
import com.monocept.commandpattern.model.RemoteControl;
import com.monocept.commandpattern.model.Telvision;

public class TvTest {

	public static void main(String[] args) {
	  Telvision tv=new Telvision();
	  ICommand oncommand=new OnCommand(tv);
	  RemoteControl remote= new RemoteControl(oncommand);
	  remote.pressButton();

	}

}
