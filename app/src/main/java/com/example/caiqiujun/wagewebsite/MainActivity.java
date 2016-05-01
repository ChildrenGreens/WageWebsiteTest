package com.example.caiqiujun.wagewebsite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<Map<String, Object>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init() {
        listView = (ListView) findViewById(R.id.listView);
        list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 5; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", R.mipmap.ic_launcher);
            map.put("title", "招聘实习生");
            map.put("sex", "女");
            map.put("district", "武进区");
            list.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.project_item,
                new String[]{"image", "title", "sex", "district"},
                new int[]{R.id.image, R.id.title, R.id.sex, R.id.district});

        listView.setAdapter(adapter);
    }


}
