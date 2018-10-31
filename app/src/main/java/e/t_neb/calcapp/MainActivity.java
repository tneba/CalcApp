package e.t_neb.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //表示用TextViewのインスタンスを宣言
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.display);

    }

    public void operateKey(View myKey){
        String key = ((Button)myKey).getText().toString();
        Log.d("Key Input",key);
        display.setText(key);
    }
}
