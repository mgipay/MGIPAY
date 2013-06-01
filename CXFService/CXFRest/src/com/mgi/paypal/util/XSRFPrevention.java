package com.mgi.paypal.util;

/*
 * Created on Feb 6, 2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author d000223
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class XSRFPrevention {

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XSRFPrevention.class);

	// Field Name is given as rnakey, so that hackers will not be able to guess
	// easily this is random key
	public final static String RANDOM_NUMBER_AUTH_KEY = "rnakey";
	public final static String RANDOM_NUMBER_STACK = "rnastack";

	/**
	 * This method initializes the stack
	 */
	public void initializeStack(
			HttpSession session) {

		Stack<String> randomNumbersStack = new Stack<String>();
		randomNumbersStack = this.generateNextRandomNumber(randomNumbersStack);

		session.setAttribute(RANDOM_NUMBER_STACK, randomNumbersStack);
	}

	/**
	 * 
	 * @param session
	 */
	@SuppressWarnings("unchecked")
	public void updateStack(
			HttpServletRequest request) {

		Stack<String> randomNumbersStack = (Stack<String>) request.getSession()
				.getAttribute(RANDOM_NUMBER_STACK);
		randomNumbersStack = this.generateNextRandomNumber(randomNumbersStack);

		request.getSession().setAttribute(RANDOM_NUMBER_STACK,
				randomNumbersStack);
	}

	/**
	 * This method stores random numbers in a stack, this will be used while
	 * validating requests from user.
	 */
	public Stack<String> generateNextRandomNumber(
			Stack<String> randomNumbersStack) {

		if (randomNumbersStack != null) {
			randomNumbersStack = new Stack<String>();
		} else {
			int maxSize = 3;
			if (randomNumbersStack.size() == maxSize) {
				// removing element at index 0 removes the object at the bottom
				// of the stack
				// research the use of removeElement(Stack.lastElement()) as an
				// alternative
				randomNumbersStack.removeElementAt(0);
			}
		}

		// Generate Random Number
		Random randomObj = new Random();
		String randomString = randomObj.nextInt() + "";

		randomNumbersStack.push(randomString);

		if (logger.isDebugEnabled()) {
			logger.debug("Next Random Number expected from JSP - "
					+ randomString);
			logger.debug("Random Numbers present in the stack - "
					+ Arrays.toString(randomNumbersStack.toArray()));
		}

		return randomNumbersStack;
	}

	/**
	 * This method verify whether user request has randomNumberKey and it is one
	 * among the stack?
	 */
	@SuppressWarnings("unchecked")
	public boolean validateRequest(
			HttpServletRequest request) {

		// First get the random Numbers stack from the session
		Stack<String> randomNumbersStack = (Stack<String>) request.getSession()
				.getAttribute(RANDOM_NUMBER_STACK);

		String fromJSP = request.getParameter(RANDOM_NUMBER_AUTH_KEY);
		if (logger.isDebugEnabled()) {
			logger.debug("Random Number received from JSP - " + fromJSP);
			logger.debug("Random Numbers present in the stack - "
					+ Arrays.toString(randomNumbersStack.toArray()));
		}

		for (int i = 0; i < randomNumbersStack.size(); i++) {
			if (fromJSP != null
					&& fromJSP.equals(randomNumbersStack.elementAt(i))) {
				return true;
			}
		}

		return false;
	}
}
