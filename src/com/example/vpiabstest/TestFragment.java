package com.example.vpiabstest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class TestFragment extends SherlockFragment {
	private String mContent = "???";
	private static final String KEY_TAB_NUM = "key.tab.num";
	
	public static TestFragment newInstance(String text) {
        TestFragment fragment = new TestFragment();
        
        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putString(KEY_TAB_NUM, text);
        fragment.setArguments(args);

        
        return fragment;
    }
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_main, null);
        String text = getString(R.string.tab_page_num) + mContent;
		
        ((TextView)view.findViewById(R.id.text)).setText(text);
        
		return view;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContent =  getArguments() != null ? getArguments().getString(KEY_TAB_NUM) : "???";
	}
}
