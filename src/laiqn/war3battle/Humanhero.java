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

public class Humanhero extends Activity {
	
	public static Humanhero instance = null;
	 
	private ViewPager mTabPager;	
	private ImageView mTabImg;// 动画图片
	private ImageView hero1,hero2,hero3,hero4;
	private ImageView mTab1,mTab2,mTab3,mTab4;
	private int zero = 0;// 动画图片偏移量
	private int currIndex = 0;// 当前页卡编号
	private int one;//单个水平动画位移
	private int two;
	private int three;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanhero);
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
        View view1 = mLi.inflate(R.layout.activity_archmage, null);
        View view2 = mLi.inflate(R.layout.activity_mountainking, null);
        View view3 = mLi.inflate(R.layout.activity_paladin, null);
        View view4 = mLi.inflate(R.layout.activity_bloodmage, null);
        
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
				mTab1.setImageDrawable(getResources().getDrawable(R.drawable.archmage_h));
				
				if (currIndex == 1) {
					animation = new TranslateAnimation(one, 0, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.mountainking_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, 0, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.paladin_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, 0, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.bloodmage_1));
				}
				break;
			case 1:
				mTab2.setImageDrawable(getResources().getDrawable(R.drawable.mountainking_h));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, one, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.archmage_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, one, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.paladin_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, one, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.bloodmage_1));
				}
				break;
			case 2:
				mTab3.setImageDrawable(getResources().getDrawable(R.drawable.paladin_h));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, two, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.archmage_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, two, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.mountainking_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, two, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.bloodmage_1));
				}
				break;
			case 3:
				mTab4.setImageDrawable(getResources().getDrawable(R.drawable.bloodmage_h));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, three, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.archmage_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, three, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.mountainking_1));
				}
				else if (currIndex == 2) {
					animation = new TranslateAnimation(two, three, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.paladin_1));
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
		 ImageView img = (ImageView)findViewById(R.id.imageViewarchmage);
		 img.setBackgroundResource(R.drawable.archmage);
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		 frameAnimation.start();
    }
    public void hero2(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewmountainking);
		 img.setBackgroundResource(R.drawable.mountainking);
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground(); 
		 frameAnimation.start();
    }
    public void hero3(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewbloodmage);
		 img.setBackgroundResource(R.drawable.bloodmage);
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		 frameAnimation.start();
    }
    public void hero4(View view) {
		 ImageView img = (ImageView)findViewById(R.id.imageViewpaladin);
		 img.setBackgroundResource(R.drawable.paladin);
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		 frameAnimation.start();
    }
*/
    public void uplevelarchmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjarchmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjarchmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjarchmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllarchmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjarchmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlarchmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblarchmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmaarchmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","37-43","40-46","43-49","46-52","49-55"};
    	String[] a={"0","3","3","4","4","4","5","5","5","6","6"};
    	String[] b={"0","14","15","17","19","21","23","24","26","28","30"};
    	String[] c={"0","17","19","19","20","21","22","23","24","25","36"};
    	String[] d={"0","19","22","25","28","31","35","38","41","44","47"};
    	String[] e={"0","450","475","525","575","625","675","700","750","800","850"};
    	String[] f={"0","285","330","375","420","465","525","570","615","660","705"};
    	
    	
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
    
    public void downlevelarchmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjarchmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjarchmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjarchmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllarchmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjarchmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlarchmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblarchmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmaarchmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","37-43","40-46","43-49","46-52","49-55"};
    	String[] a={"0","3","3","4","4","4","5","5","5","6","6"};
    	String[] b={"0","14","15","17","19","21","23","24","26","28","30"};
    	String[] c={"0","17","19","19","20","21","22","23","24","25","36"};
    	String[] d={"0","19","22","25","28","31","35","38","41","44","47"};
    	String[] e={"0","450","475","525","575","625","675","700","750","800","850"};
    	String[] f={"0","285","330","375","420","465","525","570","615","660","705"};
    	
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
    public void jn1archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      从天而降寒冷的冰锥，伤害一定范围内的全部敌人。使用间隔6s、魔法消耗75、作用范围20(快捷键B)。");
    	textViewjn2.setText("      等级1——6波冰锥,每波伤害30,最大伤害150");
    	textViewjn3.setText("      等级2——8波冰锥,每波伤害40,最大伤害200");
    	textViewjn4.setText("      等级3——10波冰锥,每波伤害50,最大伤害250");
    }
    public void jn2archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      召唤出一个水元素(Water Elemental)来攻击敌人，持续时间60s、使用间隔20s、魔法消耗125(快捷键W)。");
    	textViewjn2.setText("      等级1——525点生命，攻击18-22");
    	textViewjn3.setText("      等级2——675点生命，攻击31-39");
    	textViewjn4.setText("      等级3——900点生命，攻击41-49");
    }
    public void jn3archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      增加附近友军的魔法恢复速度、作用范围90。");
    	textViewjn2.setText("      等级1——每秒恢复魔法值0.75");
    	textViewjn3.setText("      等级2——每秒恢复魔法值1.5");
    	textViewjn4.setText("      等级3——每秒恢复魔法值2.25");
    }
    public void jn4archmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1archmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2archmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3archmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4archmage);

    	textViewjn1.setText("      可以最多移动24个我方单位,包括大法师自己,到一个友军的单位或建筑附近 (快捷键 T)。");
    	textViewjn2.setText("      使用间隔15s、魔法消耗100");
    	textViewjn3.setText("      距离无限、作用范围70、作用目标友军的地面或建筑");
    	textViewjn4.setText("      传送最多24个单位");
    }
    
    public void uplevelmountainking(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjmountainking);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjmountainking);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjmountainking);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllmountainking);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjmountainking);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlmountainking);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblmountainking);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmamountainking);
    	
    	String[] g={"0","26-36","29-39","32-42","35-45","38-48","41-51","44-54","47-57","50-60","53-63"};
    	String[] a={"0","2","3","3","4","4","4","5","5","6","6"};
    	String[] b={"0","24","27","30","33","36","39","42","45","48","51"};
    	String[] c={"0","11","12","14","15","17","18","20","21","23","24"};
    	String[] d={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] e={"0","700","775","850","925","1000","1075","1150","1225","1300","1375"};
    	String[] f={"0","225","240","270","285","315","330","360","375","405","420"};
    	
    	
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
    
    public void downlevelmountainking(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjmountainking);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjmountainking);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjmountainking);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllmountainking);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjmountainking);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlmountainking);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblmountainking);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmamountainking);
    	
    	String[] g={"0","26-36","29-39","32-42","35-45","38-48","41-51","44-54","47-57","50-60","53-63"};
    	String[] a={"0","2","3","3","4","4","4","5","5","6","6"};
    	String[] b={"0","24","27","30","33","36","39","42","45","48","51"};
    	String[] c={"0","11","12","14","15","17","18","20","21","23","24"};
    	String[] d={"0","15","16","18","19","21","22","24","25","27","28"};
    	String[] e={"0","700","775","850","925","1000","1075","1150","1225","1300","1375"};
    	String[] f={"0","225","240","270","285","315","330","360","375","405","420"};
    	
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
    public void jn1mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      高山矮人经常练习投掷战锤——作为运动和战斗技能。但只有铁炉城的山丘之王才能如此猛烈地掷出战锤，以至于能够一下击昏他们的敌人。于是风暴之锤就成为了山丘之王最可怕的攻击方式。魔法消耗75，使用间隔9s，距离60(快捷键T)。");
    	textViewjn2.setText("      等级1——100伤害，5s(英雄3)的眩晕");
    	textViewjn3.setText("      等级2——225伤害，5s(英雄3)的眩晕");
    	textViewjn4.setText("      等级3——350伤害，5s(英雄3)的眩晕");
    }
    public void jn2mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      根·落锤在奥特兰克山脉迎战一群入侵的豺狼人时第一次使用了这招。敲击地面,伤害周围的敌人,并减慢他们的攻击和移动速度。持续时间5s(英雄3)，使用间隔6s，魔法消耗90(快捷键C)。");
    	textViewjn2.setText("      等级1——作用范围25，60点伤害，移动速度减慢50%，攻击速度减慢50%");
    	textViewjn3.setText("      等级2——作用范围30，100点伤害，移动速度减慢50%，攻击速度减慢50%");
    	textViewjn4.setText("      等级3——作用范围35，140点伤害，移动速度减慢50%，攻击速度减慢50%");
    }
    public void jn3mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      让山丘之王有一定的机率给攻击目标带来额外25点伤害,并使目标悬晕,这是一项被动技能。");
    	textViewjn2.setText("      等级1——15%的机会，+25的伤害，2秒（英雄1秒）眩晕");
    	textViewjn3.setText("      等级2——25%的机会，+25的伤害，2秒（英雄1秒）眩晕");
    	textViewjn4.setText("      等级3——35%的机会，+25的伤害，2秒（英雄1秒）眩晕");
    }
    public void jn4mountainking(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1mountainking);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2mountainking);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3mountainking);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4mountainking);

    	textViewjn1.setText("      山丘之王可以将注意力集中在矮人新发现的宝藏的能量上，从而变得高大、强壮，外形也会变成石刻的雕像一般。在这种形态下，他们对魔法免疫并且各项能力都大幅度提高。使用天神下凡将给山丘之王的盔甲+5，生命上限+500点，+20的伤害和魔法免疫(快捷键V)");
    	textViewjn2.setText("      使用间隔180s");
    	textViewjn3.setText("      魔法消耗150");
    	textViewjn4.setText("      持续时间60s");
    }
    
    
    public void uplevelbloodmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjbloodmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjbloodmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjbloodmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllbloodmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjbloodmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlbloodmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblbloodmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmabloodmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","36-42","39-45","42-48","45-51","48-54"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","19","22","25","28","31","34","37","40","43","46"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
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
    
    public void downlevelbloodmage(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjbloodmage);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjbloodmage);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjbloodmage);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllbloodmage);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjbloodmage);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlbloodmage);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblbloodmage);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmabloodmage);
    	
    	String[] g={"0","21-27","24-30","27-33","30-36","33-39","36-42","39-45","42-48","45-51","48-54"};
    	String[] a={"0","2","3","3","3","3","4","4","4","5","5"};
    	String[] b={"0","18","20","22","24","26","28","30","32","34","36"};
    	String[] c={"0","14","15","16","17","18","19","20","21","22","23"};
    	String[] d={"0","19","22","25","28","31","34","37","40","43","46"};
    	String[] e={"0","550","600","650","700","750","800","850","900","950","1000"};
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
    public void jn1bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      在施法区域可造成数百伤害的区域性魔法。给位于施法中心的敌人造成最大的伤害。与大法师的暴雪不同，烈焰之击是不可打断的。在最高级，烈焰之击可以在瞬间消灭暗夜弓箭手之类的单位，为了平衡这个技能，暴雪为这个技能设计了施法准备期。每级都有2秒的延迟以便让人有时间逃离中心区域。不对空中单位起作用，只对地面部队起作用。如果多于5个的目标被击中，那么攻击的伤害值会在那些单位中平均地分配下来。持续时间6s，使用间隔10s，魔法消耗135，距离80，作用范围20(快捷键F)");
    	textViewjn2.setText("      等级1——前3秒，45伤害/秒微小伤害持续6秒");
    	textViewjn3.setText("      等级2——前3秒，80伤害/秒轻微伤害持续6秒");
    	textViewjn4.setText("      等级3——前3秒，110伤害/秒中等伤害持续6秒");
    }
    public void jn2bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      将一个单位变为气态，移动速度减半。他既不能物理攻击也不能被物理攻击，可以保护这个单位或使其变的无用。对机械单位无效。不能作用自身？。魔法对放逐的单位额外增加66%的伤害，魔法消耗75，距离80(快捷键B)。");
    	textViewjn2.setText("      等级1——持续时间12(英雄4)，变为气态移动速度减半");
    	textViewjn3.setText("      等级2——持续时间15(英雄5)，变为气态移动速度减半");
    	textViewjn4.setText("      等级3——持续时间18(英雄6)，变为气态移动速度减半");
    }
    public void jn3bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      可以吸取敌方有魔法单位的魔法，变成自己的魔法。当被吸吮单位逃出作用范围，魔法作用自动消失，持续时间6s，使用间隔6s，魔法消耗10，距离60-80(快捷键N)。");
    	textViewjn2.setText("      等级1——18魔/秒");
    	textViewjn3.setText("      等级2——35魔/秒");
    	textViewjn4.setText("      等级3——55魔/秒");
    }
    public void jn4bloodmage(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1bloodmage);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2bloodmage);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3bloodmage);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4bloodmage);

    	textViewjn1.setText("      召唤出一只会飞的，有大量生命值并能造成大量伤害的火凤凰。这种凤凰一次只能召唤一只，即使其在战斗中不被对方干掉，也会在几分钟的施法有效期后涅磐成一个蛋，10秒以后蛋如果没被消灭，将重新变成一只满血的凤凰。");
    	textViewjn2.setText("      使用间隔180s");
    	textViewjn3.setText("      魔法消耗175");
    	textViewjn4.setText("      召唤出一个凤凰");
    }
    
    
    public void uplevelpaladin(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpaladin);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpaladin);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpaladin);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpaladin);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpaladin);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpaladin);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpaladin);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapaladin);
    	
    	String[] g={"0","24-34","26-36","29-39","32-42","34-44","37-47","40-50","42-52","45-55","48-58"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","22","24","27","30","32","35","38","40","43","46"};
    	String[] c={"0","13","14","16","17","19","20","22","23","25","26"};
    	String[] d={"0","17","18","20","22","24","26","27","29","31","33"};
    	String[] e={"0","650","700","775","850","900","975","1050","1100","1175","1250"};
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
    
    public void downlevelpaladin(View view) {
    	
    	TextView textViewdj = (TextView) this.findViewById(R.id.textViewdjpaladin);
    	TextView textViewgj = (TextView) this.findViewById(R.id.textViewgjpaladin);
    	TextView textViewhj = (TextView) this.findViewById(R.id.textViewhjpaladin);
    	TextView textViewll = (TextView) this.findViewById(R.id.textViewllpaladin);
    	TextView textViewmj = (TextView) this.findViewById(R.id.textViewmjpaladin);
    	TextView textViewzl = (TextView) this.findViewById(R.id.textViewzlpaladin);
    	TextView textViewbl = (TextView) this.findViewById(R.id.textViewblpaladin);
    	TextView textViewma = (TextView) this.findViewById(R.id.textViewmapaladin);
    	
    	String[] g={"0","24-34","26-36","29-39","32-42","34-44","37-47","40-50","42-52","45-55","48-58"};
    	String[] a={"0","4","4","5","5","6","6","7","7","8","8"};
    	String[] b={"0","22","24","27","30","32","35","38","40","43","46"};
    	String[] c={"0","13","14","16","17","19","20","22","23","25","26"};
    	String[] d={"0","17","18","20","22","24","26","27","29","31","33"};
    	String[] e={"0","650","700","775","850","900","975","1050","1100","1175","1250"};
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
    public void jn1paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);

    	textViewjn1.setText("      神圣之光可以治疗我方受伤的单位或者伤害不死族的单位，使用间隔5s，魔法消耗65，距离80(快截键T)。");
    	textViewjn2.setText("      等级1——恢复单位200生命/给不死单位100点伤害");
    	textViewjn3.setText("      等级2——恢复单位400生命/给不死单位200点伤害");
    	textViewjn4.setText("      等级3——恢复单位600生命/给不死单位300点伤害");
    }
    public void jn3paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);

    	textViewjn1.setText("      增加周围友军的护甲值，作用范围90");
    	textViewjn2.setText("      等级1——增加护甲+1.5");
    	textViewjn3.setText("      等级2——增加护甲+3");
    	textViewjn4.setText("      等级3——增加护甲+4.5");
    }
    public void jn2paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);
    	textViewjn1.setText("      圣骑士可以将自己笼罩在一层无法穿透的光明结界中，从而免受任何物理和魔法伤害，魔法消耗25(快捷键D)");
    	textViewjn2.setText("      等级1——持续时间15s，使用间隔35s，效果无敌");
    	textViewjn3.setText("      等级2——持续时间30s，使用间隔50s，效果无敌");
    	textViewjn4.setText("      等级3——持续时间45s，使用间隔60s，效果无敌");
    }
    public void jn4paladin(View view) {
    	
    	TextView textViewjn1 = (TextView) this.findViewById(R.id.textViewjn1paladin);
    	TextView textViewjn2 = (TextView) this.findViewById(R.id.textViewjn2paladin);
    	TextView textViewjn3 = (TextView) this.findViewById(R.id.textViewjn3paladin);
    	TextView textViewjn4 = (TextView) this.findViewById(R.id.textViewjn4paladin);

    	textViewjn1.setText("      让已经死亡的最多6个我方单位重新返回战场.当死亡单位超过6个时，会将在范围内的最强大的6个单位复活 (快捷键R)。");
    	textViewjn2.setText("      使用间隔240s、魔法消耗200");
    	textViewjn3.setText("      距离40、作用范围90、作用目标地面、死亡、友军");
    	textViewjn4.setText("      复活最多６个我方单位");
    }
}
    
    

