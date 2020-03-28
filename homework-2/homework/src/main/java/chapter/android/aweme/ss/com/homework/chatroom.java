package chapter.android.aweme.ss.com.homework;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.InputStream;

public class chatroom extends AppCompatActivity {
    private TextView show;
    private TextView name;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        show = findViewById(R.id.tv_content_info);

        Intent intent = getIntent();
        show.setText(intent.getStringExtra("show"));
    }
}
