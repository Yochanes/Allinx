package io.ktor.http.cio.internals;

import io.ktor.util.InternalAPI;
import io.ktor.utils.p043io.pool.ObjectPool;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/http/cio/internals/CharArrayBuilder;", "", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "SubSequenceImpl", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CharArrayBuilder implements CharSequence, Appendable {

    /* JADX INFO: renamed from: a */
    public ArrayList f45887a;

    /* JADX INFO: renamed from: b */
    public char[] f45888b;

    /* JADX INFO: renamed from: c */
    public String f45889c;

    /* JADX INFO: renamed from: d */
    public boolean f45890d;

    /* JADX INFO: renamed from: f */
    public int f45891f;

    /* JADX INFO: renamed from: g */
    public int f45892g;

    /* JADX INFO: renamed from: i */
    public final ObjectPool f45893i;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/internals/CharArrayBuilder$SubSequenceImpl;", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public final class SubSequenceImpl implements CharSequence {

        /* JADX INFO: renamed from: a */
        public String f45894a;

        /* JADX INFO: renamed from: b */
        public final int f45895b;

        /* JADX INFO: renamed from: c */
        public final int f45896c;

        public SubSequenceImpl(int i, int i2) {
            this.f45895b = i;
            this.f45896c = i2;
        }

        @Override // java.lang.CharSequence
        public final char charAt(int i) {
            int i2 = this.f45895b + i;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i, "index is negative: ").toString());
            }
            if (i2 < this.f45896c) {
                return CharArrayBuilder.this.m17034c(i2);
            }
            throw new IllegalArgumentException(AbstractC0000a.m17n(AbstractC0000a.m20q(i, "index (", ") should be less than length ("), length(), ')').toString());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() == length()) {
                    int length = length();
                    CharArrayBuilder charArrayBuilder = CharArrayBuilder.this;
                    for (int i = 0; i < length; i++) {
                        if (charArrayBuilder.m17034c(this.f45895b + i) != charSequence.charAt(i)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f45894a;
            if (str != null) {
                return str.hashCode();
            }
            CharArrayBuilder charArrayBuilder = CharArrayBuilder.this;
            int iM17034c = 0;
            for (int i = this.f45895b; i < this.f45896c; i++) {
                iM17034c = (iM17034c * 31) + charArrayBuilder.m17034c(i);
            }
            return iM17034c;
        }

        @Override // java.lang.CharSequence
        public final int length() {
            return this.f45896c - this.f45895b;
        }

        @Override // java.lang.CharSequence
        public final CharSequence subSequence(int i, int i2) {
            if (!(i >= 0)) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i, "start is negative: ").toString());
            }
            if (!(i <= i2)) {
                throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
            }
            int i3 = this.f45896c;
            int i4 = this.f45895b;
            if (!(i2 <= i3 - i4)) {
                throw new IllegalArgumentException(AbstractC0000a.m17n(new StringBuilder("end should be less than length ("), length(), ')').toString());
            }
            if (i == i2) {
                return "";
            }
            return CharArrayBuilder.this.new SubSequenceImpl(i + i4, i4 + i2);
        }

        @Override // java.lang.CharSequence
        public final String toString() {
            String str = this.f45894a;
            if (str != null) {
                return str;
            }
            String string = CharArrayBuilder.this.m17033b(this.f45895b, this.f45896c).toString();
            this.f45894a = string;
            return string;
        }
    }

    public CharArrayBuilder() {
        CharArrayPoolKt$CharArrayPool$1 pool = CharArrayPoolKt.f45898a;
        Intrinsics.m18599g(pool, "pool");
        this.f45893i = pool;
    }

    /* JADX INFO: renamed from: a */
    public final char[] m17032a(int i) {
        ArrayList arrayList = this.f45887a;
        if (arrayList != null) {
            char[] cArr = this.f45888b;
            Intrinsics.m18596d(cArr);
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            m17037f(i);
            throw null;
        }
        char[] cArr2 = this.f45888b;
        if (cArr2 != null) {
            return cArr2;
        }
        m17037f(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        char[] cArrM17035d = m17035d();
        char[] cArr = this.f45888b;
        Intrinsics.m18596d(cArr);
        int length = cArr.length;
        int i = this.f45891f;
        cArrM17035d[length - i] = c2;
        this.f45889c = null;
        this.f45891f = i - 1;
        this.f45892g++;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m17033b(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrM17032a = m17032a(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb.append(cArrM17032a[iMax]);
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: c */
    public final char m17034c(int i) {
        char[] cArrM17032a = m17032a(i);
        char[] cArr = this.f45888b;
        Intrinsics.m18596d(cArr);
        return cArrM17032a[i % cArr.length];
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "index is negative: ").toString());
        }
        if (i < this.f45892g) {
            return m17034c(i);
        }
        throw new IllegalArgumentException(AbstractC0000a.m17n(AbstractC0000a.m20q(i, "index ", " is not in range [0, "), this.f45892g, ')').toString());
    }

    /* JADX INFO: renamed from: d */
    public final char[] m17035d() {
        if (this.f45891f != 0) {
            char[] cArr = this.f45888b;
            Intrinsics.m18596d(cArr);
            return cArr;
        }
        char[] cArr2 = (char[]) this.f45893i.mo17488G();
        char[] cArr3 = this.f45888b;
        this.f45888b = cArr2;
        this.f45891f = cArr2.length;
        this.f45890d = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.f45887a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f45887a = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: e */
    public final void m17036e() {
        ArrayList arrayList = this.f45887a;
        ObjectPool objectPool = this.f45893i;
        if (arrayList != null) {
            this.f45888b = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                objectPool.mo17522N0(arrayList.get(i));
            }
        } else {
            char[] cArr = this.f45888b;
            if (cArr != null) {
                objectPool.mo17522N0(cArr);
            }
            this.f45888b = null;
        }
        this.f45890d = true;
        this.f45887a = null;
        this.f45889c = null;
        this.f45892g = 0;
        this.f45891f = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f45892g == charSequence.length()) {
                int i = this.f45892g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (m17034c(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m17037f(int i) {
        if (this.f45890d) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.f45888b;
        Intrinsics.m18596d(cArr);
        sb.append(cArr.length - this.f45891f);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int hashCode() {
        String str = this.f45889c;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f45892g;
        int iM17034c = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM17034c = (iM17034c * 31) + m17034c(i2);
        }
        return iM17034c;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f45892g;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i <= i2) {
            if (!(i >= 0)) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i, "startIndex is negative: ").toString());
            }
            if (i2 <= this.f45892g) {
                return new SubSequenceImpl(i, i2);
            }
            throw new IllegalArgumentException(AbstractC0000a.m17n(AbstractC0000a.m20q(i2, "endIndex (", ") is greater than length ("), this.f45892g, ')').toString());
        }
        throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f45889c;
        if (str != null) {
            return str;
        }
        String string = m17033b(0, this.f45892g).toString();
        this.f45889c = string;
        return string;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            int i3 = i;
            while (i3 < i2) {
                char[] cArrM17035d = m17035d();
                int length = cArrM17035d.length;
                int i4 = this.f45891f;
                int i5 = length - i4;
                int iMin = Math.min(i2 - i3, i4);
                for (int i6 = 0; i6 < iMin; i6++) {
                    cArrM17035d[i5 + i6] = charSequence.charAt(i3 + i6);
                }
                i3 += iMin;
                this.f45891f -= iMin;
            }
            this.f45889c = null;
            this.f45892g = (i2 - i) + this.f45892g;
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            append(charSequence, 0, charSequence.length());
        }
        return this;
    }
}
