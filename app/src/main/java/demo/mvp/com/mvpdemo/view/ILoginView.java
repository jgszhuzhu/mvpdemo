package demo.mvp.com.mvpdemo.view;

/**
 * Created by Admin on 2017/7/13.
 */

public interface ILoginView {
    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}
