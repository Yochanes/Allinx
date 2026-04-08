package androidx.media3.p017ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.p017ui.PlayerControlView;
import com.exchange.allin.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class PlayerControlViewLayoutManager {

    /* JADX INFO: renamed from: A */
    public boolean f29980A;

    /* JADX INFO: renamed from: B */
    public boolean f29981B;

    /* JADX INFO: renamed from: a */
    public final PlayerControlView f29983a;

    /* JADX INFO: renamed from: b */
    public final View f29984b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f29985c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f29986d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f29987e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f29988f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f29989g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f29990h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f29991i;

    /* JADX INFO: renamed from: j */
    public final View f29992j;

    /* JADX INFO: renamed from: k */
    public final View f29993k;

    /* JADX INFO: renamed from: l */
    public final AnimatorSet f29994l;

    /* JADX INFO: renamed from: m */
    public final AnimatorSet f29995m;

    /* JADX INFO: renamed from: n */
    public final AnimatorSet f29996n;

    /* JADX INFO: renamed from: o */
    public final AnimatorSet f29997o;

    /* JADX INFO: renamed from: p */
    public final AnimatorSet f29998p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f29999q;

    /* JADX INFO: renamed from: r */
    public final ValueAnimator f30000r;

    /* JADX INFO: renamed from: s */
    public final RunnableC2001e f30001s = new RunnableC2001e(this, 0);

    /* JADX INFO: renamed from: t */
    public final RunnableC2001e f30002t = new RunnableC2001e(this, 3);

    /* JADX INFO: renamed from: u */
    public final RunnableC2001e f30003u = new RunnableC2001e(this, 4);

    /* JADX INFO: renamed from: v */
    public final RunnableC2001e f30004v = new RunnableC2001e(this, 5);

    /* JADX INFO: renamed from: w */
    public final RunnableC2001e f30005w = new RunnableC2001e(this, 6);

    /* JADX INFO: renamed from: x */
    public final ViewOnLayoutChangeListenerC2003g f30006x = new ViewOnLayoutChangeListenerC2003g(this, 0);

    /* JADX INFO: renamed from: C */
    public boolean f29982C = true;

    /* JADX INFO: renamed from: z */
    public int f30008z = 0;

    /* JADX INFO: renamed from: y */
    public final ArrayList f30007y = new ArrayList();

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$1 */
    /* JADX INFO: compiled from: Proguard */
    class C19821 extends AnimatorListenerAdapter {
        public C19821() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
            View view = playerControlViewLayoutManager.f29984b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = playerControlViewLayoutManager.f29985c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = playerControlViewLayoutManager.f29987e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
            View view = playerControlViewLayoutManager.f29992j;
            if (!(view instanceof DefaultTimeBar) || playerControlViewLayoutManager.f29980A) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
            ValueAnimator valueAnimator = defaultTimeBar.f29832J;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(defaultTimeBar.f29833K, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$2 */
    /* JADX INFO: compiled from: Proguard */
    class C19832 extends AnimatorListenerAdapter {
        public C19832() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
            View view = playerControlViewLayoutManager.f29984b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = playerControlViewLayoutManager.f29985c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = playerControlViewLayoutManager.f29987e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(playerControlViewLayoutManager.f29980A ? 0 : 4);
            }
            View view2 = playerControlViewLayoutManager.f29992j;
            if (!(view2 instanceof DefaultTimeBar) || playerControlViewLayoutManager.f29980A) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
            ValueAnimator valueAnimator = defaultTimeBar.f29832J;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            defaultTimeBar.f29834L = false;
            valueAnimator.setFloatValues(defaultTimeBar.f29833K, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$3 */
    /* JADX INFO: compiled from: Proguard */
    class C19843 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PlayerControlView f30011a;

        public C19843(PlayerControlView playerControlView) {
            this.f30011a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
            playerControlViewLayoutManager.m11154i(1);
            if (playerControlViewLayoutManager.f29981B) {
                this.f30011a.post(playerControlViewLayoutManager.f30001s);
                playerControlViewLayoutManager.f29981B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager.this.m11154i(3);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$4 */
    /* JADX INFO: compiled from: Proguard */
    class C19854 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PlayerControlView f30013a;

        public C19854(PlayerControlView playerControlView) {
            this.f30013a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
            playerControlViewLayoutManager.m11154i(2);
            if (playerControlViewLayoutManager.f29981B) {
                this.f30013a.post(playerControlViewLayoutManager.f30001s);
                playerControlViewLayoutManager.f29981B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager.this.m11154i(3);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$5 */
    /* JADX INFO: compiled from: Proguard */
    class C19865 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PlayerControlView f30015a;

        public C19865(PlayerControlView playerControlView) {
            this.f30015a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
            playerControlViewLayoutManager.m11154i(2);
            if (playerControlViewLayoutManager.f29981B) {
                this.f30015a.post(playerControlViewLayoutManager.f30001s);
                playerControlViewLayoutManager.f29981B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager.this.m11154i(3);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$6 */
    /* JADX INFO: compiled from: Proguard */
    class C19876 extends AnimatorListenerAdapter {
        public C19876() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerControlViewLayoutManager.this.m11154i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager.this.m11154i(4);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$7 */
    /* JADX INFO: compiled from: Proguard */
    class C19887 extends AnimatorListenerAdapter {
        public C19887() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerControlViewLayoutManager.this.m11154i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager.this.m11154i(4);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$8 */
    /* JADX INFO: compiled from: Proguard */
    class C19898 extends AnimatorListenerAdapter {
        public C19898() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = PlayerControlViewLayoutManager.this.f29988f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
            ViewGroup viewGroup = playerControlViewLayoutManager.f29990h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                playerControlViewLayoutManager.f29990h.setTranslationX(r0.getWidth());
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f29990h;
                viewGroup2.scrollTo(viewGroup2.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.PlayerControlViewLayoutManager$9 */
    /* JADX INFO: compiled from: Proguard */
    class C19909 extends AnimatorListenerAdapter {
        public C19909() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = PlayerControlViewLayoutManager.this.f29990h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = PlayerControlViewLayoutManager.this.f29988f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    public PlayerControlViewLayoutManager(PlayerControlView playerControlView) {
        this.f29983a = playerControlView;
        this.f29984b = playerControlView.findViewById(R.id.exo_controls_background);
        this.f29985c = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.f29987e = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.f29986d = viewGroup;
        this.f29991i = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(R.id.exo_progress);
        this.f29992j = viewFindViewById;
        this.f29988f = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.f29989g = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.f29990h = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.f29993k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC1998b(this, 3));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC1998b(this, 3));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C2002f(this, 3));
        valueAnimatorOfFloat.addListener(new C19821());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new C2002f(this, 0));
        valueAnimatorOfFloat2.addListener(new C19832());
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29994l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C19843(playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(m11146d(0.0f, dimension, viewFindViewById)).with(m11146d(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29995m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C19854(playerControlView));
        animatorSet2.play(m11146d(dimension, dimension2, viewFindViewById)).with(m11146d(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f29996n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C19865(playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(m11146d(0.0f, dimension2, viewFindViewById)).with(m11146d(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f29997o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C19876());
        animatorSet4.play(valueAnimatorOfFloat2).with(m11146d(dimension, 0.0f, viewFindViewById)).with(m11146d(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f29998p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C19887());
        animatorSet5.play(valueAnimatorOfFloat2).with(m11146d(dimension2, 0.0f, viewFindViewById)).with(m11146d(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f29999q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new C2002f(this, 1));
        valueAnimatorOfFloat3.addListener(new C19898());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f30000r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new C2002f(this, 2));
        valueAnimatorOfFloat4.addListener(new C19909());
    }

    /* JADX INFO: renamed from: c */
    public static int m11145c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* JADX INFO: renamed from: d */
    public static ObjectAnimator m11146d(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m11147j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: renamed from: a */
    public final void m11148a(float f) {
        ViewGroup viewGroup = this.f29990h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f29991i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f29988f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11149b(View view) {
        return view != null && this.f30007y.contains(view);
    }

    /* JADX INFO: renamed from: e */
    public final void m11150e(Runnable runnable, long j) {
        if (j >= 0) {
            this.f29983a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11151f() {
        RunnableC2001e runnableC2001e = this.f30005w;
        PlayerControlView playerControlView = this.f29983a;
        playerControlView.removeCallbacks(runnableC2001e);
        playerControlView.removeCallbacks(this.f30002t);
        playerControlView.removeCallbacks(this.f30004v);
        playerControlView.removeCallbacks(this.f30003u);
    }

    /* JADX INFO: renamed from: g */
    public final void m11152g() {
        if (this.f30008z == 3) {
            return;
        }
        m11151f();
        int showTimeoutMs = this.f29983a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f29982C) {
                m11150e(this.f30005w, showTimeoutMs);
            } else if (this.f30008z == 1) {
                m11150e(this.f30003u, 2000L);
            } else {
                m11150e(this.f30004v, showTimeoutMs);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11153h(View view, boolean z2) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f30007y;
        if (!z2) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f29980A && m11147j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: i */
    public final void m11154i(int i) {
        int i2 = this.f30008z;
        this.f30008z = i;
        PlayerControlView playerControlView = this.f29983a;
        if (i == 2) {
            playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = playerControlView.f29916d.iterator();
            while (it.hasNext()) {
                ((PlayerControlView.VisibilityListener) it.next()).mo11144L(playerControlView.getVisibility());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11155k() {
        if (!this.f29982C) {
            m11154i(0);
            m11152g();
            return;
        }
        int i = this.f30008z;
        if (i == 1) {
            this.f29997o.start();
        } else if (i == 2) {
            this.f29998p.start();
        } else if (i == 3) {
            this.f29981B = true;
        } else if (i == 4) {
            return;
        }
        m11152g();
    }
}
