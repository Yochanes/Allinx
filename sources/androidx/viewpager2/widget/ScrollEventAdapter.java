package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public int f32516a;

    /* JADX INFO: renamed from: b */
    public int f32517b;

    /* JADX INFO: compiled from: Proguard */
    public static final class ScrollEventValues {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2 = this.f32516a;
        if (!(i2 == 1 && this.f32517b == 1) && i == 1) {
            this.f32516a = 1;
            throw null;
        }
        if (!(i2 == 1 || i2 == 4) || i != 2) {
            if ((i2 == 1 || i2 == 4) && i == 0) {
                throw null;
            }
            return;
        }
        if ((this.f32516a == 3 && this.f32517b == 0) || this.f32517b == 2) {
            return;
        }
        this.f32517b = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        throw null;
    }
}
