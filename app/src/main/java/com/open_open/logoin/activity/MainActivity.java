package com.open_open.logoin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.open_open.logoin.R;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity{
    private Map map;
    private EditText
            editPassword,
            editUser,
            registePassword1,
            registePassword2,
            registeUser;
    private String username;
    private String password;
    private Button button;
    private String registename;
    private String password1;
    private String password2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = new HashMap();
        init();


        if (map.isEmpty()) {
            Toast.makeText(this, "请先注册", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,RegisteActivity.class));
            registename = registeUser.getText().toString();
            password1 = registePassword1.getText().toString();
            password2 = registePassword2.getText().toString();
            if (password1.equals(password2)) {
                map.put("username", registename);
                map.put("password", password1);
            } else {
                Toast.makeText(MainActivity.this, "两次密码输入不匹配", Toast.LENGTH_SHORT).show();
            }
        } else {
            username = editUser.getText().toString();
            password = editPassword.getText().toString();
            if (username.equals(map.get("username")) & password.equals(map.get("password"))) {
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    }
                });
            } else {
                Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void init() {
        button = (Button) findViewById(R.id.btn);
        editUser = (EditText) findViewById(R.id.edit_user);
        editPassword = (EditText) findViewById(R.id.edit_password);
        registeUser = (EditText) findViewById(R.id.registe_username);
        registePassword1 = (EditText) findViewById(R.id.resert_1);
        registePassword2 = (EditText) findViewById(R.id.resert_2);
    }

}
