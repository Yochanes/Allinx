package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: a */
    public boolean f21177a;

    /* JADX INFO: renamed from: f */
    public float f21181f;

    /* JADX INFO: renamed from: n */
    public Type f21185n;

    /* JADX INFO: renamed from: b */
    public int f21178b = -1;

    /* JADX INFO: renamed from: c */
    public int f21179c = -1;

    /* JADX INFO: renamed from: d */
    public int f21180d = 0;

    /* JADX INFO: renamed from: g */
    public boolean f21182g = false;

    /* JADX INFO: renamed from: i */
    public final float[] f21183i = new float[9];

    /* JADX INFO: renamed from: j */
    public final float[] f21184j = new float[9];

    /* JADX INFO: renamed from: o */
    public ArrayRow[] f21186o = new ArrayRow[16];

    /* JADX INFO: renamed from: p */
    public int f21187p = 0;

    /* JADX INFO: renamed from: q */
    public int f21188q = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final Type f21189a;

        /* JADX INFO: renamed from: b */
        public static final Type f21190b;

        /* JADX INFO: renamed from: c */
        public static final Type f21191c;

        /* JADX INFO: renamed from: d */
        public static final Type f21192d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ Type[] f21193f;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            f21189a = type;
            Type type2 = new Type("CONSTANT", 1);
            Type type3 = new Type("SLACK", 2);
            f21190b = type3;
            Type type4 = new Type("ERROR", 3);
            f21191c = type4;
            Type type5 = new Type("UNKNOWN", 4);
            f21192d = type5;
            f21193f = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f21193f.clone();
        }
    }

    public SolverVariable(Type type) {
        this.f21185n = type;
    }

    /* JADX INFO: renamed from: a */
    public final void m6841a(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.f21187p;
            if (i >= i2) {
                ArrayRow[] arrayRowArr = this.f21186o;
                if (i2 >= arrayRowArr.length) {
                    this.f21186o = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.f21186o;
                int i3 = this.f21187p;
                arrayRowArr2[i3] = arrayRow;
                this.f21187p = i3 + 1;
                return;
            }
            if (this.f21186o[i] == arrayRow) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6842b(ArrayRow arrayRow) {
        int i = this.f21187p;
        int i2 = 0;
        while (i2 < i) {
            if (this.f21186o[i2] == arrayRow) {
                while (i2 < i - 1) {
                    ArrayRow[] arrayRowArr = this.f21186o;
                    int i3 = i2 + 1;
                    arrayRowArr[i2] = arrayRowArr[i3];
                    i2 = i3;
                }
                this.f21187p--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6843c() {
        this.f21185n = Type.f21192d;
        this.f21180d = 0;
        this.f21178b = -1;
        this.f21179c = -1;
        this.f21181f = 0.0f;
        this.f21182g = false;
        int i = this.f21187p;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21186o[i2] = null;
        }
        this.f21187p = 0;
        this.f21188q = 0;
        this.f21177a = false;
        Arrays.fill(this.f21184j, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f21178b - solverVariable.f21178b;
    }

    /* JADX INFO: renamed from: d */
    public final void m6844d(LinearSystem linearSystem, float f) {
        this.f21181f = f;
        this.f21182g = true;
        int i = this.f21187p;
        this.f21179c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21186o[i2].m6816h(linearSystem, this, false);
        }
        this.f21187p = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m6845e(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i = this.f21187p;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21186o[i2].mo6817i(linearSystem, arrayRow, false);
        }
        this.f21187p = 0;
    }

    public final String toString() {
        return "" + this.f21178b;
    }
}
