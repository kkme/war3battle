package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class War3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_war3);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, MainActivity.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
	 public void war3v1(View view) {
	        Intent intent = new Intent(this, War3v1.class);
	        startActivity(intent);
	        this.finish();
	    }
	 public void war3v2(View view) {
	        Intent intent = new Intent(this, War3v2.class);
	        startActivity(intent);
	        this.finish();
	    }
	 public void war3v3(View view) {
	        Intent intent = new Intent(this, War3v3.class);
	        startActivity(intent);
	        this.finish();
	    }
	 public void war3v4(View view) {
	        Intent intent = new Intent(this, War3v4.class);
	        startActivity(intent);
	        this.finish();
	    }
	 public void war3v5(View view) {
	        Intent intent = new Intent(this, War3v5.class);
	        startActivity(intent);
	        this.finish();
	    }
	 public void war3v6(View view) {
	        Intent intent = new Intent(this, War3v6.class);
	        startActivity(intent);
	        this.finish();
	    }
	 public void war3v7(View view) {
	        Intent intent = new Intent(this, War3v7.class);
	        startActivity(intent);
	        this.finish();
	    }
}
