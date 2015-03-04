package com.thepit.ipitslo.ui;

import java.util.ArrayList;
import java.util.List;

import com.thepit.ipitslo.R;
import com.thepit.ipitslo.adapter.BlogAdapter;
import com.thepit.ipitslo.model.BlogEntry;
import com.thepit.ipitslo.util.BlogAsyncTask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class BlogActivity extends BaseActivity {
	
	private ListView blogListView;
	private BlogAdapter adapter;
	private ArrayList<BlogEntry> mBlogEntries;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blog);
		blogListView = (ListView)findViewById(R.id.blog_list_view);
		
		new BlogAsyncTask().execute();

		adapter = new BlogAdapter(this, android.R.layout.simple_list_item_1, mBlogEntries);
		blogListView.setAdapter(adapter);
		blogListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
		        Intent intent = new Intent(BlogActivity.this, BlogDetailActivity.class);
		        intent.putExtra("url", mBlogEntries.get(position).getLink());
		        startActivity(intent);				
			}
		});
	}
	}
