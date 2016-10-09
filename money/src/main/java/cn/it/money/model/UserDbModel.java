package cn.it.money.model;

public class UserDbModel implements IUserModel{

	@Override
	public void save(String name, double money) {
		// 实现忽略
	}

	@Override
	public double take(String name) {
		return 0;
	}

}
