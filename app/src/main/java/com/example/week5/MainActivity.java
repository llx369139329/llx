package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_denglu;
    Button btn_zhuce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.langding);
        btn_denglu = findViewById(R.id.btn_denglu);
        btn_zhuce = findViewById(R.id.btn_zhuce);

        btn_denglu.setOnClickListener(this);
        btn_zhuce.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_zhuce:
                Toast.makeText(MainActivity.this,"不会吧不会吧，不会还有人没注册吧",Toast.LENGTH_SHORT).show();
               break;
            case R.id.btn_denglu:
                AlertDialog.Builder alerBuilder = new AlertDialog.Builder(MainActivity.this);
                alerBuilder.setIcon(R.mipmap.ic_launcher);
                alerBuilder.setTitle("用户登录确认");
                alerBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                    }
                });
                alerBuilder.setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog myAlert = alerBuilder.create();
                myAlert.show();
        }
    }
}