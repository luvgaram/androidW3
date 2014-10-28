package com.example.w2_intent;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<ListData>{
	private Context context;
	private int layoutResourceId;
	private ArrayList<ListData> listData;
	
	public CustomAdapter(Context context, int layoutResourceId, ArrayList<ListData> listData) {
		super(context, layoutResourceId, listData);
		this.context = context;
		this.layoutResourceId = layoutResourceId;
		this.listData = listData;
	}
	
	// 기존 getView를 오버라이딩해서 리스트가 보여지는 형태를 직접 정해줌 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// row = list 각각의 칸
		View row = convertView;
		
		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);
		}
		
		TextView tvText1 = (TextView) row.findViewById(R.id.custom_row_textView1);
		TextView tvText2 = (TextView) row.findViewById(R.id.custom_row_textView2);
		
		tvText1.setText(listData.get(position).getText1());
		tvText2.setText(listData.get(position).getText2());
		
		ImageView imageView = (ImageView) row.findViewById(R.id.custom_row_imageView1);
		
		try {
			InputStream is = context.getAssets().open(listData.get(position).getImgName());
			Drawable d = Drawable.createFromStream(is, null);
			imageView.setImageDrawable(d);
		} catch (IOException e) {
			Log.e("ERROR", "ERROR" + e);
		}
		
		return row;
	}
}
