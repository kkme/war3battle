package laiqn.war3battle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

import android.view.View;

public class Undead extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_undead);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, MainActivity.class);
	        startActivity(intent);
			//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
			//mediaPlayer2.start(); 
	        this.finish();
	}
		return false;
	}
    public void undeadv1(View view) {
        Intent intent = new Intent(this, Undeadintro.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadhero(View view) {
        Intent intent = new Intent(this, Undeadhero.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadbattle(View view) {
        Intent intent = new Intent(this, Undeadbattle.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadunits(View view) {
        Intent intent = new Intent(this, Undeadunits.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }

}
