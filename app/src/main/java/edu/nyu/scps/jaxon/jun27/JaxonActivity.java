package edu.nyu.scps.jaxon.jun27;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;


public class JaxonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaxon);

        Button button = (Button)findViewById(R.id.button1);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button)v;	//downcast

                RotateAnimation anim = new RotateAnimation(25f, 350f, 0f, -100f);
                anim.setInterpolator(new LinearInterpolator());
                anim.setRepeatCount(5);
                // anim.setRepeatCount(Animation.INFINITE);
                anim.setDuration(700);

// Start animating the image
                final ImageView splash = (ImageView) findViewById(R.id.logo);
                splash.startAnimation(anim);



                // END ANIMATION CODE
            } // END ONCLICK
        }; // END ONCLICKLISTENER1

        button.setOnClickListener(onClickListener);



    }  // END ONCREATE

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jaxon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}  // END MAIN CLASS
