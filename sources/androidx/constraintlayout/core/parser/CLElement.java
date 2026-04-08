package androidx.constraintlayout.core.parser;

import java.util.Arrays;
import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLElement implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final char[] f21528a;

    /* JADX INFO: renamed from: b */
    public long f21529b = -1;

    /* JADX INFO: renamed from: c */
    public long f21530c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public CLContainer f21531d;

    public CLElement(char[] cArr) {
        this.f21528a = cArr;
    }

    /* JADX INFO: renamed from: a */
    public CLElement mo6942a() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m6956c() {
        String str = new String(this.f21528a);
        if (str.length() < 1) {
            return "";
        }
        long j = this.f21530c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.f21529b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.f21529b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return mo6942a();
    }

    /* JADX INFO: renamed from: d */
    public float mo6957d() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).mo6957d();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public int mo6958e() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).mo6958e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.f21529b == cLElement.f21529b && this.f21530c == cLElement.f21530c && Arrays.equals(this.f21528a, cLElement.f21528a)) {
            return Objects.equals(this.f21531d, cLElement.f21531d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m6959f() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f21528a) * 31;
        long j = this.f21529b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f21530c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        CLContainer cLContainer = this.f21531d;
        return ((i2 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m6960i(long j) {
        if (this.f21530c != Long.MAX_VALUE) {
            return;
        }
        this.f21530c = j;
        CLContainer cLContainer = this.f21531d;
        if (cLContainer != null) {
            cLContainer.m6943j(this);
        }
    }

    public String toString() {
        long j = this.f21529b;
        long j2 = this.f21530c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.f21529b);
            sb.append("-");
            return AbstractC0000a.m12i(this.f21530c, ")", sb);
        }
        return m6959f() + " (" + this.f21529b + " : " + this.f21530c + ") <<" + new String(this.f21528a).substring((int) this.f21529b, ((int) this.f21530c) + 1) + ">>";
    }
}
