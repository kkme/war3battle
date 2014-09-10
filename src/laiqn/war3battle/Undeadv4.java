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

public class Undeadv4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_undeadv4);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebtn);


		
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Undead.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
    public void backv4(View view) {
        Intent intent = new Intent(this, Undead.class);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        startActivity(intent);
        this.finish();
    }
	public void clickv4(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 11 ==0){
			displayToast("恭喜你随机到：常规ZZ流！");
		}
		if(random % 11 ==1){
			displayToast("恭喜你随机到：科技ZZ流！");
		}
		if(random % 11 ==2){
			displayToast("恭喜你随机到：狗流开局！");
		}
		if(random % 11 ==3){
			displayToast("恭喜你随机到：拼LICH天鬼！");
		}
		if(random % 11 ==4){
			displayToast("恭喜你随机到：速冰龙！");
		}
		if(random % 11 ==5){
			displayToast("恭喜你随机到：骷髅海！");
		}
		if(random % 11 ==6){
			displayToast("恭喜你随机到：2本RUSH！");
		}
		if(random % 11 ==7){
			displayToast("恭喜你随机到：小强RUSH！");
		}
		if(random % 11 ==8){
			displayToast("恭喜你随机到：混合部队！");
		}
		if(random % 11 ==9){
			displayToast("恭喜你随机到：其他大招(野墓地开矿、DL双BC爆狗开矿、空投投石车、DL蜂群屠农)！");
		}
		if(random % 11 ==10){
			displayToast("你人品太差了，什么战术都没有随机到！");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
