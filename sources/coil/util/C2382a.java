package coil.util;

import android.graphics.Canvas;
import android.graphics.PostProcessor;
import coil.transform.AnimatedTransformation;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: coil.util.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2382a implements PostProcessor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnimatedTransformation f34022a;

    public /* synthetic */ C2382a(AnimatedTransformation animatedTransformation) {
        this.f34022a = animatedTransformation;
    }

    @Override // android.graphics.PostProcessor
    public final int onPostProcess(Canvas canvas) {
        int iOrdinal = this.f34022a.transform(canvas).ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return -3;
        }
        if (iOrdinal == 2) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
