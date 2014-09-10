package laiqn.war3battle;


import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class Orchero extends Activity {
	
	public static Orchero instance = null;
	 
	private ViewPager mTabPager;	
	private ImageView mTabImg;// 动画图片
	private ImageView mTab1,mTab2,mTab3,mTab4;
	private int zero = 0;// 动画图片偏移量
	private int currIndex = 0;// 当前页卡编号
	private int one;//单个水平动画位移
	private int two;
	private int three;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orchero);
         //启动activity时不自动弹出软键盘
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 
        instance = this;


        mTabPager = (ViewPager)findViewById(R.id.tabpager);
        mTabPager.setOnPageChangeListener(new MyOnPageChangeListener());
        mTab1 = (ImageView) findViewById(R.id.img_weixin);
        mTab2 = (ImageView) findViewById(R.id.img_address);
        mTab3 = (ImageView) findViewById(R.id.img_friends);
        mTab4 = (ImageView) findViewById(R.id.img_settings);
        mTabImg = (ImageView) findViewById(R.id.img_tab_now);

        mTab1.setOnClickListener(new MyOnClickListener(0));
        mTab2.setOnClickListener(new MyOnClickListener(1));
        mTab3.setOnClickListener(new MyOnClickListener(2));
        mTab4.setOnClickListener(new MyOnClickListener(3));
        Display currDisplay = getWindowManager().getDefaultDisplay();//获取屏幕当前分辨率
        int displayWidth = currDisplay.getWidth();
        int displayHeight = currDisplay.getHeight();
        one = displayWidth/4; //设置水平动画平移大小
        two = one*2;
        three = one*3;
        //Log.i("info", "获取的屏幕分辨率为" + one + two + three + "X" + displayHeight);
        
        //InitImageView();//使用动画
      //将要分页显示的View装入数组中
        LayoutInflater mLi = LayoutInflater.from(this);
        View view1 = mLi.inflate(R.layout.activity_blademaster, null);
        View view2 = mLi.inflate(R.layout.activity_shadowhunter, null);
        View view3 = mLi.inflate(R.layout.activity_chieftain, null);
        View view4 = mLi.inflate(R.layout.activity_farseer, null);
        
      //每个页面的view数据
        final ArrayList<View> views = new ArrayList<View>();
        views.add(view1);
        views.add(view2);
        views.add(view3);
        views.add(view4);
        



        
      //填充ViewPager的数据适配器
        PagerAdapter mPagerAdapter = new PagerAdapter() {
			
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
			
			@Override
			public int getCount() {
				return views.size();
			}

			@Override
			public void destroyItem(View container, int position, Object object) {
				((ViewPager)container).removeView(views.get(position));
			}
			

			@Override
			public Object instantiateItem(View container, int position) {
				((ViewPager)container).addView(views.get(position));
				return views.get(position);
			}
		};
		
		mTabPager.setAdapter(mPagerAdapter);
    }
    /**
	 * 头标点击监听
	 */
	public class MyOnClickListener implements View.OnClickListener {
		private int index = 0;

		public MyOnClickListener(int i) {
			index = i;
		}
		@Override
		public void onClick(View v) {
			mTabPager.setCurrentItem(index);
		}
	};
    

	
	 /* 页卡切换监听(原作者:D.Winter)
	 */
	public class MyOnPageChangeListener implements OnPageChangeListener {
		@Override
		public void onPageSelected(int arg0) {
			Animation animation = null;
			switch (arg0) {
			case 0:
				mTab1.setImageDrawable(getResources().getDrawable(R.drawable.blademaster_o));
				
				if (currIndex == 1) {
					animation = new TranslateAnimation(one, 0, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.shadowhunter_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, 0, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.taurenchieftain_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, 0, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.farseer_1));
				}
				break;
			case 1:
				mTab2.setImageDrawable(getResources().getDrawable(R.drawable.shadowhunter_o));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, one, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.blademaster_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, one, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.taurenchieftain_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, one, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.farseer_1));
				}
				break;
			case 2:
				mTab3.setImageDrawable(getResources().getDrawable(R.drawable.taurenchieftain_o));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, two, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.blademaster_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, two, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.shadowhunter_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, two, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.farseer_1));
				}
				break;
			case 3:
				mTab4.setImageDrawable(getResources().getDrawable(R.drawable.farseer_o));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, three, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.blademaster_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, three, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.shadowhunter_1));
				}
				else if (currIndex == 2) {
					animation = new TranslateAnimation(two, three, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.taurenchieftain_1));
				}
				break;
			}
			currIndex = arg0;
			animation.setFillAfter(true);// True:图片停在动画结束位置
			animation.setDuration(150);
			mTabImg.startAnimation(animation);
			
		}
		
		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	       
	        this.finish();
	}
		return false;
	}
	

    public void uplevelblademaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjblademaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjblademaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjblademaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllblademaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjblademaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlblademaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblblademaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmablademaster);
    	
    	String[] g={"0","25-47","26-48","28-50","30-52","32-54","33-55","35-57","37-59","39-61","40-62"};
    	String[] a={"0","5","5","6","6","7","7","8","8","9","9"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","24","25","27","29","31","32","34","36","38","39"};
    	String[] d={"0","16","18","20","22","25","27","29","31","34","36"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
    	String[] f={"0","240","270","300","330","375","405","435","465","510","540"};
    	
    	
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
    
    public void downlevelblademaster(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjblademaster);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjblademaster);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjblademaster);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllblademaster);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjblademaster);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlblademaster);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblblademaster);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmablademaster);
    	
    	String[] g={"0","25-47","26-48","28-50","30-52","32-54","33-55","35-57","37-59","39-61","40-62"};
    	String[] a={"0","5","5","6","6","7","7","8","8","9","9"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","24","25","27","29","31","32","34","36","38","39"};
    	String[] d={"0","16","18","20","22","25","27","29","31","34","36"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
    	String[] f={"0","240","270","300","330","375","405","435","465","510","540"};
    	
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
    public void jn1blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      让剑圣隐身，并增加其移动速度．如果在隐身其间剑圣攻击目标的话，会造成额外伤害，同时显形，持续时间20s，使用间隔5s，魔法消耗75(快捷键W)");
    	textViewjn2.setText("      等级1——隐身,增加10%移动速度,攻击时造成50点额外伤害");
    	textViewjn3.setText("      等级2——隐身,增加40%移动速度,攻击时造成85点额外伤害");
    	textViewjn4.setText("      等级3——隐身,增加移动速度到最大,攻击时造成120点额外伤害");
    }
    public void jn2blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      制造出剑圣的幻影来迷惑对手,同时消除自身所有不利魔法效果，持续时间60s，使用间隔3s，魔法消耗125(快捷键R)。");
    	textViewjn2.setText("      等级1——创造出一个幻象");
    	textViewjn3.setText("      等级2——创造出两个幻象");
    	textViewjn4.setText("      等级3——创造出三个幻象");
    }
    public void jn3blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      有15%的机率可以让剑圣在攻击时造成更多的伤害。");
    	textViewjn2.setText("      等级1——造成2倍普通的伤害");
    	textViewjn3.setText("      等级2——造成3倍普通的伤害");
    	textViewjn4.setText("      等级3——造成4倍普通的伤害");
    }
    public void jn4blademaster(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1blademaster);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2blademaster);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3blademaster);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4blademaster);

    	textViewjn1.setText("      快速的旋转剑刃重创附近的所有敌人地面部队.并让剑圣对魔法免疫,每秒造成110点伤害(快捷键B)。");
    	textViewjn2.setText("      使用间隔180s、魔法消耗250");
    	textViewjn3.setText("      持续时间250");
    	textViewjn4.setText("      每秒造成110点伤害");
    }
    
    public void uplevelshadowhunter(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjshadowhunter);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjshadowhunter);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjshadowhunter);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllshadowhunter);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjshadowhunter);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlshadowhunter);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblshadowhunter);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmashadowhunter);
    	
    	String[] g={"0","22-28","23-29","25-31","26-32","28-34","29-35","31-37","32-38","34-40","35-41"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","20","21","23","24","26","27","29","30","32","33"};
    	String[] d={"0","17","19","22","24","27","29","32","34","37","39"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","255","285","330","360","405","435","480","510","555","585"};
    	
    	
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
    
    public void downlevelshadowhunter(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjshadowhunter);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjshadowhunter);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjshadowhunter);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllshadowhunter);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjshadowhunter);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlshadowhunter);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblshadowhunter);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmashadowhunter);
    	
    	String[] g={"0","22-28","23-29","25-31","26-32","28-34","29-35","31-37","32-38","34-40","35-41"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","20","21","23","24","26","27","29","30","32","33"};
    	String[] d={"0","17","19","22","24","27","29","32","34","37","39"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","255","285","330","360","405","435","480","510","555","585"};
    	
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
    public void jn1shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      与连锁闪电相反，以连锁闪电的方式为单位疗伤，每次跳跃治疗效果都会变弱，使用间隔9s，魔法消耗90，距离70，作用范围50(快捷键E)。");
    	textViewjn2.setText("      等级1——加130血，跳跃3次");
    	textViewjn3.setText("      等级2——加215血，跳跃4次");
    	textViewjn4.setText("      等级3——加300血，跳跃5次");
    }
    public void jn2shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      就象变羊的野生生物版本，施魔目前只有很少的魔法消耗和施法间隔。被施法单位的生命值和装甲值不变，但要根据影子猎手的等级保持野生生物状态15到30秒。施魔可将对方转化为一个随机的小动物。此法术不对召唤单位起作用，被变以后的单位移动速度为100。可被对应魔法驱散效果，使用间隔7s，魔法消耗70，距离80(快捷键B)。");
    	textViewjn2.setText("      等级1——持续时间15(英雄4)s，把单位变成一个随机的小动物");
    	textViewjn3.setText("      等级2——持续时间30(英雄5)s，把单位变成一个随机的小动物");
    	textViewjn4.setText("      等级3——持续时间45(英雄6)s，把单位变成一个随机的小动物");
    }
    public void jn3shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      眼镜蛇守卫，这个就类似于低成本的箭塔！他们射出火球造成可观的伤害，但只有100点生命值，他们很容易被敌人的物理攻击干掉（尽管他们魔法免疫）。如果影子猎手在己方后方设置一些眼镜蛇守卫的话，他们将为兽人提供另人生畏的远程火力支持。可对空对地，抗魔法，生命依次为75/100/135，持续时间40s，使用间隔6.5s，魔法消耗30(快捷键W)。");
    	textViewjn2.setText("      等级1——出手距离50，11-13伤害");
    	textViewjn3.setText("      等级2——出手距离80，23-26伤害");
    	textViewjn4.setText("      等级3——出手距离80，41-45伤害");
    }
    public void jn4shadowhunter(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1shadowhunter);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2shadowhunter);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3shadowhunter);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4shadowhunter);

    	textViewjn1.setText("      这是一个极端强大的魔法，并且是持续性的。施展时，施法者被强迫原地不动。巫毒使整个屏幕内的所有自己和盟友的单位无敌。对友方进攻单位来说，这是一个好消息，但对影子猎手来说，这可是一个坏消息。由于无敌的单位不会成为敌人的目标，影子猎手就伦为整个屏幕上敌人可以攻击的唯一目标！在这个魔法失效前利用无敌的部队保护影子猎手将是非常重要的。能持续30秒！此魔法可被打断，对友军有效");
    	textViewjn2.setText("      持续时间30s，使用间隔180s");
    	textViewjn3.setText("      魔法消耗200，作用范围80");
    	textViewjn4.setText("      英雄附近全部无敌");
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
    
    

