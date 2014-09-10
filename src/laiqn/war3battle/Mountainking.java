package laiqn.war3battle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.KeyEvent;

import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Mountainking extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mountainking);

		
		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewmountainking);
		 img.setBackgroundResource(R.drawable.mountainking);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		// AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		// frameAnimation.start();
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
        Intent intent = new Intent(this, Archmage.class);
        startActivity(intent);
        this.finish();
    }
	public void click(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
		Intent intent = new Intent(this, Paladin.class);
        startActivity(intent);
        this.finish();
	}
    
    public void uplevelmountainking(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjmountainking);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjmountainking);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjmountainking);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllmountainking);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjmountainking);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlmountainking);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblmountainking);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmamountainking);
    	
    	String[] g={"0","26-36","29-39","32-42","35-45","38-48","41-51","44-54","47-57","50-60","53-63"};
    	String[] a={"0","2","3","3","4","4","4","5","5","6","6"};
    	String[] b={"0","24","27","30","33","36","39","42","45","48","51"};
    	String[] c={"0","11","12","14","15","17","18","20","21","23","24"};
    	String[] d={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] e={"0","700","775","850","925","1000","1075","1150","1225","1300","1375"};
    	String[] f={"0","225","240","270","285","315","330","360","375","405","420"};
    	
    	
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
    
    public void downlevelmountainking(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjmountainking);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjmountainking);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjmountainking);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllmountainking);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjmountainking);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlmountainking);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblmountainking);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmamountainking);
    	
    	String[] g={"0","26-36","29-39","32-42","35-45","38-48","41-51","44-54","47-57","50-60","53-63"};
    	String[] a={"0","2","3","3","4","4","4","5","5","6","6"};
    	String[] b={"0","24","27","30","33","36","39","42","45","48","51"};
    	String[] c={"0","11","12","14","15","17","18","20","21","23","24"};
    	String[] d={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] e={"0","700","775","850","925","1000","1075","1150","1225","1300","1375"};
    	String[] f={"0","225","240","270","285","315","330","360","375","405","420"};
    	
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
    public void jn1mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      高山矮人经常练习投掷战锤——作为运动和战斗技能。但只有铁炉城的山丘之王才能如此猛烈地掷出战锤，以至于能够一下击昏他们的敌人。于是风暴之锤就成为了山丘之王最可怕的攻击方式。魔法消耗75，使用间隔9s，距离60(快捷键T)。");
    	textViewjn2.setText("      等级1——100伤害，5s(英雄3)的眩晕");
    	textViewjn3.setText("      等级2——225伤害，5s(英雄3)的眩晕");
    	textViewjn4.setText("      等级3——350伤害，5s(英雄3)的眩晕");
    }
    public void jn2mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      根·落锤在奥特兰克山脉迎战一群入侵的豺狼人时第一次使用了这招。敲击地面,伤害周围的敌人,并减慢他们的攻击和移动速度。持续时间5s(英雄3)，使用间隔6s，魔法消耗90(快捷键C)。");
    	textViewjn2.setText("      等级1——作用范围25，60点伤害，移动速度减慢50%，攻击速度减慢50%");
    	textViewjn3.setText("      等级2——作用范围30，100点伤害，移动速度减慢50%，攻击速度减慢50%");
    	textViewjn4.setText("      等级3——作用范围35，140点伤害，移动速度减慢50%，攻击速度减慢50%");
    }
    public void jn3mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      让山丘之王有一定的机率给攻击目标带来额外25点伤害,并使目标悬晕,这是一项被动技能。");
    	textViewjn2.setText("      等级1——15%的机会，+25的伤害，2秒（英雄1秒）眩晕");
    	textViewjn3.setText("      等级2——25%的机会，+25的伤害，2秒（英雄1秒）眩晕");
    	textViewjn4.setText("      等级3——35%的机会，+25的伤害，2秒（英雄1秒）眩晕");
    }
    public void jn4mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      山丘之王可以将注意力集中在矮人新发现的宝藏的能量上，从而变得高大、强壮，外形也会变成石刻的雕像一般。在这种形态下，他们对魔法免疫并且各项能力都大幅度提高。使用天神下凡将给山丘之王的盔甲+5，生命上限+500点，+20的伤害和魔法免疫(快捷键V)");
    	textViewjn2.setText("      使用间隔180s");
    	textViewjn3.setText("      魔法消耗150");
    	textViewjn4.setText("      持续时间60s");
    }

}
