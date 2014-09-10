package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class Neuunits extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_neuunits);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        
	        this.finish();
	}
		return false;
	}
	public void firelord(View view) {
		Intent intent = new Intent(this, Firelord.class);
	    startActivity(intent);
	    this.finish();
	}
	public void pitlord(View view) {
		Intent intent = new Intent(this, Pitlord.class);
	    startActivity(intent);
	    this.finish();
	}
	public void nagaseawitch(View view) {
		Intent intent = new Intent(this, Nagaseawitch.class);
	    startActivity(intent);
	    this.finish();
	}
	public void goblinalchemist(View view) {
		Intent intent = new Intent(this, Goblinalchemist.class);
	    startActivity(intent);
	    this.finish();
	}
	public void goblintinker(View view) {
		Intent intent = new Intent(this, Goblintinker.class);
	    startActivity(intent);
	    this.finish();
	}
	public void beastmaster(View view) {
		Intent intent = new Intent(this, Beastmaster.class);
	    startActivity(intent);
	    this.finish();
	}
	public void pandarenbrewmaster(View view) {
		Intent intent = new Intent(this, Pandarenbrewmaster.class);
	    startActivity(intent);
	    this.finish();
	}
	public void darkranger(View view) {
		Intent intent = new Intent(this, Darkranger.class);
	    startActivity(intent);
	    this.finish();
	}
	public void icetroll(View view) {
		Intent intent = new Intent(this, Icetroll.class);
	    startActivity(intent);
	    this.finish();
	}
	public void mudgolem(View view) {
		Intent intent = new Intent(this, Mudgolem.class);
	    startActivity(intent);
	    this.finish();
	}
	public void furbolgshaman(View view) {
		Intent intent = new Intent(this, Furbolgshaman.class);
	    startActivity(intent);
	    this.finish();
	}
	public void bluedragon(View view) {
		Intent intent = new Intent(this, Bluedragon.class);
	    startActivity(intent);
	    this.finish();
	}
	public void thunderlizard(View view) {
		Intent intent = new Intent(this, Thunderlizard.class);
	    startActivity(intent);
	    this.finish();
	}
	public void centaur(View view) {
		Intent intent = new Intent(this, Centaur.class);
	    startActivity(intent);
	    this.finish();
	}
	public void harpy(View view) {
		Intent intent = new Intent(this, Harpy.class);
	    startActivity(intent);
	    this.finish();
	}
	public void foresttrolls(View view) {
		Intent intent = new Intent(this, Foresttrolls.class);
	    startActivity(intent);
	    this.finish();
	}

}
