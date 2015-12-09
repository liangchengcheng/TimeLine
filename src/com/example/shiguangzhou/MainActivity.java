package com.example.shiguangzhou;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView titleText = null;// ����
	private ListView routeList = null;// ��Ʒ�б�

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

		infos.add(new  RouteInfo("��л��ʹ�ú�˹�����������̳ǣ���������Ѿ��ύ�ɹ�", "2014-06-19 10:39:17"));
		infos.add(new  RouteInfo("����������������", "2014-06-19 10:14:17"));
		infos.add(new  RouteInfo("����������ͨ�������ڴ����Ԥ��2Сʱ�ڵ���", "2014-06-19 09:34:38"));
		infos.add(new  RouteInfo("������ִ���Ѿ���ɣ����ѯ������", "2014-06-19 07:34:38"));
	

		RouteItemAdapter itemAdapter = new RouteItemAdapter(
				MainActivity.this, infos);
		routeList.setAdapter(itemAdapter);

	}

}
