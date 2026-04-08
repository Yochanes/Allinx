package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "Builder", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final String[] f57106a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Headers$Builder;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final ArrayList f57107a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public final void m21245a(String name, String value) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(value, "value");
            Companion.m21252a(name);
            Companion.m21253b(value, name);
            m21247c(name, value);
        }

        /* JADX INFO: renamed from: b */
        public final void m21246b(String str) {
            int iM20445u = StringsKt.m20445u(str, ':', 1, 4);
            if (iM20445u != -1) {
                String strSubstring = str.substring(0, iM20445u);
                Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iM20445u + 1);
                Intrinsics.m18598f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                m21247c(strSubstring, strSubstring2);
                return;
            }
            if (str.charAt(0) != ':') {
                m21247c("", str);
                return;
            }
            String strSubstring3 = str.substring(1);
            Intrinsics.m18598f(strSubstring3, "this as java.lang.String).substring(startIndex)");
            m21247c("", strSubstring3);
        }

        /* JADX INFO: renamed from: c */
        public final void m21247c(String name, String value) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(value, "value");
            ArrayList arrayList = this.f57107a;
            arrayList.add(name);
            arrayList.add(StringsKt.m20430b0(value).toString());
        }

        /* JADX INFO: renamed from: d */
        public final void m21248d(String name, String value) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(value, "value");
            Companion.m21252a(name);
            m21247c(name, value);
        }

        /* JADX INFO: renamed from: e */
        public final Headers m21249e() {
            return new Headers((String[]) this.f57107a.toArray(new String[0]));
        }

        /* JADX INFO: renamed from: f */
        public final String m21250f(String name) {
            Intrinsics.m18599g(name, "name");
            ArrayList arrayList = this.f57107a;
            int size = arrayList.size() - 2;
            int iM18565a = ProgressionUtilKt.m18565a(size, 0, -2);
            if (iM18565a > size) {
                return null;
            }
            while (!name.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == iM18565a) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        /* JADX INFO: renamed from: g */
        public final void m21251g(String name) {
            Intrinsics.m18599g(name, "name");
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f57107a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Headers$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m21252a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.m21326i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m21253b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.m21326i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(Util.m21334q(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static Headers m21254c(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr2[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i2] = StringsKt.m20430b0(str).toString();
            }
            int iM18565a = ProgressionUtilKt.m18565a(0, strArr2.length - 1, 2);
            if (iM18565a >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    m21252a(str2);
                    m21253b(str3, str2);
                    if (i == iM18565a) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(strArr2);
        }
    }

    public Headers(String[] strArr) {
        this.f57106a = strArr;
    }

    /* JADX INFO: renamed from: c */
    public final String m21240c(String name) {
        Intrinsics.m18599g(name, "name");
        String[] strArr = this.f57106a;
        int length = strArr.length - 2;
        int iM18565a = ProgressionUtilKt.m18565a(length, 0, -2);
        if (iM18565a > length) {
            return null;
        }
        while (!StringsKt.m20442r(name, strArr[length], true)) {
            if (length == iM18565a) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: e */
    public final String m21241e(int i) {
        return this.f57106a[i * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f57106a, ((Headers) obj).f57106a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Builder m21242f() {
        Builder builder = new Builder();
        CollectionsKt.m18436j(builder.f57107a, this.f57106a);
        return builder;
    }

    /* JADX INFO: renamed from: g */
    public final String m21243g(int i) {
        return this.f57106a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57106a);
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(m21241e(i), m21243g(i));
        }
        return ArrayIteratorKt.m18576a(pairArr);
    }

    /* JADX INFO: renamed from: j */
    public final List m21244j(String name) {
        Intrinsics.m18599g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(m21241e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m21243g(i));
            }
        }
        if (arrayList == null) {
            return EmptyList.f51496a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.m18598f(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f57106a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM21241e = m21241e(i);
            String strM21243g = m21243g(i);
            sb.append(strM21241e);
            sb.append(": ");
            if (Util.m21334q(strM21241e)) {
                strM21243g = "██";
            }
            sb.append(strM21243g);
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
