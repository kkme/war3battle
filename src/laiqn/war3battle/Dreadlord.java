package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Dreadlord extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dreadlord);
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
public void upleveldreadlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdreadlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdreadlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdreadlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldreadlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdreadlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldreadlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldreadlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmadreadlord);
    	
    	String[] g={"0","22-32","24-34","27-37","29-39","32-42","34-44","37-47","39-49","42-52","44-54"};
    	String[] a={"0","3","3","3","4","4","4","5","5","6","6"};
    	String[] b={"0","20","22","25","27","30","32","35","37","40","42"};
    	String[] c={"0","16","17","18","19","20","21","22","23","24","25"};
    	String[] d={"0","18","20","23","25","28","30","33","35","38","40"};
    	String[] e={"0","600","650","725","775","850","900","975","1025","1100","1150"};
    	String[] f={"0","270","300","345","375","420","450","495","525","575","600"};
    	
    	
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
    
    public void downleveldreadlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdreadlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdreadlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdreadlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldreadlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdreadlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldreadlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldreadlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmadreadlord);
    	
    	String[] g={"0","22-32","24-34","27-37","29-39","32-42","34-44","37-47","39-49","42-52","44-54"};
    	String[] a={"0","3","3","3","4","4","4","5","5","6","6"};
    	String[] b={"0","20","22","25","27","30","32","35","37","40","42"};
    	String[] c={"0","16","17","18","19","20","21","22","23","24","25"};
    	String[] d={"0","18","20","23","25","28","30","33","35","38","40"};
    	String[] e={"0","600","650","725","775","850","900","975","1025","1100","1150"};
    	String[] f={"0","270","300","345","375","420","450","495","525","575","600"};
    	
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
    public void jn1dreadlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1dreadlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2dreadlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3dreadlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4dreadlord);

    	textViewjn1.setText("      召唤大量的蝙蝠和昆虫攻击敌人并造成伤害，使用间隔10s，魔法消耗110，距离70，作用范围15(快捷键C)。");
    	textViewjn2.setText("      等级1——每个单位受75点伤害,最大伤害总值300");
    	textViewjn3.setText("      等级2——每个单位受125点伤害,最大伤害总值600");
    	textViewjn4.setText("      等级3——每个单位受200点伤害,最大伤害总值1000");
    }
    public void jn2dreadlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1dreadlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2dreadlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3dreadlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4dreadlord);

    	textViewjn1.setText("      让敌人陷入突如其来的沉睡之中。无论是来自敌人还是朋友的攻击都可以唤醒可怜的沉睡者，使用间隔6s，距离80(快捷键E)。");
    	textViewjn2.setText("      等级1——持续时间20(英雄5)s，魔法消耗100，使单位陷入沉睡");
    	textViewjn3.setText("      等级2——持续时间40(英雄10)s，魔法消耗100，使单位陷入沉睡");
    	textViewjn4.setText("      等级3——持续时间60(英雄15)s，魔法消耗100，使单位陷入沉睡");
    }
    public void jn3dreadlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1dreadlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2dreadlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3dreadlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4dreadlord);

    	textViewjn1.setText("      附近的单位可以通过攻击别的单位来获取生命，作用范围90");
    	textViewjn2.setText("      等级1——15%的伤害转化为生命");
    	textViewjn3.setText("      等级2——30%的伤害转化为生命");
    	textViewjn4.setText("      等级3——45%的伤害转化为生命");
    }
    public void jn4dreadlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1dreadlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2dreadlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3dreadlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4dreadlord);

    	textViewjn1.setText("      地狱火会从天而降，当它撞击地面的时候，对他们造成50的伤害，巨大的震荡波会震昏这一区域的敌人4秒。地狱火将持续180秒");
    	textViewjn2.setText("      使用间隔180s");
    	textViewjn3.setText("      魔法消耗175，距离90，作用范围25");
    	textViewjn4.setText("      召唤地狱火，4（2）秒眩晕，造成50点伤害");
    }

}
