package spsmb.dinogame;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    DisplayMetrics displayMetrics;
    @SuppressLint("StaticFieldLeak")
    public static TextView scoreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Screen.height = displayMetrics.heightPixels;
        Screen.width = displayMetrics.widthPixels;
        setContentView(R.layout.activity_main);
        scoreText = (TextView) findViewById(R.id.score);
    }
}