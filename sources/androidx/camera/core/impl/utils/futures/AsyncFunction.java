package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
@RequiresApi
public interface AsyncFunction<I, O> {
    ListenableFuture apply(Object obj);
}
