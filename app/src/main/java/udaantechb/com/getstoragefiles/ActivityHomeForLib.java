package udaantechb.com.getstoragefiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import udaantechb.com.mylittlelibrary.MyView;

public class ActivityHomeForLib extends AppCompatActivity {

    Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        View v = new MyView(this);
        setContentView(v);

       /* btnClickMe=(Button)findViewById(udaantechb.com.mylittlelibrary.R.id.btnClickMe);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityHomeForLib.this, "you ClickMe", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
