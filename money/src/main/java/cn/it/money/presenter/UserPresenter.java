package cn.it.money.presenter;


import android.content.Context;

import cn.it.money.model.IUserModel;
import cn.it.money.model.UserDbModel;
import cn.it.money.view.IUserView;

public class UserPresenter {
	private IUserModel userModel;
	private IUserView userView;
	private Context mContext;

	public UserPresenter(Context context, IUserView userView) {
		this.mContext = context;
//		userModel = new UserPreferenceModel(context);
		userModel=new UserDbModel();
		this.userView = userView;
	}

	// 存
	public void save(String name, double money) {
		if(userView==null){
			throw new IllegalArgumentException("userView can not be null");
		}
		userModel.save(name, money);
		userView.save(name, money);
	}

	// 取
	public double take(String name) {
		userView.take(name);
		return userModel.take(name);
	}

}
