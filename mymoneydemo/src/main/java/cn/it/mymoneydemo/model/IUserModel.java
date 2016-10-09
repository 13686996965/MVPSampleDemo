package cn.it.mymoneydemo.model;

import cn.it.mymoneydemo.bean.UserBean;

/**
 * Created by Sen on 2016/10/9.
 */

public interface IUserModel {

    // 存储数据
    void setName(String name);
    void setMoney(int money);

    // 获取数据
    UserBean load(String name);

}
