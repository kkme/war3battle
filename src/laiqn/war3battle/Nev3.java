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

public class Nev3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_nev3);
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
    public void backv3(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Ne.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv3(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 11 ==0){
			displayToast("��ϲ���������ƴ�ܣ�");
		}
		if(random % 11 ==1){
			displayToast("��ϲ������������磡");
		}
		if(random % 11 ==2){
			displayToast("��ϲ�������������¹��");
		}
		if(random % 11 ==3){
			displayToast("��ϲ���������ƴHT��");
		}
		if(random % 11 ==4){
			displayToast("��ϲ�������������ս��֮��������");
		}
		if(random % 11 ==5){
			displayToast("��ϲ�������������ս��֮��������");
		}
		if(random % 11 ==6){
			displayToast("��ϲ�������������ս��֮��ӥ��ʿ����");
		}
		if(random % 11 ==7){
			displayToast("��ϲ�������������ս��֮������");
		}
		if(random % 11 ==8){
			displayToast("��ϲ�������������ս��֮HT�������");
		}
		if(random % 11 ==9){
			displayToast("��ϲ�������������ս��֮ɽ������");
		}
		if(random % 11 ==10){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}