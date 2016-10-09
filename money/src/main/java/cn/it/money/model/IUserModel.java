package cn.it.money.model;

public interface IUserModel {
	// 存
	void save(String name, double money);
	// 取
	double take(String name);
}
