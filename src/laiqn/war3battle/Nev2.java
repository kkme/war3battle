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

public class Nev2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_nev2);
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
    public void backv2(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Ne.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv2(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 10 ==0){
			displayToast("��ϲ���������1����orcTR��");
		}
		if(random % 10 ==1){
			displayToast("��ϲ���������2����orcTR��");
		}
		if(random % 10 ==2){
			displayToast("��ϲ�����������3��С����TR��");
		}
		if(random % 10 ==3){
			displayToast("��ϲ�����������������");
		}
		if(random % 10 ==4){
			displayToast("��ϲ�����������¹����");
		}
		if(random % 10 ==5){
			displayToast("��ϲ���������AC���RUSH��");
		}
		if(random % 10 ==6){
			displayToast("��ϲ���������3Զ��");
		}
		if(random % 10 ==7){
			displayToast("��ϲ�������������HT�ҿ�");
		}
		if(random % 10 ==8){
			displayToast("��ϲ���������͵BP2��ǣ�ƣ�");
		}
		if(random % 10 ==9){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
