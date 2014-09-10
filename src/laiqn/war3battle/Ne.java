package laiqn.war3battle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

import android.view.View;

public class Ne extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ne);
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
    public void nev1(View view) {
        Intent intent = new Intent(this, Neintro.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void nehero(View view) {
        Intent intent = new Intent(this, Nehero.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }

    public void nebattle(View view) {
        Intent intent = new Intent(this, Nebattle.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void neunits(View view) {
        Intent intent = new Intent(this, Neunits.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
}
/*
		<TextView android:textColor="#000"  
            android:layout_width="wrap_content"  
            android:layout_height="wrap_content"  
            android:textStyle="bold"  
            android:typeface="serif"  
            android:textSize="18sp"  
            android:text=""  
            android:layout_marginTop="10dp"
            android:layout_marginBottom="10dp"
            android:gravity="left"  
           ></TextView>
		<TextView android:textColor="#000"  
			android:layout_width="wrap_content"  
			android:layout_height="wrap_content"    
			android:text="        "  
			android:gravity="left"  
		></TextView>  
*/