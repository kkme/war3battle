package laiqn.war3battle;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Human extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_human);
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
    public void humanv1(View view) {
        Intent intent = new Intent(this, Humanintro.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }

    public void humanhero(View view) {
        Intent intent = new Intent(this, Humanhero.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }
    public void humanbattle(View view) {
        Intent intent = new Intent(this, Humanbattle.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }
    public void humanunits(View view) {
        Intent intent = new Intent(this, Humanunits.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }
    public void humanshort(View view) {
        Intent intent = new Intent(this, Humanshort.class);
        startActivity(intent);
		//MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		//mediaPlayer2.start(); 
        this.finish();
    }
    
}
