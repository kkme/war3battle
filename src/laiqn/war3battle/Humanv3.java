package laiqn.war3battle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Humanv3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_humanv3);	

	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Human.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
    public void backv3(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Human.class);
        startActivity(intent);
        this.finish();
    }

	public void clickv3(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 8 ==0){
			displayToast("恭喜你随机到：TR之3农民TR！");
		}
		if(random % 8 ==1){
			displayToast("恭喜你随机到：TR之一来就TR！");
		}
		if(random % 8 ==2){
			displayToast("恭喜你随机到：TR之入夜顶盾步兵TR！");
		}
		if(random % 8 ==3){
			displayToast("恭喜你随机到：Tod流3法小炮！");
		}
		if(random % 8 ==4){
			displayToast("恭喜你随机到：3本狮鹫+小炮！");
		}
		if(random % 8 ==5){
			displayToast("恭喜你随机到：WS流！");
		}
		if(random % 8 ==6){
			displayToast("恭喜你随机到：其他大招(偷塔、偷小炮、TK流)！");
		}
		if(random % 8 ==7){
			displayToast("你人品太差了，什么战术都没有随机到！");
		}
	}

	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
