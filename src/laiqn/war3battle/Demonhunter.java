package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Demonhunter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demonhunter);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Neunits.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
public void upleveldemonhunter(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdemonhunter);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdemonhunter);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdemonhunter);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldemonhunter);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdemonhunter);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldemonhunter);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldemonhunter);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmademonhunter);
    	
    	String[] g={"0","24-46","25-47","27-49","28-50","30-52","31-53","33-55","34-56","36-58","37-59"};
    	String[] a={"0","5","5","6","6","6","7","7","8","8","9"};
    	String[] b={"0","19","21","23","26","28","31","33","35","38","40"};
    	String[] c={"0","22","23","25","26","28","29","31","32","34","35"};
    	String[] d={"0","16","18","20","22","24","26","28","30","32","34"};
    	String[] e={"0","575","625","675","750","800","875","925","975","1050","1100"};
    	String[] f={"0","240","270","300","330","360","390","420","450","480","510"};
    	
    	
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
    
    public void downleveldemonhunter(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdemonhunter);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdemonhunter);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdemonhunter);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldemonhunter);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdemonhunter);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldemonhunter);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldemonhunter);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmademonhunter);
    	
    	String[] g={"0","24-46","25-47","27-49","28-50","30-52","31-53","33-55","34-56","36-58","37-59"};
    	String[] a={"0","5","5","6","6","6","7","7","8","8","9"};
    	String[] b={"0","19","21","23","26","28","31","33","35","38","40"};
    	String[] c={"0","22","23","25","26","28","29","31","32","34","35"};
    	String[] d={"0","16","18","20","22","24","26","28","30","32","34"};
    	String[] e={"0","575","625","675","750","800","875","925","975","1050","1100"};
    	String[] f={"0","240","270","300","330","360","390","420","450","480","510"};
    	
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
    public void jn1demonhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1demonhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2demonhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3demonhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4demonhunter);

    	textViewjn1.setText("      放出一个魔法能量射线，燃烧掉敌人魔法单位的一部分魔法值。同时造成和损失魔法值相等的伤害，魔法消耗50，距离30(快捷键B)。");
    	textViewjn2.setText("      等级1——使用间隔7s，燃烧敌方魔法单位50点魔法值");
    	textViewjn3.setText("      等级2——使用间隔6s，燃烧敌方魔法单位100点魔法值");
    	textViewjn4.setText("      等级3——使用间隔5s，燃烧敌方魔法单位150点魔法值");
    }
    public void jn2demonhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1demonhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2demonhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3demonhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4demonhunter);

    	textViewjn1.setText("      让恶魔猎手包在一团火中，伤害附近的敌方单位。魔法值耗尽时，这个技能自动结束，作用范围16，打开献祭时消耗魔法35点，之后每秒消耗7点魔法(快捷键L)。");
    	textViewjn2.setText("      等级1——每秒10点伤害");
    	textViewjn3.setText("      等级2——每秒15点伤害");
    	textViewjn4.setText("      等级3——每秒20点伤害");
    }
    public void jn3demonhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1demonhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2demonhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3demonhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4demonhunter);

    	textViewjn1.setText("      让恶魔猎手有一定的机率回避敌方攻击。");
    	textViewjn2.setText("      等级1——10%的机率回避敌方攻击");
    	textViewjn3.setText("      等级2——20%的机率回避敌方攻击");
    	textViewjn4.setText("      等级3——30%的机率回避敌方攻击");
    }
    public void jn4demonhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1demonhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2demonhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3demonhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4demonhunter);

    	textViewjn1.setText("      让恶魔猎手变身成为一个强大的恶魔,攻击方式变为远程（60）,并增加500点生命(快捷键T)。");
    	textViewjn2.setText("      使用间隔180s、魔法消耗150");
    	textViewjn3.setText("      持续时间60s");
    	textViewjn4.setText("      增加500点生命,生命恢复速度变为每秒3点");
    }

}
