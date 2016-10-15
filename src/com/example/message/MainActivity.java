package com.example.message;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
         private EditText editNum,editMess;
         private Button btnSend;
	@Override
	protected void onCreate(Bundle savedInstanceState) {


		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editNum=(EditText)findViewById(R.id.editNum);

		editMess=(EditText)findViewById(R.id.editMess);

		btnSend=(Button)findViewById(R.id.btnSend);
		
		btnSend.setOnClickListener(new OnClickListener() {

			
			@Override
			public void onClick(View v) {

				// TODO Auto-generated method stub
				String mobile=editNum.getText().toString();
				String content=editMess.getText().toString();
				
				Intent intent=new Intent();
				intent.setData(Uri.parse("smsto:"+mobile));
				intent.putExtra("sms_boby", content);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {



		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
