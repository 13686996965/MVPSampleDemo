package cn.it.mymoneydemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.it.mymoneydemo.R;
import cn.it.mymoneydemo.precenter.UserPrecenter;

/**
 * 需求  根据姓名 存钱 和 取钱
 */

public class UserViewActivity extends AppCompatActivity implements IUserView {

    @Bind(R.id.edt_name)
    EditText mEdtName;
    @Bind(R.id.edt_money)
    EditText mEdtMoney;
    @Bind(R.id.safe)
    Button mSafe;
    @Bind(R.id.load)
    Button mLoad;

    private UserPrecenter mUserPrecenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view);
        ButterKnife.bind(this);
        mUserPrecenter = new UserPrecenter(this);
    }

    @OnClick({R.id.safe, R.id.load})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.safe:
                mUserPrecenter.saveInfo(getName(), getMoney());
                break;
            case R.id.load:
                mUserPrecenter.loadInfo(getName());
                break;
        }
    }

    @Override
    public String getName() {
        return mEdtName.getText().toString();
    }

    @Override
    public int getMoney() {
        return Integer.parseInt(mEdtMoney.getText().toString());
    }

    @Override
    public void setName(String name) {
        Log.d("it", "name:" + name);

    }

    @Override
    public void setMoney(int money) {
        Log.d("it", "money:" + money);
    }
}
