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
			displayToast("��ϲ�������������ZZ����");
		}
		if(random % 13 ==1){
			displayToast("��ϲ����������������֣�");
		}
		if(random % 13 ==2){
			displayToast("��ϲ���������1��LICH����ZZ TR��");
		}
		if(random % 13 ==3){
			displayToast("��ϲ���������2��ZZ+С��TR��");
		}
		if(random % 13 ==4){
			displayToast("��ϲ���������2������ZZѹ�ƣ�");
		}
		if(random % 13 ==5){
			displayToast("��ϲ���������3����������");
		}
		if(random % 13 ==6){
			displayToast("��ϲ�����������ZZ��ORC������");
		}
		if(random % 13 ==7){
			displayToast("��ϲ���������Ů��ռ������");
		}
		if(random % 13 ==8){
			displayToast("��ϲ���������3����ϲ��ӣ�");
		}
		if(random % 13 ==9){
			displayToast("��ϲ���������FL˫BC������");
		}
		if(random % 13 ==10){
			displayToast("��ϲ�������������Ϸ�����");
		}
		if(random % 13 ==11){
			displayToast("��ϲ���������3���ʱ�����");
		}
		if(random % 13 ==12){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
