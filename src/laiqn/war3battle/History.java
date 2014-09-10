package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class History extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history);
	}
    public void history1(View view) {
        Intent intent = new Intent(this, History1.class);
        startActivity(intent);
        this.finish();
    }
    public void history2(View view) {
        Intent intent = new Intent(this, History2.class);
        startActivity(intent);
        this.finish();
    }
    public void history3(View view) {
        Intent intent = new Intent(this, History3.class);
        startActivity(intent);
        this.finish();
    }
    public void history4(View view) {
        Intent intent = new Intent(this, History4.class);
        startActivity(intent);
        this.finish();
    }
    public void history5(View view) {
        Intent intent = new Intent(this, History5.class);
        startActivity(intent);
        this.finish();
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

}
