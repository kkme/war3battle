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

public class Archmage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_archmage);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewarchmage);
		 img.setBackgroundResource(R.drawable.archmage);

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
        Intent intent = new Intent(this, Human.class);
        startActivity(intent);
        this.finish();
    }
	public void click(View view) {
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
		Intent intent = new Intent(this, Mountainking.class);
        startActivity(intent);
        this.finish();
	}
    
    public void uplevelarchmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjarchmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjarchmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjarchmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllarchmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjarchmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlarchmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblarchmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmaarchmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","37-43","40-46","43-49","46-52","49-55"};
    	String[] a={"0","3","3","4","4","4","5","5","5","6","6"};
    	String[] b={"0","14","15","17","19","21","23","24","26","28","30"};
    	String[] c={"0","17","19","19","20","21","22","23","24","25","26"};
    	String[] d={"0","19","22","25","28","31","35","38","41","44","47"};
    	String[] e={"0","450","475","525","575","625","675","700","750","800","850"};
    	String[] f={"0","285","330","375","420","465","525","570","615","660","705"};
    	
    	
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
    
    public void downlevelarchmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjarchmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjarchmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjarchmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllarchmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjarchmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlarchmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblarchmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmaarchmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","37-43","40-46","43-49","46-52","49-55"};
    	String[] a={"0","3","3","4","4","4","5","5","5","6","6"};
    	String[] b={"0","14","15","17","19","21","23","24","26","28","30"};
    	String[] c={"0","17","19","19","20","21","22","23","24","25","26"};
    	String[] d={"0","19","22","25","28","31","35","38","41","44","47"};
    	String[] e={"0","450","475","525","575","625","675","700","750","800","850"};
    	String[] f={"0","285","330","375","420","465","525","570","615","660","705"};
    	
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
    public void jn1archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      从天而降寒冷的冰锥，伤害一定范围内的全部敌人。使用间隔6s、魔法消耗75、作用范围20(快捷键B)。");
    	textViewjn2.setText("      等级1——6波冰锥,每波伤害30,最大伤害150");
    	textViewjn3.setText("      等级2——8波冰锥,每波伤害40,最大伤害200");
    	textViewjn4.setText("      等级3——10波冰锥,每波伤害50,最大伤害250");
    }
    public void jn2archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      召唤出一个水元素(Water Elemental)来攻击敌人，持续时间60s、使用间隔20s、魔法消耗125(快捷键W)。");
    	textViewjn2.setText("      等级1——525点生命，攻击18-22");
    	textViewjn3.setText("      等级2——675点生命，攻击31-39");
    	textViewjn4.setText("      等级3——900点生命，攻击41-49");
    }
    public void jn3archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      增加附近友军的魔法恢复速度、作用范围90。");
    	textViewjn2.setText("      等级1——每秒恢复魔法值0.75");
    	textViewjn3.setText("      等级2——每秒恢复魔法值1.5");
    	textViewjn4.setText("      等级3——每秒恢复魔法值2.25");
    }
    public void jn4archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      可以最多移动24个我方单位,包括大法师自己,到一个友军的单位或建筑附近 (快捷键 T)。");
    	textViewjn2.setText("      使用间隔15s、魔法消耗100");
    	textViewjn3.setText("      距离无限、作用范围70、作用目标友军的地面或建筑");
    	textViewjn4.setText("      传送最多24个单位");
    }
}
