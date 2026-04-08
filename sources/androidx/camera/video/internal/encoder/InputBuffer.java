package androidx.camera.video.internal.encoder;

import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface InputBuffer {
    /* JADX INFO: renamed from: a */
    void mo1910a();

    /* JADX INFO: renamed from: b */
    ListenableFuture mo1911b();

    /* JADX INFO: renamed from: c */
    ByteBuffer mo1912c();

    boolean cancel();

    /* JADX INFO: renamed from: d */
    boolean mo1913d();

    /* JADX INFO: renamed from: e */
    void mo1914e(long j);
}
