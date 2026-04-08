package androidx.media3.p017ui;

import android.view.View;
import androidx.media3.p017ui.PlayerControlView;

/* JADX INFO: renamed from: androidx.media3.ui.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1999c implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayerControlView.PlaybackSpeedAdapter f30144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f30145b;

    public /* synthetic */ ViewOnClickListenerC1999c(PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter, int i) {
        this.f30144a = playbackSpeedAdapter;
        this.f30145b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter = this.f30144a;
        int i = playbackSpeedAdapter.f29961c;
        int i2 = this.f30145b;
        PlayerControlView playerControlView = PlayerControlView.this;
        if (i2 != i) {
            PlayerControlView.m11117a(playerControlView, playbackSpeedAdapter.f29960b[i2]);
        }
        playerControlView.f29935p.dismiss();
    }
}
