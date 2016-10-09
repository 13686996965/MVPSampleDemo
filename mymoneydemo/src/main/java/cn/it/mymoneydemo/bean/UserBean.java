package cn.it.mymoneydemo.bean;

/**
 * Created by Sen on 2016/10/9.
 */

public class UserBean {
    private String name;
    private int money;

    public UserBean(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
