package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Lich extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lich);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Undeadunits.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
public void uplevellich(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjlich);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjlich);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjlich);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlllich);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjlich);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzllich);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbllich);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmalich);
    	
    	String[] g={"0","22-28","25-31","28-34","32-38","35-41","39-45","42-48","44-51","49-55","52-58"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","20","23","26","30","33","37","40","43","47","50"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","300","345","390","450","495","555","600","645","705","750"};
    	
    	
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
    
    public void downlevellich(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjlich);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjlich);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjlich);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlllich);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjlich);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzllich);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbllich);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmalich);
    	
    	String[] g={"0","22-28","25-31","28-34","32-38","35-41","39-45","42-48","44-51","49-55","52-58"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","20","23","26","30","33","37","40","43","47","50"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","300","345","390","450","495","555","600","645","705","750"};
    	
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
    public void jn1lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      制造一场由目标处引发的寒霜爆炸，对附近的所有敌人造成伤害并且减慢他们的移动速度和工作速率，持续时间4s，使用间隔8s，魔法消耗125，距离80，作用范围20(快捷键N)。");
    	textViewjn2.setText("      等级1——目标受到100点伤害，霜星造成50点伤害");
    	textViewjn3.setText("      等级2——目标受到100点伤害，霜星造成100点伤害");
    	textViewjn4.setText("      等级3——目标受到100点伤害，霜星造成150点伤害");
    }
    public void jn2lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      使目标包围在一层保护性的霜冻护甲中，这层护甲不仅能增加防御还能减慢近身攻击他的敌人，持续时间45s，使用间隔2s，魔法消耗40，距离80(快捷键F)。");
    	textViewjn2.setText("      等级1——甲+3，受到5秒的冰冻");
    	textViewjn3.setText("      等级2——甲+5，受到5秒的冰冻");
    	textViewjn4.setText("      等级3——甲+7，受到5秒的冰冻");
    }
    public void jn3lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      通过黑暗仪式摧毁他的一个单位，从而吸取他的能量来补充自己的黑暗法力，使用间隔15s，魔法消耗25，出手距离80(快捷键R)。");
    	textViewjn2.setText("      等级1——33%的生命转化为魔法");
    	textViewjn3.setText("      等级2——66%的生命转化为魔法");
    	textViewjn4.setText("      等级3——100%的生命转化为魔法");
    }
    public void jn4lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      在一个区域里以每秒4%的基础生命值摧毁一切物体。");
    	textViewjn2.setText("      持续时间35s，使用间隔150s");
    	textViewjn3.setText("      魔法消耗250，作用范围30，距离100");
    	textViewjn4.setText("      每秒目标基础生命4%的伤害");
    }

}
