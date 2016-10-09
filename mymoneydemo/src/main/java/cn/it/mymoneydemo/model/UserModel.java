package cn.it.mymoneydemo.model;

import java.util.HashMap;
import java.util.Map;

import cn.it.mymoneydemo.bean.UserBean;

/**
 * Created by Sen on 2016/10/9.
 */

public class UserModel implements IUserModel {


    private String mName;
    private int mMoney;
    private Map<String, UserBean> mUsers = new HashMap<>();

    @Override
    public void setName(String name) {
        mName = name;
    }

    /**
     * 保存数据  数据由 Precenter 设置过来
     * @param money
     */
    @Override
    public void setMoney(int money) {
        mMoney = money;
        UserBean userBean = new UserBean(mName, mMoney);
        mUsers.put(mName, userBean);
    }

    /**
     * 给 Precenter 提供数据
     * @param name
     * @return 根据名字 返回 bean
     */
    @Override
    public UserBean load(String name) {
        return mUsers.get(name);
    }
}
