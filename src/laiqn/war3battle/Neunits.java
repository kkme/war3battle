package laiqn.war3battle;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class Neunits extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_neunits);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        
	        this.finish();
	}
		return false;
	}
	public void wisp(View view) {
		Intent intent = new Intent(this, WispActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void archer(View view) {
		Intent intent = new Intent(this, ArcherActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void huntress(View view) {
		Intent intent = new Intent(this, HuntressActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	
	public void glaivethrower(View view) {
		Intent intent = new Intent(this, GlaivethrowerActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void dryad(View view) {
		Intent intent = new Intent(this, DryadActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void ancientofwar(View view) {
		Intent intent = new Intent(this, Ancientofwar.class);
	    startActivity(intent);
	    this.finish();
	}
	public void treeoflife(View view) {
		Intent intent = new Intent(this, Treeoflife.class);
	    startActivity(intent);
	    this.finish();
	}
	public void moonwell(View view) {
		Intent intent = new Intent(this, Moonwell.class);
	    startActivity(intent);
	    this.finish();
	}
	public void altarofelders(View view) {
		Intent intent = new Intent(this, Altarofelders.class);
	    startActivity(intent);
	    this.finish();
	}

	public void huntershall(View view) {
		Intent intent = new Intent(this, Huntershall.class);
	    startActivity(intent);
	    this.finish();
	}
	public void ancientprotector(View view) {
		Intent intent = new Intent(this, Ancientprotector.class);
	    startActivity(intent);
	    this.finish();
	}
	public void treeofages(View view) {
		Intent intent = new Intent(this, Treeofages.class);
	    startActivity(intent);
	    this.finish();
	}
	public void ancientofwind(View view) {
		Intent intent = new Intent(this, Ancientofwind.class);
	    startActivity(intent);
	    this.finish();
	}
	public void ancientoflore(View view) {
		Intent intent = new Intent(this, Ancientoflore.class);
	    startActivity(intent);
	    this.finish();
	}
	public void treeofeternity(View view) {
		Intent intent = new Intent(this, Treeofeternity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void chimaeraroost(View view) {
		Intent intent = new Intent(this, Chimaeraroost.class);
	    startActivity(intent);
	    this.finish();
	}
	public void docdruidform(View view) {
		Intent intent = new Intent(this, DocdruidformActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void mountaingiant(View view) {
		Intent intent = new Intent(this, MountaingiantActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void druidtalon(View view) {
		Intent intent = new Intent(this, DruidtalonActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void faeriedragon(View view) {
		Intent intent = new Intent(this, FaeriedragonActivity.class);
	    startActivity(intent);
	    this.finish();
	}

	public void chimaera(View view) {
		Intent intent = new Intent(this, ChimaeraActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void hippogryph(View view) {
		Intent intent = new Intent(this, HippogryphActivity.class);
	    startActivity(intent);
	    this.finish();
	}
	public void demonhunter(View view) {
		Intent intent = new Intent(this, Demonhunter.class);
	    startActivity(intent);
	    this.finish();
	}
	public void keepergrove(View view) {
		Intent intent = new Intent(this, Keeper.class);
	    startActivity(intent);
	    this.finish();
	}
	public void priestess(View view) {
		Intent intent = new Intent(this, Priestess.class);
	    startActivity(intent);
	    this.finish();
	}
	public void warden(View view) {
		Intent intent = new Intent(this, Warden.class);
	    startActivity(intent);
	    this.finish();
	}
}
