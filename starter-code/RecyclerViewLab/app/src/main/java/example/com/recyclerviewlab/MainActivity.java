package example.com.recyclerviewlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton = (Button) findViewById(R.id.button);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObject1> customObjectList1 = new ArrayList<>();
        customObjectList1.add(new CustomObject1("title1", "description a", R.color.colorPrimaryDark));
        customObjectList1.add(new CustomObject1("title1", "description a", R.color.colorAccent));
       customObjectList1.add(new CustomObject1("title 2", "description a", R.color.colorAccent));
        customObjectList1.add(new CustomObject1("title 3", "description a", R.color.colorPrimaryDark));
        customObjectList1.add(new CustomObject1("title 4", "description a", R.color.colorAccent));
        customObjectList1.add(new CustomObject1("title 5", "description a", R.color.colorAccent));
        customObjectList1.add(new CustomObject1("title 6", "description a", R.color.colorPrimaryDark));
        customObjectList1.add(new CustomObject1("title 7", "description a", R.color.colorAccent));
        customObjectList1.add(new CustomObject1("title 8", "description a", R.color.colorPrimaryDark));
        customObjectList1.add(new CustomObject1("title 9", "description a", R.color.colorPrimaryDark));
        customObjectList1.add(new CustomObject1("title 10", "description a", R.color.colorAccent));

        CustomRecyclerViewAdapter1 adapter = new CustomRecyclerViewAdapter1(customObjectList1);

        mRecyclerView.setAdapter(adapter);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
       startActivity(intent);
            }
        });


    }
}
