package androidx.work;

import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/OperationImpl;", "Landroidx/work/Operation;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class OperationImpl implements Operation {

    /* JADX INFO: renamed from: c */
    public final ListenableFuture f32597c;

    public OperationImpl(MutableLiveData mutableLiveData, ListenableFuture listenableFuture) {
        this.f32597c = listenableFuture;
    }
}
