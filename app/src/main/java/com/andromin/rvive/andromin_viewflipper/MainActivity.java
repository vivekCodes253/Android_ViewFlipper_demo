package com.andromin.rvive.andromin_viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewflip();

    }

    public void viewflip()
    {
        Animation anim_in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation anim_out = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        ViewFlipper vf = (ViewFlipper)findViewById(R.id.vf);
        vf.setInAnimation(anim_in);
        vf.setOutAnimation(anim_out);
        vf.setFlipInterval(3000);
        vf.startFlipping();
    }


}





