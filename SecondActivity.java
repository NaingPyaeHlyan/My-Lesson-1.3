package mm.com.fairway.mylesson13;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String message = "Selected Course is "+ intent.getStringExtra("COURSE_SELECTED");

        TextView myTextView = (TextView)findViewById(R.id.textView);

        myTextView.setText(message);
    }
}
