package org.example.imci;

import com.example.imci.R;  

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;




public class Main extends Activity{
	 
	 DrawerLayout drawerLayout;
	
	private ListView listView;
	private String [] planets;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
		planets = getResources().getStringArray(R.array.planets);
		listView = (ListView)findViewById(R.id.drawerList);
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,planets));
		 	
}
	public void	onItemClick(AdapterView<?> parent , View view,int position,long id)
{
		Toast.makeText(this,planets[position]+"was selected",Toast.LENGTH_LONG).show();
	}
}
