package com.example.mygame.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mygame.MainActivity;
import com.example.mygame.R; 

public class UserFragment extends Fragment implements OnClickListener {
	private View view;
	private MainActivity activity;
	private LinearLayout ll_userinfo;
	private ImageView iv_avatar;
	private TextView tv_name;
	private TextView tv_intro;
	private LinearLayout ll_zuji;
	private LinearLayout ll_focus;
	private LinearLayout ll_match;
	private LinearLayout ll_collection;
	
	private void initView() {
		ll_userinfo = (LinearLayout) view.findViewById(R.id.ll_userinfo);
		iv_avatar = (ImageView) view.findViewById(R.id.iv_avatar);
		tv_name = (TextView) view.findViewById(R.id.tv_name);
		tv_intro = (TextView) view.findViewById(R.id.tv_intro);
		ll_zuji = (LinearLayout) view.findViewById(R.id.ll_about_zuji);
		ll_focus = (LinearLayout) view.findViewById(R.id.ll_focus);
		ll_match = (LinearLayout) view.findViewById(R.id.ll_match);
		ll_collection = (LinearLayout) view.findViewById(R.id.ll_collection);
		ll_userinfo.setOnClickListener(this);
		ll_zuji.setOnClickListener(this);
		ll_focus.setOnClickListener(this);
		ll_match.setOnClickListener(this);
		ll_collection.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = View.inflate(activity, R.layout.frag_user, null);

		initView();
		
		return view;
	}
}
