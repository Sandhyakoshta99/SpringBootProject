package com.railway.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppResponse {

	public AppResponse(String message2, boolean b) {
		// TODO Auto-generated constructor stub
	}
	private String message;
	boolean status;

}
