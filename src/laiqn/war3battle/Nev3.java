package laiqn.war3battle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Nev3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_nev3);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebtn);


	
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Ne.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
    public void backv3(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Ne.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv3(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 11 ==0){
			displayToast("恭喜你随机到：拼熊！");
		}
		if(random % 11 ==1){
			displayToast("恭喜你随机到：吹风！");
		}
		if(random % 11 ==2){
			displayToast("恭喜你随机到：开矿爆鹿！");
		}
		if(random % 11 ==3){
			displayToast("恭喜你随机到：拼HT！");
		}
		if(random % 11 ==4){
			displayToast("恭喜你随机到：其他战术之大树流！");
		}
		if(random % 11 ==5){
			displayToast("恭喜你随机到：其他战术之精灵龙！");
		}
		if(random % 11 ==6){
			displayToast("恭喜你随机到：其他战术之角鹰骑士流！");
		}
		if(random % 11 ==7){
			displayToast("恭喜你随机到：其他战术之弩车流！");
		}
		if(random % 11 ==8){
			displayToast("恭喜你随机到：其他战术之HT拆家流！");
		}
		if(random % 11 ==9){
			displayToast("恭喜你随机到：其他战术之山岭流！");
		}
		if(random % 11 ==10){
			displayToast("你人品太差了，什么战术都没有随机到！");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}