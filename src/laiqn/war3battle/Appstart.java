package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.content.Intent;


public class Appstart extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.activity_appstart);

	new Handler().postDelayed(new Runnable(){
		@Override
		public void run(){
			Intent intent = new Intent (Appstart.this,MainActivity.class);			
			startActivity(intent);			
			Appstart.this.finish();
		}
	}, 2500);
   }
}
