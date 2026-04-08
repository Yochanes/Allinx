package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0744c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntConsumer f9191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9192c;

    public /* synthetic */ RunnableC0744c(IntConsumer intConsumer, int i, int i2) {
        this.f9190a = i2;
        this.f9191b = intConsumer;
        this.f9192c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9190a) {
            case 0:
                this.f9191b.accept(this.f9192c);
                break;
            default:
                this.f9191b.accept(this.f9192c);
                break;
        }
    }
}
