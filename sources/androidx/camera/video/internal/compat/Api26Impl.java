package androidx.camera.video.internal.compat;

import android.media.MediaMuxer;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Api26Impl {
    @NonNull
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static MediaMuxer m1864a(@NonNull FileDescriptor fileDescriptor, int i) {
        return new MediaMuxer(fileDescriptor, i);
    }
}
