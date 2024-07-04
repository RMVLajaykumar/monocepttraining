package com.monocept.behavioural.state.test;

import com.monocept.behavioural.state.model.TelevisionState;
import com.monocept.behavioural.state.model.Tvoff;

public class TVtest {

	public static void main(String[] args) {
		 TelevisionState tvstate= new  TelevisionState(new Tvoff());
		 tvstate.pressButton();
		 tvstate.pressButton();
		 

	}

}
