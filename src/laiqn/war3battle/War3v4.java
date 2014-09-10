package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;

public class War3v4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_war3v4);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, War3.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}

}
