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

public class Goblintinker extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_goblintinker);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewgoblintinker);
		 img.setBackgroundResource(R.drawable.goblintinker);

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

    
    public void uplevelgoblintinker(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjgoblintinker);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjgoblintinker);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjgoblintinker);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllgoblintinker);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjgoblintinker);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlgoblintinker);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblgoblintinker);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmagoblintinker);
    	
    	String[] g={"0","22-28","24-30","27-33","29-35","32-38","35-41","37-43","40-46","42-48","45-51"};
    	String[] a={"0","5","5","5","5","6","6","6","7","7","7"};
    	String[] b={"0","20","22","24","27","29","32","34","36","39","41"};
    	String[] c={"0","15","16","17","18","19","20","21","22","23","24"};
    	String[] d={"0","20","22","25","27","30","33","35","38","40","43"};
    	String[] e={"0","600","650","700","775","825","900","950","1000","1075","1225"};
    	String[] f={"0","300","330","375","405","450","495","525","570","600","645"};
    	
    	
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
    
    public void downlevelgoblintinker(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjgoblintinker);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjgoblintinker);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjgoblintinker);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllgoblintinker);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjgoblintinker);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlgoblintinker);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblgoblintinker);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmagoblintinker);
    	
    	String[] g={"0","22-28","24-30","27-33","29-35","32-38","35-41","37-43","40-46","42-48","45-51"};
    	String[] a={"0","5","5","5","5","6","6","6","7","7","7"};
    	String[] b={"0","20","22","24","27","29","32","34","36","39","41"};
    	String[] c={"0","15","16","17","18","19","20","21","22","23","24"};
    	String[] d={"0","20","22","25","27","30","33","35","38","40","43"};
    	String[] e={"0","600","650","700","775","825","900","950","1000","1075","1225"};
    	String[] f={"0","300","330","375","405","450","495","525","570","600","645"};
    	
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
    public void jn1goblintinker(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblintinker);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblintinker);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblintinker);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblintinker);

    	textViewjn1.setText("      产生一个会自动产生炸弹人的口袋工厂。炸弹人会在死亡的时候爆炸，对周围单位造成伤害。持续时间45s，使用间隔35s，魔法消耗125，距离50");
    	textViewjn2.setText("      等级1——造成30点伤害");
    	textViewjn3.setText("      等级2——造成60点伤害");
    	textViewjn4.setText("      等级3——造成80点伤害");
    }
    public void jn2goblintinker(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblintinker);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblintinker);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblintinker);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblintinker);

    	textViewjn1.setText("      用火箭对一个范围进行轰炸，对区域内的敌人造成1秒眩晕和伤害。持续时间1s，使用间隔6s，魔法消耗70，距离80");
    	textViewjn2.setText("      等级1——作用范围23，造成30点伤害");
    	textViewjn3.setText("      等级2——作用范围26，造成65点伤害");
    	textViewjn4.setText("      等级3——作用范围29，造成100点伤害");
    }
    public void jn3goblintinker(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblintinker);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblintinker);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblintinker);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblintinker);

    	textViewjn1.setText("      增加地精修补匠其他技能的等级学习。");
    	textViewjn2.setText("      等级1——+2伤害，10%的移动速度");
    	textViewjn3.setText("      等级2——+4伤害，20%的移动速度");
    	textViewjn4.setText("      等级3——+6伤害，30%的移动速度");
    }
    public void jn4goblintinker(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblintinker);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblintinker);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblintinker);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblintinker);

    	textViewjn1.setText("      变化成为机械地精，有一种特殊的甲及下列作用形式。");
    	textViewjn2.setText("      使用间隔1s、魔法消耗26");
    	textViewjn3.setText("      持续时间无限");
    	textViewjn4.setText("      变化成为机械地精");
    }
}
