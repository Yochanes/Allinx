package p003C;

import android.media.SoundPool;
import io.intercom.android.sdk.p032m5.conversation.utils.SoundPlayer;

/* JADX INFO: renamed from: C.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0010a implements SoundPool.OnLoadCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SoundPlayer f10a;

    public /* synthetic */ C0010a(SoundPlayer soundPlayer) {
        this.f10a = soundPlayer;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        SoundPlayer.m16032a(this.f10a, soundPool, i, i2);
    }
}
