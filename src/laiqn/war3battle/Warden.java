package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Warden extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_warden);
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
public void uplevelwarden(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjwarden);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjwarden);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjwarden);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllwarden);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjwarden);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlwarden);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblwarden);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmawarden);
    	
    	String[] g={"0","22-42","23-43","25-45","26-46","28-48","30-50","31-51","33-53","34-54","36-56"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","18","20","22","25","27","30","32","34","37","39"};
    	String[] c={"0","20","21","23","24","26","28","29","31","32","34"};
    	String[] d={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] e={"0","550","600","650","725","775","850","900","950","1025","1075"};
    	String[] f={"0","225","255","285","315","345","375","405","435","465","495"};
    	
    	
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
    
    public void downlevelwarden(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjwarden);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjwarden);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjwarden);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllwarden);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjwarden);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlwarden);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblwarden);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmawarden);
    	
    	String[] g={"0","22-42","23-43","25-45","26-46","28-48","30-50","31-51","33-53","34-54","36-56"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","18","20","22","25","27","30","32","34","37","39"};
    	String[] c={"0","20","21","23","24","26","28","29","31","32","34"};
    	String[] d={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] e={"0","550","600","650","725","775","850","900","950","1025","1075"};
    	String[] f={"0","225","255","285","315","345","375","405","435","465","495"};
    	
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
    public void jn1warden(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1warden);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2warden);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3warden);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4warden);

    	textViewjn1.setText("      望者发射出锋利的飞刀伤害周围的敌人，使用间隔9s，魔法消耗100(快捷键F)。");
    	textViewjn2.setText("      等级1——作用范围40，每个单位受70点伤害,最大伤害总值350");
    	textViewjn3.setText("      等级2——作用范围50，每个单位受120点伤害,最大伤害总值575");
    	textViewjn4.setText("      等级3——作用范围60，每个单位受180点伤害,最大伤害总值950");
    }
    public void jn2warden(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1warden);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2warden);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3warden);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4warden);

    	textViewjn1.setText("      让守望者进行短距离的瞬间移动,可以用来快速脱离战场(快捷键B)。");
    	textViewjn2.setText("      等级1——使用间隔10s，魔法消耗50，瞬间移动");
    	textViewjn3.setText("      等级2——使用间隔10s，魔法消耗10，瞬间移动");
    	textViewjn4.setText("      等级3——使用间隔1s，魔法消耗10，瞬间移动");
    }
    public void jn3warden(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1warden);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2warden);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3warden);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4warden);

    	textViewjn1.setText("      发射一个毒标造成伤害,并在一定时间内让被攻击单位持续受到伤害,被攻击的单位会在一定时间内降低移动速度，持续时间15s，使用间隔8s，魔法消耗65，出手距离30(快捷键D)。");
    	textViewjn2.setText("      等级1——造成75点初始伤害,持续每3秒10点伤害,降低移动速度50%");
    	textViewjn3.setText("      等级2——造成150点初始伤害,持续每3秒30点伤害,降低移动速度50%");
    	textViewjn4.setText("      等级3——造成225点初始伤害,持续每3秒45点伤害,降低移动速度50%");
    }
    public void jn4warden(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1warden);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2warden);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3warden);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4warden);

    	textViewjn1.setText("      创造一个强大的天神,这个天神可以从战场的尸体中召唤出无形的灵魂去攻击你的敌人,当复仇天神死亡时,所招呼出的灵魂也会消失(快捷键V)");
    	textViewjn2.setText("      使用间隔180s");
    	textViewjn3.setText("      魔法消耗200");
    	textViewjn4.setText("      创造出复仇天神");
    }

}
