package cn.it.mymoneydemo.precenter;

import cn.it.mymoneydemo.bean.UserBean;
import cn.it.mymoneydemo.model.IUserModel;
import cn.it.mymoneydemo.model.UserModel;
import cn.it.mymoneydemo.view.IUserView;

/**
 * Created by Sen on 2016/10/9.
 *
 * 在 view 层拿到数据
 * 向MOdel存/取数据
 */

public class UserPrecenter {

    private final IUserModel mUserModel;
    private final IUserView mUserView;

    public UserPrecenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    /**
     * 给Activity 保存数据
     * @param name
     * @param money
     */
    public void saveInfo(String name, int money) {
        mUserModel.setName(name);
        mUserModel.setMoney(money);
    }

    /**
     * 给 Activity 获取数据
     * @param name
     */
    public void loadInfo(String name) {
        UserBean user = mUserModel.load(name);
        mUserView.setName(user.getName());
        mUserView.setMoney(user.getMoney());
    }
}
