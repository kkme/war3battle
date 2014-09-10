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

public class Darkranger extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_darkranger);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewdarkranger);
		 img.setBackgroundResource(R.drawable.darkranger);

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

    
    public void upleveldarkranger(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdarkranger);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdarkranger);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdarkranger);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldarkranger);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdarkranger);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldarkranger);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldarkranger);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmadarkranger);
    	
    	String[] g={"0","23-33","24-34","26-36","27-37","29-39","30-40","32-42","33-43","35-45","36-46"};
    	String[] a={"0","4","4","5","5","6","6","6","7","7","8"};
    	String[] b={"0","18","19","21","23","25","27","29","31","33","34"};
    	String[] c={"0","21","22","24","25","27","28","30","31","33","34"};
    	String[] d={"0","15","17","20","22","25","28","30","33","35","38"};
    	String[] e={"0","550","575","625","675","725","775","825","875","925","975"};
    	String[] f={"0","225","255","300","330","375","420","450","495","525","570"};
    	
    	
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
    
    public void downleveldarkranger(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdarkranger);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdarkranger);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdarkranger);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldarkranger);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdarkranger);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldarkranger);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldarkranger);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmadarkranger);
    	
    	String[] g={"0","23-33","24-34","26-36","27-37","29-39","30-40","32-42","33-43","35-45","36-46"};
    	String[] a={"0","4","4","5","5","6","6","6","7","7","8"};
    	String[] b={"0","18","19","21","23","25","27","29","31","33","34"};
    	String[] c={"0","21","22","24","25","27","28","30","31","33","34"};
    	String[] d={"0","15","17","20","22","25","28","30","33","35","38"};
    	String[] e={"0","550","575","625","675","725","775","825","875","925","975"};
    	String[] f={"0","225","255","300","330","375","420","450","495","525","570"};
    	
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
    public void jn1darkranger(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1darkranger);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2darkranger);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3darkranger);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4darkranger);

    	textViewjn1.setText("      停止敌人在一个目标区域内施展魔法。区域的范围和持续时间随着等级的提高而提高。使用间隔15s，魔法消耗75，距离90");
    	textViewjn2.setText("      等级1——持续时间16（8）s，作用范围20，阻止施展魔法");
    	textViewjn3.setText("      等级2——持续时间20（10）s，作用范围27.5，阻止施展魔法");
    	textViewjn4.setText("      等级3——持续时间24（12）s，作用范围35，阻止施展魔法");
    }
    public void jn2darkranger(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1darkranger);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2darkranger);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3darkranger);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4darkranger);

    	textViewjn1.setText("      额外的伤害攻击。被黑暗之箭杀死后尸体将转化为一个由施法者控制的骷髅战士。魔法消耗6，距离60");
    	textViewjn2.setText("      等级1——2点的额外伤害，200HP的骷髅战士");
    	textViewjn3.setText("      等级2——10点的额外伤害，260HP的骷髅战士");
    	textViewjn4.setText("      等级3——20点的额外伤害，320HP的骷髅战士");
    }
    public void jn3darkranger(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1darkranger);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2darkranger);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3darkranger);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4darkranger);

    	textViewjn1.setText("      黑暗游侠内从目标上吸取一定的生命值，持续一定时间或被影响的单位离开有效范围。持续时间8s，使用间隔8s，魔法消耗75，距离80");
    	textViewjn2.setText("      等级1——每秒汲取20HP");
    	textViewjn3.setText("      等级2——每秒汲取35HP");
    	textViewjn4.setText("      等级3——每秒汲取50HP");
    }
    public void jn4darkranger(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1darkranger);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2darkranger);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3darkranger);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4darkranger);

    	textViewjn1.setText("      控制一个敌人单位。但不能用于英雄或者超过等级5的中立单位 。");
    	textViewjn2.setText("      使用间隔45s、魔法消耗150");
    	textViewjn3.setText("      距离70");
    	textViewjn4.setText("      控制一个敌人的单位");
    }
}
