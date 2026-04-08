package androidx.media3.p017ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AdOverlayInfo;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.ErrorMessageProvider;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.AbstractC1761c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.p017ui.AspectRatioFrameLayout;
import androidx.media3.p017ui.PlayerControlView;
import com.exchange.allin.R;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout implements AdViewProvider {

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ int f30021O = 0;

    /* JADX INFO: renamed from: A */
    public PlayerControlView.VisibilityListener f30022A;

    /* JADX INFO: renamed from: B */
    public FullscreenButtonClickListener f30023B;

    /* JADX INFO: renamed from: C */
    public int f30024C;

    /* JADX INFO: renamed from: D */
    public int f30025D;

    /* JADX INFO: renamed from: E */
    public Drawable f30026E;

    /* JADX INFO: renamed from: F */
    public int f30027F;

    /* JADX INFO: renamed from: G */
    public boolean f30028G;

    /* JADX INFO: renamed from: H */
    public ErrorMessageProvider f30029H;

    /* JADX INFO: renamed from: I */
    public CharSequence f30030I;

    /* JADX INFO: renamed from: J */
    public int f30031J;

    /* JADX INFO: renamed from: K */
    public boolean f30032K;

    /* JADX INFO: renamed from: L */
    public boolean f30033L;

    /* JADX INFO: renamed from: M */
    public boolean f30034M;

    /* JADX INFO: renamed from: N */
    public boolean f30035N;

    /* JADX INFO: renamed from: a */
    public final ComponentListener f30036a;

    /* JADX INFO: renamed from: b */
    public final AspectRatioFrameLayout f30037b;

    /* JADX INFO: renamed from: c */
    public final View f30038c;

    /* JADX INFO: renamed from: d */
    public final View f30039d;

    /* JADX INFO: renamed from: f */
    public final boolean f30040f;

    /* JADX INFO: renamed from: g */
    public final SurfaceSyncGroupCompatV34 f30041g;

    /* JADX INFO: renamed from: i */
    public final ImageView f30042i;

    /* JADX INFO: renamed from: j */
    public final ImageView f30043j;

    /* JADX INFO: renamed from: n */
    public final SubtitleView f30044n;

    /* JADX INFO: renamed from: o */
    public final View f30045o;

    /* JADX INFO: renamed from: p */
    public final TextView f30046p;

    /* JADX INFO: renamed from: q */
    public final PlayerControlView f30047q;

    /* JADX INFO: renamed from: r */
    public final FrameLayout f30048r;

    /* JADX INFO: renamed from: s */
    public final FrameLayout f30049s;

    /* JADX INFO: renamed from: t */
    public final Handler f30050t;

    /* JADX INFO: renamed from: u */
    public final Class f30051u;

    /* JADX INFO: renamed from: v */
    public final Method f30052v;

    /* JADX INFO: renamed from: w */
    public final Object f30053w;

    /* JADX INFO: renamed from: x */
    public Player f30054x;

    /* JADX INFO: renamed from: y */
    public boolean f30055y;

    /* JADX INFO: renamed from: z */
    public ControllerVisibilityListener f30056z;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34 {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ArtworkDisplayMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ComponentListener implements Player.Listener, View.OnClickListener, PlayerControlView.VisibilityListener, PlayerControlView.OnFullScreenModeChangedListener {

        /* JADX INFO: renamed from: a */
        public final Timeline.Period f30057a = new Timeline.Period();

        /* JADX INFO: renamed from: b */
        public Object f30058b;

        public ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: D */
        public final void mo9292D(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
            PlayerControlView playerControlView;
            int i2 = PlayerView.f30021O;
            PlayerView playerView = PlayerView.this;
            if (playerView.m11159d() && playerView.f30033L && (playerControlView = playerView.f30047q) != null) {
                playerControlView.m11122f();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: H */
        public final void mo9295H(int i, boolean z2) {
            int i2 = PlayerView.f30021O;
            PlayerView playerView = PlayerView.this;
            playerView.m11166k();
            if (!playerView.m11159d() || !playerView.f30033L) {
                playerView.m11160e(false);
                return;
            }
            PlayerControlView playerControlView = playerView.f30047q;
            if (playerControlView != null) {
                playerControlView.m11122f();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: J */
        public final void mo9297J(int i) {
            int i2 = PlayerView.f30021O;
            PlayerView playerView = PlayerView.this;
            playerView.m11166k();
            playerView.m11168m();
            if (!playerView.m11159d() || !playerView.f30033L) {
                playerView.m11160e(false);
                return;
            }
            PlayerControlView playerControlView = playerView.f30047q;
            if (playerControlView != null) {
                playerControlView.m11122f();
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener
        /* JADX INFO: renamed from: K */
        public final void mo11139K(boolean z2) {
            FullscreenButtonClickListener fullscreenButtonClickListener = PlayerView.this.f30023B;
            if (fullscreenButtonClickListener != null) {
                fullscreenButtonClickListener.m11173a();
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.VisibilityListener
        /* JADX INFO: renamed from: L */
        public final void mo11144L(int i) {
            int i2 = PlayerView.f30021O;
            PlayerView playerView = PlayerView.this;
            playerView.m11167l();
            ControllerVisibilityListener controllerVisibilityListener = playerView.f30056z;
            if (controllerVisibilityListener != null) {
                controllerVisibilityListener.m11172a();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: W */
        public final void mo9304W() {
            PlayerView playerView = PlayerView.this;
            View view = playerView.f30038c;
            if (view != null) {
                view.setVisibility(4);
                if (!playerView.m11157b()) {
                    playerView.m11158c();
                    return;
                }
                ImageView imageView = playerView.f30042i;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: X */
        public final void mo9305X(Tracks tracks) {
            PlayerView playerView = PlayerView.this;
            Player player = playerView.f30054x;
            player.getClass();
            Timeline timelineMo9262O = player.mo9215H(17) ? player.mo9262O() : Timeline.f25340a;
            if (timelineMo9262O.m9368p()) {
                this.f30058b = null;
            } else {
                boolean zMo9215H = player.mo9215H(30);
                Timeline.Period period = this.f30057a;
                if (!zMo9215H || player.mo9251A().f25417a.isEmpty()) {
                    Object obj = this.f30058b;
                    if (obj != null) {
                        int iMo9353b = timelineMo9262O.mo9353b(obj);
                        if (iMo9353b != -1) {
                            if (player.mo9255G() == timelineMo9262O.mo9354f(iMo9353b, period, false).f25343c) {
                                return;
                            }
                        }
                        this.f30058b = null;
                    }
                } else {
                    this.f30058b = timelineMo9262O.mo9354f(player.mo9281n(), period, true).f25342b;
                }
            }
            playerView.m11169n(false);
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: a */
        public final void mo9307a(VideoSize videoSize) {
            PlayerView playerView;
            Player player;
            if (videoSize.equals(VideoSize.f25425d) || (player = (playerView = PlayerView.this).f30054x) == null || player.mo9289z() == 1) {
                return;
            }
            playerView.m11165j();
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: i0 */
        public final void mo9311i0(int i, int i2) {
            if (Util.f25665a == 34) {
                PlayerView playerView = PlayerView.this;
                if ((playerView.f30039d instanceof SurfaceView) && playerView.f30035N) {
                    SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34 = playerView.f30041g;
                    surfaceSyncGroupCompatV34.getClass();
                    playerView.f30050t.post(new RunnableC2005i(surfaceSyncGroupCompatV34, (SurfaceView) playerView.f30039d, new RunnableC1997a(2, playerView)));
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: m */
        public final void mo9313m(CueGroup cueGroup) {
            SubtitleView subtitleView = PlayerView.this.f30044n;
            if (subtitleView != null) {
                subtitleView.setCues(cueGroup.f25554a);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.f30021O;
            PlayerView.this.m11164i();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ControllerVisibilityListener {
        /* JADX INFO: renamed from: a */
        void m11172a();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface FullscreenButtonClickListener {
        /* JADX INFO: renamed from: a */
        void m11173a();
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ImageDisplayMode {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ShowBuffering {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class SurfaceSyncGroupCompatV34 {

        /* JADX INFO: renamed from: a */
        public SurfaceSyncGroup f30060a;
    }

    public PlayerView(Context context) {
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, null, 0);
        ComponentListener componentListener = new ComponentListener();
        this.f30036a = componentListener;
        this.f30050t = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f30037b = null;
            this.f30038c = null;
            this.f30039d = null;
            this.f30040f = false;
            this.f30041g = null;
            this.f30042i = null;
            this.f30043j = null;
            this.f30044n = null;
            this.f30045o = null;
            this.f30046p = null;
            this.f30047q = null;
            this.f30048r = null;
            this.f30049s = null;
            this.f30051u = null;
            this.f30052v = null;
            this.f30053w = null;
            ImageView imageView = new ImageView(context);
            if (Util.f25665a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f30037b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f30038c = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (Util.f25665a >= 34) {
                AbstractC1761c.m9729v(surfaceView);
            }
            this.f30039d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(componentListener);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f30039d = null;
        }
        this.f30040f = false;
        this.f30041g = Util.f25665a == 34 ? new SurfaceSyncGroupCompatV34() : null;
        this.f30048r = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f30049s = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f30042i = (ImageView) findViewById(R.id.exo_image);
        this.f30025D = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new C2004h(this));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f30051u = cls;
        this.f30052v = method;
        this.f30053w = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f30043j = imageView2;
        this.f30024C = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f30044n = subtitleView;
        if (subtitleView != null) {
            subtitleView.m11176a();
            subtitleView.m11177b();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.f30045o = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f30027F = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f30046p = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f30047q = playerControlView;
        } else if (viewFindViewById2 != null) {
            PlayerControlView playerControlView2 = new PlayerControlView(context);
            this.f30047q = playerControlView2;
            playerControlView2.setId(R.id.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            this.f30047q = null;
        }
        PlayerControlView playerControlView3 = this.f30047q;
        this.f30031J = playerControlView3 != null ? 5000 : 0;
        this.f30034M = true;
        this.f30032K = true;
        this.f30033L = true;
        this.f30055y = playerControlView3 != null;
        if (playerControlView3 != null) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView3.f29910a;
            int i = playerControlViewLayoutManager.f30008z;
            if (i != 3 && i != 2) {
                playerControlViewLayoutManager.m11151f();
                playerControlViewLayoutManager.m11154i(2);
            }
            PlayerControlView playerControlView4 = this.f30047q;
            ComponentListener componentListener2 = this.f30036a;
            playerControlView4.getClass();
            componentListener2.getClass();
            playerControlView4.f29916d.add(componentListener2);
        }
        setClickable(true);
        m11167l();
    }

    /* JADX INFO: renamed from: a */
    public static void m11156a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        Player player = playerView.f30054x;
        if (player != null && player.mo9215H(30) && player.mo9251A().m9390a(2)) {
            return;
        }
        ImageView imageView = playerView.f30042i;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.m11170o();
        }
        View view = playerView.f30038c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f30042i;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        m11170o();
    }

    private void setImageOutput(Player player) {
        Class cls = this.f30051u;
        if (cls == null || !cls.isAssignableFrom(player.getClass())) {
            return;
        }
        try {
            Method method = this.f30052v;
            method.getClass();
            Object obj = this.f30053w;
            obj.getClass();
            method.invoke(player, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11157b() {
        Player player = this.f30054x;
        return player != null && this.f30053w != null && player.mo9215H(30) && player.mo9251A().m9390a(4);
    }

    /* JADX INFO: renamed from: c */
    public final void m11158c() {
        ImageView imageView = this.f30042i;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11159d() {
        Player player = this.f30054x;
        return player != null && player.mo9215H(16) && this.f30054x.mo9275f() && this.f30054x.mo9278j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (Util.f25665a != 34 || (surfaceSyncGroupCompatV34 = this.f30041g) == null || !this.f30035N || (surfaceSyncGroup = surfaceSyncGroupCompatV34.f30060a) == null) {
            return;
        }
        AbstractC1761c.m9730w(surfaceSyncGroup);
        surfaceSyncGroupCompatV34.f30060a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f30054x;
        if (player != null && player.mo9215H(16) && this.f30054x.mo9275f()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z2 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.f30047q;
        if (z2 && m11171p() && !playerControlView.m11123g()) {
            m11160e(true);
            return true;
        }
        if ((m11171p() && playerControlView.m11119c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m11160e(true);
            return true;
        }
        if (z2 && m11171p()) {
            m11160e(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m11160e(boolean z2) {
        if (!(m11159d() && this.f30033L) && m11171p()) {
            PlayerControlView playerControlView = this.f30047q;
            boolean z3 = playerControlView.m11123g() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zM11162g = m11162g();
            if (z2 || z3 || zM11162g) {
                m11163h(zM11162g);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11161f(Drawable drawable) {
        ImageView imageView = this.f30043j;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f30024C == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f30037b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11162g() {
        Player player = this.f30054x;
        if (player != null) {
            int iMo9289z = player.mo9289z();
            if (!this.f30032K) {
                return false;
            }
            if (this.f30054x.mo9215H(17) && this.f30054x.mo9262O().m9368p()) {
                return false;
            }
            if (iMo9289z != 1 && iMo9289z != 4) {
                Player player2 = this.f30054x;
                player2.getClass();
                if (player2.mo9278j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f30049s;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        PlayerControlView playerControlView = this.f30047q;
        if (playerControlView != null) {
            arrayList.add(new AdOverlayInfo(playerControlView));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f30048r;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    @UnstableApi
    public int getArtworkDisplayMode() {
        return this.f30024C;
    }

    @UnstableApi
    public boolean getControllerAutoShow() {
        return this.f30032K;
    }

    @UnstableApi
    public boolean getControllerHideOnTouch() {
        return this.f30034M;
    }

    @UnstableApi
    public int getControllerShowTimeoutMs() {
        return this.f30031J;
    }

    @Nullable
    @UnstableApi
    public Drawable getDefaultArtwork() {
        return this.f30026E;
    }

    @UnstableApi
    public int getImageDisplayMode() {
        return this.f30025D;
    }

    @Nullable
    @UnstableApi
    public FrameLayout getOverlayFrameLayout() {
        return this.f30049s;
    }

    @Nullable
    public Player getPlayer() {
        return this.f30054x;
    }

    @UnstableApi
    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f30037b;
        Assertions.m9466g(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    @UnstableApi
    public SubtitleView getSubtitleView() {
        return this.f30044n;
    }

    @UnstableApi
    @Deprecated
    public boolean getUseArtwork() {
        return this.f30024C != 0;
    }

    public boolean getUseController() {
        return this.f30055y;
    }

    @Nullable
    @UnstableApi
    public View getVideoSurfaceView() {
        return this.f30039d;
    }

    /* JADX INFO: renamed from: h */
    public final void m11163h(boolean z2) {
        if (m11171p()) {
            int i = z2 ? 0 : this.f30031J;
            PlayerControlView playerControlView = this.f30047q;
            playerControlView.setShowTimeoutMs(i);
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.f29910a;
            PlayerControlView playerControlView2 = playerControlViewLayoutManager.f29983a;
            if (!playerControlView2.m11124h()) {
                playerControlView2.setVisibility(0);
                playerControlView2.m11125i();
                ImageView imageView = playerControlView2.f29943t;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            playerControlViewLayoutManager.m11155k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11164i() {
        if (!m11171p() || this.f30054x == null) {
            return;
        }
        PlayerControlView playerControlView = this.f30047q;
        if (!playerControlView.m11123g()) {
            m11160e(true);
        } else if (this.f30034M) {
            playerControlView.m11122f();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11165j() {
        Player player = this.f30054x;
        VideoSize videoSizeMo9283p = player != null ? player.mo9283p() : VideoSize.f25425d;
        int i = videoSizeMo9283p.f25426a;
        int i2 = videoSizeMo9283p.f25427b;
        float f = this.f30040f ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * videoSizeMo9283p.f25428c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f30037b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11166k() {
        boolean z2;
        View view = this.f30045o;
        if (view != null) {
            Player player = this.f30054x;
            if (player == null || player.mo9289z() != 2) {
                z2 = false;
            } else {
                int i = this.f30027F;
                z2 = true;
                if (i != 2 && (i != 1 || !this.f30054x.mo9278j())) {
                }
            }
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11167l() {
        PlayerControlView playerControlView = this.f30047q;
        if (playerControlView == null || !this.f30055y) {
            setContentDescription(null);
        } else if (playerControlView.m11123g()) {
            setContentDescription(this.f30034M ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11168m() {
        ErrorMessageProvider errorMessageProvider;
        TextView textView = this.f30046p;
        if (textView != null) {
            CharSequence charSequence = this.f30030I;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            Player player = this.f30054x;
            if ((player != null ? player.mo9271a() : null) == null || (errorMessageProvider = this.f30029H) == null) {
                textView.setVisibility(8);
            } else {
                textView.setText((CharSequence) errorMessageProvider.m9242a().second);
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11169n(boolean z2) {
        byte[] bArr;
        Drawable drawable;
        Player player = this.f30054x;
        boolean zM11161f = false;
        boolean z3 = (player == null || !player.mo9215H(30) || player.mo9251A().f25417a.isEmpty()) ? false : true;
        boolean z4 = this.f30028G;
        ImageView imageView = this.f30043j;
        View view = this.f30038c;
        if (!z4 && (!z3 || z2)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m11158c();
        }
        if (z3) {
            Player player2 = this.f30054x;
            boolean z5 = player2 != null && player2.mo9215H(30) && player2.mo9251A().m9390a(2);
            boolean zM11157b = m11157b();
            if (!z5 && !zM11157b) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m11158c();
            }
            ImageView imageView2 = this.f30042i;
            boolean z6 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM11157b && !z5 && z6) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m11170o();
                }
            } else if (z5 && !zM11157b && z6) {
                m11158c();
            }
            if (!z5 && !zM11157b && this.f30024C != 0) {
                Assertions.m9466g(imageView);
                if (player != null && player.mo9215H(18) && (bArr = player.mo9268X().f25264f) != null) {
                    zM11161f = m11161f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM11161f || m11161f(this.f30026E)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11170o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f30042i;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f30025D == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f30037b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m11171p() || this.f30054x == null) {
            return false;
        }
        m11160e(true);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m11171p() {
        if (!this.f30055y) {
            return false;
        }
        Assertions.m9466g(this.f30047q);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m11164i();
        return super.performClick();
    }

    @UnstableApi
    public void setArtworkDisplayMode(int i) {
        Assertions.m9464e(i == 0 || this.f30043j != null);
        if (this.f30024C != i) {
            this.f30024C = i;
            m11169n(false);
        }
    }

    @UnstableApi
    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f30037b;
        Assertions.m9466g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aspectRatioListener);
    }

    @UnstableApi
    public void setControllerAnimationEnabled(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setAnimationEnabled(z2);
    }

    @UnstableApi
    public void setControllerAutoShow(boolean z2) {
        this.f30032K = z2;
    }

    @UnstableApi
    public void setControllerHideDuringAds(boolean z2) {
        this.f30033L = z2;
    }

    @UnstableApi
    public void setControllerHideOnTouch(boolean z2) {
        Assertions.m9466g(this.f30047q);
        this.f30034M = z2;
        m11167l();
    }

    @UnstableApi
    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        this.f30023B = null;
        playerControlView.setOnFullScreenModeChangedListener(onFullScreenModeChangedListener);
    }

    @UnstableApi
    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        this.f30031J = i;
        if (playerControlView.m11123g()) {
            m11163h(m11162g());
        }
    }

    public void setControllerVisibilityListener(@Nullable ControllerVisibilityListener controllerVisibilityListener) {
        this.f30056z = controllerVisibilityListener;
        if (controllerVisibilityListener != null) {
            setControllerVisibilityListener((PlayerControlView.VisibilityListener) null);
        }
    }

    @UnstableApi
    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        Assertions.m9464e(this.f30046p != null);
        this.f30030I = charSequence;
        m11168m();
    }

    @UnstableApi
    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f30026E != drawable) {
            this.f30026E = drawable;
            m11169n(false);
        }
    }

    @UnstableApi
    public void setEnableComposeSurfaceSyncWorkaround(boolean z2) {
        this.f30035N = z2;
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.f30029H != errorMessageProvider) {
            this.f30029H = errorMessageProvider;
            m11168m();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable FullscreenButtonClickListener fullscreenButtonClickListener) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        this.f30023B = fullscreenButtonClickListener;
        playerControlView.setOnFullScreenModeChangedListener(this.f30036a);
    }

    @UnstableApi
    public void setFullscreenButtonState(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        if (playerControlView.f29940r0 == z2) {
            return;
        }
        playerControlView.f29940r0 = z2;
        String str = playerControlView.f29932n0;
        Drawable drawable = playerControlView.f29929l0;
        String str2 = playerControlView.f29930m0;
        Drawable drawable2 = playerControlView.f29928k0;
        ImageView imageView = playerControlView.f29885C;
        if (imageView != null) {
            if (z2) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = playerControlView.f29887D;
        if (imageView2 != null) {
            if (z2) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener = playerControlView.f29938q0;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.mo11139K(z2);
        }
    }

    @UnstableApi
    public void setImageDisplayMode(int i) {
        Assertions.m9464e(this.f30042i != null);
        if (this.f30025D != i) {
            this.f30025D = i;
            m11170o();
        }
    }

    @UnstableApi
    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.f30028G != z2) {
            this.f30028G = z2;
            m11169n(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(@Nullable Player player) {
        Assertions.m9464e(Looper.myLooper() == Looper.getMainLooper());
        Assertions.m9460a(player == null || player.mo9263P() == Looper.getMainLooper());
        Player player2 = this.f30054x;
        if (player2 == player) {
            return;
        }
        View view = this.f30039d;
        ComponentListener componentListener = this.f30036a;
        if (player2 != null) {
            player2.mo9253D(componentListener);
            if (player2.mo9215H(27)) {
                if (view instanceof TextureView) {
                    player2.mo9282o((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    player2.mo9258K((SurfaceView) view);
                }
            }
            Class cls = this.f30051u;
            if (cls != null && cls.isAssignableFrom(player2.getClass())) {
                try {
                    Method method = this.f30052v;
                    method.getClass();
                    method.invoke(player2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        SubtitleView subtitleView = this.f30044n;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f30054x = player;
        boolean zM11171p = m11171p();
        PlayerControlView playerControlView = this.f30047q;
        if (zM11171p) {
            playerControlView.setPlayer(player);
        }
        m11166k();
        m11168m();
        m11169n(true);
        if (player == null) {
            if (playerControlView != null) {
                playerControlView.m11122f();
                return;
            }
            return;
        }
        if (player.mo9215H(27)) {
            if (view instanceof TextureView) {
                player.mo9267V((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player.mo9285t((SurfaceView) view);
            }
            if (player.mo9215H(30)) {
                Tracks tracksMo9251A = player.mo9251A();
                boolean z2 = false;
                int i = 0;
                loop0: while (true) {
                    ImmutableList immutableList = tracksMo9251A.f25417a;
                    if (i >= immutableList.size()) {
                        break;
                    }
                    if (((Tracks.Group) immutableList.get(i)).f25419b.f25367c == 2) {
                        Tracks.Group group = (Tracks.Group) immutableList.get(i);
                        for (int i2 = 0; i2 < group.f25421d.length; i2++) {
                            if (group.m9392b(i2)) {
                                z2 = true;
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                if (z2) {
                    m11165j();
                }
            }
        }
        if (subtitleView != null && player.mo9215H(28)) {
            subtitleView.setCues(player.mo9252C().f25554a);
        }
        player.mo9259L(componentListener);
        setImageOutput(player);
        m11160e(false);
    }

    @UnstableApi
    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setRepeatToggleModes(i);
    }

    @UnstableApi
    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f30037b;
        Assertions.m9466g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    @UnstableApi
    public void setShowBuffering(int i) {
        if (this.f30027F != i) {
            this.f30027F = i;
            m11166k();
        }
    }

    @UnstableApi
    public void setShowFastForwardButton(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowFastForwardButton(z2);
    }

    @UnstableApi
    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z2);
    }

    @UnstableApi
    public void setShowNextButton(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowNextButton(z2);
    }

    @UnstableApi
    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z2);
    }

    @UnstableApi
    public void setShowPreviousButton(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowPreviousButton(z2);
    }

    @UnstableApi
    public void setShowRewindButton(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowRewindButton(z2);
    }

    @UnstableApi
    public void setShowShuffleButton(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowShuffleButton(z2);
    }

    @UnstableApi
    public void setShowSubtitleButton(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowSubtitleButton(z2);
    }

    @UnstableApi
    public void setShowVrButton(boolean z2) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        playerControlView.setShowVrButton(z2);
    }

    @UnstableApi
    public void setShutterBackgroundColor(@ColorInt int i) {
        View view = this.f30038c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @UnstableApi
    @Deprecated
    public void setUseArtwork(boolean z2) {
        setArtworkDisplayMode(!z2 ? 1 : 0);
    }

    public void setUseController(boolean z2) {
        boolean z3 = true;
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9464e((z2 && playerControlView == null) ? false : true);
        if (!z2 && !hasOnClickListeners()) {
            z3 = false;
        }
        setClickable(z3);
        if (this.f30055y == z2) {
            return;
        }
        this.f30055y = z2;
        if (m11171p()) {
            playerControlView.setPlayer(this.f30054x);
        } else if (playerControlView != null) {
            playerControlView.m11122f();
            playerControlView.setPlayer(null);
        }
        m11167l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f30039d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    @UnstableApi
    @Deprecated
    public void setControllerVisibilityListener(@Nullable PlayerControlView.VisibilityListener visibilityListener) {
        PlayerControlView playerControlView = this.f30047q;
        Assertions.m9466g(playerControlView);
        PlayerControlView.VisibilityListener visibilityListener2 = this.f30022A;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = playerControlView.f29916d;
        if (visibilityListener2 != null) {
            copyOnWriteArrayList.remove(visibilityListener2);
        }
        this.f30022A = visibilityListener;
        if (visibilityListener != null) {
            copyOnWriteArrayList.add(visibilityListener);
            setControllerVisibilityListener((ControllerVisibilityListener) null);
        }
    }
}
