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

public class Orcv4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_orcv4);
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
    public void backv4(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Orc.class);
        startActivity(intent);
        this.finish();
    }

	public void clickv4(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 8 ==0){
			displayToast("��ϲ�������������ս����");
		}
		if(random % 8 ==1){
			displayToast("��ϲ���������3����������");
		}
		if(random % 8 ==2){
			displayToast("��ϲ���������TR֮��ҹ���ܲ���TR��");
		}
		if(random % 8 ==3){
			displayToast("��ϲ���������TC+��ͷ��3������ͷ+��ʦ��");
		}
		if(random % 8 ==4){
			displayToast("��ϲ��������������");
		}
		if(random % 8 ==5){
			displayToast("��ϲ�����������Ĺ����");
		}
		if(random % 8 ==6){
			displayToast("��ϲ���������ȼ������");
		}
		if(random % 8 ==7){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}

	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
