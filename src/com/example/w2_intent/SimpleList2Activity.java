package com.example.w2_intent;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class SimpleList2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_list2);
		
		ListView listView = (ListView) findViewById(R.id.simple_list2_listView);
		
		ArrayList<HashMap<String, String>> hashMapList1 = new ArrayList<HashMap<String, String>>(2);
		
		for (int i = 0; i < 10; i++) {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("line1", "첫번째 줄의 " + i + "번");
			map.put("line2", "두번째 줄의 " + i + "번");
			hashMapList1.add(map);
		}
		
		String[] from = {"line1", "line2"};
		
		int[] to = {android.R.id.text1, android.R.id.text2};
		
		SimpleAdapter simpleAdapter2 = new SimpleAdapter(this, hashMapList1, android.R.layout.simple_list_item_2, from, to);
		
		listView.setAdapter(simpleAdapter2);
	}
}
