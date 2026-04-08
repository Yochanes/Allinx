package androidx.fragment.app;

import androidx.core.util.Consumer;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1696f implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FragmentActivity f24809b;

    public /* synthetic */ C1696f(FragmentActivity fragmentActivity, int i) {
        this.f24808a = i;
        this.f24809b = fragmentActivity;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f24808a) {
            case 0:
                this.f24809b.mFragments.m8942a();
                break;
            default:
                this.f24809b.mFragments.m8942a();
                break;
        }
    }
}
