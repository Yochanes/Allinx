package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BaseDataSource implements DataSource {

    /* JADX INFO: renamed from: a */
    public final boolean f25792a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f25793b = new ArrayList(1);

    /* JADX INFO: renamed from: c */
    public int f25794c;

    /* JADX INFO: renamed from: d */
    public DataSpec f25795d;

    public BaseDataSource(boolean z2) {
        this.f25792a = z2;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: b */
    public final void mo9669b(TransferListener transferListener) {
        transferListener.getClass();
        ArrayList arrayList = this.f25793b;
        if (arrayList.contains(transferListener)) {
            return;
        }
        arrayList.add(transferListener);
        this.f25794c++;
    }

    /* JADX INFO: renamed from: k */
    public final void m9672k(int i) {
        DataSpec dataSpec = this.f25795d;
        int i2 = Util.f25665a;
        for (int i3 = 0; i3 < this.f25794c; i3++) {
            ((TransferListener) this.f25793b.get(i3)).mo9701c(dataSpec, this.f25792a, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9673l() {
        DataSpec dataSpec = this.f25795d;
        int i = Util.f25665a;
        for (int i2 = 0; i2 < this.f25794c; i2++) {
            ((TransferListener) this.f25793b.get(i2)).mo9702d(dataSpec, this.f25792a);
        }
        this.f25795d = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m9674m(DataSpec dataSpec) {
        for (int i = 0; i < this.f25794c; i++) {
            ((TransferListener) this.f25793b.get(i)).mo9700b(dataSpec, this.f25792a);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9675n(DataSpec dataSpec) {
        this.f25795d = dataSpec;
        for (int i = 0; i < this.f25794c; i++) {
            ((TransferListener) this.f25793b.get(i)).mo9703g(dataSpec, this.f25792a);
        }
    }
}
