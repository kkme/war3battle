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

public class Pandarenbrewmaster extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pandarenbrewmaster);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewpandarenbrewmaster);
		 img.setBackgroundResource(R.drawable.pandarenbrewmaster);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		// AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 //frameAnimation.start();
		
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Neuunits.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}

    
    public void uplevelpandarenbrewmaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpandarenbrewmaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpandarenbrewmaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpandarenbrewmaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpandarenbrewmaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpandarenbrewmaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpandarenbrewmaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpandarenbrewmaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapandarenbrewmaster);
    	
    	String[] g={"0","24-34","27-37","30-40","33-43","36-46","39-49","42-52","45-55","48-58","51-61"};
    	String[] a={"0","3","4","4","4","5","5","6","6","7","7"};
    	String[] b={"0","22","25","28","31","34","37","40","43","46","49"};
    	String[] c={"0","14","15","17","18","20","21","23","24","26","27"};
    	String[] d={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] e={"0","650","725","800","875","950","1025","1100","1175","1250","1325"};
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
    
    public void downlevelpandarenbrewmaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpandarenbrewmaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpandarenbrewmaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpandarenbrewmaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpandarenbrewmaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpandarenbrewmaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpandarenbrewmaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpandarenbrewmaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapandarenbrewmaster);
    	
    	String[] g={"0","24-34","27-37","30-40","33-43","36-46","39-49","42-52","45-55","48-58","51-61"};
    	String[] a={"0","3","4","4","4","5","5","6","6","7","7"};
    	String[] b={"0","22","25","28","31","34","37","40","43","46","49"};
    	String[] c={"0","14","15","17","18","20","21","23","24","26","27"};
    	String[] d={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] e={"0","650","725","800","875","950","1025","1100","1175","1250","1325"};
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
    public void jn1pandarenbrewmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pandarenbrewmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pandarenbrewmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pandarenbrewmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pandarenbrewmaster);

    	textViewjn1.setText("      向敌人呼出一道锥形火焰，对其造成一定的伤害。那些身上带有醉酒云雾的单位会自动引燃，并持续受到伤害。持续时间5s，使用间隔10s，魔法消耗75，距离50，作用范围15");
    	textViewjn2.setText("      等级1——65点直接伤害，7点伤害/秒");
    	textViewjn3.setText("      等级2——125点直接伤害，14点伤害/秒");
    	textViewjn4.setText("      等级3——170点直接伤害，21点伤害/秒");
    }
    public void jn2pandarenbrewmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pandarenbrewmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pandarenbrewmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pandarenbrewmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pandarenbrewmaster);

    	textViewjn1.setText("      用酒精浸透目标单位，减慢起移动速度，并使其有一定概率不能击中其他单位。持续时间12（5）s，使用间隔12s，魔法消耗70，距离55，作用范围20");
    	textViewjn2.setText("      等级1——减慢15%的移动速度，45%的概率不能击中其他目标");
    	textViewjn3.setText("      等级2——减慢30%的移动速度，65%的概率不能击中其他目标");
    	textViewjn4.setText("      等级3——减慢50%的移动速度，80%的概率不能击中其他目标");
    }
    public void jn3pandarenbrewmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pandarenbrewmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pandarenbrewmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pandarenbrewmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pandarenbrewmaster);

    	textViewjn1.setText("      使熊猫酒仙有一定的概率来躲避攻击并且有10%的机会放出额外的伤害。");
    	textViewjn2.setText("      等级1——7%的概率躲避，2倍的普通伤害");
    	textViewjn3.setText("      等级2——14%的概率躲避，3倍的普通伤害");
    	textViewjn4.setText("      等级3——21%的概率躲避，4倍的普通伤害");
    }
    public void jn4pandarenbrewmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pandarenbrewmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pandarenbrewmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pandarenbrewmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pandarenbrewmaster);

    	textViewjn1.setText("      熊猫分身成地、风、火属性的熊猫元素，只要他们其中的1个能在召唤的时间内不死，那么熊猫就会再生。");
    	textViewjn2.setText("      使用间隔180s、魔法消耗150");
    	textViewjn3.setText("      持续时间60");
    	textViewjn4.setText("      召唤地、风、火属性的熊猫元素");
    }
}
