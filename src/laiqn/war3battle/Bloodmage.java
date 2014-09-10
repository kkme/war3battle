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

public class Bloodmage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_bloodmage);

		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewbloodmage);
		 img.setBackgroundResource(R.drawable.bloodmage);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 //AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

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
        Intent intent = new Intent(this, Paladin.class);
        startActivity(intent);
        this.finish();
    }
	public void click(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
		Intent intent = new Intent(this, Human.class);
        startActivity(intent);
        this.finish();
	}
    
    public void uplevelbloodmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjbloodmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjbloodmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjbloodmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllbloodmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjbloodmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlbloodmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblbloodmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmabloodmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","36-42","39-45","42-48","45-51","48-54"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","19","22","25","28","31","34","37","40","43","46"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
    	String[] f={"0","285","330","375","420","465","510","555","600","645","690"};
    	
    	
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
    
    public void downlevelbloodmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjbloodmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjbloodmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjbloodmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllbloodmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjbloodmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlbloodmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblbloodmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmabloodmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","36-42","39-45","42-48","45-51","48-54"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","19","22","25","28","31","34","37","40","43","46"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
    	String[] f={"0","285","330","375","420","465","510","555","600","645","690"};
    	
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
    public void jn1bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      在施法区域可造成数百伤害的区域性魔法。给位于施法中心的敌人造成最大的伤害。与大法师的暴雪不同，烈焰之击是不可打断的。在最高级，烈焰之击可以在瞬间消灭暗夜弓箭手之类的单位，为了平衡这个技能，暴雪为这个技能设计了施法准备期。每级都有2秒的延迟以便让人有时间逃离中心区域。不对空中单位起作用，只对地面部队起作用。如果多于5个的目标被击中，那么攻击的伤害值会在那些单位中平均地分配下来。持续时间6s，使用间隔10s，魔法消耗135，距离80，作用范围20(快捷键F)");
    	textViewjn2.setText("      等级1——前3秒，45伤害/秒微小伤害持续6秒");
    	textViewjn3.setText("      等级2——前3秒，80伤害/秒轻微伤害持续6秒");
    	textViewjn4.setText("      等级3——前3秒，110伤害/秒中等伤害持续6秒");
    }
    public void jn2bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      将一个单位变为气态，移动速度减半。他既不能物理攻击也不能被物理攻击，可以保护这个单位或使其变的无用。对机械单位无效。不能作用自身？。魔法对放逐的单位额外增加66%的伤害，魔法消耗75，距离80(快捷键B)。");
    	textViewjn2.setText("      等级1——持续时间12(英雄4)，变为气态移动速度减半");
    	textViewjn3.setText("      等级2——持续时间15(英雄5)，变为气态移动速度减半");
    	textViewjn4.setText("      等级3——持续时间18(英雄6)，变为气态移动速度减半");
    }
    public void jn3bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      可以吸取敌方有魔法单位的魔法，变成自己的魔法。当被吸吮单位逃出作用范围，魔法作用自动消失，持续时间6s，使用间隔6s，魔法消耗10，距离60-80(快捷键N)。");
    	textViewjn2.setText("      等级1——18魔/秒");
    	textViewjn3.setText("      等级2——35魔/秒");
    	textViewjn4.setText("      等级3——55魔/秒");
    }
    public void jn4bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      召唤出一只会飞的，有大量生命值并能造成大量伤害的火凤凰。这种凤凰一次只能召唤一只，即使其在战斗中不被对方干掉，也会在几分钟的施法有效期后涅磐成一个蛋，10秒以后蛋如果没被消灭，将重新变成一只满血的凤凰。");
    	textViewjn2.setText("      使用间隔180s");
    	textViewjn3.setText("      魔法消耗175");
    	textViewjn4.setText("      召唤出一个凤凰");
    }
}
