package kotlin.internal.jdk7;

import kotlin.Metadata;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "kotlin-stdlib-jdk7"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class ReflectSdkVersion {

        /* JADX INFO: renamed from: a */
        public static final Integer f51614a;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f51614a = num;
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    /* JADX INFO: renamed from: a */
    public final void mo18564a(Throwable cause, Throwable exception) {
        Intrinsics.m18599g(cause, "cause");
        Intrinsics.m18599g(exception, "exception");
        Integer num = ReflectSdkVersion.f51614a;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.mo18564a(cause, exception);
        }
    }
}
