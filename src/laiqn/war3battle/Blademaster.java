package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Blademaster extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blademaster);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Orcunits.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
	

    public void uplevelblademaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjblademaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjblademaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjblademaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllblademaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjblademaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlblademaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblblademaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmablademaster);
    	
    	String[] g={"0","25-47","26-48","28-50","30-52","32-54","33-55","35-57","37-59","39-61","40-62"};
    	String[] a={"0","5","5","6","6","7","7","8","8","9","9"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","24","25","27","29","31","32","34","36","38","39"};
    	String[] d={"0","16","18","20","22","25","27","29","31","34","36"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
    	String[] f={"0","240","270","300","330","375","405","435","465","510","540"};
    	
    	
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
    
    public void downlevelblademaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjblademaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjblademaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjblademaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllblademaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjblademaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlblademaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblblademaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmablademaster);
    	
    	String[] g={"0","25-47","26-48","28-50","30-52","32-54","33-55","35-57","37-59","39-61","40-62"};
    	String[] a={"0","5","5","6","6","7","7","8","8","9","9"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","24","25","27","29","31","32","34","36","38","39"};
    	String[] d={"0","16","18","20","22","25","27","29","31","34","36"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
    	String[] f={"0","240","270","300","330","375","405","435","465","510","540"};
    	
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
    public void jn1blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      让剑圣隐身，并增加其移动速度．如果在隐身其间剑圣攻击目标的话，会造成额外伤害，同时显形，持续时间20s，使用间隔5s，魔法消耗75(快捷键W)");
    	textViewjn2.setText("      等级1——隐身,增加10%移动速度,攻击时造成50点额外伤害");
    	textViewjn3.setText("      等级2——隐身,增加40%移动速度,攻击时造成85点额外伤害");
    	textViewjn4.setText("      等级3——隐身,增加移动速度到最大,攻击时造成120点额外伤害");
    }
    public void jn2blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      制造出剑圣的幻影来迷惑对手,同时消除自身所有不利魔法效果，持续时间60s，使用间隔3s，魔法消耗125(快捷键R)。");
    	textViewjn2.setText("      等级1——创造出一个幻象");
    	textViewjn3.setText("      等级2——创造出两个幻象");
    	textViewjn4.setText("      等级3——创造出三个幻象");
    }
    public void jn3blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      有15%的机率可以让剑圣在攻击时造成更多的伤害。");
    	textViewjn2.setText("      等级1——造成2倍普通的伤害");
    	textViewjn3.setText("      等级2——造成3倍普通的伤害");
    	textViewjn4.setText("      等级3——造成4倍普通的伤害");
    }
    public void jn4blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      快速的旋转剑刃重创附近的所有敌人地面部队.并让剑圣对魔法免疫,每秒造成110点伤害(快捷键B)。");
    	textViewjn2.setText("      使用间隔180s、魔法消耗250");
    	textViewjn3.setText("      持续时间250");
    	textViewjn4.setText("      每秒造成110点伤害");
    }

}
