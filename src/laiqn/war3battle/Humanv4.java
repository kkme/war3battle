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
			displayToast("��ϲ�������������ս��֮74+�ɻ���");
		}
		if(random % 10 ==9){
			displayToast("��ϲ�������������ս��֮74+49+��ӥ��");
		}
		if(random % 10 ==1){
			displayToast("��ϲ�������������ս��ʨ��+��ӥ��");
		}
		if(random % 10 ==2){
			displayToast("��ϲ���������2����ǹ+��ʦ�������ϣ�");
		}
		if(random % 10 ==3){
			displayToast("��ϲ���������RUSH�򷨣�");
		}
		if(random % 10 ==4){
			displayToast("��ϲ�������������ǹ��");
		}
		if(random % 10 ==5){
			displayToast("��ϲ�������������ս��֮TK����");
		}
		if(random % 10 ==6){
			displayToast("��ϲ�������������ս��֮BMG��");
		}
		if(random % 10 ==7){
			displayToast("��ϲ�������������ս��֮�ɻ�̹�ˣ�");
		}
		if(random % 10 ==8){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
