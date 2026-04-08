package androidx.appcompat.widget;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class RtlSpacingHelper {

    /* JADX INFO: renamed from: a */
    public int f1349a;

    /* JADX INFO: renamed from: b */
    public int f1350b;

    /* JADX INFO: renamed from: c */
    public int f1351c;

    /* JADX INFO: renamed from: d */
    public int f1352d;

    /* JADX INFO: renamed from: e */
    public int f1353e;

    /* JADX INFO: renamed from: f */
    public int f1354f;

    /* JADX INFO: renamed from: g */
    public boolean f1355g;

    /* JADX INFO: renamed from: h */
    public boolean f1356h;

    /* JADX INFO: renamed from: a */
    public final void m682a(int i, int i2) {
        this.f1351c = i;
        this.f1352d = i2;
        this.f1356h = true;
        if (this.f1355g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1349a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1350b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1349a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1350b = i2;
        }
    }
}
