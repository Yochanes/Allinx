package androidx.compose.p013ui.graphics;

import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1222c implements DoubleUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f17682b;

    public /* synthetic */ C1222c(Function1 function1, int i) {
        this.f17681a = i;
        this.f17682b = function1;
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        switch (this.f17681a) {
            case 0:
                return ((Number) this.f17682b.invoke(Double.valueOf(d))).doubleValue();
            default:
                return ((Number) this.f17682b.invoke(Double.valueOf(d))).doubleValue();
        }
    }
}
