package laiqn.war3battle;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Humanv1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_humanv1);

	
}
	

	public void clickv1(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
		mediaPlayer2.start(); 
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*100);
		if(random % 3 ==0){
			displayToast("��ϲ�������������ս����");
		}
		if(random % 3 ==1){
			displayToast("��ϲ���������AM��ѩ(TK��BMG)ɧ����3��ʨ�գ�");
		}
		if(random % 3 ==2){
			displayToast("����Ʒ̫���ˣ�ʲôս����û���������");
		}
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
    public void backv1(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Human.class);
        startActivity(intent);
        this.finish();
    }
    
    
    
	private void displayToast(String s){
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	
	}

}
