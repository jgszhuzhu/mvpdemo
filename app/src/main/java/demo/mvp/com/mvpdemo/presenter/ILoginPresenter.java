package demo.mvp.com.mvpdemo.presenter;

/**
 * Created by Admin on 2017/7/13.
 */

public interface ILoginPresenter {
    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}
