package com.zjanvier.fadeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;

 public void fade(View view)
 {
     imageView=findViewById(R.id.imageView);


     imageView2=findViewById(R.id.imageView2);

    // imageView.animate().alpha(0f).setDuration(3000);
    // imageView2.animate().alpha(1f).setDuration(3000);

    // imageView.animate().translationXBy(-1000f).setDuration(2500);
      // imageView.animate().rotationBy(-90f).setDuration(500);
     /*imageView.animate()
             .scaleX(0.25f)
             .scaleY(0.25f)
             .setDuration(2000);
*/
     imageView2.animate().alpha(0f).setDuration(1000);
     imageView.animate()
             .translationXBy(1000f)
             .translationYBy(1000f)
             .rotationBy(3600)
             .setDuration(4000);



 }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);

        imageView.setTranslationX(-1000f);
        imageView.setTranslationY(-1000f);

    }
}
