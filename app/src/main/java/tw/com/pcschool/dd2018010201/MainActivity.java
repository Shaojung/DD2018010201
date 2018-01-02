package tw.com.pcschool.dd2018010201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Test3", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void click1(View v)
    {
        switch(v.getId())
        {
            case R.id.button:
                Toast.makeText(MainActivity.this, "Test1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "Test2", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
