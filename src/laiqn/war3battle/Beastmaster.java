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

public class Beastmaster extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_beastmaster);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewbeastmaster);
		 img.setBackgroundResource(R.drawable.beastmaster);

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

    
    public void uplevelbeastmaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjbeastmaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjbeastmaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjbeastmaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllbeastmaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjbeastmaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlbeastmaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblbeastmaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmabeastmaster);
    	
    	String[] g={"0","24-34","26-36","29-39","32-42","35-45","38-48","41-51","44-54","47-57","50-60"};
    	String[] a={"0","2","3","3","3","4","4","4","5","5","6"};
    	String[] b={"0","22","24","27","30","33","36","39","42","45","48"};
    	String[] c={"0","14","15","16","17","19","20","21","23","24","25"};
    	String[] d={"0","15","16","18","20","22","24","25","27","29","31"};
    	String[] e={"0","650","700","775","850","925","1000","1075","1150","1225","1300"};
    	String[] f={"0","225","240","270","300","330","360","375","405","435","465"};
    	
    	
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
    
    public void downlevelbeastmaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjbeastmaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjbeastmaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjbeastmaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllbeastmaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjbeastmaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlbeastmaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblbeastmaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmabeastmaster);
    	
    	String[] g={"0","24-34","26-36","29-39","32-42","35-45","38-48","41-51","44-54","47-57","50-60"};
    	String[] a={"0","2","3","3","3","4","4","4","5","5","6"};
    	String[] b={"0","22","24","27","30","33","36","39","42","45","48"};
    	String[] c={"0","14","15","16","17","19","20","21","23","24","25"};
    	String[] d={"0","15","16","18","20","22","24","25","27","29","31"};
    	String[] e={"0","650","700","775","850","925","1000","1075","1150","1225","1300"};
    	String[] f={"0","225","240","270","300","330","360","375","405","435","465"};
    	
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
    public void jn1beastmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1beastmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2beastmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3beastmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4beastmaster);

    	textViewjn1.setText("      召唤一头威力强大的熊来攻击敌人。魔法消耗125");
    	textViewjn2.setText("      等级1——使用间隔45s，召唤一头熊");
    	textViewjn3.setText("      等级2——使用间隔45s，召唤一头带有重击的熊");
    	textViewjn4.setText("      等级3——使用间隔45s，召唤一头带有闪烁和重击的的熊");
    }
    public void jn2beastmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1beastmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2beastmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3beastmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4beastmaster);

    	textViewjn1.setText("      召唤一只愤怒的豪猪攻击敌人。使用间隔25，魔法消耗75");
    	textViewjn2.setText("      等级1——召唤一只豪猪");
    	textViewjn3.setText("      等级2——召唤一只具有嗜血的豪猪");
    	textViewjn4.setText("      等级3——召唤一只具有嗜血和溅射的豪猪");
    }
    public void jn3beastmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1beastmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2beastmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3beastmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4beastmaster);

    	textViewjn1.setText("      召唤一只 骄傲的战鹰侦查敌人。使用间隔70，魔法消耗50");
    	textViewjn2.setText("      等级1——召唤一只战鹰");
    	textViewjn3.setText("      等级2——召唤一只有攻击力的战鹰");
    	textViewjn4.setText("      等级3——召唤一只有攻击力的能隐形的战鹰");
    }
    public void jn4beastmaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1beastmaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2beastmaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3beastmaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4beastmaster);

    	textViewjn1.setText("      驱使一群蜥蜴急速赶至目标区域。每只蜥蜴爆炸后造成60点伤害 。");
    	textViewjn2.setText("      使用间隔180s、魔法消耗150");
    	textViewjn3.setText("      距离30、作用范围100、持续时间30s");
    	textViewjn4.setText("      驱使一群受惊吓的蜥蜴");
    }
}
