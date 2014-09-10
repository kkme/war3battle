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

public class Humanv4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_humanv4);




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
    public void backv4(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Human.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv4(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 10 ==0){
			displayToast("恭喜你随机到：常规战术之74+飞机！");
		}
		if(random % 10 ==9){
			displayToast("恭喜你随机到：常规战术之74+49+龙鹰！");
		}
		if(random % 10 ==1){
			displayToast("恭喜你随机到：常规战术狮鹫+龙鹰！");
		}
		if(random % 10 ==2){
			displayToast("恭喜你随机到：2本火枪+法师万金油组合！");
		}
		if(random % 10 ==3){
			displayToast("恭喜你随机到：RUSH打法！");
		}
		if(random % 10 ==4){
			displayToast("恭喜你随机到：纯火枪！");
		}
		if(random % 10 ==5){
			displayToast("恭喜你随机到：其他战术之TK流！");
		}
		if(random % 10 ==6){
			displayToast("恭喜你随机到：其他战术之BMG！");
		}
		if(random % 10 ==7){
			displayToast("恭喜你随机到：其他战术之飞机坦克！");
		}
		if(random % 10 ==8){
			displayToast("你人品太差了，什么战术都没有随机到！");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
