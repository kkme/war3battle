package laiqn.war3battle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class War3v3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_war3v3);
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
	
	
	   public void item1(View view) {
			
	        Intent intent = new Intent(this, Item1.class);
	        startActivity(intent);
	        this.finish();
	    }
	   public void item2(View view) {
			
	        Intent intent = new Intent(this, Item2.class);
	        startActivity(intent);
	        this.finish();
	    }
	   public void item3(View view) {
			
	        Intent intent = new Intent(this, Item3.class);
	        startActivity(intent);
	        this.finish();
	    }

}
