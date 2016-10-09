package cn.it.loginmvpdemo.model;


import cn.it.loginmvpdemo.bean.UserBean;

public interface IUserModel {
	void setID(int id);

	void setFirstName(String firstName);

	void setLastName(String lastName);

	UserBean load(int id);
}
