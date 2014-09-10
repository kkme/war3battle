package laiqn.war3battle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Priestess extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_priestess);
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
	 public void uplevelpriestess(View view) {
	    	
	    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpriestess);
	    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpriestess);
	    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpriestess);
	    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpriestess);
	    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpriestess);
	    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpriestess);
	    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpriestess);
	    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapriestess);
	    	
	    	String[] g={"0","21-31","22-32","24-34","25-35","27-37","28-38","30-40","31-41","33-43","34-44"};
	    	String[] a={"0","4","4","5","5","5","6","6","7","7","8"};
	    	String[] b={"0","18","19","21","23","25","27","29","31","33","35"};
	    	String[] c={"0","19","20","22","23","25","26","28","29","31","32"};
	    	String[] d={"0","15","17","20","22","25","28","30","33","35","38"};
	    	String[] e={"0","550","575","625","675","725","775","825","875","925","975"};
	    	String[] f={"0","225","255","300","330","375","420","450","495","525","570"};
	    	
	    	
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
	    
	    public void downlevelpriestess(View view) {
	    	
	    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpriestess);
	    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpriestess);
	    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpriestess);
	    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpriestess);
	    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpriestess);
	    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpriestess);
	    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpriestess);
	    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapriestess);
	    	
	    	String[] g={"0","21-31","22-32","24-34","25-35","27-37","28-38","30-40","31-41","33-43","34-44"};
	    	String[] a={"0","4","4","5","5","5","6","6","7","7","8"};
	    	String[] b={"0","18","19","21","23","25","27","29","31","33","35"};
	    	String[] c={"0","19","20","22","23","25","26","28","29","31","32"};
	    	String[] d={"0","15","17","20","22","25","28","30","33","35","38"};
	    	String[] e={"0","550","575","625","675","725","775","825","875","925","975"};
	    	String[] f={"0","225","255","300","330","375","420","450","495","525","570"};
	    	
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
	    public void jn1priestess(View view) {
	    	
	    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1priestess);
	    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2priestess);
	    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3priestess);
	    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4priestess);

	    	textViewjn1.setText("      召唤出一只猫头鹰，用来侦察整个地图，并可以看到隐形的单位，使用间隔20s(快捷键C)。");
	    	textViewjn2.setText("      等级1——持续时间60s，魔法消耗100，召唤出一只猫头鹰");
	    	textViewjn3.setText("      等级2——持续时间90s，魔法消耗75，召唤出一只猫头鹰");
	    	textViewjn4.setText("      等级3——持续时间120s，魔法消耗75，召唤出一只猫头鹰");
	    }
	    public void jn2priestess(View view) {
	    	
	    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1priestess);
	    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2priestess);
	    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3priestess);
	    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4priestess);

	    	textViewjn1.setText("      让月亮女祭司的攻击带有火焰伤害,每次攻击都会损失少量的魔法值.该技能可以设置为自动施放，魔法消耗8，距离70(快捷键R)。");
	    	textViewjn2.setText("      等级1——增加10点额外伤害");
	    	textViewjn3.setText("      等级2——增加20点额外伤害");
	    	textViewjn4.setText("      等级3——增加30点额外伤害");
	    }
	    public void jn3priestess(View view) {
	    	
	    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1priestess);
	    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2priestess);
	    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3priestess);
	    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4priestess);

	    	textViewjn1.setText("      增加所有在月亮女祭司旁边的我方远程部队的攻击力，作用范围90");
	    	textViewjn2.setText("      等级1——增加我方远程单位10%的攻击力");
	    	textViewjn3.setText("      等级2——增加我方远程单位20%的攻击力");
	    	textViewjn4.setText("      等级3——增加我方远程单位30%的攻击力");
	    }
	    public void jn4priestess(View view) {
	    	
	    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1priestess);
	    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2priestess);
	    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3priestess);
	    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4priestess);

	    	textViewjn1.setText("      召唤数波从天而降的流星雨伤害附近的敌军.每一波每单位造成50点伤害,每波间隔1.5秒(快捷键F)");
	    	textViewjn2.setText("      使用间隔180s，持续时间45s");
	    	textViewjn3.setText("      魔法消耗200，作用范围100");
	    	textViewjn4.setText("      45秒内降下流星雨,每波造成50点伤害");
	    }

}
