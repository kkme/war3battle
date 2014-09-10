package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Keeper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_keeper);
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
public void uplevelkeeper(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjkeeper);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjkeeper);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjkeeper);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllkeeper);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjkeeper);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlkeeper);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblkeeper);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmakeeper);
    	
    	String[] g={"0","20-26","22-28","25-31","28-34","30-36","33-39","36-42","38-44","41-47","44-50"};
    	String[] a={"0","3","3","3","4","4","5","5","6","6","6"};
    	String[] b={"0","16","17","19","21","23","25","26","28","30","32"};
    	String[] c={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] d={"0","18","20","23","26","28","31","34","36","39","42"};
    	String[] e={"0","500","525","575","625","675","725","750","800","850","900"};
    	String[] f={"0","270","300","345","390","420","465","510","540","585","630"};
    	
    	
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
    
    public void downlevelkeeper(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjkeeper);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjkeeper);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjkeeper);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllkeeper);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjkeeper);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlkeeper);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblkeeper);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmakeeper);
    	
    	String[] g={"0","20-26","22-28","25-31","28-34","30-36","33-39","36-42","38-44","41-47","44-50"};
    	String[] a={"0","3","3","3","4","4","5","5","6","6","6"};
    	String[] b={"0","16","17","19","21","23","25","26","28","30","32"};
    	String[] c={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] d={"0","18","20","23","26","28","31","34","36","39","42"};
    	String[] e={"0","500","525","575","625","675","725","750","800","850","900"};
    	String[] f={"0","270","300","345","390","420","465","510","540","585","630"};
    	
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
    public void jn1keeper(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1keeper);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2keeper);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3keeper);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4keeper);

    	textViewjn1.setText("      从地下召唤出树根缠绕住敌人,使其无法行动并造成持续伤害，使用间隔8s，魔法消耗75，距离80(快捷键E)。");
    	textViewjn2.setText("      等级1——持续时间12(英雄3)s，造成每秒15点伤害");
    	textViewjn3.setText("      等级2——持续时间24(英雄4)s，造成每秒15点伤害");
    	textViewjn4.setText("      等级3——持续时间36(英雄5)s，造成每秒15点伤害");
    }
    public void jn2keeper(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1keeper);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2keeper);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3keeper);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4keeper);

    	textViewjn1.setText("      从一片树中召唤出几个树人来协助作战，持续时间60s，使用间隔20s，魔法消耗125，距离70(快捷键F)");
    	textViewjn2.setText("      等级1——作用范围15，召唤出2个树人");
    	textViewjn3.setText("      等级2——作用范围22.5，召唤出3个树人");
    	textViewjn4.setText("      等级3——作用范围30，召唤出4个树人");
    }
    public void jn3keeper(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1keeper);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2keeper);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3keeper);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4keeper);
    	textViewjn1.setText("      让一定范围的我方部队被一层充满荆棘的盾所环绕，给那些攻击他们的近战单位造成伤害，作用范围90");
    	textViewjn2.setText("      等级1——反馈给敌人10%的伤害");
    	textViewjn3.setText("      等级2——反馈给敌人20%的伤害");
    	textViewjn4.setText("      等级3——反馈给敌人30%的伤害");
    }
    public void jn4keeper(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1keeper);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2keeper);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3keeper);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4keeper);

    	textViewjn1.setText("      在大范围内降下生命之雨,每秒恢复我方单位生命20点(快捷键T)");
    	textViewjn2.setText("      持续时间30s，使用间隔60s");
    	textViewjn3.setText("      魔法消耗125，作用范围90");
    	textViewjn4.setText("      每秒恢复20点生命");
    }
}
