package com.example.study_book.hw_android_23_moroz_vladimir;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TW_COLOR = "key_tw_color";
    private final static String CBR_COLOR = "key_crb_color";
    private final static String CBB_COLOR = "key_cbb_color";
    private final static String CBY_COLOR = "key_cby_color";
    private final static String LL_BCOLOR = "key_ll_bcolor";

    CheckBox cbRed;
    CheckBox cbYellow;
    CheckBox cbBlue;
    LinearLayout ll;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbRed = (CheckBox) findViewById(R.id.cbRed);
        cbYellow = (CheckBox) findViewById(R.id.cbYellow);
        cbBlue = (CheckBox) findViewById(R.id.cbBlue);
        ll = (LinearLayout) findViewById(R.id.ll);
        tw = (TextView)findViewById(R.id.tw);

        if(savedInstanceState!=null){
            cbRed.setTextColor(savedInstanceState.getInt(MainActivity.CBR_COLOR));
            cbBlue.setTextColor(savedInstanceState.getInt(MainActivity.CBB_COLOR));
            cbYellow.setTextColor(savedInstanceState.getInt(MainActivity.CBY_COLOR));
            tw.setTextColor(savedInstanceState.getInt(MainActivity.TW_COLOR));
            ll.setBackgroundColor(savedInstanceState.getInt(MainActivity.LL_BCOLOR));
        }else{
            cbRed.setTextColor(getResources().getColor(R.color.gray));
            cbYellow.setTextColor(getResources().getColor(R.color.gray));
            cbBlue.setTextColor(getResources().getColor(R.color.gray));
            tw.setTextColor(getResources().getColor(R.color.gray));
            ll.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }

    public void Click(View view) {
        switch(view.getId()){
            case R.id.cbRed:
                if(cbRed.isChecked()&&!cbYellow.isChecked()&&!cbBlue.isChecked()) {
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                    cbBlue.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.blue_yellow));
                    tw.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbRed.setChecked(true);
                }else if(!cbRed.isChecked()&&!cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
                    cbRed.setChecked(false);
                    cbBlue.setTextColor(getResources().getColor(R.color.gray));
                    cbYellow.setTextColor(getResources().getColor(R.color.gray));
                    cbRed.setTextColor(getResources().getColor(R.color.gray));
                    tw.setTextColor(getResources().getColor(R.color.gray));
                }else if(cbRed.isChecked()&&cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.blue));
                    cbYellow.setTextColor(getResources().getColor(R.color.blue));
                    cbRed.setTextColor(getResources().getColor(R.color.blue));
                    tw.setTextColor(getResources().getColor(R.color.blue));
                    cbRed.setChecked(true);
                }else if(!cbRed.isChecked()&&cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.red_blue));
                    cbYellow.setTextColor(getResources().getColor(R.color.red_blue));
                    cbRed.setTextColor(getResources().getColor(R.color.red_blue));
                    tw.setTextColor(getResources().getColor(R.color.red_blue));
                    cbRed.setChecked(false);
                }else if(cbRed.isChecked()&&!cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red_blue));
                    cbBlue.setTextColor(getResources().getColor(R.color.yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.yellow));
                    tw.setTextColor(getResources().getColor(R.color.yellow));
                    cbRed.setChecked(true);
                }else if(!cbRed.isChecked()&&!cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
                    cbBlue.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.red_yellow));
                    tw.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbRed.setChecked(false);
                }else if(cbRed.isChecked()&&cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.reb_blue_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.light_green));
                    cbYellow.setTextColor(getResources().getColor(R.color.light_green));
                    cbRed.setTextColor(getResources().getColor(R.color.light_green));
                    tw.setTextColor(getResources().getColor(R.color.light_green));
                    cbRed.setChecked(true);
                }else if(!cbRed.isChecked()&&cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.red));
                    cbYellow.setTextColor(getResources().getColor(R.color.red));
                    cbRed.setTextColor(getResources().getColor(R.color.red));
                    tw.setTextColor(getResources().getColor(R.color.red));
                    cbRed.setChecked(false);
                }
                break;
            case R.id.cbYellow:
                if(!cbRed.isChecked()&&cbYellow.isChecked()&&!cbBlue.isChecked()) {
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.red_blue));
                    cbYellow.setTextColor(getResources().getColor(R.color.red_blue));
                    cbRed.setTextColor(getResources().getColor(R.color.red_blue));
                    tw.setTextColor(getResources().getColor(R.color.red_blue));
                    cbYellow.setChecked(true);
                }else if(!cbRed.isChecked()&&!cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
                    cbBlue.setTextColor(getResources().getColor(R.color.gray));
                    cbYellow.setTextColor(getResources().getColor(R.color.gray));
                    cbRed.setTextColor(getResources().getColor(R.color.gray));
                    tw.setTextColor(getResources().getColor(R.color.gray));
                    cbYellow.setChecked(false);
                }else if(cbRed.isChecked()&&cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.blue));
                    cbYellow.setTextColor(getResources().getColor(R.color.blue));
                    cbRed.setTextColor(getResources().getColor(R.color.blue));
                    tw.setTextColor(getResources().getColor(R.color.blue));
                    cbYellow.setChecked(true);
                }else if(cbRed.isChecked()&&!cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                    cbBlue.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.blue_yellow));
                    tw.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbYellow.setChecked(false);
                }else if(!cbRed.isChecked()&&cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.red));
                    cbYellow.setTextColor(getResources().getColor(R.color.red));
                    cbRed.setTextColor(getResources().getColor(R.color.red));
                    tw.setTextColor(getResources().getColor(R.color.red));
                    cbYellow.setChecked(true);
                }else if(!cbRed.isChecked()&&!cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
                    cbBlue.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.red_yellow));
                    tw.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbYellow.setChecked(false);
                }else if(cbRed.isChecked()&&cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.reb_blue_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.light_green));
                    cbYellow.setTextColor(getResources().getColor(R.color.light_green));
                    cbRed.setTextColor(getResources().getColor(R.color.light_green));
                    tw.setTextColor(getResources().getColor(R.color.light_green));
                    cbYellow.setChecked(true);
                }else if(cbRed.isChecked()&&!cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red_blue));
                    cbBlue.setTextColor(getResources().getColor(R.color.yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.yellow));
                    tw.setTextColor(getResources().getColor(R.color.yellow));
                    cbYellow.setChecked(false);
                }
                break;
            case R.id.cbBlue:
                if(!cbRed.isChecked()&&!cbYellow.isChecked()&&cbBlue.isChecked()) {
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
                    cbBlue.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.red_yellow));
                    tw.setTextColor(getResources().getColor(R.color.red_yellow));
                    cbBlue.setChecked(true);
                }else if(!cbRed.isChecked()&&!cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
                    cbBlue.setTextColor(getResources().getColor(R.color.gray));
                    cbYellow.setTextColor(getResources().getColor(R.color.gray));
                    cbRed.setTextColor(getResources().getColor(R.color.gray));
                    tw.setTextColor(getResources().getColor(R.color.gray));
                    cbBlue.setChecked(false);
                }else if(cbRed.isChecked()&&!cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red_blue));
                    cbBlue.setTextColor(getResources().getColor(R.color.yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.yellow));
                    tw.setTextColor(getResources().getColor(R.color.yellow));
                    cbBlue.setChecked(true);
                }else if(cbRed.isChecked()&&!cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                    cbBlue.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbYellow.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbRed.setTextColor(getResources().getColor(R.color.blue_yellow));
                    tw.setTextColor(getResources().getColor(R.color.blue_yellow));
                    cbBlue.setChecked(false);
                }else if(!cbRed.isChecked()&&cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.red));
                    cbYellow.setTextColor(getResources().getColor(R.color.red));
                    cbRed.setTextColor(getResources().getColor(R.color.red));
                    tw.setTextColor(getResources().getColor(R.color.red));
                    cbBlue.setChecked(true);
                }else if(!cbRed.isChecked()&&cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.red_blue));
                    cbYellow.setTextColor(getResources().getColor(R.color.red_blue));
                    cbRed.setTextColor(getResources().getColor(R.color.red_blue));
                    tw.setTextColor(getResources().getColor(R.color.red_blue));
                    cbBlue.setChecked(false);
                }else if(cbRed.isChecked()&&cbYellow.isChecked()&&cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.reb_blue_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.light_green));
                    cbYellow.setTextColor(getResources().getColor(R.color.light_green));
                    cbRed.setTextColor(getResources().getColor(R.color.light_green));
                    tw.setTextColor(getResources().getColor(R.color.light_green));
                    cbBlue.setChecked(true);
                }else if(cbRed.isChecked()&&cbYellow.isChecked()&&!cbBlue.isChecked()){
                    ll.setBackgroundColor(ContextCompat.getColor(this, R.color.red_yellow));
                    cbBlue.setTextColor(getResources().getColor(R.color.blue));
                    cbYellow.setTextColor(getResources().getColor(R.color.blue));
                    cbRed.setTextColor(getResources().getColor(R.color.blue));
                    tw.setTextColor(getResources().getColor(R.color.blue));
                    cbBlue.setChecked(false);
                }
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(MainActivity.CBB_COLOR, this.cbBlue.getCurrentTextColor());
        savedInstanceState.putInt(MainActivity.CBR_COLOR, this.cbRed.getCurrentTextColor());
        savedInstanceState.putInt(MainActivity.CBY_COLOR, this.cbYellow.getCurrentTextColor());
        savedInstanceState.putInt(MainActivity.TW_COLOR, this.tw.getCurrentTextColor());
        int background_color = Color.TRANSPARENT;
        Drawable background = ll.getBackground();
        if (background instanceof ColorDrawable) background_color = ((ColorDrawable) background).getColor();
        savedInstanceState.putInt(MainActivity.LL_BCOLOR, background_color );



    }
}
