package laiqn.war3battle;

import android.app.Activity;
import android.content.Intent;

import android.graphics.drawable.AnimationDrawable;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Paladin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_paladin);



		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewpaladin);
		 img.setBackgroundResource(R.drawable.paladin);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		// AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 //frameAnimation.start();
		
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Humanunits.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
    public void back(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        Intent intent = new Intent(this, Mountainking.class);
        startActivity(intent);
        this.finish();
    }
	public void click(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
		Intent intent = new Intent(this, Bloodmage.class);
        startActivity(intent);
        this.finish();
	}
    
    public void uplevelpaladin(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpaladin);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpaladin);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpaladin);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpaladin);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpaladin);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpaladin);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpaladin);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapaladin);
    	
    	String[] g={"0","24-34","26-36","29-39","32-42","34-44","37-47","40-50","42-52","45-55","48-58"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","22","24","27","30","32","35","38","40","43","46"};
    	String[] c={"0","13","14","16","17","19","20","22","23","25","26"};
    	String[] d={"0","17","18","20","22","24","26","27","29","31","33"};
    	String[] e={"0","650","700","775","850","900","975","1050","1100","1175","1250"};
    	String[] f={"0","255","270","300","330","360","390","405","435","465","495"};
    	
    	
    	String n = textViewdj.getText().toString().trim();
    	
		int m = Integer.parseInt(n);
		

		
		if(m==1){
			textViewgj.setText("攻击："+g[2]);
			textViewdj.setText("2");
			textViewhj.setText("护甲："+a[2]);
			textViewll.setText("力量："+b[2]);
			textViewmj.setText("敏捷："+c[2]);
			textViewzl.setText("智力："+d[2]);
			textViewbl.setText(e[2]+"/"+e[2]);
			textViewma.setText(f[2]+"/"+f[2]);
		}
		if(m==2){
			textViewgj.setText("攻击："+g[3]);
			textViewdj.setText("3");
			textViewhj.setText("护甲："+a[3]);
			textViewll.setText("力量："+b[3]);
			textViewmj.setText("敏捷："+c[3]);
			textViewzl.setText("智力："+d[3]);
			textViewbl.setText(e[3]+"/"+e[3]);
			textViewma.setText(f[3]+"/"+f[3]);
		}
		if(m==3){
			textViewgj.setText("攻击："+g[4]);
			textViewdj.setText("4");
			textViewhj.setText("护甲："+a[4]);
			textViewll.setText("力量："+b[4]);
			textViewmj.setText("敏捷："+c[4]);
			textViewzl.setText("智力："+d[4]);
			textViewbl.setText(e[4]+"/"+e[4]);
			textViewma.setText(f[4]+"/"+f[4]);
		}
		if(m==4){
			textViewgj.setText("攻击："+g[5]);
			textViewdj.setText("5");
			textViewhj.setText("护甲："+a[5]);
			textViewll.setText("力量："+b[5]);
			textViewmj.setText("敏捷："+c[5]);
			textViewzl.setText("智力："+d[5]);
			textViewbl.setText(e[5]+"/"+e[5]);
			textViewma.setText(f[5]+"/"+f[5]);
		}
		if(m==5){
			textViewgj.setText("攻击："+g[6]);
			textViewdj.setText("6");
			textViewhj.setText("护甲："+a[6]);
			textViewll.setText("力量："+b[6]);
			textViewmj.setText("敏捷："+c[6]);
			textViewzl.setText("智力："+d[6]);
			textViewbl.setText(e[6]+"/"+e[6]);
			textViewma.setText(f[6]+"/"+f[6]);
		}
		if(m==6){
			textViewgj.setText("攻击："+g[7]);
			textViewdj.setText("7");
			textViewhj.setText("护甲："+a[7]);
			textViewll.setText("力量："+b[7]);
			textViewmj.setText("敏捷："+c[7]);
			textViewzl.setText("智力："+d[7]);
			textViewbl.setText(e[7]+"/"+e[7]);
			textViewma.setText(f[7]+"/"+f[7]);
		}
		if(m==7){
			textViewgj.setText("攻击："+g[8]);
			textViewdj.setText("8");
			textViewhj.setText("护甲："+a[8]);
			textViewll.setText("力量："+b[8]);
			textViewmj.setText("敏捷："+c[8]);
			textViewzl.setText("智力："+d[8]);
			textViewbl.setText(e[8]+"/"+e[8]);
			textViewma.setText(f[8]+"/"+f[8]);
		}
		if(m==8){
			textViewgj.setText("攻击："+g[9]);
			textViewdj.setText("9");
			textViewhj.setText("护甲："+a[9]);
			textViewll.setText("力量："+b[9]);
			textViewmj.setText("敏捷："+c[9]);
			textViewzl.setText("智力："+d[9]);
			textViewbl.setText(e[9]+"/"+e[9]);
			textViewma.setText(f[9]+"/"+f[9]);
		}
		if(m==9){
			textViewgj.setText("攻击："+g[10]);
			textViewdj.setText("10");
			textViewhj.setText("护甲："+a[10]);
			textViewll.setText("力量："+b[10]);
			textViewmj.setText("敏捷："+c[10]);
			textViewzl.setText("智力："+d[10]);
			textViewbl.setText(e[10]+"/"+e[10]);
			textViewma.setText(f[10]+"/"+f[10]);
		}
    	
    }
    
    public void downlevelpaladin(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpaladin);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpaladin);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpaladin);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpaladin);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpaladin);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpaladin);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpaladin);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapaladin);
    	
    	String[] g={"0","24-34","26-36","29-39","32-42","34-44","37-47","40-50","42-52","45-55","48-58"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","22","24","27","30","32","35","38","40","43","46"};
    	String[] c={"0","13","14","16","17","19","20","22","23","25","26"};
    	String[] d={"0","17","18","20","22","24","26","27","29","31","33"};
    	String[] e={"0","650","700","775","850","900","975","1050","1100","1175","1250"};
    	String[] f={"0","255","270","300","330","360","390","405","435","465","495"};
    	
    	String n = textViewdj.getText().toString().trim();
    	
		int m = Integer.parseInt(n);
		
		

		if(m==2){
			textViewgj.setText("攻击："+g[1]);
			textViewdj.setText("1");
			textViewhj.setText("护甲："+a[1]);
			textViewll.setText("力量："+b[1]);
			textViewmj.setText("敏捷："+c[1]);
			textViewzl.setText("智力："+d[1]);
			textViewbl.setText(e[1]+"/"+e[1]);
			textViewma.setText(f[1]+"/"+f[1]);
		}		
		if(m==3){
			textViewgj.setText("攻击："+g[2]);
			textViewdj.setText("2");
			textViewhj.setText("护甲："+a[2]);
			textViewll.setText("力量："+b[2]);
			textViewmj.setText("敏捷："+c[2]);
			textViewzl.setText("智力："+d[2]);
			textViewbl.setText(e[2]+"/"+e[2]);
			textViewma.setText(f[2]+"/"+f[2]);
		}
		if(m==4){
			textViewgj.setText("攻击："+g[3]);
			textViewdj.setText("3");
			textViewhj.setText("护甲："+a[3]);
			textViewll.setText("力量："+b[3]);
			textViewmj.setText("敏捷："+c[3]);
			textViewzl.setText("智力："+d[3]);
			textViewbl.setText(e[3]+"/"+e[3]);
			textViewma.setText(f[3]+"/"+f[3]);
		}
		if(m==5){
			textViewgj.setText("攻击："+g[4]);
			textViewdj.setText("4");
			textViewhj.setText("护甲："+a[4]);
			textViewll.setText("力量："+b[4]);
			textViewmj.setText("敏捷："+c[4]);
			textViewzl.setText("智力："+d[4]);
			textViewbl.setText(e[4]+"/"+e[4]);
			textViewma.setText(f[4]+"/"+f[4]);
		}
		if(m==6){
			textViewgj.setText("攻击："+g[5]);
			textViewdj.setText("5");
			textViewhj.setText("护甲："+a[5]);
			textViewll.setText("力量："+b[5]);
			textViewmj.setText("敏捷："+c[5]);
			textViewzl.setText("智力："+d[5]);
			textViewbl.setText(e[5]+"/"+e[5]);
			textViewma.setText(f[5]+"/"+f[5]);
		}
		if(m==7){
			textViewgj.setText("攻击："+g[6]);
			textViewdj.setText("6");
			textViewhj.setText("护甲："+a[6]);
			textViewll.setText("力量："+b[6]);
			textViewmj.setText("敏捷："+c[6]);
			textViewzl.setText("智力："+d[6]);
			textViewbl.setText(e[6]+"/"+e[6]);
			textViewma.setText(f[6]+"/"+f[6]);
		}
		if(m==8){
			textViewgj.setText("攻击："+g[7]);
			textViewdj.setText("7");
			textViewhj.setText("护甲："+a[7]);
			textViewll.setText("力量："+b[7]);
			textViewmj.setText("敏捷："+c[7]);
			textViewzl.setText("智力："+d[7]);
			textViewbl.setText(e[7]+"/"+e[7]);
			textViewma.setText(f[7]+"/"+f[7]);
		}
		if(m==9){
			textViewgj.setText("攻击："+g[8]);
			textViewdj.setText("8");
			textViewhj.setText("护甲："+a[8]);
			textViewll.setText("力量："+b[8]);
			textViewmj.setText("敏捷："+c[8]);
			textViewzl.setText("智力："+d[8]);
			textViewbl.setText(e[8]+"/"+e[8]);
			textViewma.setText(f[8]+"/"+f[8]);
		}
		if(m==10){
			textViewgj.setText("攻击："+g[9]);
			textViewdj.setText("9");
			textViewhj.setText("护甲："+a[9]);
			textViewll.setText("力量："+b[9]);
			textViewmj.setText("敏捷："+c[9]);
			textViewzl.setText("智力："+d[9]);
			textViewbl.setText(e[9]+"/"+e[9]);
			textViewma.setText(f[9]+"/"+f[9]);
		}

    	
    }
    public void jn1paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);

    	textViewjn1.setText("      神圣之光可以治疗我方受伤的单位或者伤害不死族的单位，使用间隔5s，魔法消耗65，距离80(快截键T)。");
    	textViewjn2.setText("      等级1——恢复单位200生命/给不死单位100点伤害");
    	textViewjn3.setText("      等级2——恢复单位400生命/给不死单位200点伤害");
    	textViewjn4.setText("      等级3——恢复单位600生命/给不死单位300点伤害");
    }
    public void jn3paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);

    	textViewjn1.setText("      增加周围友军的护甲值，作用范围90");
    	textViewjn2.setText("      等级1——增加护甲+1.5");
    	textViewjn3.setText("      等级2——增加护甲+3");
    	textViewjn4.setText("      等级3——增加护甲+4.5");
    }
    public void jn2paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);
    	textViewjn1.setText("      圣骑士可以将自己笼罩在一层无法穿透的光明结界中，从而免受任何物理和魔法伤害，魔法消耗25(快捷键D)");
    	textViewjn2.setText("      等级1——持续时间15s，使用间隔35s，效果无敌");
    	textViewjn3.setText("      等级2——持续时间30s，使用间隔50s，效果无敌");
    	textViewjn4.setText("      等级3——持续时间45s，使用间隔60s，效果无敌");
    }
    public void jn4paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);

    	textViewjn1.setText("      让已经死亡的最多6个我方单位重新返回战场.当死亡单位超过6个时，会将在范围内的最强大的6个单位复活 (快捷键R)。");
    	textViewjn2.setText("      使用间隔240s、魔法消耗200");
    	textViewjn3.setText("      距离40、作用范围90、作用目标地面、死亡、友军");
    	textViewjn4.setText("      复活最多６个我方单位");
    }
}
