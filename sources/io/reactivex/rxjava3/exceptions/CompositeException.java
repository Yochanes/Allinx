package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final List f49375a;

    /* JADX INFO: renamed from: b */
    public final String f49376b;

    /* JADX INFO: renamed from: c */
    public Throwable f49377c;

    /* JADX INFO: compiled from: Proguard */
    public static final class ExceptionOverview extends RuntimeException {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class PrintStreamOrWriter {
        /* JADX INFO: renamed from: a */
        public abstract PrintStreamOrWriter mo17949a(Serializable serializable);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WrappedPrintStream extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a */
        public final PrintStream f49378a;

        public WrappedPrintStream(PrintStream printStream) {
            this.f49378a = printStream;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.PrintStreamOrWriter
        /* JADX INFO: renamed from: a */
        public final PrintStreamOrWriter mo17949a(Serializable serializable) {
            this.f49378a.print(serializable);
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WrappedPrintWriter extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a */
        public final PrintWriter f49379a;

        public WrappedPrintWriter(PrintWriter printWriter) {
            this.f49379a = printWriter;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.PrintStreamOrWriter
        /* JADX INFO: renamed from: a */
        public final PrintStreamOrWriter mo17949a(Serializable serializable) {
            this.f49379a.print(serializable);
            return this;
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* JADX INFO: renamed from: a */
    public static void m17947a(PrintStreamOrWriter printStreamOrWriter, Throwable th, String str) {
        printStreamOrWriter.mo17949a(str).mo17949a(th).mo17949a('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            printStreamOrWriter.mo17949a("\t\tat ").mo17949a(stackTraceElement).mo17949a('\n');
        }
        if (th.getCause() != null) {
            printStreamOrWriter.mo17949a("\tCaused by: ");
            m17947a(printStreamOrWriter, th.getCause(), "");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17948b(PrintStreamOrWriter printStreamOrWriter) {
        printStreamOrWriter.mo17949a(this).mo17949a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            printStreamOrWriter.mo17949a("\tat ").mo17949a(stackTraceElement).mo17949a("\n");
        }
        int i = 1;
        for (Throwable th : this.f49375a) {
            printStreamOrWriter.mo17949a("  ComposedException ").mo17949a(Integer.valueOf(i)).mo17949a(" :\n");
            m17947a(printStreamOrWriter, th, "\t");
            i++;
        }
        printStreamOrWriter.mo17949a("\n");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        int i;
        try {
            if (this.f49377c == null) {
                String property = System.getProperty("line.separator");
                if (this.f49375a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.f49375a.size());
                    sb.append(")");
                    sb.append(property);
                    for (Throwable cause : this.f49375a) {
                        int i2 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    sb.append("  ");
                                }
                                sb.append("|-- ");
                                sb.append(cause.getClass().getCanonicalName());
                                sb.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb.append(message);
                                    sb.append(property);
                                } else {
                                    sb.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i4 = 0; i4 < i2 + 2; i4++) {
                                            sb.append("  ");
                                        }
                                        sb.append(str);
                                        sb.append(property);
                                    }
                                }
                                int i5 = 0;
                                while (true) {
                                    i = i2 + 2;
                                    if (i5 >= i) {
                                        break;
                                    }
                                    sb.append("  ");
                                    i5++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb.append("at ");
                                    sb.append(stackTrace[0]);
                                    sb.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i6 = 0; i6 < i; i6++) {
                                            sb.append("  ");
                                        }
                                        sb.append("|-- ");
                                        sb.append("(cause not expanded again) ");
                                        sb.append(cause2.getClass().getCanonicalName());
                                        sb.append(": ");
                                        sb.append(cause2.getMessage());
                                        sb.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i2++;
                                }
                            }
                        }
                    }
                    this.f49377c = new ExceptionOverview(sb.toString().trim());
                } else {
                    this.f49377c = (Throwable) this.f49375a.get(0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f49377c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f49376b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m17948b(new WrappedPrintStream(printStream));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f49375a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f49375a = listUnmodifiableList;
            this.f49376b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m17948b(new WrappedPrintWriter(printWriter));
    }
}
