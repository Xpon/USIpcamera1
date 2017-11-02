package net.majorkernelpanic.spydroid.ui;


import net.majorkernelpanic.spydroid.R;
import net.majorkernelpanic.streaming.rtsp.RtspServer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IpcameraActivity extends Activity {

	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		intent=new Intent(IpcameraActivity.this,RtspServer.class);
		Button button = (Button) findViewById(R.id.start);
		button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				startService(intent);
			}
			
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		stopService(intent);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
//	private ServiceConnection mRtspServiceConnection = new ServiceConnection() {
//
//		@Override
//		public void onServiceConnected(ComponentName name, IBinder service) {
//			mRtspServer = ((RtspServer.LocalBinder)service).getService();
//			mRtspServer.start();
//		}
//
//		@Override
//		public void onServiceDisconnected(ComponentName name) {}
//
//	};

}
