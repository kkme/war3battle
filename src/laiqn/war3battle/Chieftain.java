package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Chieftain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chieftain);
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
public void uplevelchieftain(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjchieftain);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjchieftain);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjchieftain);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllchieftain);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjchieftain);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlchieftain);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblchieftain);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmachieftain);
    	
    	String[] g={"0","27-37","30-40","33-43","36-46","39-49","43-53","46-56","49-59","52-62","55-65"};
    	String[] a={"0","2","2","3","3","4","4","5","5","6","6"};
    	String[] b={"0","25","28","31","34","37","41","44","47","50","53"};
    	String[] c={"0","10","11","13","14","16","17","19","20","22","23"};
    	String[] d={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] e={"0","725","800","875","950","1025","1125","1200","1275","1350","1425"};
    	String[] f={"0","210","225","240","255","285","300","315","345","360","375"};
    	
    	
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
    
    public void downlevelchieftain(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjchieftain);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjchieftain);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjchieftain);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllchieftain);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjchieftain);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlchieftain);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblchieftain);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmachieftain);
    	
    	String[] g={"0","27-37","30-40","33-43","36-46","39-49","43-53","46-56","49-59","52-62","55-65"};
    	String[] a={"0","2","2","3","3","4","4","5","5","6","6"};
    	String[] b={"0","25","28","31","34","37","41","44","47","50","53"};
    	String[] c={"0","10","11","13","14","16","17","19","20","22","23"};
    	String[] d={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] e={"0","725","800","875","950","1025","1125","1200","1275","1350","1425"};
    	String[] f={"0","210","225","240","255","285","300","315","345","360","375"};
    	
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
    public void jn1chieftain(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1chieftain);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2chieftain);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3chieftain);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4chieftain);

    	textViewjn1.setText("      发射出一道猛烈的振荡波,伤害位于一条直线上的敌人,这个技能只能攻击地面单位，使用间隔8s，魔法消耗100，距离70，作用范围15(快捷键W)。");
    	textViewjn2.setText("      等级1——造成75点伤害");
    	textViewjn3.setText("      等级2——造成130点伤害");
    	textViewjn4.setText("      等级3——造成200点伤害");
    }
    public void jn2chieftain(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1chieftain);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2chieftain);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3chieftain);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4chieftain);

    	textViewjn1.setText("      猛烈的撞击地面,震晕并伤害那些附加的敌方部队，使用间隔6s，魔法消耗90(快捷键T)");
    	textViewjn2.setText("      等级1——作用范围25，造成25点伤害，眩晕3(英雄2)s");
    	textViewjn3.setText("      等级2——作用范围30，造成25点伤害，眩晕4(英雄3)s");
    	textViewjn4.setText("      等级3——作用范围35，造成25点伤害，眩晕5(英雄4)s");
    }
    public void jn3chieftain(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1chieftain);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2chieftain);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3chieftain);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4chieftain);
    	textViewjn1.setText("      增加附近友军的移动速度和攻击速率，作用范围90");
    	textViewjn2.setText("      等级1——增加移动速度10%,攻击速率5%");
    	textViewjn3.setText("      等级2——增加移动速度20%,攻击速率10%");
    	textViewjn4.setText("      等级3——增加移动速度30%,攻击速率15%");
    }
    public void jn4chieftain(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1chieftain);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2chieftain);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3chieftain);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4chieftain);

    	textViewjn1.setText("      当牛头人酋长死后，具有一次死而复生的机会,并恢复全部的生命和魔法。");
    	textViewjn2.setText("      持续时间7s");
    	textViewjn3.setText("      使用间隔240s");
    	textViewjn4.setText("      让英雄死而复生");
    }

}
