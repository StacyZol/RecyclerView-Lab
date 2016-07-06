package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObject2> customObjectList2 = new ArrayList<>();
        customObjectList2.add(new CustomObject2("title 1", "description a", "color green", true));
        customObjectList2.add(new CustomObject2("title 2", "description a", "color green", false));
        customObjectList2.add(new CustomObject2("title 3", "description a", "color green", true));
        customObjectList2.add(new CustomObject2("title 4", "description a", "color green", false));
        customObjectList2.add(new CustomObject2("title 5", "description a", "color green", false));
        customObjectList2.add(new CustomObject2("title 6", "description a", "color green", false));
        customObjectList2.add(new CustomObject2("title 7", "description a", "color green", true));
        customObjectList2.add(new CustomObject2("title 8", "description a", "color green", true));
        customObjectList2.add(new CustomObject2("title 9", "description a", "color green", false));
        customObjectList2.add(new CustomObject2("title 10", "description a", "color green", true));

        CustomRecyclerViewAdapter2 adapter = new CustomRecyclerViewAdapter2(customObjectList2);

        mRecyclerView.setAdapter(adapter);

    }
}
