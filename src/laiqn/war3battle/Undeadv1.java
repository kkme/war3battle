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
			displayToast("��ϲ���������2��ZZ+Ͷʯ��RUSH��");
		}
		if(random % 8 ==1){
			displayToast("��ϲ���������2�����ú�ǿ�ƣ�");
		}
		if(random % 8 ==2){
			displayToast("��ϲ���������3������һ����");
		}
		if(random % 8 ==3){
			displayToast("��ϲ���������Ӧ�Գ���3������");
		}
		if(random % 8 ==4){
			displayToast("��ϲ���������Ӧ�Էɻ�+49��ϣ�");
		}
		if(random % 8 ==5){
			displayToast("��ϲ���������Ӧ��̹��WS��");
		}
		if(random % 8 ==6){
			displayToast("��ϲ���������Ӧ����ӥʨ�գ�");
		}
		if(random % 8 ==6){
			displayToast("��ϲ�����������������(˫BC������1���Կ���DL+����ֱ������)��");
		}
		if(random % 8 ==7){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
