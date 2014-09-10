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

public class Undeadv2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_undeadv2);
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
    public void backv2(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Undead.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv2(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 13 ==0){
			displayToast("恭喜你随机到：常规ZZ流！");
		}
		if(random % 13 ==1){
			displayToast("恭喜你随机到：狗流开局！");
		}
		if(random % 13 ==2){
			displayToast("恭喜你随机到：1本LICH冰甲ZZ TR！");
		}
		if(random % 13 ==3){
			displayToast("恭喜你随机到：2本ZZ+小狗TR！");
		}
		if(random % 13 ==4){
			displayToast("恭喜你随机到：2本暴力ZZ压制！");
		}
		if(random % 13 ==5){
			displayToast("恭喜你随机到：3本常规流！");
		}
		if(random % 13 ==6){
			displayToast("恭喜你随机到：狂狗ZZ打ORC毒龙！");
		}
		if(random % 13 ==7){
			displayToast("恭喜你随机到：女妖占据流！");
		}
		if(random % 13 ==8){
			displayToast("恭喜你随机到：3本混合部队！");
		}
		if(random % 13 ==9){
			displayToast("恭喜你随机到：FL双BC爆狗！");
		}
		if(random % 13 ==10){
			displayToast("恭喜你随机到：天鬼拖肥流！");
		}
		if(random % 13 ==11){
			displayToast("恭喜你随机到：3本攀冰龙！");
		}
		if(random % 13 ==12){
			displayToast("你人品太差了，什么战术都没有随机到！");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
