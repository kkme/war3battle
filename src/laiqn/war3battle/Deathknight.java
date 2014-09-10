package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Deathknight extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deathknight);
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
public void upleveldeathknight(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdeathknight);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdeathknight);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdeathknight);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldeathknight);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdeathknight);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldeathknight);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldeathknight);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmadeathknight);
    	
    	String[] g={"0","25-35","27-37","30-40","33-43","35-45","38-48","41-51","43-53","46-56","49-59"};
    	String[] a={"0","4","4","5","5","5","6","6","7","7","8"};
    	String[] b={"0","23","25","28","31","33","36","39","41","44","47"};
    	String[] c={"0","12","13","15","16","18","19","21","22","24","25"};
    	String[] d={"0","17","18","20","22","24","26","27","29","31","33"};
    	String[] e={"0","675","725","800","875","925","1000","1075","1125","1200","1275"};
    	String[] f={"0","255","270","300","330","360","390","405","435","465","495"};
    	
    	
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
    
    public void downleveldeathknight(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjdeathknight);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjdeathknight);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjdeathknight);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlldeathknight);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjdeathknight);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzldeathknight);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbldeathknight);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmadeathknight);
    	
    	String[] g={"0","25-35","27-37","30-40","33-43","35-45","38-48","41-51","43-53","46-56","49-59"};
    	String[] a={"0","4","4","5","5","5","6","6","7","7","8"};
    	String[] b={"0","23","25","28","31","33","36","39","41","44","47"};
    	String[] c={"0","12","13","15","16","18","19","21","22","24","25"};
    	String[] d={"0","17","18","20","22","24","26","27","29","31","33"};
    	String[] e={"0","675","725","800","875","925","1000","1075","1125","1200","1275"};
    	String[] f={"0","255","270","300","330","360","390","405","435","465","495"};
    	
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
    public void jn1deathknight(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1deathknight);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2deathknight);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3deathknight);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4deathknight);

    	textViewjn1.setText("      死亡骑士可以按照自己的意愿召唤黑暗的力量，从手中放出具有死亡力量的黑暗之箭，对死亡骑士的敌人造成巨大的伤害，或者治愈他的亡灵同伴，魔法消耗75，距离80(快捷键C)。");
    	textViewjn2.setText("      等级1——使用间隔6s，100点伤害或者恢复200点生命");
    	textViewjn3.setText("      等级2——使用间隔5s，200点伤害或者恢复400点生命");
    	textViewjn4.setText("      等级3——使用间隔5s，300点伤害或者恢复600点生命");
    }
    public void jn2deathknight(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1deathknight);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2deathknight);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3deathknight);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4deathknight);

    	textViewjn1.setText("      死亡骑士可以通过杀死友军的一个单位，将它们的邪恶能量据为己有，以此来恢复自己的生命值，使用间隔15s，魔法消耗50，距离80(快捷键D)。");
    	textViewjn2.setText("      等级1——100%的转换为自己的生命值");
    	textViewjn3.setText("      等级2——200%的转换为自己的生命值");
    	textViewjn4.setText("      等级3——300%的转换为自己的生命值");
    }
    public void jn3deathknight(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1deathknight);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2deathknight);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3deathknight);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4deathknight);

    	textViewjn1.setText("      所有的死亡骑士都可以通过训练而散发出黑暗、狂暴的战斗光环，使他们附近的盟友获得更快的移动速度和生命回复速度，作用范围90");
    	textViewjn2.setText("      等级1——移动速度+10%，0.5/秒的生命恢复");
    	textViewjn3.setText("      等级2——移动速度+20%，1/秒的生命恢复");
    	textViewjn4.setText("      等级3——移动速度+30%，1.5/秒的生命恢复");
    }
    public void jn4deathknight(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1deathknight);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2deathknight);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3deathknight);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4deathknight);

    	textViewjn1.setText("      在死亡骑士的周围最多复活6个单位，并且他们是无敌的！");
    	textViewjn2.setText("      使用间隔180s、魔法消耗250");
    	textViewjn3.setText("      持续时间40s、距离40、作用范围90");
    	textViewjn4.setText("      复活6个死亡单位");
    }
}
