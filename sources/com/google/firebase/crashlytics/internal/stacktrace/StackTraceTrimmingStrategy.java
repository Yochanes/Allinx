package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface StackTraceTrimmingStrategy {
    StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr);
}
