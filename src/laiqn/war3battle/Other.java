package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class Other extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
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
	public void wcg(View view) {
        Intent intent = new Intent(this, Name.class);
        startActivity(intent);
        this.finish();
    }
	public void gameaction(View view) {
        Intent intent = new Intent(this, Cheats.class);
        startActivity(intent);
        this.finish();
    }
	public void war3information(View view) {
        Intent intent = new Intent(this, War3information.class);
        startActivity(intent);
        this.finish();
    }
	public void war3v7(View view) {
        Intent intent = new Intent(this, War3v7.class);
        startActivity(intent);
        this.finish();
    }
	public void maps(View view) {
        Intent intent = new Intent(this, Maps.class);
        startActivity(intent);
        this.finish();
    }
}
