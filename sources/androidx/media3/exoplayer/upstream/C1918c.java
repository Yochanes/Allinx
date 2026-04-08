package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.Consumer;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1918c implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
