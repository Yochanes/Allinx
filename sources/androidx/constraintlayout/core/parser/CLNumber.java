package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLNumber extends CLElement {

    /* JADX INFO: renamed from: f */
    public float f21532f;

    public CLNumber(float f) {
        super(null);
        this.f21532f = f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: d */
    public final float mo6957d() {
        char[] cArr;
        if (Float.isNaN(this.f21532f) && (cArr = this.f21528a) != null && cArr.length >= 1) {
            this.f21532f = Float.parseFloat(m6956c());
        }
        return this.f21532f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: e */
    public final int mo6958e() {
        char[] cArr;
        if (Float.isNaN(this.f21532f) && (cArr = this.f21528a) != null && cArr.length >= 1) {
            this.f21532f = Integer.parseInt(m6956c());
        }
        return (int) this.f21532f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLNumber) {
            float fMo6957d = mo6957d();
            float fMo6957d2 = ((CLNumber) obj).mo6957d();
            if ((Float.isNaN(fMo6957d) && Float.isNaN(fMo6957d2)) || fMo6957d == fMo6957d2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.f21532f;
        return iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }
}
