package laiqn.war3battle;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Humanunits extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_humanunits);
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        
	        this.finish();
	}
		return false;
	}
	public void peasant(View view) {
		Intent intent = new Intent(this, Peasant.class);
	    startActivity(intent);
	    this.finish();
	}
	public void footman(View view) {
		Intent intent = new Intent(this, Footman.class);
	    startActivity(intent);
	    this.finish();
	}
	public void knight(View view) {
		Intent intent = new Intent(this, Knight.class);
	    startActivity(intent);
	    this.finish();
	}
	public void priest(View view) {
		Intent intent = new Intent(this, Priest.class);
	    startActivity(intent);
	    this.finish();
	}
	public void sorceress(View view) {
		Intent intent = new Intent(this, Sorceress.class);
	    startActivity(intent);
	    this.finish();
	}
	public void spellbreaker(View view) {
		Intent intent = new Intent(this, Spellbreaker.class);
	    startActivity(intent);
	    this.finish();
	}
	public void dragonhawk(View view) {
		Intent intent = new Intent(this, Dragonhawk.class);
	    startActivity(intent);
	    this.finish();
	}
	public void mortarteam(View view) {
		Intent intent = new Intent(this, Mortarteam.class);
	    startActivity(intent);
	    this.finish();
	}
	public void gyrocopter(View view) {
		Intent intent = new Intent(this, Gyrocopter.class);
	    startActivity(intent);
	    this.finish();
	}
	public void siegeengine(View view) {
		Intent intent = new Intent(this, Siegeengine.class);
	    startActivity(intent);
	    this.finish();
	}
	public void gryphonrider(View view) {
		Intent intent = new Intent(this, Gryphonrider.class);
	    startActivity(intent);
	    this.finish();
	}
	public void townhall(View view) {
		Intent intent = new Intent(this, Townhall.class);
	    startActivity(intent);
	    this.finish();
	}
	public void keep(View view) {
		Intent intent = new Intent(this, Keep.class);
	    startActivity(intent);
	    this.finish();
	}
	public void castle(View view) {
		Intent intent = new Intent(this, Castle.class);
	    startActivity(intent);
	    this.finish();
	}
	public void humanbarracks(View view) {
		Intent intent = new Intent(this, Humanbarracks.class);
	    startActivity(intent);
	    this.finish();
	}
	public void farm(View view) {
		Intent intent = new Intent(this, Farm.class);
	    startActivity(intent);
	    this.finish();
	}
	public void altarofkings(View view) {
		Intent intent = new Intent(this, Altarofkings.class);
	    startActivity(intent);
	    this.finish();
	}
	public void humanlumbermill(View view) {
		Intent intent = new Intent(this, Humanlumbermill.class);
	    startActivity(intent);
	    this.finish();
	}
	public void humanwatchtower(View view) {
		Intent intent = new Intent(this, Humanwatchtower.class);
	    startActivity(intent);
	    this.finish();
	}
	public void blacksmith(View view) {
		Intent intent = new Intent(this, Blacksmith.class);
	    startActivity(intent);
	    this.finish();
	}
	public void workshop(View view) {
		Intent intent = new Intent(this, Workshop.class);
	    startActivity(intent);
	    this.finish();
	}
	public void arcanesanctum(View view) {
		Intent intent = new Intent(this, Arcanesanctum.class);
	    startActivity(intent);
	    this.finish();
	}
	public void gryphonaviary(View view) {
		Intent intent = new Intent(this, Gryphonaviary.class);
	    startActivity(intent);
	    this.finish();
	}
	public void rifleman(View view) {
		Intent intent = new Intent(this, Rifleman.class);
	    startActivity(intent);
	    this.finish();
	}
	public void archmage(View view) {
		Intent intent = new Intent(this, Archmage.class);
	    startActivity(intent);
	    this.finish();
	}
	public void mountainking(View view) {
		Intent intent = new Intent(this, Mountainking.class);
	    startActivity(intent);
	    this.finish();
	}
	public void paladin(View view) {
		Intent intent = new Intent(this, Paladin.class);
	    startActivity(intent);
	    this.finish();
	}
	public void bloodmage(View view) {
		Intent intent = new Intent(this, Bloodmage.class);
	    startActivity(intent);
	    this.finish();
	}
	


}
