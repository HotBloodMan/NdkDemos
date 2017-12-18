package com.ljt.ndkdemos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"开始调用JNI。。。"
                        + com.ljt.ndkdemos.utils.ViewUtils.getStringFromJni(),Toast.LENGTH_LONG).show();

                /*
                *
                * ViewUtils utils = new ViewUtils();
                utils.callMethod1();
                Toast.makeText(MainActivity.this,"开始调用JNI。。。",Toast.LENGTH_LONG).show();
                *
                * */
            }
        });
    }

}
