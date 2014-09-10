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

public class Nehero extends Activity {
	
	public static Nehero instance = null;
	 
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
        setContentView(R.layout.activity_nehero);
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
        View view1 = mLi.inflate(R.layout.activity_demonhunter, null);
        View view2 = mLi.inflate(R.layout.activity_warden, null);
        View view3 = mLi.inflate(R.layout.activity_keeper, null);
        View view4 = mLi.inflate(R.layout.activity_priestess, null);
        
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
				mTab1.setImageDrawable(getResources().getDrawable(R.drawable.demonhunter_n));
				
				if (currIndex == 1) {
					animation = new TranslateAnimation(one, 0, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.warden_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, 0, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.keepergrove_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, 0, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.priestess_1));
				}
				break;
			case 1:
				mTab2.setImageDrawable(getResources().getDrawable(R.drawable.warden_n));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, one, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.demonhunter_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, one, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.keepergrove_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, one, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.priestess_1));
				}
				break;
			case 2:
				mTab3.setImageDrawable(getResources().getDrawable(R.drawable.keepergrove_n));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, two, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.demonhunter_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, two, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.warden_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, two, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.priestess_1));
				}
				break;
			case 3:
				mTab4.setImageDrawable(getResources().getDrawable(R.drawable.priestess_n));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, three, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.demonhunter_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, three, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.warden_1));
				}
				else if (currIndex == 2) {
					animation = new TranslateAnimation(two, three, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.keepergrove_1));
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
	
/*
    public void hero1(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewdemonhunter);
		 img.setBackgroundResource(R.drawable.demonhunter);
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		 frameAnimation.start();
    }
    public void hero2(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewwarden);
		 img.setBackgroundResource(R.drawable.warden);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 frameAnimation.start();
    }
    public void hero3(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewkeeper);
		 img.setBackgroundResource(R.drawable.keeper);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 frameAnimation.start();
    }
    public void hero4(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewpriestess);
		 img.setBackgroundResource(R.drawable.priestess);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 frameAnimation.start();
    }
*/
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
    
    

