package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Farseer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_farseer);
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
public void uplevelfarseer(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjfarseer);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjfarseer);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjfarseer);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllfarseer);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjfarseer);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlfarseer);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblfarseer);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmafarseer);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","36-42","39-45","42-48","45-51","48-54"};
    	String[] a={"0","3","4","4","4","5","5","6","6","6","6"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","18","19","20","21","22","23","24","25","26","27"};
    	String[] d={"0","19","22","25","28","31","34","37","40","43","46"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","285","330","375","420","465","510","555","600","645","690"};
    	
    	
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
    
    public void downlevelfarseer(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjfarseer);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjfarseer);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjfarseer);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllfarseer);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjfarseer);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlfarseer);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblfarseer);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmafarseer);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","36-42","39-45","42-48","45-51","48-54"};
    	String[] a={"0","3","4","4","4","5","5","6","6","6","6"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","18","19","20","21","22","23","24","25","26","27"};
    	String[] d={"0","19","22","25","28","31","34","37","40","43","46"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","285","330","375","420","465","510","555","600","645","690"};
    	
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
    public void jn1farseer(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1farseer);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2farseer);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3farseer);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4farseer);

    	textViewjn1.setText("      让你可以看到地图上一定区域内所有活动，并可以显示出隐形单位，持续时间8s，魔法消耗75，距离无限(快捷键T)。");
    	textViewjn2.setText("      等级1——作用范围60，显示地图");
    	textViewjn3.setText("      等级2——作用范围180，显示地图");
    	textViewjn4.setText("      等级3——作用范围400，显示地图");
    }
    public void jn2farseer(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1farseer);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2farseer);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3farseer);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4farseer);

    	textViewjn1.setText("      发射出一道猛烈的闪电，并在附近的敌人身上不停的跳跃．每次跳跃损失15%的攻击力，使用间隔9s，魔法消耗120，距离70，作用范围50(快捷键C)。");
    	textViewjn2.setText("      等级1——造成85点伤害,可跳跃4次总伤害为85+72+61+52=270");
    	textViewjn3.setText("      等级2——造成125点伤害,可跳跃6次总伤害为125+106+90+76+65+55=517");
    	textViewjn4.setText("      等级3——造成180点伤害,可跳跃8次总伤害为180+153+130+110+93+79+67+57=869");
    }
    public void jn3farseer(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1farseer);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2farseer);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3farseer);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4farseer);

    	textViewjn1.setText("      召唤两头狼来协助先知战斗一段时间.几级技能召唤出来的狼都是60秒存在时间，持续时间60s，使用间隔30s，魔法消耗75(快捷键T)。");
    	textViewjn2.setText("      等级1——召唤出两头幽灵之狼");
    	textViewjn3.setText("      等级2——召唤出两头恐惧之狼");
    	textViewjn4.setText("      等级3——召唤出两头暗影之狼");
    }
    public void jn4farseer(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1farseer);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2farseer);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3farseer);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4farseer);

    	textViewjn1.setText("      召使大地不停的震动,给区域内所有建筑每秒50点伤害,并减慢所有范围内单位的移动速度75%.持续时间25秒(快捷键E)");
    	textViewjn2.setText("      使用间隔90s，持续时间25s");
    	textViewjn3.setText("      魔法消耗100，距离100，作用范围25");
    	textViewjn4.setText("      给建筑造成每秒50点伤害,并减慢单位移动速度75%");
    }

}
