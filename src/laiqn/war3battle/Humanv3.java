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
			displayToast("��ϲ���������TR֮3ũ��TR��");
		}
		if(random % 8 ==1){
			displayToast("��ϲ���������TR֮һ����TR��");
		}
		if(random % 8 ==2){
			displayToast("��ϲ���������TR֮��ҹ���ܲ���TR��");
		}
		if(random % 8 ==3){
			displayToast("��ϲ���������Tod��3��С�ڣ�");
		}
		if(random % 8 ==4){
			displayToast("��ϲ���������3��ʨ��+С�ڣ�");
		}
		if(random % 8 ==5){
			displayToast("��ϲ���������WS����");
		}
		if(random % 8 ==6){
			displayToast("��ϲ�����������������(͵����͵С�ڡ�TK��)��");
		}
		if(random % 8 ==7){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}

	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
