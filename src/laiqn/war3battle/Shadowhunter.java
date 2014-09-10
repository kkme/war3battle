package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Shadowhunter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shadowhunter);
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
public void uplevelshadowhunter(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjshadowhunter);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjshadowhunter);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjshadowhunter);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllshadowhunter);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjshadowhunter);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlshadowhunter);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblshadowhunter);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmashadowhunter);
    	
    	String[] g={"0","22-28","23-29","25-31","26-32","28-34","29-35","31-37","32-38","34-40","35-41"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","20","21","23","24","26","27","29","30","32","33"};
    	String[] d={"0","17","19","22","24","27","29","32","34","37","39"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","255","285","330","360","405","435","480","510","555","585"};
    	
    	
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
    
    public void downlevelshadowhunter(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjshadowhunter);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjshadowhunter);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjshadowhunter);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllshadowhunter);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjshadowhunter);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlshadowhunter);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblshadowhunter);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmashadowhunter);
    	
    	String[] g={"0","22-28","23-29","25-31","26-32","28-34","29-35","31-37","32-38","34-40","35-41"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","20","21","23","24","26","27","29","30","32","33"};
    	String[] d={"0","17","19","22","24","27","29","32","34","37","39"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","255","285","330","360","405","435","480","510","555","585"};
    	
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
    public void jn1shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      与连锁闪电相反，以连锁闪电的方式为单位疗伤，每次跳跃治疗效果都会变弱，使用间隔9s，魔法消耗90，距离70，作用范围50(快捷键E)。");
    	textViewjn2.setText("      等级1——加130血，跳跃3次");
    	textViewjn3.setText("      等级2——加215血，跳跃4次");
    	textViewjn4.setText("      等级3——加300血，跳跃5次");
    }
    public void jn2shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      就象变羊的野生生物版本，施魔目前只有很少的魔法消耗和施法间隔。被施法单位的生命值和装甲值不变，但要根据影子猎手的等级保持野生生物状态15到30秒。施魔可将对方转化为一个随机的小动物。此法术不对召唤单位起作用，被变以后的单位移动速度为100。可被对应魔法驱散效果，使用间隔7s，魔法消耗70，距离80(快捷键B)。");
    	textViewjn2.setText("      等级1——持续时间15(英雄4)s，把单位变成一个随机的小动物");
    	textViewjn3.setText("      等级2——持续时间30(英雄5)s，把单位变成一个随机的小动物");
    	textViewjn4.setText("      等级3——持续时间45(英雄6)s，把单位变成一个随机的小动物");
    }
    public void jn3shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      眼镜蛇守卫，这个就类似于低成本的箭塔！他们射出火球造成可观的伤害，但只有100点生命值，他们很容易被敌人的物理攻击干掉（尽管他们魔法免疫）。如果影子猎手在己方后方设置一些眼镜蛇守卫的话，他们将为兽人提供另人生畏的远程火力支持。可对空对地，抗魔法，生命依次为75/100/135，持续时间40s，使用间隔6.5s，魔法消耗30(快捷键W)。");
    	textViewjn2.setText("      等级1——出手距离50，11-13伤害");
    	textViewjn3.setText("      等级2——出手距离80，23-26伤害");
    	textViewjn4.setText("      等级3——出手距离80，41-45伤害");
    }
    public void jn4shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      这是一个极端强大的魔法，并且是持续性的。施展时，施法者被强迫原地不动。巫毒使整个屏幕内的所有自己和盟友的单位无敌。对友方进攻单位来说，这是一个好消息，但对影子猎手来说，这可是一个坏消息。由于无敌的单位不会成为敌人的目标，影子猎手就伦为整个屏幕上敌人可以攻击的唯一目标！在这个魔法失效前利用无敌的部队保护影子猎手将是非常重要的。能持续30秒！此魔法可被打断，对友军有效");
    	textViewjn2.setText("      持续时间30s，使用间隔180s");
    	textViewjn3.setText("      魔法消耗200，作用范围80");
    	textViewjn4.setText("      英雄附近全部无敌");
    }

}
