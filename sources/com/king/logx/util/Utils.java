package com.king.logx.util;

import android.os.Build;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m18302d2 = {"Lcom/king/logx/util/Utils;", "", "()V", "Companion", "logx_release"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public final class Utils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_TAG_LENGTH = 23;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m18302d2 = {"Lcom/king/logx/util/Utils$Companion;", "", "()V", "MAX_TAG_LENGTH", "", "createStackElementTag", "", "element", "Ljava/lang/StackTraceElement;", "getStackTraceString", "t", "", "logx_release"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String createStackElementTag(@NotNull StackTraceElement element) {
            Intrinsics.m18599g(element, "element");
            String className = element.getClassName();
            Intrinsics.m18598f(className, "element.className");
            String strM20420R = StringsKt.m20420R('.', className, className);
            int iM20445u = StringsKt.m20445u(strM20420R, '$', 0, 6);
            if (iM20445u != -1) {
                strM20420R = strM20420R.substring(0, iM20445u);
                Intrinsics.m18598f(strM20420R, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (strM20420R.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return strM20420R;
            }
            String strSubstring = strM20420R.substring(0, 23);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @NotNull
        public final String getStackTraceString(@NotNull Throwable t) {
            Intrinsics.m18599g(t, "t");
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            t.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            Intrinsics.m18598f(string, "sw.toString()");
            return string;
        }

        private Companion() {
        }
    }

    private Utils() {
        throw new AssertionError();
    }
}
