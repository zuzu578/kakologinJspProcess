package com.mycompnay.myapp.dao;

import com.mycompany.myapp.dto.PUDING_USER_DATA;

public interface PUDING_USER_DATADao {

	public void insertUserData(String userNickName, String userProfile_image, String userEmail, String user_birthday,
			String user_gender);

	public int userDataCount(String userEmail);

	public PUDING_USER_DATA getUserData(String userEmail);

}
