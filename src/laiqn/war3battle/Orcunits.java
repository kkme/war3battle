package laiqn.war3battle;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class Orcunits extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orcunits);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	       
	        this.finish();
	}
		return false;
	}
	public void peon(View view) {
		Intent intent = new Intent(this, PeonActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void grunt(View view) {
		Intent intent = new Intent(this, GruntActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void headhunter(View view) {
		Intent intent = new Intent(this, HeadhunterActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void shaman(View view) {
		Intent intent = new Intent(this, ShamanActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void witchdoctor(View view) {
		Intent intent = new Intent(this, WitchdoctorActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void spiritwalker(View view) {
		Intent intent = new Intent(this, SpiritwalkerActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void spiritlodge(View view) {
		Intent intent = new Intent(this, Spiritlodge.class);
	    startActivity(intent);
	    this.finish();
	}
	public void warmill(View view) {
		Intent intent = new Intent(this, Warmill.class);
	    startActivity(intent);
	    this.finish();
	}
	public void orcburrow(View view) {
		Intent intent = new Intent(this, Orcburrow.class);
	    startActivity(intent);
	    this.finish();
	}
	public void greathall(View view) {
		Intent intent = new Intent(this, Greathall.class);
	    startActivity(intent);
	    this.finish();
	}
	public void barracks(View view) {
		Intent intent = new Intent(this, Barracks.class);
	    startActivity(intent);
	    this.finish();
	}
	public void altarofstorms(View view) {
		Intent intent = new Intent(this, Altarofstorms.class);
	    startActivity(intent);
	    this.finish();
	}
	public void stronghold(View view) {
		Intent intent = new Intent(this, Stronghold.class);
	    startActivity(intent);
	    this.finish();
	}
	public void beastiary(View view) {
		Intent intent = new Intent(this, Beastiary.class);
	    startActivity(intent);
	    this.finish();
	}
	public void fortress(View view) {
		Intent intent = new Intent(this, Fortress.class);
	    startActivity(intent);
	    this.finish();
	}
	public void taurentotem(View view) {
		Intent intent = new Intent(this, Taurentotem.class);
	    startActivity(intent);
	    this.finish();
	}
	public void watchtower(View view) {
		Intent intent = new Intent(this, Watchtower.class);
	    startActivity(intent);
	    this.finish();
	}
	public void raider(View view) {
		Intent intent = new Intent(this, RaiderActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void kodobeast(View view) {
		Intent intent = new Intent(this, KodobeastActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void wyvernrider(View view) {
		Intent intent = new Intent(this, WyvernriderActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void trollbatrider(View view) {
		Intent intent = new Intent(this, TrollbatriderActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void demolisher(View view) {
		Intent intent = new Intent(this, DemolisherActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void tauren(View view) {
		Intent intent = new Intent(this, TaurenActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void blademaster(View view) {
		Intent intent = new Intent(this, Blademaster.class);
	    startActivity(intent);
	    this.finish();
	}
	public void farseer(View view) {
		Intent intent = new Intent(this, Farseer.class);
	    startActivity(intent);
	    this.finish();
	}
	public void shadowhunter(View view) {
		Intent intent = new Intent(this, Shadowhunter.class);
	    startActivity(intent);
	    this.finish();
	}
	public void taurenchieftain(View view) {
		Intent intent = new Intent(this, Chieftain.class);
	    startActivity(intent);
	    this.finish();
	}
}
