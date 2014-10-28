package com.example.w2_intent;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleList1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_list1);
	
		ListView listView = (ListView) findViewById(R.id.simple_list1_listView);
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("데이터1");
		arrayList1.add("데이터2");
		arrayList1.add("데이터3");
		arrayList1.add("데이터4");
		arrayList1.add("데이터5");
		arrayList1.add("데이터6");
		
		ArrayAdapter<String> simpleAdapter1;
		//												안드로이드에서 기본 제공하는 한줄짜리 리스트 레이아웃  리스트에 집어 넣을 데이터
		simpleAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList1);
		
		listView.setAdapter(simpleAdapter1);
	}
}
