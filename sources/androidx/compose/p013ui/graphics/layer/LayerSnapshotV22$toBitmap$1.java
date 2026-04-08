package androidx.compose.p013ui.graphics.layer;

import android.media.Image;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", m18559f = "LayerSnapshot.android.kt", m18560l = {225}, m18561m = "toBitmap")
final class LayerSnapshotV22$toBitmap$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayerSnapshotV22 f17909b;

    /* JADX INFO: renamed from: c */
    public int f17910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerSnapshotV22$toBitmap$1(LayerSnapshotV22 layerSnapshotV22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f17909b = layerSnapshotV22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LayerSnapshotV22$toBitmap$1 layerSnapshotV22$toBitmap$1;
        this.f17908a = obj;
        this.f17910c |= Integer.MIN_VALUE;
        LayerSnapshotV22 layerSnapshotV22 = this.f17909b;
        layerSnapshotV22.getClass();
        int i = this.f17910c;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.f17910c = i - Integer.MIN_VALUE;
            layerSnapshotV22$toBitmap$1 = this;
        } else {
            layerSnapshotV22$toBitmap$1 = new LayerSnapshotV22$toBitmap$1(layerSnapshotV22, this);
        }
        Object obj2 = layerSnapshotV22$toBitmap$1.f17908a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = layerSnapshotV22$toBitmap$1.f17910c;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ResultKt.m18313b(obj2);
            return LayerSnapshot_androidKt.m5435a((Image) obj2);
        } finally {
        }
    }
}
