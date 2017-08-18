 package com.example.toshiba.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] student = {"ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem","ali", "hasan", "hamza", "usman", "yousaf", "bilal", "naseem"};
        ListAdapter listAdapter = new Custom_adapter(this,student);
        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(listAdapter);
    }
}
