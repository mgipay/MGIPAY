package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ACInterface {

	void getFee(HttpServletRequest request, HttpServletResponse response,
			int amt);
}
