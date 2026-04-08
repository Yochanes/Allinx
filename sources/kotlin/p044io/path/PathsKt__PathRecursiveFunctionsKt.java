package kotlin.p044io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib-jdk7"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension
class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CopyActionResult[] copyActionResultArr = CopyActionResult.f51625a;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CopyActionResult[] copyActionResultArr2 = CopyActionResult.f51625a;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OnErrorResult[] onErrorResultArr = OnErrorResult.f51628a;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final FileVisitResult m18570a(Path path, Exception exc) {
        Intrinsics.m18599g(null, "base");
        try {
            int i = PathRelativizer.f51630a;
            Intrinsics.m18599g(null, "base");
            throw null;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: null", e);
        }
    }
}
