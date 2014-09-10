package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Cryptlord extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cryptlord);
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
public void uplevelcryptlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjcryptlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjcryptlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjcryptlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllcryptlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjcryptlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlcryptlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblcryptlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmacryptlord);
    	
    	String[] g={"0","28-34","31-37","34-40","37-43","40-46","44-50","47-53","50-56","53-59","56-62"};
    	String[] a={"0","2","3","3","3","3","4","4","5","5","5"};
    	String[] b={"0","26","29","32","35","38","42","45","48","51","54"};
    	String[] c={"0","14","15","16","17","18","20","21","22","23","24"};
    	String[] d={"0","14","15","17","18","20","22","23","25","26","28"};
    	String[] e={"0","675","750","825","900","975","1075","1150","1225","1300","1375"};
    	String[] f={"0","210","225","255","270","300","330","345","375","390","420"};
    	
    	
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
    
    public void downlevelcryptlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjcryptlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjcryptlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjcryptlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllcryptlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjcryptlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlcryptlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblcryptlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmacryptlord);
    	
    	String[] g={"0","28-34","31-37","34-40","37-43","40-46","44-50","47-53","50-56","53-59","56-62"};
    	String[] a={"0","2","3","3","3","3","4","4","5","5","5"};
    	String[] b={"0","26","29","32","35","38","42","45","48","51","54"};
    	String[] c={"0","14","15","16","17","18","20","21","22","23","24"};
    	String[] d={"0","14","15","17","18","20","22","23","25","26","28"};
    	String[] e={"0","675","750","825","900","975","1075","1150","1225","1300","1375"};
    	String[] f={"0","210","225","255","270","300","330","345","375","390","420"};
    	
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
    public void jn1cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);

    	textViewjn1.setText("      爪子砸向地面，把敌人仍到天上，并将其钉在地穴领主的一只尖利的前肢上，从而造成大量伤害，并使目标眩晕几秒钟，使用间隔9s，魔法消耗100，距离70，作用范围25(快捷键E)。");
    	textViewjn2.setText("      等级1——持续2(英雄1)s，造成50点伤害，2（英雄1秒）的眩晕。");
    	textViewjn3.setText("      等级2——持续3(英雄2)s，造成80点伤害，3（英雄2秒）的眩晕。");
    	textViewjn4.setText("      等级3——持续4(英雄3)s，造成110点伤害，4（英雄3秒）的眩晕。");
    }
    public void jn2cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);

    	textViewjn1.setText("      增加防御，并且将伤害归还与近战的敌人");
    	textViewjn2.setText("      等级1——归还15%的伤害，装甲+3");
    	textViewjn3.setText("      等级2——归还25%的伤害，装甲+5");
    	textViewjn4.setText("      等级3——归还35%的伤害，装甲+7");
    }
    public void jn3cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);
    	textViewjn1.setText("      使地穴领主可以从地面上任意一具尸体上召唤一只甲虫。但在同一时间内只有控制最多5只，使用间隔6s，魔法消耗30，出手距离90(快捷键C)");
    	textViewjn2.setText("      等级1——140点生命，8-9的伤害");
    	textViewjn3.setText("      等级2——275点生命，15-18的伤害");
    	textViewjn4.setText("      等级3——410点生命，22-27的伤害");
    }
    public void jn4cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);

    	textViewjn1.setText("      在地穴领主周围召唤一大片蝗虫，给攻击区域内的敌人造成伤害。当尸体被腐化时将转化为地穴领主的生命值(快捷键L)");
    	textViewjn2.setText("      魔法消耗150，持续时间30s");
    	textViewjn3.setText("      使用间隔180s，作用范围80");
    	textViewjn4.setText("      召唤一大片蝗虫");
    }
}
