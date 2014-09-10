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

public class Undeadhero extends Activity {
	
	public static Undeadhero instance = null;
	 
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
        setContentView(R.layout.activity_undeadhero);
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
        View view1 = mLi.inflate(R.layout.activity_deathknight, null);
        View view2 = mLi.inflate(R.layout.activity_lich, null);
        View view3 = mLi.inflate(R.layout.activity_cryptlord, null);
        View view4 = mLi.inflate(R.layout.activity_dreadlord, null);
        
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
				mTab1.setImageDrawable(getResources().getDrawable(R.drawable.deathknight_u));
				
				if (currIndex == 1) {
					animation = new TranslateAnimation(one, 0, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.lich_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, 0, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.cryptlord_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, 0, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.dreadlord_1));
				}
				break;
			case 1:
				mTab2.setImageDrawable(getResources().getDrawable(R.drawable.lich_u));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, one, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.deathknight_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, one, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.cryptlord_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, one, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.dreadlord_1));
				}
				break;
			case 2:
				mTab3.setImageDrawable(getResources().getDrawable(R.drawable.cryptlord_u));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, two, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.deathknight_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, two, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.lich_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, two, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.dreadlord_1));
				}
				break;
			case 3:
				mTab4.setImageDrawable(getResources().getDrawable(R.drawable.dreadlord_u));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, three, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.deathknight_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, three, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.lich_1));
				}
				else if (currIndex == 2) {
					animation = new TranslateAnimation(two, three, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.cryptlord_1));
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
		 ImageView img = (ImageView)findViewById(R.id.imageViewdeathknight);
		 img.setBackgroundResource(R.drawable.deathknight);
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		 frameAnimation.start();
    }
    public void hero2(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewlich);
		 img.setBackgroundResource(R.drawable.lich);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 frameAnimation.start();
    }
    public void hero3(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewcryptlord);
		 img.setBackgroundResource(R.drawable.cryptlord);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 frameAnimation.start();
    }
    public void hero4(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewdreadlord);
		 img.setBackgroundResource(R.drawable.dreadlord);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 
		 frameAnimation.start();
    }
*/
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
    
    public void uplevellich(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjlich);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjlich);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjlich);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlllich);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjlich);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzllich);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbllich);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmalich);
    	
    	String[] g={"0","22-28","25-31","28-34","32-38","35-41","39-45","42-48","44-51","49-55","52-58"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","20","23","26","30","33","37","40","43","47","50"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","300","345","390","450","495","555","600","645","705","750"};
    	
    	
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
    
    public void downlevellich(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjlich);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjlich);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjlich);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewlllich);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjlich);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzllich);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewbllich);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmalich);
    	
    	String[] g={"0","22-28","25-31","28-34","32-38","35-41","39-45","42-48","44-51","49-55","52-58"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","15","17","19","21","23","25","27","29","31","33"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","20","23","26","30","33","37","40","43","47","50"};
    	String[] e={"0","475","525","575","625","675","725","775","825","875","925"};
    	String[] f={"0","300","345","390","450","495","555","600","645","705","750"};
    	
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
    public void jn1lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      制造一场由目标处引发的寒霜爆炸，对附近的所有敌人造成伤害并且减慢他们的移动速度和工作速率，持续时间4s，使用间隔8s，魔法消耗125，距离80，作用范围20(快捷键N)。");
    	textViewjn2.setText("      等级1——目标受到100点伤害，霜星造成50点伤害");
    	textViewjn3.setText("      等级2——目标受到100点伤害，霜星造成100点伤害");
    	textViewjn4.setText("      等级3——目标受到100点伤害，霜星造成150点伤害");
    }
    public void jn2lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      使目标包围在一层保护性的霜冻护甲中，这层护甲不仅能增加防御还能减慢近身攻击他的敌人，持续时间45s，使用间隔2s，魔法消耗40，距离80(快捷键F)。");
    	textViewjn2.setText("      等级1——甲+3，受到5秒的冰冻");
    	textViewjn3.setText("      等级2——甲+5，受到5秒的冰冻");
    	textViewjn4.setText("      等级3——甲+7，受到5秒的冰冻");
    }
    public void jn3lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      通过黑暗仪式摧毁他的一个单位，从而吸取他的能量来补充自己的黑暗法力，使用间隔15s，魔法消耗25，出手距离80(快捷键R)。");
    	textViewjn2.setText("      等级1——33%的生命转化为魔法");
    	textViewjn3.setText("      等级2——66%的生命转化为魔法");
    	textViewjn4.setText("      等级3——100%的生命转化为魔法");
    }
    public void jn4lich(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1lich);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2lich);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3lich);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4lich);

    	textViewjn1.setText("      在一个区域里以每秒4%的基础生命值摧毁一切物体。");
    	textViewjn2.setText("      持续时间35s，使用间隔150s");
    	textViewjn3.setText("      魔法消耗250，作用范围30，距离100");
    	textViewjn4.setText("      每秒目标基础生命4%的伤害");
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
    
    
    public void uplevelcryptlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjcryptlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjcryptlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjcryptlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllcryptlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjcryptlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlcryptlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblcryptlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmacryptlord);
    	
    	String[] g={"0","28-34","31-37","34-40","37-43","40-46","44-50","47-53","50-56","53-59","56-62"};
    	String[] a={"0","2","3","3","3","3","4","4","5","5","5"};
    	String[] b={"0","26","29","32","35","38","42","45","48","51","54"};
    	String[] c={"0","14","15","16","17","18","20","21","22","23","24"};
    	String[] d={"0","14","15","17","18","20","22","23","25","26","28"};
    	String[] e={"0","675","750","825","900","975","1075","1150","1225","1300","1375"};
    	String[] f={"0","210","225","255","270","300","330","345","375","390","420"};
    	
    	
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
    
    public void downlevelcryptlord(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjcryptlord);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjcryptlord);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjcryptlord);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllcryptlord);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjcryptlord);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlcryptlord);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblcryptlord);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmacryptlord);
    	
    	String[] g={"0","28-34","31-37","34-40","37-43","40-46","44-50","47-53","50-56","53-59","56-62"};
    	String[] a={"0","2","3","3","3","3","4","4","5","5","5"};
    	String[] b={"0","26","29","32","35","38","42","45","48","51","54"};
    	String[] c={"0","14","15","16","17","18","20","21","22","23","24"};
    	String[] d={"0","14","15","17","18","20","22","23","25","26","28"};
    	String[] e={"0","675","750","825","900","975","1075","1150","1225","1300","1375"};
    	String[] f={"0","210","225","255","270","300","330","345","375","390","420"};
    	
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
    public void jn1cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);

    	textViewjn1.setText("      爪子砸向地面，把敌人仍到天上，并将其钉在地穴领主的一只尖利的前肢上，从而造成大量伤害，并使目标眩晕几秒钟，使用间隔9s，魔法消耗100，距离70，作用范围25(快捷键E)。");
    	textViewjn2.setText("      等级1——持续2(英雄1)s，造成50点伤害，2（英雄1秒）的眩晕。");
    	textViewjn3.setText("      等级2——持续3(英雄2)s，造成80点伤害，3（英雄2秒）的眩晕。");
    	textViewjn4.setText("      等级3——持续4(英雄3)s，造成110点伤害，4（英雄3秒）的眩晕。");
    }
    public void jn2cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);

    	textViewjn1.setText("      增加防御，并且将伤害归还与近战的敌人");
    	textViewjn2.setText("      等级1——归还15%的伤害，装甲+3");
    	textViewjn3.setText("      等级2——归还25%的伤害，装甲+5");
    	textViewjn4.setText("      等级3——归还35%的伤害，装甲+7");
    }
    public void jn3cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);
    	textViewjn1.setText("      使地穴领主可以从地面上任意一具尸体上召唤一只甲虫。但在同一时间内只有控制最多5只，使用间隔6s，魔法消耗30，出手距离90(快捷键C)");
    	textViewjn2.setText("      等级1——140点生命，8-9的伤害");
    	textViewjn3.setText("      等级2——275点生命，15-18的伤害");
    	textViewjn4.setText("      等级3——410点生命，22-27的伤害");
    }
    public void jn4cryptlord(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1cryptlord);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2cryptlord);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3cryptlord);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4cryptlord);

    	textViewjn1.setText("      在地穴领主周围召唤一大片蝗虫，给攻击区域内的敌人造成伤害。当尸体被腐化时将转化为地穴领主的生命值(快捷键L)");
    	textViewjn2.setText("      魔法消耗150，持续时间30s");
    	textViewjn3.setText("      使用间隔180s，作用范围80");
    	textViewjn4.setText("      召唤一大片蝗虫");
    }
}
    
    

