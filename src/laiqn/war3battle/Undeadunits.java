package laiqn.war3battle;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class Undeadunits extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_undeadunits);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        
	        this.finish();
	}
		return false;
	}
	public void acolyte(View view) {
		Intent intent = new Intent(this, AcolyteActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void ghoul(View view) {
		Intent intent = new Intent(this, GhoulActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void cryptfiend(View view) {
		Intent intent = new Intent(this, CryptfiendActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void gargoyle(View view) {
		Intent intent = new Intent(this, GargoyleActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void necromancer(View view) {
		Intent intent = new Intent(this, NecromancerActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void banshee(View view) {
		Intent intent = new Intent(this, BansheeActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void meatwagon(View view) {
		Intent intent = new Intent(this, MeatwagonActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void abomination(View view) {
		Intent intent = new Intent(this, AbominationActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void obsidianstatue(View view) {
		Intent intent = new Intent(this, ObsidianstatueActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void sacrifice(View view) {
		Intent intent = new Intent(this, SacrificeActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void frostwyrm(View view) {
		Intent intent = new Intent(this, FrostwyrmActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void deathknight(View view) {
		Intent intent = new Intent(this, Deathknight.class);
	    startActivity(intent);
	    this.finish();
	}
	public void lich(View view) {
		Intent intent = new Intent(this, Lich.class);
	    startActivity(intent);
	    this.finish();
	}
	public void cryptlord(View view) {
		Intent intent = new Intent(this, Cryptlord.class);
	    startActivity(intent);
	    this.finish();
	}
	public void dreadlord(View view) {
		Intent intent = new Intent(this, Dreadlord.class);
	    startActivity(intent);
	    this.finish();
	}
	public void boneyard(View view) {
		Intent intent = new Intent(this, Boneyard.class);
	    startActivity(intent);
	    this.finish();
	}
	public void sacrificialpit(View view) {
		Intent intent = new Intent(this, Sacrificialpit.class);
	    startActivity(intent);
	    this.finish();
	}
	public void blackcitadel(View view) {
		Intent intent = new Intent(this, Blackcitadel.class);
	    startActivity(intent);
	    this.finish();
	}
	public void slaughterhouse(View view) {
		Intent intent = new Intent(this, Slaughterhouse.class);
	    startActivity(intent);
	    this.finish();
	}
	public void templeofthedamned(View view) {
		Intent intent = new Intent(this, Templeofthedamned.class);
	    startActivity(intent);
	    this.finish();
	}
	public void hallsofthedead(View view) {
		Intent intent = new Intent(this, Hallsofthedead.class);
	    startActivity(intent);
	    this.finish();
	}
	public void crypt(View view) {
		Intent intent = new Intent(this, Crypt.class);
	    startActivity(intent);
	    this.finish();
	}
	public void necropolis(View view) {
		Intent intent = new Intent(this, Necropolis.class);
	    startActivity(intent);
	    this.finish();
	}
	public void graveyard(View view) {
		Intent intent = new Intent(this, Graveyard.class);
	    startActivity(intent);
	    this.finish();
	}
	public void ziggurat(View view) {
		Intent intent = new Intent(this, Ziggurat.class);
	    startActivity(intent);
	    this.finish();
	}
	public void altarofdarkness(View view) {
		Intent intent = new Intent(this, Altarofdarkness.class);
	    startActivity(intent);
	    this.finish();
	}
}
