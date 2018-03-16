package udaantechb.com.mylittlelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONObject;

/**
 * Created by Admin on 3/15/2018.
 */

public class MyView extends LinearLayout
{


     private void initialize(Context context)
     {
         inflate(context, R.layout.my_view, this);
     }

     public MyView(Context context)
     {
        super(context);
         initialize(context);
    }

    public MyView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        initialize(context);
    }
}