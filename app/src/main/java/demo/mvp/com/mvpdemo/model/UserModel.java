package demo.mvp.com.mvpdemo.model;

import android.text.TextUtils;

/**
 * Created by Admin on 2017/7/13.
 */

public class UserModel implements IUser {
    private String username,password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public int checkUser(String username, String pwd) {
            if (!TextUtils.isEmpty(username)&&!TextUtils.isEmpty(pwd)){

                return   1;
            }else{
                return  0;
            }
    }
}
