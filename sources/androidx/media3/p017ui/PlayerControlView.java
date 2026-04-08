package androidx.media3.p017ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.p017ui.TimeBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.exchange.allin.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class PlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: G0 */
    public static final float[] f29880G0;

    /* JADX INFO: renamed from: A */
    public final ImageView f29881A;

    /* JADX INFO: renamed from: A0 */
    public long[] f29882A0;

    /* JADX INFO: renamed from: B */
    public final ImageView f29883B;

    /* JADX INFO: renamed from: B0 */
    public boolean[] f29884B0;

    /* JADX INFO: renamed from: C */
    public final ImageView f29885C;

    /* JADX INFO: renamed from: C0 */
    public final long[] f29886C0;

    /* JADX INFO: renamed from: D */
    public final ImageView f29887D;

    /* JADX INFO: renamed from: D0 */
    public final boolean[] f29888D0;

    /* JADX INFO: renamed from: E */
    public final View f29889E;

    /* JADX INFO: renamed from: E0 */
    public long f29890E0;

    /* JADX INFO: renamed from: F */
    public final View f29891F;

    /* JADX INFO: renamed from: F0 */
    public boolean f29892F0;

    /* JADX INFO: renamed from: G */
    public final View f29893G;

    /* JADX INFO: renamed from: H */
    public final TextView f29894H;

    /* JADX INFO: renamed from: I */
    public final TextView f29895I;

    /* JADX INFO: renamed from: J */
    public final TimeBar f29896J;

    /* JADX INFO: renamed from: K */
    public final StringBuilder f29897K;

    /* JADX INFO: renamed from: L */
    public final Formatter f29898L;

    /* JADX INFO: renamed from: M */
    public final Timeline.Period f29899M;

    /* JADX INFO: renamed from: N */
    public final Timeline.Window f29900N;

    /* JADX INFO: renamed from: O */
    public final RunnableC1997a f29901O;

    /* JADX INFO: renamed from: P */
    public final Drawable f29902P;

    /* JADX INFO: renamed from: Q */
    public final Drawable f29903Q;

    /* JADX INFO: renamed from: R */
    public final Drawable f29904R;

    /* JADX INFO: renamed from: S */
    public final Drawable f29905S;

    /* JADX INFO: renamed from: T */
    public final Drawable f29906T;

    /* JADX INFO: renamed from: U */
    public final String f29907U;

    /* JADX INFO: renamed from: V */
    public final String f29908V;

    /* JADX INFO: renamed from: W */
    public final String f29909W;

    /* JADX INFO: renamed from: a */
    public final PlayerControlViewLayoutManager f29910a;

    /* JADX INFO: renamed from: a0 */
    public final Drawable f29911a0;

    /* JADX INFO: renamed from: b */
    public final Resources f29912b;

    /* JADX INFO: renamed from: b0 */
    public final Drawable f29913b0;

    /* JADX INFO: renamed from: c */
    public final ComponentListener f29914c;

    /* JADX INFO: renamed from: c0 */
    public final float f29915c0;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f29916d;

    /* JADX INFO: renamed from: d0 */
    public final float f29917d0;

    /* JADX INFO: renamed from: e0 */
    public final String f29918e0;

    /* JADX INFO: renamed from: f */
    public final RecyclerView f29919f;

    /* JADX INFO: renamed from: f0 */
    public final String f29920f0;

    /* JADX INFO: renamed from: g */
    public final SettingsAdapter f29921g;

    /* JADX INFO: renamed from: g0 */
    public final Drawable f29922g0;

    /* JADX INFO: renamed from: h0 */
    public final Drawable f29923h0;

    /* JADX INFO: renamed from: i */
    public final PlaybackSpeedAdapter f29924i;

    /* JADX INFO: renamed from: i0 */
    public final String f29925i0;

    /* JADX INFO: renamed from: j */
    public final TextTrackSelectionAdapter f29926j;

    /* JADX INFO: renamed from: j0 */
    public final String f29927j0;

    /* JADX INFO: renamed from: k0 */
    public final Drawable f29928k0;

    /* JADX INFO: renamed from: l0 */
    public final Drawable f29929l0;

    /* JADX INFO: renamed from: m0 */
    public final String f29930m0;

    /* JADX INFO: renamed from: n */
    public final AudioTrackSelectionAdapter f29931n;

    /* JADX INFO: renamed from: n0 */
    public final String f29932n0;

    /* JADX INFO: renamed from: o */
    public final DefaultTrackNameProvider f29933o;

    /* JADX INFO: renamed from: o0 */
    public Player f29934o0;

    /* JADX INFO: renamed from: p */
    public final PopupWindow f29935p;

    /* JADX INFO: renamed from: p0 */
    public ProgressUpdateListener f29936p0;

    /* JADX INFO: renamed from: q */
    public final int f29937q;

    /* JADX INFO: renamed from: q0 */
    public OnFullScreenModeChangedListener f29938q0;

    /* JADX INFO: renamed from: r */
    public final ImageView f29939r;

    /* JADX INFO: renamed from: r0 */
    public boolean f29940r0;

    /* JADX INFO: renamed from: s */
    public final ImageView f29941s;

    /* JADX INFO: renamed from: s0 */
    public boolean f29942s0;

    /* JADX INFO: renamed from: t */
    public final ImageView f29943t;

    /* JADX INFO: renamed from: t0 */
    public boolean f29944t0;

    /* JADX INFO: renamed from: u */
    public final View f29945u;

    /* JADX INFO: renamed from: u0 */
    public boolean f29946u0;

    /* JADX INFO: renamed from: v */
    public final View f29947v;

    /* JADX INFO: renamed from: v0 */
    public boolean f29948v0;

    /* JADX INFO: renamed from: w */
    public final TextView f29949w;

    /* JADX INFO: renamed from: w0 */
    public boolean f29950w0;

    /* JADX INFO: renamed from: x */
    public final TextView f29951x;

    /* JADX INFO: renamed from: x0 */
    public int f29952x0;

    /* JADX INFO: renamed from: y */
    public final ImageView f29953y;

    /* JADX INFO: renamed from: y0 */
    public int f29954y0;

    /* JADX INFO: renamed from: z */
    public final ImageView f29955z;

    /* JADX INFO: renamed from: z0 */
    public int f29956z0;

    /* JADX INFO: compiled from: Proguard */
    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        public AudioTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        /* JADX INFO: renamed from: c */
        public final void mo11136c(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.f29972a.setText(R.string.exo_track_selection_auto);
            Player player = PlayerControlView.this.f29934o0;
            player.getClass();
            subSettingViewHolder.f29973b.setVisibility(m11138e(player.mo9265R()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC1998b(this, 0));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        /* JADX INFO: renamed from: d */
        public final void mo11137d(String str) {
            PlayerControlView.this.f29921g.f29969b[1] = str;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m11138e(TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.f29978a.size(); i++) {
                if (trackSelectionParameters.f25392t.containsKey(((TrackInformation) this.f29978a.get(i)).f29975a.f25419b)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        public ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: E */
        public final void mo9293E(Player.Events events) {
            boolean zM9349a = events.m9349a(4, 5, 13);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (zM9349a) {
                float[] fArr = PlayerControlView.f29880G0;
                playerControlView.m11128l();
            }
            if (events.m9349a(4, 5, 7, 13)) {
                float[] fArr2 = PlayerControlView.f29880G0;
                playerControlView.m11130n();
            }
            if (events.m9349a(8, 13)) {
                float[] fArr3 = PlayerControlView.f29880G0;
                playerControlView.m11131o();
            }
            if (events.m9349a(9, 13)) {
                float[] fArr4 = PlayerControlView.f29880G0;
                playerControlView.m11133q();
            }
            if (events.m9349a(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = PlayerControlView.f29880G0;
                playerControlView.m11127k();
            }
            if (events.m9349a(11, 0, 13)) {
                float[] fArr6 = PlayerControlView.f29880G0;
                playerControlView.m11134r();
            }
            if (events.m9349a(12, 13)) {
                float[] fArr7 = PlayerControlView.f29880G0;
                playerControlView.m11129m();
            }
            if (events.m9349a(2, 13)) {
                float[] fArr8 = PlayerControlView.f29880G0;
                playerControlView.m11135s();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        /* JADX INFO: renamed from: K */
        public final void mo11113K(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.f29895I;
            if (textView != null) {
                textView.setText(Util.m9633x(playerControlView.f29897K, playerControlView.f29898L, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        /* JADX INFO: renamed from: L */
        public final void mo11114L(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f29950w0 = true;
            TextView textView = playerControlView.f29895I;
            if (textView != null) {
                textView.setText(Util.m9633x(playerControlView.f29897K, playerControlView.f29898L, j));
            }
            playerControlView.f29910a.m11151f();
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        /* JADX INFO: renamed from: M */
        public final void mo11115M(long j, boolean z2) {
            Player player;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i = 0;
            playerControlView.f29950w0 = false;
            if (!z2 && (player = playerControlView.f29934o0) != null) {
                if (playerControlView.f29948v0) {
                    if (player.mo9215H(17) && player.mo9215H(10)) {
                        Timeline timelineMo9262O = player.mo9262O();
                        int iMo9359o = timelineMo9262O.mo9359o();
                        while (true) {
                            long jM9609S = Util.m9609S(timelineMo9262O.mo9358n(i, playerControlView.f29900N, 0L).f25361l);
                            if (j < jM9609S) {
                                break;
                            }
                            if (i == iMo9359o - 1) {
                                j = jM9609S;
                                break;
                            } else {
                                j -= jM9609S;
                                i++;
                            }
                        }
                        player.mo9226h(i, j);
                    }
                } else if (player.mo9215H(5)) {
                    player.mo9230u(j);
                }
                playerControlView.m11130n();
            }
            playerControlView.f29910a.m11152g();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.f29934o0;
            if (player == null) {
                return;
            }
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.f29910a;
            playerControlViewLayoutManager.m11152g();
            if (playerControlView.f29941s == view) {
                if (player.mo9215H(9)) {
                    player.mo9216T();
                    return;
                }
                return;
            }
            if (playerControlView.f29939r == view) {
                if (player.mo9215H(7)) {
                    player.mo9231v();
                    return;
                }
                return;
            }
            if (playerControlView.f29945u == view) {
                if (player.mo9289z() == 4 || !player.mo9215H(12)) {
                    return;
                }
                player.mo9217U();
                return;
            }
            if (playerControlView.f29947v == view) {
                if (player.mo9215H(11)) {
                    player.mo9218W();
                    return;
                }
                return;
            }
            if (playerControlView.f29943t == view) {
                if (Util.m9606P(player, playerControlView.f29946u0)) {
                    Util.m9591A(player);
                    return;
                } else {
                    if (player.mo9215H(1)) {
                        player.pause();
                        return;
                    }
                    return;
                }
            }
            if (playerControlView.f29953y == view) {
                if (player.mo9215H(15)) {
                    int iMo9261N = player.mo9261N();
                    int i = playerControlView.f29956z0;
                    for (int i2 = 1; i2 <= 2; i2++) {
                        int i3 = (iMo9261N + i2) % 3;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2 || (i & 2) == 0) {
                                }
                            } else if ((i & 1) == 0) {
                            }
                        }
                        iMo9261N = i3;
                    }
                    player.mo9256I(iMo9261N);
                    return;
                }
                return;
            }
            if (playerControlView.f29955z == view) {
                if (player.mo9215H(14)) {
                    player.mo9279k(!player.mo9264Q());
                    return;
                }
                return;
            }
            View view2 = playerControlView.f29889E;
            if (view2 == view) {
                playerControlViewLayoutManager.m11151f();
                playerControlView.m11120d(playerControlView.f29921g, view2);
                return;
            }
            View view3 = playerControlView.f29891F;
            if (view3 == view) {
                playerControlViewLayoutManager.m11151f();
                playerControlView.m11120d(playerControlView.f29924i, view3);
                return;
            }
            View view4 = playerControlView.f29893G;
            if (view4 == view) {
                playerControlViewLayoutManager.m11151f();
                playerControlView.m11120d(playerControlView.f29931n, view4);
                return;
            }
            ImageView imageView = playerControlView.f29883B;
            if (imageView == view) {
                playerControlViewLayoutManager.m11151f();
                playerControlView.m11120d(playerControlView.f29926j, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.f29892F0) {
                playerControlView.f29910a.m11152g();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public interface OnFullScreenModeChangedListener {
        /* JADX INFO: renamed from: K */
        void mo11139K(boolean z2);
    }

    /* JADX INFO: compiled from: Proguard */
    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: a */
        public final String[] f29959a;

        /* JADX INFO: renamed from: b */
        public final float[] f29960b;

        /* JADX INFO: renamed from: c */
        public int f29961c;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.f29959a = strArr;
            this.f29960b = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f29959a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SubSettingViewHolder subSettingViewHolder = (SubSettingViewHolder) viewHolder;
            String[] strArr = this.f29959a;
            if (i < strArr.length) {
                subSettingViewHolder.f29972a.setText(strArr[i]);
            }
            if (i == this.f29961c) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.f29973b.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.f29973b.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC1999c(this, i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ProgressUpdateListener {
        /* JADX INFO: renamed from: a */
        void m11140a();
    }

    /* JADX INFO: compiled from: Proguard */
    public final class SettingViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int f29963e = 0;

        /* JADX INFO: renamed from: a */
        public final TextView f29964a;

        /* JADX INFO: renamed from: b */
        public final TextView f29965b;

        /* JADX INFO: renamed from: c */
        public final ImageView f29966c;

        public SettingViewHolder(View view) {
            super(view);
            if (Util.f25665a < 26) {
                view.setFocusable(true);
            }
            this.f29964a = (TextView) view.findViewById(R.id.exo_main_text);
            this.f29965b = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f29966c = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new ViewOnClickListenerC1998b(this, 1));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {

        /* JADX INFO: renamed from: a */
        public final String[] f29968a;

        /* JADX INFO: renamed from: b */
        public final String[] f29969b;

        /* JADX INFO: renamed from: c */
        public final Drawable[] f29970c;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.f29968a = strArr;
            this.f29969b = new String[strArr.length];
            this.f29970c = drawableArr;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m11141b(int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.f29934o0;
            if (player == null) {
                return false;
            }
            return i != 0 ? i != 1 || (player.mo9215H(30) && playerControlView.f29934o0.mo9215H(29)) : player.mo9215H(13);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f29968a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SettingViewHolder settingViewHolder = (SettingViewHolder) viewHolder;
            if (m11141b(i)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.f29964a.setText(this.f29968a[i]);
            String str = this.f29969b[i];
            TextView textView = settingViewHolder.f29965b;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.f29970c[i];
            ImageView imageView = settingViewHolder.f29966c;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            return playerControlView.new SettingViewHolder(LayoutInflater.from(playerControlView.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public final TextView f29972a;

        /* JADX INFO: renamed from: b */
        public final View f29973b;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Util.f25665a < 26) {
                view.setFocusable(true);
            }
            this.f29972a = (TextView) view.findViewById(R.id.exo_text);
            this.f29973b = view.findViewById(R.id.exo_check);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TrackInformation {

        /* JADX INFO: renamed from: a */
        public final Tracks.Group f29975a;

        /* JADX INFO: renamed from: b */
        public final int f29976b;

        /* JADX INFO: renamed from: c */
        public final String f29977c;

        /* JADX WARN: Multi-variable type inference failed */
        public TrackInformation(Tracks tracks, int i, int i2, String str) {
            this.f29975a = (Tracks.Group) tracks.f25417a.get(i);
            this.f29976b = i2;
            this.f29977c = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: a */
        public List f29978a = new ArrayList();

        public TrackSelectionAdapter() {
        }

        /* JADX INFO: renamed from: b */
        public void mo11142b(SubSettingViewHolder subSettingViewHolder, int i) {
            Player player = PlayerControlView.this.f29934o0;
            if (player == null) {
                return;
            }
            if (i == 0) {
                mo11136c(subSettingViewHolder);
                return;
            }
            TrackInformation trackInformation = (TrackInformation) this.f29978a.get(i - 1);
            TrackGroup trackGroup = trackInformation.f29975a.f25419b;
            boolean z2 = player.mo9265R().f25392t.get(trackGroup) != null && trackInformation.f29975a.f25422e[trackInformation.f29976b];
            subSettingViewHolder.f29972a.setText(trackInformation.f29977c);
            subSettingViewHolder.f29973b.setVisibility(z2 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC2000d(this, player, trackGroup, trackInformation));
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo11136c(SubSettingViewHolder subSettingViewHolder);

        /* JADX INFO: renamed from: d */
        public abstract void mo11137d(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.f29978a.isEmpty()) {
                return 0;
            }
            return this.f29978a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            mo11142b((SubSettingViewHolder) viewHolder, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public interface VisibilityListener {
        /* JADX INFO: renamed from: L */
        void mo11144L(int i);
    }

    static {
        MediaLibraryInfo.m9322a("media3.ui");
        f29880G0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        super(context, null, 0);
        this.f29946u0 = true;
        this.f29952x0 = 5000;
        this.f29956z0 = 0;
        this.f29954y0 = 200;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        ComponentListener componentListener = new ComponentListener();
        this.f29914c = componentListener;
        this.f29916d = new CopyOnWriteArrayList();
        this.f29899M = new Timeline.Period();
        this.f29900N = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.f29897K = sb;
        this.f29898L = new Formatter(sb, Locale.getDefault());
        this.f29882A0 = new long[0];
        this.f29884B0 = new boolean[0];
        this.f29886C0 = new long[0];
        this.f29888D0 = new boolean[0];
        this.f29901O = new RunnableC1997a(1, this);
        this.f29894H = (TextView) findViewById(R.id.exo_duration);
        this.f29895I = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f29883B = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f29885C = imageView2;
        ViewOnClickListenerC1998b viewOnClickListenerC1998b = new ViewOnClickListenerC1998b(this, 4);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC1998b);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f29887D = imageView3;
        ViewOnClickListenerC1998b viewOnClickListenerC1998b2 = new ViewOnClickListenerC1998b(this, 4);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC1998b2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f29889E = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(componentListener);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f29891F = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f29893G = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        TimeBar timeBar = (TimeBar) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.f29896J = timeBar;
        } else if (viewFindViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f29896J = defaultTimeBar;
        } else {
            this.f29896J = null;
        }
        TimeBar timeBar2 = this.f29896J;
        if (timeBar2 != null) {
            timeBar2.mo11097a(componentListener);
        }
        Resources resources = context.getResources();
        this.f29912b = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f29943t = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f29939r = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_previous, context.getTheme()));
            imageView5.setOnClickListener(componentListener);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f29941s = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_next, context.getTheme()));
            imageView6.setOnClickListener(componentListener);
        }
        Typeface typefaceM7541b = ResourcesCompat.m7541b(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_rewind, context.getTheme()));
            this.f29947v = imageView7;
            this.f29951x = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceM7541b);
            this.f29951x = textView;
            this.f29947v = textView;
        } else {
            this.f29951x = null;
            this.f29947v = null;
        }
        View view = this.f29947v;
        if (view != null) {
            view.setOnClickListener(componentListener);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_fastforward, context.getTheme()));
            this.f29945u = imageView8;
            this.f29949w = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM7541b);
            this.f29949w = textView2;
            this.f29945u = textView2;
        } else {
            this.f29949w = null;
            this.f29945u = null;
        }
        View view2 = this.f29945u;
        if (view2 != null) {
            view2.setOnClickListener(componentListener);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f29953y = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(componentListener);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f29955z = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(componentListener);
        }
        this.f29915c0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f29917d0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f29881A = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_vr, context.getTheme()));
            m11126j(imageView11, false);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(this);
        this.f29910a = playerControlViewLayoutManager;
        playerControlViewLayoutManager.f29982C = true;
        SettingsAdapter settingsAdapter = new SettingsAdapter(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f29921g = settingsAdapter;
        this.f29937q = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f29919f = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f29935p = popupWindow;
        if (Util.f25665a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(componentListener);
        this.f29892F0 = true;
        this.f29933o = new DefaultTrackNameProvider(getResources());
        this.f29922g0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on, context.getTheme());
        this.f29923h0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off, context.getTheme());
        this.f29925i0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f29927j0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f29926j = new TextTrackSelectionAdapter();
        this.f29931n = new AudioTrackSelectionAdapter();
        this.f29924i = new PlaybackSpeedAdapter(resources.getStringArray(R.array.exo_controls_playback_speeds), f29880G0);
        this.f29902P = resources.getDrawable(R.drawable.exo_styled_controls_play, context.getTheme());
        this.f29903Q = resources.getDrawable(R.drawable.exo_styled_controls_pause, context.getTheme());
        this.f29928k0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit, context.getTheme());
        this.f29929l0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter, context.getTheme());
        this.f29904R = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off, context.getTheme());
        this.f29905S = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one, context.getTheme());
        this.f29906T = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all, context.getTheme());
        this.f29911a0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on, context.getTheme());
        this.f29913b0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off, context.getTheme());
        this.f29930m0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f29932n0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f29907U = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f29908V = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f29909W = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f29918e0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f29920f0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager.m11153h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        playerControlViewLayoutManager.m11153h(this.f29945u, true);
        playerControlViewLayoutManager.m11153h(this.f29947v, true);
        playerControlViewLayoutManager.m11153h(imageView5, true);
        playerControlViewLayoutManager.m11153h(imageView6, true);
        playerControlViewLayoutManager.m11153h(imageView10, false);
        playerControlViewLayoutManager.m11153h(imageView, false);
        playerControlViewLayoutManager.m11153h(imageView11, false);
        playerControlViewLayoutManager.m11153h(imageView9, this.f29956z0 != 0);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2003g(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11117a(PlayerControlView playerControlView, float f) {
        playerControlView.setPlaybackSpeed(f);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11118b(Player player, Timeline.Window window) {
        Timeline timelineMo9262O;
        int iMo9359o;
        if (player.mo9215H(17) && (iMo9359o = (timelineMo9262O = player.mo9262O()).mo9359o()) > 1 && iMo9359o <= 100) {
            for (int i = 0; i < iMo9359o; i++) {
                if (timelineMo9262O.mo9358n(i, window, 0L).f25361l != -9223372036854775807L) {
                }
            }
            return true;
        }
        return false;
    }

    private void setPlaybackSpeed(float f) {
        Player player = this.f29934o0;
        if (player == null || !player.mo9215H(13)) {
            return;
        }
        Player player2 = this.f29934o0;
        player2.mo9273d(new PlaybackParameters(f, player2.mo9274e().f25323b));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11119c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f29934o0;
        if (player == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (player.mo9289z() != 4 && player.mo9215H(12)) {
                    player.mo9217U();
                }
            } else if (keyCode == 89 && player.mo9215H(11)) {
                player.mo9218W();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (Util.m9606P(player, this.f29946u0)) {
                        Util.m9591A(player);
                    } else if (player.mo9215H(1)) {
                        player.pause();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            Util.m9591A(player);
                        } else if (keyCode == 127) {
                            int i = Util.f25665a;
                            if (player.mo9215H(1)) {
                                player.pause();
                            }
                        }
                    } else if (player.mo9215H(7)) {
                        player.mo9231v();
                    }
                } else if (player.mo9215H(9)) {
                    player.mo9216T();
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m11120d(RecyclerView.Adapter adapter, View view) {
        this.f29919f.setAdapter(adapter);
        m11132p();
        this.f29892F0 = false;
        PopupWindow popupWindow = this.f29935p;
        popupWindow.dismiss();
        this.f29892F0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f29937q;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m11119c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final ImmutableList m11121e(Tracks tracks, int i) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList immutableList = tracks.f25417a;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            Tracks.Group group = (Tracks.Group) immutableList.get(i2);
            if (group.f25419b.f25367c == i) {
                for (int i3 = 0; i3 < group.f25418a; i3++) {
                    if (group.m9392b(i3)) {
                        Format formatM9391a = group.m9391a(i3);
                        if ((formatM9391a.f25152e & 2) == 0) {
                            builder.add(new TrackInformation(tracks, i2, i3, this.f29933o.mo11104a(formatM9391a)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: f */
    public final void m11122f() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f29910a;
        int i = playerControlViewLayoutManager.f30008z;
        if (i == 3 || i == 2) {
            return;
        }
        playerControlViewLayoutManager.m11151f();
        if (!playerControlViewLayoutManager.f29982C) {
            playerControlViewLayoutManager.m11154i(2);
        } else if (playerControlViewLayoutManager.f30008z == 1) {
            playerControlViewLayoutManager.f29995m.start();
        } else {
            playerControlViewLayoutManager.f29996n.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11123g() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f29910a;
        return playerControlViewLayoutManager.f30008z == 0 && playerControlViewLayoutManager.f29983a.m11124h();
    }

    @Nullable
    public Player getPlayer() {
        return this.f29934o0;
    }

    public int getRepeatToggleModes() {
        return this.f29956z0;
    }

    public boolean getShowShuffleButton() {
        return this.f29910a.m11149b(this.f29955z);
    }

    public boolean getShowSubtitleButton() {
        return this.f29910a.m11149b(this.f29883B);
    }

    public int getShowTimeoutMs() {
        return this.f29952x0;
    }

    public boolean getShowVrButton() {
        return this.f29910a.m11149b(this.f29881A);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11124h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m11125i() {
        m11128l();
        m11127k();
        m11131o();
        m11133q();
        m11135s();
        m11129m();
        m11134r();
    }

    /* JADX INFO: renamed from: j */
    public final void m11126j(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f29915c0 : this.f29917d0);
    }

    /* JADX INFO: renamed from: k */
    public final void m11127k() {
        boolean zMo9215H;
        boolean zMo9215H2;
        boolean zMo9215H3;
        boolean zMo9215H4;
        boolean zMo9215H5;
        if (m11124h() && this.f29942s0) {
            Player player = this.f29934o0;
            if (player != null) {
                zMo9215H = (this.f29944t0 && m11118b(player, this.f29900N)) ? player.mo9215H(10) : player.mo9215H(5);
                zMo9215H3 = player.mo9215H(7);
                zMo9215H4 = player.mo9215H(11);
                zMo9215H5 = player.mo9215H(12);
                zMo9215H2 = player.mo9215H(9);
            } else {
                zMo9215H = false;
                zMo9215H2 = false;
                zMo9215H3 = false;
                zMo9215H4 = false;
                zMo9215H5 = false;
            }
            Resources resources = this.f29912b;
            View view = this.f29947v;
            if (zMo9215H4) {
                Player player2 = this.f29934o0;
                int iMo9270Z = (int) ((player2 != null ? player2.mo9270Z() : 5000L) / 1000);
                TextView textView = this.f29951x;
                if (textView != null) {
                    textView.setText(String.valueOf(iMo9270Z));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iMo9270Z, Integer.valueOf(iMo9270Z)));
                }
            }
            View view2 = this.f29945u;
            if (zMo9215H5) {
                Player player3 = this.f29934o0;
                int iMo9287x = (int) ((player3 != null ? player3.mo9287x() : 15000L) / 1000);
                TextView textView2 = this.f29949w;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iMo9287x));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iMo9287x, Integer.valueOf(iMo9287x)));
                }
            }
            m11126j(this.f29939r, zMo9215H3);
            m11126j(view, zMo9215H4);
            m11126j(view2, zMo9215H5);
            m11126j(this.f29941s, zMo9215H2);
            TimeBar timeBar = this.f29896J;
            if (timeBar != null) {
                timeBar.setEnabled(zMo9215H);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11128l() {
        ImageView imageView;
        boolean z2;
        if (m11124h() && this.f29942s0 && (imageView = this.f29943t) != null) {
            boolean zM9606P = Util.m9606P(this.f29934o0, this.f29946u0);
            Drawable drawable = zM9606P ? this.f29902P : this.f29903Q;
            int i = zM9606P ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f29912b.getString(i));
            Player player = this.f29934o0;
            if (player != null) {
                z2 = true;
                if (!player.mo9215H(1) || (player.mo9215H(17) && player.mo9262O().m9368p())) {
                    z2 = false;
                }
            }
            m11126j(imageView, z2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11129m() {
        PlaybackSpeedAdapter playbackSpeedAdapter;
        Player player = this.f29934o0;
        if (player == null) {
            return;
        }
        float f = player.mo9274e().f25322a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            playbackSpeedAdapter = this.f29924i;
            float[] fArr = playbackSpeedAdapter.f29960b;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        playbackSpeedAdapter.f29961c = i2;
        String str = playbackSpeedAdapter.f29959a[i2];
        SettingsAdapter settingsAdapter = this.f29921g;
        settingsAdapter.f29969b[0] = str;
        m11126j(this.f29889E, settingsAdapter.m11141b(1) || settingsAdapter.m11141b(0));
    }

    /* JADX INFO: renamed from: n */
    public final void m11130n() {
        long jMo9288y;
        long jMo9266S;
        if (m11124h() && this.f29942s0) {
            Player player = this.f29934o0;
            if (player == null || !player.mo9215H(16)) {
                jMo9288y = 0;
                jMo9266S = 0;
            } else {
                jMo9288y = player.mo9288y() + this.f29890E0;
                jMo9266S = player.mo9266S() + this.f29890E0;
            }
            TextView textView = this.f29895I;
            if (textView != null && !this.f29950w0) {
                textView.setText(Util.m9633x(this.f29897K, this.f29898L, jMo9288y));
            }
            TimeBar timeBar = this.f29896J;
            if (timeBar != null) {
                timeBar.setPosition(jMo9288y);
                timeBar.setBufferedPosition(jMo9266S);
            }
            ProgressUpdateListener progressUpdateListener = this.f29936p0;
            if (progressUpdateListener != null) {
                progressUpdateListener.m11140a();
            }
            RunnableC1997a runnableC1997a = this.f29901O;
            removeCallbacks(runnableC1997a);
            int iMo9289z = player == null ? 1 : player.mo9289z();
            if (player != null && player.mo9213B()) {
                long jMin = Math.min(timeBar != null ? timeBar.getPreferredUpdateDelay() : 1000L, 1000 - (jMo9288y % 1000));
                float f = player.mo9274e().f25322a;
                postDelayed(runnableC1997a, Util.m9619j(f > 0.0f ? (long) (jMin / f) : 1000L, this.f29954y0, 1000L));
            } else {
                if (iMo9289z == 4 || iMo9289z == 1) {
                    return;
                }
                postDelayed(runnableC1997a, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11131o() {
        ImageView imageView;
        if (m11124h() && this.f29942s0 && (imageView = this.f29953y) != null) {
            if (this.f29956z0 == 0) {
                m11126j(imageView, false);
                return;
            }
            Player player = this.f29934o0;
            String str = this.f29907U;
            Drawable drawable = this.f29904R;
            if (player == null || !player.mo9215H(15)) {
                m11126j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m11126j(imageView, true);
            int iMo9261N = player.mo9261N();
            if (iMo9261N == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iMo9261N == 1) {
                imageView.setImageDrawable(this.f29905S);
                imageView.setContentDescription(this.f29908V);
            } else {
                if (iMo9261N != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f29906T);
                imageView.setContentDescription(this.f29909W);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f29910a;
        playerControlViewLayoutManager.f29983a.addOnLayoutChangeListener(playerControlViewLayoutManager.f30006x);
        this.f29942s0 = true;
        if (m11123g()) {
            playerControlViewLayoutManager.m11152g();
        }
        m11125i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f29910a;
        playerControlViewLayoutManager.f29983a.removeOnLayoutChangeListener(playerControlViewLayoutManager.f30006x);
        this.f29942s0 = false;
        removeCallbacks(this.f29901O);
        playerControlViewLayoutManager.m11151f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        View view = this.f29910a.f29984b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11132p() {
        RecyclerView recyclerView = this.f29919f;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f29937q;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f29935p;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: q */
    public final void m11133q() {
        ImageView imageView;
        if (m11124h() && this.f29942s0 && (imageView = this.f29955z) != null) {
            Player player = this.f29934o0;
            if (!this.f29910a.m11149b(imageView)) {
                m11126j(imageView, false);
                return;
            }
            String str = this.f29920f0;
            Drawable drawable = this.f29913b0;
            if (player == null || !player.mo9215H(14)) {
                m11126j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m11126j(imageView, true);
            if (player.mo9264Q()) {
                drawable = this.f29911a0;
            }
            imageView.setImageDrawable(drawable);
            if (player.mo9264Q()) {
                str = this.f29918e0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.media3.common.AdPlaybackState] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.common.Timeline$Period] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11134r() {
        long jM9598H;
        int i;
        int i2;
        ?? r24;
        boolean z2;
        boolean[] zArr;
        boolean z3;
        Player player = this.f29934o0;
        if (player == null) {
            return;
        }
        boolean z4 = this.f29944t0;
        boolean z5 = false;
        boolean z6 = true;
        Timeline.Window window = this.f29900N;
        this.f29948v0 = z4 && m11118b(player, window);
        long j = 0;
        this.f29890E0 = 0L;
        Timeline timelineMo9262O = player.mo9215H(17) ? player.mo9262O() : Timeline.f25340a;
        long j2 = -9223372036854775807L;
        if (!timelineMo9262O.m9368p()) {
            int iMo9255G = player.mo9255G();
            boolean z7 = this.f29948v0;
            int i3 = z7 ? 0 : iMo9255G;
            int iMo9359o = z7 ? timelineMo9262O.mo9359o() - 1 : iMo9255G;
            i = 0;
            long j3 = 0;
            ?? r2 = timelineMo9262O;
            while (true) {
                if (i3 > iMo9359o) {
                    break;
                }
                long j4 = j;
                if (i3 == iMo9255G) {
                    this.f29890E0 = Util.m9609S(j3);
                }
                r2.m9367m(i3, window);
                if (window.f25361l == j2) {
                    Assertions.m9464e(this.f29948v0 ^ z6);
                    break;
                }
                int i4 = window.f25362m;
                ?? r22 = r2;
                while (i4 <= window.f25363n) {
                    ?? r7 = this.f29899M;
                    r22.mo9354f(i4, r7, z5);
                    long j5 = j2;
                    AdPlaybackState adPlaybackState = r7.f25347g;
                    adPlaybackState.getClass();
                    long j6 = j4;
                    ?? r23 = r22;
                    for (?? r10 = z5; r10 < adPlaybackState.f25086a; r10++) {
                        r7.m9372d(r10);
                        long j7 = r7.f25345e;
                        if (j7 >= j6) {
                            long[] jArr = this.f29882A0;
                            i2 = iMo9255G;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f29882A0 = Arrays.copyOf(jArr, length);
                                this.f29884B0 = Arrays.copyOf(this.f29884B0, length);
                            }
                            this.f29882A0[i] = Util.m9609S(j7 + j3);
                            boolean[] zArr2 = this.f29884B0;
                            AdPlaybackState.AdGroup adGroupM9209a = r7.f25347g.m9209a(r10);
                            int i5 = adGroupM9209a.f25088a;
                            if (i5 == -1) {
                                zArr = zArr2;
                                r24 = r23;
                                z2 = true;
                                z3 = true;
                            } else {
                                int i6 = 0;
                                ?? r25 = r23;
                                while (i6 < i5) {
                                    zArr = zArr2;
                                    int i7 = adGroupM9209a.f25092e[i6];
                                    ?? r242 = r25;
                                    z2 = true;
                                    if (i7 == 0 || i7 == 1) {
                                        z3 = true;
                                        r24 = r242;
                                        break;
                                    } else {
                                        i6++;
                                        zArr2 = zArr;
                                        r25 = r242;
                                    }
                                }
                                zArr = zArr2;
                                r24 = r25;
                                z2 = true;
                                z3 = false;
                            }
                            zArr[i] = !z3;
                            i++;
                        } else {
                            i2 = iMo9255G;
                            r24 = r23;
                            z2 = true;
                        }
                        z6 = z2;
                        iMo9255G = i2;
                        r23 = r24;
                    }
                    i4++;
                    j2 = j5;
                    j4 = j6;
                    r22 = r23;
                    z5 = false;
                }
                j3 += window.f25361l;
                i3++;
                z6 = z6;
                j = j4;
                r2 = r22;
                z5 = false;
            }
            jM9598H = j3;
        } else if (player.mo9215H(16)) {
            long jMo9228m = player.mo9228m();
            jM9598H = jMo9228m != -9223372036854775807L ? Util.m9598H(jMo9228m) : 0L;
            i = 0;
        }
        long jM9609S = Util.m9609S(jM9598H);
        TextView textView = this.f29894H;
        if (textView != null) {
            textView.setText(Util.m9633x(this.f29897K, this.f29898L, jM9609S));
        }
        TimeBar timeBar = this.f29896J;
        if (timeBar != null) {
            timeBar.setDuration(jM9609S);
            long[] jArr2 = this.f29886C0;
            int length2 = jArr2.length;
            int i8 = i + length2;
            long[] jArr3 = this.f29882A0;
            if (i8 > jArr3.length) {
                this.f29882A0 = Arrays.copyOf(jArr3, i8);
                this.f29884B0 = Arrays.copyOf(this.f29884B0, i8);
            }
            System.arraycopy(jArr2, 0, this.f29882A0, i, length2);
            System.arraycopy(this.f29888D0, 0, this.f29884B0, i, length2);
            timeBar.mo11098b(this.f29882A0, this.f29884B0, i8);
        }
        m11130n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final void m11135s() {
        TextTrackSelectionAdapter textTrackSelectionAdapter = this.f29926j;
        textTrackSelectionAdapter.getClass();
        List list = Collections.EMPTY_LIST;
        textTrackSelectionAdapter.f29978a = list;
        AudioTrackSelectionAdapter audioTrackSelectionAdapter = this.f29931n;
        audioTrackSelectionAdapter.getClass();
        audioTrackSelectionAdapter.f29978a = list;
        Player player = this.f29934o0;
        ImageView imageView = this.f29883B;
        if (player != null && player.mo9215H(30) && this.f29934o0.mo9215H(29)) {
            Tracks tracksMo9251A = this.f29934o0.mo9251A();
            ImmutableList immutableListM11121e = m11121e(tracksMo9251A, 1);
            audioTrackSelectionAdapter.f29978a = immutableListM11121e;
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player2 = playerControlView.f29934o0;
            player2.getClass();
            TrackSelectionParameters trackSelectionParametersMo9265R = player2.mo9265R();
            boolean zIsEmpty = immutableListM11121e.isEmpty();
            SettingsAdapter settingsAdapter = playerControlView.f29921g;
            if (!zIsEmpty) {
                if (audioTrackSelectionAdapter.m11138e(trackSelectionParametersMo9265R)) {
                    int i = 0;
                    while (true) {
                        if (i >= immutableListM11121e.size()) {
                            break;
                        }
                        TrackInformation trackInformation = (TrackInformation) immutableListM11121e.get(i);
                        if (trackInformation.f29975a.f25422e[trackInformation.f29976b]) {
                            settingsAdapter.f29969b[1] = trackInformation.f29977c;
                            break;
                        }
                        i++;
                    }
                } else {
                    settingsAdapter.f29969b[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                settingsAdapter.f29969b[1] = playerControlView.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.f29910a.m11149b(imageView)) {
                textTrackSelectionAdapter.m11143e(m11121e(tracksMo9251A, 3));
            } else {
                textTrackSelectionAdapter.m11143e(ImmutableList.m14824of());
            }
        }
        m11126j(imageView, textTrackSelectionAdapter.getItemCount() > 0);
        SettingsAdapter settingsAdapter2 = this.f29921g;
        m11126j(this.f29889E, settingsAdapter2.m11141b(1) || settingsAdapter2.m11141b(0));
    }

    public void setAnimationEnabled(boolean z2) {
        this.f29910a.f29982C = z2;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.f29938q0 = onFullScreenModeChangedListener;
        boolean z2 = onFullScreenModeChangedListener != null;
        ImageView imageView = this.f29885C;
        if (imageView != null) {
            if (z2) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z3 = onFullScreenModeChangedListener != null;
        ImageView imageView2 = this.f29887D;
        if (imageView2 == null) {
            return;
        }
        if (z3) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.m9464e(Looper.myLooper() == Looper.getMainLooper());
        Assertions.m9460a(player == null || player.mo9263P() == Looper.getMainLooper());
        Player player2 = this.f29934o0;
        if (player2 == player) {
            return;
        }
        ComponentListener componentListener = this.f29914c;
        if (player2 != null) {
            player2.mo9253D(componentListener);
        }
        this.f29934o0 = player;
        if (player != null) {
            player.mo9259L(componentListener);
        }
        m11125i();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.f29936p0 = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i) {
        this.f29956z0 = i;
        Player player = this.f29934o0;
        if (player != null && player.mo9215H(15)) {
            int iMo9261N = this.f29934o0.mo9261N();
            if (i == 0 && iMo9261N != 0) {
                this.f29934o0.mo9256I(0);
            } else if (i == 1 && iMo9261N == 2) {
                this.f29934o0.mo9256I(1);
            } else if (i == 2 && iMo9261N == 1) {
                this.f29934o0.mo9256I(2);
            }
        }
        this.f29910a.m11153h(this.f29953y, i != 0);
        m11131o();
    }

    public void setShowFastForwardButton(boolean z2) {
        this.f29910a.m11153h(this.f29945u, z2);
        m11127k();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z2) {
        this.f29944t0 = z2;
        m11134r();
    }

    public void setShowNextButton(boolean z2) {
        this.f29910a.m11153h(this.f29941s, z2);
        m11127k();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z2) {
        this.f29946u0 = z2;
        m11128l();
    }

    public void setShowPreviousButton(boolean z2) {
        this.f29910a.m11153h(this.f29939r, z2);
        m11127k();
    }

    public void setShowRewindButton(boolean z2) {
        this.f29910a.m11153h(this.f29947v, z2);
        m11127k();
    }

    public void setShowShuffleButton(boolean z2) {
        this.f29910a.m11153h(this.f29955z, z2);
        m11133q();
    }

    public void setShowSubtitleButton(boolean z2) {
        this.f29910a.m11153h(this.f29883B, z2);
    }

    public void setShowTimeoutMs(int i) {
        this.f29952x0 = i;
        if (m11123g()) {
            this.f29910a.m11152g();
        }
    }

    public void setShowVrButton(boolean z2) {
        this.f29910a.m11153h(this.f29881A, z2);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f29954y0 = Util.m9618i(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.f29881A;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            m11126j(imageView, onClickListener != null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        public TextTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        /* JADX INFO: renamed from: b */
        public final void mo11142b(SubSettingViewHolder subSettingViewHolder, int i) {
            super.mo11142b(subSettingViewHolder, i);
            if (i > 0) {
                TrackInformation trackInformation = (TrackInformation) this.f29978a.get(i - 1);
                subSettingViewHolder.f29973b.setVisibility(trackInformation.f29975a.f25422e[trackInformation.f29976b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        /* JADX INFO: renamed from: c */
        public final void mo11136c(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.f29972a.setText(R.string.exo_track_selection_none);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f29978a.size()) {
                    break;
                }
                TrackInformation trackInformation = (TrackInformation) this.f29978a.get(i2);
                if (trackInformation.f29975a.f25422e[trackInformation.f29976b]) {
                    i = 4;
                    break;
                }
                i2++;
            }
            subSettingViewHolder.f29973b.setVisibility(i);
            subSettingViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC1998b(this, 2));
        }

        /* JADX INFO: renamed from: e */
        public final void m11143e(List list) {
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                TrackInformation trackInformation = (TrackInformation) list.get(i);
                if (trackInformation.f29975a.f25422e[trackInformation.f29976b]) {
                    z2 = true;
                    break;
                }
                i++;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.f29883B;
            if (imageView != null) {
                imageView.setImageDrawable(z2 ? playerControlView.f29922g0 : playerControlView.f29923h0);
                playerControlView.f29883B.setContentDescription(z2 ? playerControlView.f29925i0 : playerControlView.f29927j0);
            }
            this.f29978a = list;
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            mo11142b((SubSettingViewHolder) viewHolder, i);
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        /* JADX INFO: renamed from: d */
        public final void mo11137d(String str) {
        }
    }
}
