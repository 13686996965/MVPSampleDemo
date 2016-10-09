package cn.it.money.bean;

public class UserBean {
	public String name;
	public double money;

	public UserBean(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", money=" + money + "]";
	}

}
