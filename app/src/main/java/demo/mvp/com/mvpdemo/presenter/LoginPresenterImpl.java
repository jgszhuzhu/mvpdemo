package demo.mvp.com.mvpdemo.presenter;

import android.os.Handler;
import android.os.Looper;

import demo.mvp.com.mvpdemo.model.IUser;
import demo.mvp.com.mvpdemo.model.UserModel;
import demo.mvp.com.mvpdemo.view.ILoginView;

/**
 * Created by Admin on 2017/7/13.
 */

public class LoginPresenterImpl implements ILoginPresenter {

    ILoginView iLoginView;
    IUser user;
    Handler handler;
    Boolean isLoginSuccess = true;

    public LoginPresenterImpl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }
    public void initUser(){
        user  = new UserModel();
    }
    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String passwd) {

        final int code = user.checkUser(name,passwd);
        if (code==1){
            isLoginSuccess  = true;
        }else{

            isLoginSuccess= false;
        }
        final Boolean result = isLoginSuccess;

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(isLoginSuccess,code);
            }
        },3000);

    }

    @Override
    public void setProgressBarVisiblity(int visiblity) {
        iLoginView.onSetProgressBarVisibility(visiblity);
    }
}
