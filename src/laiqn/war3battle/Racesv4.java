package laiqn.war3battle;


import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
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
import android.widget.Toast;

public class Racesv4 extends Activity {
	
	public static Racesv4 instance = null;
	 
	private ViewPager mTabPager;	
	private ImageView mTabImg;// ����ͼƬ
	private ImageView mTab1,mTab2,mTab3,mTab4;
	private int zero = 0;// ����ͼƬƫ����
	private int currIndex = 0;// ��ǰҳ�����
	private int one;//����ˮƽ����λ��
	private int two;
	private int three;
	private LinearLayout mClose;
    private LinearLayout mCloseBtn;
    private View layout;	
	private boolean menu_display = false;
	private PopupWindow menuWindow;
	private LayoutInflater inflater;
	private TextView textView1;
	private Button mButton;
	//private Button mRightBtn;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_racesv4);
         //����activityʱ���Զ����������
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 
        instance = this;
        /*
        mRightBtn = (Button) findViewById(R.id.right_btn);
        mRightBtn.setOnClickListener(new Button.OnClickListener()
		{	@Override
			public void onClick(View v)
			{	showPopupWindow (MainWeixin.this,mRightBtn);
			}
		  });*/
        
        mTabPager = (ViewPager)findViewById(R.id.tabpager);


        Display currDisplay = getWindowManager().getDefaultDisplay();//��ȡ��Ļ��ǰ�ֱ���
        int displayWidth = currDisplay.getWidth();
        int displayHeight = currDisplay.getHeight();
        one = displayWidth/4; //����ˮƽ����ƽ�ƴ�С
        two = one*2;
        three = one*3;
        //Log.i("info", "��ȡ����Ļ�ֱ���Ϊ" + one + two + three + "X" + displayHeight);
        
        //InitImageView();//ʹ�ö���
      //��Ҫ��ҳ��ʾ��Viewװ��������
        LayoutInflater mLi = LayoutInflater.from(this);
        View view1 = mLi.inflate(R.layout.activity_undead, null);
        View view3 = mLi.inflate(R.layout.activity_human, null);
        View view4 = mLi.inflate(R.layout.activity_orc, null);
        View view5 = mLi.inflate(R.layout.activity_ne, null);
        View view2 = mLi.inflate(R.layout.activity_neu, null);
        
      //ÿ��ҳ���view���
        final ArrayList<View> views = new ArrayList<View>();
        views.add(view1);
        views.add(view2);
        views.add(view3);
        views.add(view4);
        views.add(view5);
      //���ViewPager�����������
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
			
			//@Override
			//public CharSequence getPageTitle(int position) {
				//return titles.get(position);
			//}
			
			@Override
			public Object instantiateItem(View container, int position) {
				((ViewPager)container).addView(views.get(position));
				return views.get(position);
			}
		};
		
		mTabPager.setAdapter(mPagerAdapter);
    }
    /**
	 * ͷ��������
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
    

	

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        Intent intent = new Intent(this, MainActivity.class);
	        startActivity(intent);
	        this.finish();
	}
		return false;
	}
	
    public void humanv1(View view) {
        Intent intent = new Intent(this, Humanintro.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }

    public void humanhero(View view) {
        Intent intent = new Intent(this, Humanhero.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void humanbattle(View view) {
        Intent intent = new Intent(this, Humanbattle.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    
    public void orcv1(View view) {
        Intent intent = new Intent(this, Orcintro.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }

    public void orchero(View view) {
        Intent intent = new Intent(this, Orchero.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void orcbattle(View view) {
        Intent intent = new Intent(this, Orcbattle.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void nev1(View view) {
        Intent intent = new Intent(this, Neintro.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void nehero(View view) {
        Intent intent = new Intent(this, Nehero.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }

    public void nebattle(View view) {
        Intent intent = new Intent(this, Nebattle.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadv1(View view) {
        Intent intent = new Intent(this, Undeadintro.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadhero(View view) {
        Intent intent = new Intent(this, Undeadhero.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadbattle(View view) {
        Intent intent = new Intent(this, Undeadbattle.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void humanunits(View view) {
        Intent intent = new Intent(this, Humanunits.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void orcunits(View view) {
        Intent intent = new Intent(this, Orcunits.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void neunits(View view) {
        Intent intent = new Intent(this, Neunits.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadunits(View view) {
        Intent intent = new Intent(this, Undeadunits.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void neuintro(View view) {
        Intent intent = new Intent(this, Neuintro.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void neuunits(View view) {
        Intent intent = new Intent(this, Neuunits.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void humanshort(View view) {
        Intent intent = new Intent(this, Humanshort.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void orcshort(View view) {
        Intent intent = new Intent(this, Orcshort.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void neshort(View view) {
        Intent intent = new Intent(this, Neshort.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadshort(View view) {
        Intent intent = new Intent(this, Undeadshort.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void neushort(View view) {
        Intent intent = new Intent(this, Neushort.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void humanplayer(View view) {
        Intent intent = new Intent(this, Humanplayer.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void orcplayer(View view) {
        Intent intent = new Intent(this, Orcplayer.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void neplayer(View view) {
        Intent intent = new Intent(this, Neplayer.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
    public void undeadplayer(View view) {
        Intent intent = new Intent(this, Undeadplayer.class);
        startActivity(intent);
		MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
		mediaPlayer2.start(); 
        this.finish();
    }
}
    
    

