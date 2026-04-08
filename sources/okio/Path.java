package okio;

import com.airbnb.lottie.utils.AbstractC2433a;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokio/Path;", "", "Companion", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Path implements Comparable<Path> {

    /* JADX INFO: renamed from: b */
    public static final String f57884b;

    /* JADX INFO: renamed from: a */
    public final ByteString f57885a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokio/Path$Companion;", "", "", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static Path m21687a(String str) {
            Intrinsics.m18599g(str, "<this>");
            ByteString byteString = okio.internal.Path.f57935a;
            Buffer buffer = new Buffer();
            buffer.m21578S0(str);
            return okio.internal.Path.m21721d(buffer, false);
        }

        /* JADX INFO: renamed from: b */
        public static Path m21688b(File file) {
            String str = Path.f57884b;
            Intrinsics.m18599g(file, "<this>");
            String string = file.toString();
            Intrinsics.m18598f(string, "toString(...)");
            return m21687a(string);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.m18598f(separator, "separator");
        f57884b = separator;
    }

    public Path(ByteString bytes) {
        Intrinsics.m18599g(bytes, "bytes");
        this.f57885a = bytes;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m21680a() {
        ArrayList arrayList = new ArrayList();
        int iM21718a = okio.internal.Path.m21718a(this);
        ByteString byteString = this.f57885a;
        if (iM21718a == -1) {
            iM21718a = 0;
        } else if (iM21718a < byteString.mo21617d() && byteString.mo21621j(iM21718a) == 92) {
            iM21718a++;
        }
        int iMo21617d = byteString.mo21617d();
        int i = iM21718a;
        while (iM21718a < iMo21617d) {
            if (byteString.mo21621j(iM21718a) == 47 || byteString.mo21621j(iM21718a) == 92) {
                arrayList.add(byteString.mo21626p(i, iM21718a));
                i = iM21718a + 1;
            }
            iM21718a++;
        }
        if (i < byteString.mo21617d()) {
            arrayList.add(byteString.mo21626p(i, byteString.mo21617d()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final Path m21681b() {
        ByteString byteString = okio.internal.Path.f57938d;
        ByteString byteString2 = this.f57885a;
        if (Intrinsics.m18594b(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = okio.internal.Path.f57935a;
        if (Intrinsics.m18594b(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = okio.internal.Path.f57936b;
        if (Intrinsics.m18594b(byteString2, byteString4)) {
            return null;
        }
        ByteString suffix = okio.internal.Path.f57939e;
        byteString2.getClass();
        Intrinsics.m18599g(suffix, "suffix");
        int iMo21617d = byteString2.mo21617d();
        byte[] bArr = suffix.f57842a;
        if (byteString2.mo21623m(iMo21617d - bArr.length, suffix, bArr.length) && (byteString2.mo21617d() == 2 || byteString2.mo21623m(byteString2.mo21617d() - 3, byteString3, 1) || byteString2.mo21623m(byteString2.mo21617d() - 3, byteString4, 1))) {
            return null;
        }
        int iM21612l = ByteString.m21612l(byteString2, byteString3);
        if (iM21612l == -1) {
            iM21612l = ByteString.m21612l(byteString2, byteString4);
        }
        if (iM21612l == 2 && m21686h() != null) {
            if (byteString2.mo21617d() == 3) {
                return null;
            }
            return new Path(ByteString.m21613q(byteString2, 0, 3, 1));
        }
        if (iM21612l == 1 && byteString2.m21625o(byteString4)) {
            return null;
        }
        if (iM21612l != -1 || m21686h() == null) {
            return iM21612l == -1 ? new Path(byteString) : iM21612l == 0 ? new Path(ByteString.m21613q(byteString2, 0, 1, 1)) : new Path(ByteString.m21613q(byteString2, 0, iM21612l, 1));
        }
        if (byteString2.mo21617d() == 2) {
            return null;
        }
        return new Path(ByteString.m21613q(byteString2, 0, 2, 1));
    }

    /* JADX INFO: renamed from: c */
    public final Path m21682c(Path other) {
        Intrinsics.m18599g(other, "other");
        int iM21718a = okio.internal.Path.m21718a(this);
        ByteString byteString = this.f57885a;
        Path path = iM21718a == -1 ? null : new Path(byteString.mo21626p(0, iM21718a));
        int iM21718a2 = okio.internal.Path.m21718a(other);
        ByteString byteString2 = other.f57885a;
        if (!Intrinsics.m18594b(path, iM21718a2 != -1 ? new Path(byteString2.mo21626p(0, iM21718a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListM21680a = m21680a();
        ArrayList arrayListM21680a2 = other.m21680a();
        int iMin = Math.min(arrayListM21680a.size(), arrayListM21680a2.size());
        int i = 0;
        while (i < iMin && Intrinsics.m18594b(arrayListM21680a.get(i), arrayListM21680a2.get(i))) {
            i++;
        }
        if (i == iMin && byteString.mo21617d() == byteString2.mo21617d()) {
            return Companion.m21687a(".");
        }
        if (arrayListM21680a2.subList(i, arrayListM21680a2.size()).indexOf(okio.internal.Path.f57939e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString byteStringM21720c = okio.internal.Path.m21720c(other);
        if (byteStringM21720c == null && (byteStringM21720c = okio.internal.Path.m21720c(this)) == null) {
            byteStringM21720c = okio.internal.Path.m21723f(f57884b);
        }
        int size = arrayListM21680a2.size();
        for (int i2 = i; i2 < size; i2++) {
            buffer.m21606x0(okio.internal.Path.f57939e);
            buffer.m21606x0(byteStringM21720c);
        }
        int size2 = arrayListM21680a.size();
        while (i < size2) {
            buffer.m21606x0((ByteString) arrayListM21680a.get(i));
            buffer.m21606x0(byteStringM21720c);
            i++;
        }
        return okio.internal.Path.m21721d(buffer, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Path path) {
        Path other = path;
        Intrinsics.m18599g(other, "other");
        return this.f57885a.m21615b(other.f57885a);
    }

    /* JADX INFO: renamed from: d */
    public final Path m21683d(String child) {
        Intrinsics.m18599g(child, "child");
        Buffer buffer = new Buffer();
        buffer.m21578S0(child);
        return okio.internal.Path.m21719b(this, okio.internal.Path.m21721d(buffer, false), false);
    }

    /* JADX INFO: renamed from: e */
    public final File m21684e() {
        return new File(this.f57885a.m21629t());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Path) && Intrinsics.m18594b(((Path) obj).f57885a, this.f57885a);
    }

    /* JADX INFO: renamed from: f */
    public final java.nio.file.Path m21685f() {
        java.nio.file.Path pathM12763f = AbstractC2433a.m12763f(this.f57885a.m21629t(), new String[0]);
        Intrinsics.m18598f(pathM12763f, "get(...)");
        return pathM12763f;
    }

    /* JADX INFO: renamed from: h */
    public final Character m21686h() {
        ByteString byteString = okio.internal.Path.f57935a;
        ByteString byteString2 = this.f57885a;
        if (ByteString.m21611h(byteString2, byteString) != -1 || byteString2.mo21617d() < 2 || byteString2.mo21621j(1) != 58) {
            return null;
        }
        char cMo21621j = (char) byteString2.mo21621j(0);
        if (('a' > cMo21621j || cMo21621j >= '{') && ('A' > cMo21621j || cMo21621j >= '[')) {
            return null;
        }
        return Character.valueOf(cMo21621j);
    }

    public final int hashCode() {
        return this.f57885a.hashCode();
    }

    public final String toString() {
        return this.f57885a.m21629t();
    }
}
