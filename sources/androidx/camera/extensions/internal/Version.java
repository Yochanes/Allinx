package androidx.camera.extensions.internal;

import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class Version implements Comparable<Version> {

    /* JADX INFO: renamed from: a */
    public static final Version f3225a;

    /* JADX INFO: renamed from: b */
    public static final Pattern f3226b;

    static {
        new AutoValue_Version(1, 0, 0, "");
        new AutoValue_Version(1, 1, 0, "");
        new AutoValue_Version(1, 2, 0, "");
        f3225a = new AutoValue_Version(1, 3, 0, "");
        new AutoValue_Version(1, 4, 0, "");
        f3226b = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");
    }

    /* JADX INFO: renamed from: b */
    public static BigInteger m1750b(Version version) {
        return BigInteger.valueOf(version.mo1744d()).shiftLeft(32).or(BigInteger.valueOf(version.mo1745e())).shiftLeft(32).or(BigInteger.valueOf(version.mo1746f()));
    }

    /* JADX INFO: renamed from: h */
    public static Version m1751h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f3226b.matcher(str);
        if (matcher.matches()) {
            return new AutoValue_Version(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m1752a(int i, int i2) {
        return mo1744d() == i ? Integer.compare(mo1745e(), i2) : Integer.compare(mo1744d(), i);
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo1743c();

    @Override // java.lang.Comparable
    public final int compareTo(Version version) {
        return m1750b(this).compareTo(m1750b(version));
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo1744d();

    /* JADX INFO: renamed from: e */
    public abstract int mo1745e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return Integer.valueOf(mo1744d()).equals(Integer.valueOf(version.mo1744d())) && Integer.valueOf(mo1745e()).equals(Integer.valueOf(version.mo1745e())) && Integer.valueOf(mo1746f()).equals(Integer.valueOf(version.mo1746f()));
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo1746f();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(mo1744d()), Integer.valueOf(mo1745e()), Integer.valueOf(mo1746f()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(mo1744d() + "." + mo1745e() + "." + mo1746f());
        if (!TextUtils.isEmpty(mo1743c())) {
            sb.append("-" + mo1743c());
        }
        return sb.toString();
    }
}
