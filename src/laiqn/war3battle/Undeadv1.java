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

public class Undeadv1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_undeadv1);
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
    public void backv1(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Undead.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv1(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 8 ==0){
			displayToast("恭喜你随机到：2本ZZ+投石车RUSH！");
		}
		if(random % 8 ==1){
			displayToast("恭喜你随机到：2本骷髅海强推！");
		}
		if(random % 8 ==2){
			displayToast("恭喜你随机到：3本毁灭一波！");
		}
		if(random % 8 ==3){
			displayToast("恭喜你随机到：应对常规3本流！");
		}
		if(random % 8 ==4){
			displayToast("恭喜你随机到：应对飞机+49组合！");
		}
		if(random % 8 ==5){
			displayToast("恭喜你随机到：应对坦克WS！");
		}
		if(random % 8 ==6){
			displayToast("恭喜你随机到：应对龙鹰狮鹫！");
		}
		if(random % 8 ==6){
			displayToast("恭喜你随机到：其他大招(双BC爆狗、1本对开矿、DL+狗、直爆冰龙)！");
		}
		if(random % 8 ==7){
			displayToast("你人品太差了，什么战术都没有随机到！");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
