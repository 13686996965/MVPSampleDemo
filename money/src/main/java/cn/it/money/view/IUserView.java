package cn.it.money.view;

public interface IUserView {// 当数据模型改变之后，UI也有可能改变
	// 存
	void save(String name, double money);
	// 取
	double take(String name);
}
