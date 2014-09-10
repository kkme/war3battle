package laiqn.war3battle;

import android.app.Activity;
import android.content.Intent;

import android.graphics.drawable.AnimationDrawable;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Firelord extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_firelord);
		


		 // Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		 ImageView img = (ImageView)findViewById(R.id.imageViewfirelord);
		 img.setBackgroundResource(R.drawable.firelord);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		// AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 //frameAnimation.start();
		
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, Neuunits.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}

    
    public void uplevelfirelord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjfirelord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjfirelord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjfirelord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllfirelord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjfirelord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlfirelord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblfirelord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmafirelord);
    	
    	String[] g={"0","22-28","23-29","25-31","26-32","28-34","30-36","31-37","33-39","34-40","36-42"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","20","21","23","24","26","28","29","31","32","34"};
    	String[] d={"0","18","20","23","25","28","30","33","35","38","40"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","270","300","345","375","420","450","495","525","570","600"};
    	
    	
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
    
    public void downlevelfirelord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjfirelord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjfirelord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjfirelord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllfirelord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjfirelord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlfirelord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblfirelord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmafirelord);
    	
    	String[] g={"0","22-28","23-29","25-31","26-32","28-34","30-36","31-37","33-39","34-40","36-42"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","20","21","23","24","26","28","29","31","32","34"};
    	String[] d={"0","18","20","23","25","28","30","33","35","38","40"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","270","300","345","375","420","450","495","525","570","600"};
    	
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
    public void jn1firelord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1firelord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2firelord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3firelord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4firelord);

    	textViewjn1.setText("      将敌人卷入魔法火焰中并造成伤害，禁止其使用魔法并降低50%攻击力。使用间隔12s，魔法消耗85，距离70");
    	textViewjn2.setText("      等级1——持续时间14（7）s，14秒内造成100点伤害");
    	textViewjn3.setText("      等级2——持续时间16（8）s，16秒内造成225点伤害");
    	textViewjn4.setText("      等级3——持续时间18（9）s，18秒内造成375点伤害");
    }
    public void jn2firelord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1firelord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2firelord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3firelord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4firelord);

    	textViewjn1.setText("      召唤一个岩浆怪，它会在攻击敌人的时候吸取其精华，最终分裂为两个。岩浆怪需要15次有效的攻击才能分裂。岩浆怪分裂时会变黑。每个等级的岩浆怪初始颜色都是相同的。持续时间70s，使用间隔32s，魔法消耗150，作用范围20");
    	textViewjn2.setText("      等级1——425点生命值、伤害力为11-27");
    	textViewjn3.setText("      等级2——550点生命值、伤害力为21-45");
    	textViewjn4.setText("      等级3——700点生命值、伤害力为32-56");
    }
    public void jn3firelord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1firelord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2firelord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3firelord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4firelord);

    	textViewjn1.setText("      每次攻击都带有火焰伤害。第一次攻击增加 一定的附加伤害，第二次攻击增加第一次附加伤害的2倍的附加伤害，第三次攻击增加第一次附加伤害的3倍的 附加伤害 ，依次类推。受燃灰技能影响的单位在死亡的时候会爆炸，并且对周围单位造成伤害。燃灰有两个用法。第一种是连续攻击多个低生命值的单位产生连续爆炸。如果使用恰当，你能够获得许多经验。第二种是集中攻击一个单位来让加成攻击翻倍，翻倍，再翻倍。用这个技能对付农民也不错哦。魔法消耗6点每次攻击");
    	textViewjn2.setText("      等级1——1点附加伤害，30点爆炸伤害");
    	textViewjn3.setText("      等级2——2点附加伤害，45点爆炸伤害");
    	textViewjn4.setText("      等级3——3点附加伤害，60点爆炸伤害");
    }
    public void jn4firelord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1firelord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2firelord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3firelord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4firelord);

    	textViewjn1.setText("      一定区域内制造一座火山，每5秒钟产生一波熔岩伤害附近的目标，造成100的伤害+2秒的眩晕，建筑承受2倍伤害。");
    	textViewjn2.setText("      使用间隔180s、魔法消耗200");
    	textViewjn3.setText("      距离80、作用范围50、持续时间35s");
    	textViewjn4.setText("      创造一座火山");
    }
}
