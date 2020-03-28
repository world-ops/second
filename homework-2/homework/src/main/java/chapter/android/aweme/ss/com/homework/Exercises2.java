package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    private View view;
    private TextView show;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
        view = findViewById(R.id.root);
        show = findViewById(R.id.tv_center);
        show.setText(String.valueOf(getAllChildViewCount(view)));
    }


    public int getAllChildViewCount(View view) {
        //todo 补全你的代码
        //递归
        /*=========BEGIN============*/
        int viewCount = 0;

        if(null == view){
            return 0;
        }
        else{
            if(view instanceof ViewGroup){
                //viewCount++;
                for (int i = 0; i < ((ViewGroup)view).getChildCount();i++){
                    View subView = ((ViewGroup)view).getChildAt(i);
                    if (subView instanceof ViewGroup){
                        viewCount += getAllChildViewCount(subView);
                    }
                    else{
                        viewCount++;
                    }
                }
            }
            else{
                viewCount++;
            }
        }
        /*==========END============*/
        return viewCount;
    }

}
