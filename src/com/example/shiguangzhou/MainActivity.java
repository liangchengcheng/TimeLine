package com.example.shiguangzhou;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView titleText = null;// 标题
	private ListView routeList = null;// 商品列表

	private List<RouteInfo> infos = new ArrayList<RouteInfo>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
	
		routeList = (ListView) findViewById(R.id.lv_route_list);

		infos.add(new  RouteInfo("感谢您使用海斯福健康生活商城，你的提现已经提交成功", "2014-06-19 10:39:17"));
		infos.add(new  RouteInfo("你的提现正在审核中", "2014-06-19 10:14:17"));
		infos.add(new  RouteInfo("你的提现审核通过，正在打款中预计2小时内到账", "2014-06-19 09:34:38"));
		infos.add(new  RouteInfo("你的提现打款已经完成，请查询你的余额", "2014-06-19 07:34:38"));
	

		RouteItemAdapter itemAdapter = new RouteItemAdapter(
				MainActivity.this, infos);
		routeList.setAdapter(itemAdapter);

	}

}
