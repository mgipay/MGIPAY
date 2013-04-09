package com.ac;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FeeLinkValueInputBean {

	public FeeLinkValueInputBean() {

	}

	private boolean fundsIn;

	public boolean isFundsIn() {
		return fundsIn;
	}

	public void setFundsIn(boolean fundsIn) {
		this.fundsIn = fundsIn;
	}

}
