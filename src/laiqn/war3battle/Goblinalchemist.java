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

public class Goblinalchemist extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_goblinalchemist);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewgoblinalchemist);
		 img.setBackgroundResource(R.drawable.goblinalchemist);

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

    
    public void uplevelgoblinalchemist(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjgoblinalchemist);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjgoblinalchemist);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjgoblinalchemist);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllgoblinalchemist);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjgoblinalchemist);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlgoblinalchemist);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblgoblinalchemist);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmagoblinalchemist);
    	
    	String[] g={"0","28-55","31-58","34-61","37-64","41-68","44-71","47-74","51-78","54-81","57-84"};
    	String[] a={"0","1","1","2","2","2","3","3","3","3","4"};
    	String[] b={"0","25","28","31","34","38","41","44","48","51","54"};
    	String[] c={"0","10","11","12","13","14","15","16","17","18","19"};
    	String[] d={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] e={"0","725","800","875","950","1050","1125","1200","1300","1375","1450"};
    	String[] f={"0","270","300","330","360","390","420","450","480","510","540"};
    	
    	
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
    
    public void downlevelgoblinalchemist(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjgoblinalchemist);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjgoblinalchemist);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjgoblinalchemist);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllgoblinalchemist);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjgoblinalchemist);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlgoblinalchemist);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblgoblinalchemist);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmagoblinalchemist);
    	
    	String[] g={"0","28-55","31-58","34-61","37-64","41-68","44-71","47-74","51-78","54-81","57-84"};
    	String[] a={"0","1","1","2","2","2","3","3","3","3","4"};
    	String[] b={"0","25","28","31","34","38","41","44","48","51","54"};
    	String[] c={"0","10","11","12","13","14","15","16","17","18","19"};
    	String[] d={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] e={"0","725","800","875","950","1050","1125","1200","1300","1375","1450"};
    	String[] f={"0","270","300","330","360","390","420","450","480","510","540"};
    	
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
    public void jn1goblinalchemist(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblinalchemist);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblinalchemist);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblinalchemist);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblinalchemist);

    	textViewjn1.setText("      喷数波治疗雾，可以治疗一定区域的单位。治疗喷雾也能治疗敌人。魔法消耗75，距离80，作用范围20");
    	textViewjn2.setText("      等级1——三波每波40HP");
    	textViewjn3.setText("      等级2——四波每波55HP");
    	textViewjn4.setText("      等级3——五波每波70HP");
    }
    public void jn3goblinalchemist(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblinalchemist);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblinalchemist);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblinalchemist);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblinalchemist);

    	textViewjn1.setText("      向目标投掷酸性烧瓶，爆炸后对中间的一定区域目标减低装甲，并有对爆炸主要目标有高的持续伤害，附近的目标有较低的持续伤害。持续时间15s，使用间隔12s，魔法消耗75，距离70，作用范围20");
    	textViewjn2.setText("      等级1——每秒5点最大伤害,护甲-3");
    	textViewjn3.setText("      等级2——每秒10点最大伤害,护甲-4");
    	textViewjn4.setText("      等级3——每秒15点最大伤害,护甲-5");
    }
    public void jn2goblinalchemist(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblinalchemist);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblinalchemist);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblinalchemist);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblinalchemist);

    	textViewjn1.setText("      炼金术士使他的食人魔进入狂暴的状态，增加50%的移动速度同时随等级增加攻击频率。魔法消耗25，持续时间15，使用间隔30");
    	textViewjn2.setText("      等级1——增加攻击频率25%");
    	textViewjn3.setText("      等级2——增加攻击频率75%");
    	textViewjn4.setText("      等级3——增加攻击频率100%");
    }
    public void jn4goblinalchemist(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1goblinalchemist);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2goblinalchemist);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3goblinalchemist);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4goblinalchemist);

    	textViewjn1.setText("      立即杀死一个单位把它转换为金子。不能对英雄或五级以上的野外生物使用。");
    	textViewjn2.setText("      使用间隔45s、魔法消耗150");
    	textViewjn3.setText("      距离65");
    	textViewjn4.setText("      立即杀死一个单位把它转换为金子");
    }
}
