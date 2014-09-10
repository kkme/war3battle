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

public class Nagaseawitch extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nagaseawitch);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewnagaseawitch);
		 img.setBackgroundResource(R.drawable.nagaseawitch);

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

    
    public void uplevelnagaseawitch(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjnagaseawitch);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjnagaseawitch);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjnagaseawitch);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllnagaseawitch);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjnagaseawitch);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlnagaseawitch);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblnagaseawitch);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmanagaseawitch);
    	
    	String[] g={"0","24-34","27-37","30-40","33-43","36-46","40-50","42-52","45-55","48-58","51-61"};
    	String[] a={"0","3","3","3","4","4","4","5","5","5","6"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","16","17","18","19","20","21","22","23","24","25"};
    	String[] d={"0","22","25","28","31","34","37","40","43","46","49"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","330","375","420","465","510","555","600","645","690","735"};
    	
    	
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
    
    public void downlevelnagaseawitch(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjnagaseawitch);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjnagaseawitch);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjnagaseawitch);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllnagaseawitch);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjnagaseawitch);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlnagaseawitch);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblnagaseawitch);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmanagaseawitch);
    	
    	String[] g={"0","24-34","27-37","30-40","33-43","36-46","40-50","42-52","45-55","48-58","51-61"};
    	String[] a={"0","3","3","3","4","4","4","5","5","5","6"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","16","17","18","19","20","21","22","23","24","25"};
    	String[] d={"0","22","25","28","31","34","37","40","43","46","49"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","330","375","420","465","510","555","600","645","690","735"};
    	
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
    public void jn1nagaseawitch(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1nagaseawitch);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2nagaseawitch);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3nagaseawitch);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4nagaseawitch);

    	textViewjn1.setText("      召唤一道锥形闪电伤害女海巫面前的多个敌人。最多伤害3个单位。使用间隔11s，魔法消耗110，距离60");
    	textViewjn2.setText("      等级1——每个单位受到85点伤害");
    	textViewjn3.setText("      等级2——每个单位受到160点伤害");
    	textViewjn4.setText("      等级3——每个单位受到250点伤害");
    }
    public void jn2nagaseawitch(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1nagaseawitch);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2nagaseawitch);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3nagaseawitch);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4nagaseawitch);

    	textViewjn1.setText("      增加每次攻击的冰冻效果，以减缓敌单位的攻击和移动速度最多伤害3个。持续时间5（1.5）s魔法消耗10，距离70");
    	textViewjn2.setText("      等级1——+5的额外伤害，使目标的攻击速率和移动速度减慢30%");
    	textViewjn3.setText("      等级2——+10的额外伤害，使目标的攻击速率和移动速度减慢50%");
    	textViewjn4.setText("      等级3——+15的额外伤害，使目标的攻击速率和移动速度减慢70%");
    }
    public void jn3nagaseawitch(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1nagaseawitch);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2nagaseawitch);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3nagaseawitch);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4nagaseawitch);

    	textViewjn1.setText("      创造以娜迦女海巫的魔力值吸收伤害的盾牌。100%的吸收伤害。使用间隔10s，魔法消耗25");
    	textViewjn2.setText("      等级1——每1点魔法吸收1点伤害");
    	textViewjn3.setText("      等级2——每1点魔法吸收1.5点伤害");
    	textViewjn4.setText("      等级3——每1点魔法吸收2点伤害");
    }
    public void jn4nagaseawitch(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1nagaseawitch);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2nagaseawitch);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3nagaseawitch);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4nagaseawitch);

    	textViewjn1.setText("      创造一个可以减慢敌人单位移动速度的龙卷风，把敌人地面单位卷到空中并且伤害敌人的建筑。龙卷风以每秒50点的伤害毁坏在他中心的建筑物，并以每秒7点的伤害毁坏在它周围的建筑。持续40秒。");
    	textViewjn2.setText("      使用间隔120s、魔法消耗200");
    	textViewjn3.setText("      持续时间12（6）s、距离90、作用范围27.5");
    	textViewjn4.setText("      创造一个龙卷风");
    }
}
