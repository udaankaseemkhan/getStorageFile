package udaantechb.com.mylittlelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

/**
 * Created by Admin on 3/15/2018.
 */

public class MyView extends LinearLayout
{
    Button btnClickMe;
    Context contextGlobal;
     private void initialize(Context context)
     {
         this.contextGlobal=context;
         inflate(context, R.layout.my_view, this);


     }


     public MyView(Context context)
     {
        super(context);
         initialize(context);
         btnClickMe=(Button)findViewById(R.id.btnClickMe);

         btnClickMe.setOnClickListener(new OnClickListener()
         {
             @Override
             public void onClick(View view)
             {
                 Toast.makeText(contextGlobal, "clicked", Toast.LENGTH_SHORT).show();
             }
         });
    }

    public MyView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        initialize(context);
    }
}