package cn.it.money;


import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cn.it.money.presenter.UserPresenter;
import cn.it.money.view.IUserView;

public class MainActivity extends Activity implements IUserView {
	private UserPresenter mUserPresenter;
	private EditText etName;
	private EditText etMoney;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etName = (EditText) findViewById(R.id.et_name);
		etMoney = (EditText) findViewById(R.id.et_money);
		mUserPresenter = new UserPresenter(getApplicationContext(), this);
	}

	public void clickMe(View view) {
		String name;
		switch (view.getId()) {
		case R.id.btn_save:
			name = etName.getText().toString();
			String money = etMoney.getText().toString();
			if (TextUtils.isEmpty(name)) {
				Toast.makeText(getApplicationContext(), "名字不能为空", 0).show();
				return;
			}
			mUserPresenter.save(name, Double.parseDouble(money));
			break;
		case R.id.btn_take:
			name = etName.getText().toString();
			double take = mUserPresenter.take(name);
			Toast.makeText(getApplicationContext(), "take:" + take, 0).show();
			break;

		default:
			break;
		}
	}

	@Override
	public void save(String name, double money) {
		// 处理我们的UI
		Toast.makeText(getApplicationContext(), "name:" + name + ";money:" + money, 0).show();
	}

	@Override
	public double take(String name) {
		// 处理我们的UI
		return 0;
	}
}
