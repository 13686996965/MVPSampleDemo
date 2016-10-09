package cn.it.money.model;


import android.content.Context;

import cn.it.money.utils.PreferenceUtils;

public class UserPreferenceModel implements IUserModel {
	private Context mContext;

	public UserPreferenceModel(Context context) {
		this.mContext = context;
	}

	@Override
	public void save(String name, double money) {
		PreferenceUtils.putString(mContext, name, String.valueOf(money));
	}

	@Override
	public double take(String name) {
		String money = PreferenceUtils.getString(mContext, name);
		return Double.parseDouble(money);
	}

}
