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

public class Orcv1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_orcv1);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebtn);


		
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Orc.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
    public void backv1(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Orc.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv1(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 9 ==0){
			displayToast("恭喜你随机到：防1本TR！");
		}
		if(random % 9 ==1){
			displayToast("恭喜你随机到：防2本TR！");
		}
		if(random % 9 ==2){
			displayToast("恭喜你随机到：对抗人族冰火两重天！");
		}
		if(random % 9 ==3){
			displayToast("恭喜你随机到：打MK49流！");
		}
		if(random % 9 ==4){
			displayToast("恭喜你随机到：双骑流！");
		}
		if(random % 9 ==5){
			displayToast("恭喜你随机到：其他大招之2本KD+SM TR！");
		}
		if(random % 9 ==6){
			displayToast("恭喜你随机到：其他大招之1本无视野偷塔TR！");
		}
		if(random % 9 ==7){
			displayToast("恭喜你随机到：其他大招之暴力狼骑！");
		}
		if(random % 9 ==8){
			displayToast("你人品太差了，什么战术都没有随机到！");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
