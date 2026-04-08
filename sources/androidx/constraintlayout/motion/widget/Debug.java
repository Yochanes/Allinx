package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public class Debug {
    /* JADX INFO: renamed from: a */
    public static String m7209a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* JADX INFO: renamed from: b */
    public static String m7210b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* JADX INFO: renamed from: c */
    public static String m7211c(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return AbstractC0000a.m9f(i, "?");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m7212d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
