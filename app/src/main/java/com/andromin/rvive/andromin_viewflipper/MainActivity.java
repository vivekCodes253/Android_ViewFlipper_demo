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
        // -------View Flipper
        //1 - Create the animations, we will load the animations from
        //    the already made animations in the android.R.anim folder
        //    custom animations can be added into to res/anim folder
        Animation anim_in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation anim_out = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);


        //2 - Find the fipper in the XML
        ViewFlipper vf = findViewById(R.id.vf);

        //3 - Assisgn the animations
        vf.setInAnimation(anim_in);
        vf.setOutAnimation(anim_out);

        //4 - Set the flipping interval, that is the time between flips
        vf.setFlipInterval(3000);

        //5 - Start FLipping - optional here, can also be
        //    called on click for click to flip
        vf.startFlipping();
    }


}





