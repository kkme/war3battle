package laiqn.war3battle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

import android.view.View;

public class Orc extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orc);
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
    public void orcv1(View view) {
        Intent intent = new Intent(this, Orcintro.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }

    public void orchero(View view) {
        Intent intent = new Intent(this, Orchero.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void orcbattle(View view) {
        Intent intent = new Intent(this, Orcbattle.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void orcunits(View view) {
        Intent intent = new Intent(this, Orcunits.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }

}
