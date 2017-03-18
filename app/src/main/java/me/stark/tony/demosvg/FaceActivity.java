package me.stark.tony.demosvg;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * 作者：Stark.Tony          <br/>
 * 描述：笑脸矢量图动画          <br/>
 * 生成日期：2017-3-18    <br/>
 */
public class FaceActivity extends AppCompatActivity {

  private ImageView imageView;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_face);

    imageView = (ImageView) findViewById(R.id.image);
    imageView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        animate();
      }
    });

  }


  private void animate() {
    Drawable drawable = imageView.getDrawable();
    if (drawable instanceof Animatable) {
      ((Animatable) drawable).start();
    }
  }

}
