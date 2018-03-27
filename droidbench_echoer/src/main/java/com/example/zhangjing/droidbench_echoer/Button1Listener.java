package com.example.zhangjing.droidbench_echoer;

import android.util.Log;
import android.view.View;

/**
 * Created by ZhangJing on 18/3/26.
 */
public class Button1Listener implements View.OnClickListener {

    private final MainActivity act;

    public Button1Listener(MainActivity parentActivity) {
        this.act = parentActivity;
    }


    @Override
    public void onClick(View arg0) {
        try {
//			this.act.i.putExtra("resultData", "new secret");
            Log.i("In Echoer", "Echoing data back to caller using setResult()");
            this.act.setResult(0, this.act.i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            this.act.finish();
        }

    }

}
