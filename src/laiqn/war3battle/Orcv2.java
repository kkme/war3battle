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

public class Orcv2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_orcv2);
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
    public void backv2(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Orc.class);
        startActivity(intent);
        this.finish();
    }
	public void clickv2(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 6 ==0){
			displayToast("��ϲ�������������ͣ�");
		}
		if(random % 6 ==1){
			displayToast("��ϲ���������2��TR��");
		}
		if(random % 6 ==2){
			displayToast("��ϲ�����������������֮�������");
		}
		if(random % 6 ==3){
			displayToast("��ϲ�����������������֮��Ĺ����");
		}
		if(random % 6 ==4){
			displayToast("��ϲ�����������������֮FS����ͷ͵��TR��");
		}
		if(random % 6 ==5){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
	}
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
