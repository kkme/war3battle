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

public class Pitlord extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pitlord);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewpitlord);
		 img.setBackgroundResource(R.drawable.pitlord);

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

    
    public void uplevelpitlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpitlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpitlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpitlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpitlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpitlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpitlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpitlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapitlord);
    	
    	String[] g={"0","28-38","31-41","34-44","37-47","40-50","44-54","47-57","50-60","53-63","56-66"};
    	String[] a={"0","2","3","3","3","4","4","4","5","5","5"};
    	String[] b={"0","26","29","32","35","38","42","45","48","51","54"};
    	String[] c={"0","14","15","16","17","19","20","21","23","24","25"};
    	String[] d={"0","14","15","17","18","20","21","23","24","26","27"};
    	String[] e={"0","750","825","900","975","1050","1150","1225","1300","1375","1450"};
    	String[] f={"0","210","225","255","270","300","315","345","360","390","405"};
    	
    	
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
    
    public void downlevelpitlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpitlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpitlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpitlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpitlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpitlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpitlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpitlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapitlord);
    	
    	String[] g={"0","28-38","31-41","34-44","37-47","40-50","44-54","47-57","50-60","53-63","56-66"};
    	String[] a={"0","2","3","3","3","4","4","4","5","5","5"};
    	String[] b={"0","26","29","32","35","38","42","45","48","51","54"};
    	String[] c={"0","14","15","16","17","19","20","21","23","24","25"};
    	String[] d={"0","14","15","17","18","20","21","23","24","26","27"};
    	String[] e={"0","750","825","900","975","1050","1150","1225","1300","1375","1450"};
    	String[] f={"0","210","225","255","270","300","315","345","360","390","405"};
    	
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
    public void jn1pitlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pitlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pitlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pitlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pitlord);

    	textViewjn1.setText("      召唤从天而降的慧眼波浪伤害区域内的单位。每波火焰雨造成基础伤害后并且持续3秒的燃烧。持续时间3s，使用间隔8s，魔法消耗85，距离80，作用范围20");
    	textViewjn2.setText("      等级1——每波25点伤害，6波，5点伤害/秒，最大造成125点伤害");
    	textViewjn3.setText("      等级2——每波30点伤害，6波，10点伤害/秒，最大造成125点伤害");
    	textViewjn4.setText("      等级3——每波35点伤害，6波，15点伤害/秒，最大造成125点伤害");
    }
    public void jn3pitlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pitlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pitlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pitlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pitlord);

    	textViewjn1.setText("      深渊魔王同时对多个敌人单位造成伤害。作用范围20");
    	textViewjn2.setText("      等级1——周围受到30%的伤害");
    	textViewjn3.setText("      等级2——周围受到55%的伤害");
    	textViewjn4.setText("      等级3——周围受到80%的伤害");
    }
    public void jn2pitlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pitlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pitlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pitlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pitlord);

    	textViewjn1.setText("      深渊魔王发出恐怖嚎叫，使周围敌人在恐惧中战栗，丢失当前的魔法效果，减少他们的攻击伤害。持续时间15s，使用间隔12s，魔法消耗75，作用范围50");
    	textViewjn2.setText("      等级1——减少30%的伤害");
    	textViewjn3.setText("      等级2——减少40%的伤害");
    	textViewjn4.setText("      等级3——减少50%的伤害");
    }
    public void jn4pitlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1pitlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2pitlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3pitlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4pitlord);

    	textViewjn1.setText("      使一个目标遭到魔鬼的缠身。被折磨的单位不能释放任何的魔法技能，并会受到一顶伤害而直到他死去。在他死亡时，一个巨大的毁灭守卫会从他的尸体上诞生。魔鬼缠身不能被驱散或取消。");
    	textViewjn2.setText("      使用间隔120s、魔法消耗150");
    	textViewjn3.setText("      距离65");
    	textViewjn4.setText("      创造一个毁灭守卫");
    }
}
