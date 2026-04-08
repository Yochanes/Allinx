package kotlin.p044io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/io/FilesKt__FilePathComponentsKt", "kotlin/io/FilesKt__FileReadWriteKt", "kotlin/io/FilesKt__FileTreeWalkKt", "kotlin/io/FilesKt__UtilsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class FilesKt extends FilesKt__UtilsKt {
    /* JADX INFO: renamed from: a */
    public static File m18569a(File file) {
        int length;
        int iM20445u;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        Intrinsics.m18598f(path, "getPath(...)");
        char c2 = File.separatorChar;
        int iM20445u2 = StringsKt.m20445u(path, c2, 0, 4);
        if (iM20445u2 != 0) {
            length = (iM20445u2 <= 0 || path.charAt(iM20445u2 + (-1)) != ':') ? (iM20445u2 == -1 && StringsKt.m20440p(path, ':')) ? path.length() : 0 : iM20445u2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c2 || (iM20445u = StringsKt.m20445u(path, c2, 2, 4)) < 0) {
            length = 1;
        } else {
            int iM20445u3 = StringsKt.m20445u(path, c2, iM20445u + 1, 4);
            length = iM20445u3 >= 0 ? iM20445u3 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        Intrinsics.m18598f(string, "toString(...)");
        if ((string.length() == 0) || StringsKt.m20440p(string, c2)) {
            return new File(string + file2);
        }
        return new File(string + c2 + file2);
    }
}
