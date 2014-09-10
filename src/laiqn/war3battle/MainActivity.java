package laiqn.war3battle;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
	//private static MediaPlayer mediaPlayer;
	private long mExitTime;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*
		if(mediaPlayer != null){
			mediaPlayer.start();
		}
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bg);
		mediaPlayer.start(); 
		mediaPlayer.setLooping(true);// no need to call prepare(); create() does that for you
	    HomeKeyEventBroadCastReceiver receiver = new HomeKeyEventBroadCastReceiver();  
	    registerReceiver(receiver, new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS));  
	    */
	}


	protected void onPause(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			//mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bg);
			//mediaPlayer.start(); 
			//mediaPlayer.setLooping(true);// no need to call prepare(); create() does that for you
	    HomeKeyEventBroadCastReceiver receiver = new HomeKeyEventBroadCastReceiver();  
	    registerReceiver(receiver, new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS));  
	}


	class HomeKeyEventBroadCastReceiver extends BroadcastReceiver {

		static final String SYSTEM_REASON = "reason";
		static final String SYSTEM_HOME_KEY = "homekey";//home key
		static final String SYSTEM_RECENT_APPS = "recentapps";//long home key
		
		@Override
		public void onReceive(Context context, Intent intent) {
			String action = intent.getAction();
			if (action.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {
				String reason = intent.getStringExtra(SYSTEM_REASON);
				if (reason != null) {
					if (reason.equals(SYSTEM_HOME_KEY)) {
	                	//mediaPlayer.release();
	                  //  mediaPlayer = null;
	                        finish();
						
					} else if (reason.equals(SYSTEM_RECENT_APPS)) {
						
					}
				}
			}
		}
	}

    public void human(View view) {
        Intent intent = new Intent(this, Human.class);
        startActivity(intent);
        //mediaPlayer.release();
       // mediaPlayer = null;
        this.finish();
    }
    public void orc(View view) {
        Intent intent = new Intent(this, Orc.class);
        startActivity(intent);
       // mediaPlayer.release();
       // mediaPlayer = null;
        this.finish();
    }
    public void ne(View view) {
        Intent intent = new Intent(this, Ne.class);
        startActivity(intent);
       // mediaPlayer.release();
       // mediaPlayer = null;
        this.finish();
    }
    public void undead(View view) {
        Intent intent = new Intent(this, Undead.class);
        startActivity(intent);
       // mediaPlayer.release();
       // mediaPlayer = null;
        this.finish();
    }
    public void war3(View view) {
        Intent intent = new Intent(this, War3.class);
        startActivity(intent);
        //mediaPlayer.release();
        //mediaPlayer = null;
        this.finish();
    }
    public void races(View view) {
        Intent intent = new Intent(this, Races.class);
        startActivity(intent);
       // mediaPlayer.release();
       // mediaPlayer = null;
        this.finish();
    }
    public void cheats(View view) {
        Intent intent = new Intent(this, Cheats.class);
        startActivity(intent);
        //mediaPlayer.release();
       // mediaPlayer = null;
        this.finish();
    }
    public void app(View view) {
        Intent intent = new Intent(this, Appintro.class);
        startActivity(intent);
        //mediaPlayer.release();
        //mediaPlayer = null;
        this.finish();
    }
    public void history(View view) {
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
        //mediaPlayer.release();
        //mediaPlayer = null;
        this.finish();
    }
    public void name(View view) {
        Intent intent = new Intent(this, Name.class);
        startActivity(intent);
        //mediaPlayer.release();
        //mediaPlayer = null;
        this.finish();
    }
    public void other(View view) {
        Intent intent = new Intent(this, Other.class);
        startActivity(intent);
        //mediaPlayer.release();
       // mediaPlayer = null;
        this.finish();
    }
    

     
	@Override

	public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
                if ((System.currentTimeMillis() - mExitTime) > 2000) {
                        Object mHelperUtils;
                        Toast.makeText(this, "再按一次返回键退出", Toast.LENGTH_SHORT).show();
                        mExitTime = System.currentTimeMillis();
                } else {
                	//mediaPlayer.release();
                  //  mediaPlayer = null;
                        finish();
                }
                return true;
        }

        return super.onKeyDown(keyCode, event);
	}
	


}
