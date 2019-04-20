package mm.com.fairway.mylesson13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.myListView);
        String[] myData = {"Visual Basic .NET", "Java", "Android", "C# .NET", "PHP", "C++", "Ruby", "JavaScript", "HTML", "Python", "Swift"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myData);
        listView.setAdapter(arrayAdapter);

        intent = new Intent(this,SecondActivity.class);

        listView.setOnItemClickListener(listClick);
    }

    private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            String itemValue = (String) listView.getItemAtPosition(position);
            intent.putExtra("COURSE_SELECTED", itemValue);
            startActivity(intent);

        }
    };
}
