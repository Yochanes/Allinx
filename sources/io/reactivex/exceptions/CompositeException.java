package io.reactivex.exceptions;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final List f47547a;

    /* JADX INFO: renamed from: b */
    public final String f47548b;

    /* JADX INFO: renamed from: c */
    public Throwable f47549c;

    /* JADX INFO: compiled from: Proguard */
    public static final class CompositeExceptionCausalChain extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class PrintStreamOrWriter {
        /* JADX INFO: renamed from: a */
        public abstract void mo17611a(String str);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WrappedPrintStream extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a */
        public final PrintStream f47550a;

        public WrappedPrintStream(PrintStream printStream) {
            this.f47550a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        /* JADX INFO: renamed from: a */
        public final void mo17611a(String str) {
            this.f47550a.println((Object) str);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WrappedPrintWriter extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a */
        public final PrintWriter f47551a;

        public WrappedPrintWriter(PrintWriter printWriter) {
            this.f47551a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        /* JADX INFO: renamed from: a */
        public final void mo17611a(String str) {
            this.f47551a.println((Object) str);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* JADX INFO: renamed from: a */
    public static void m17609a(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m17609a("", sb, th.getCause());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17610b(PrintStreamOrWriter printStreamOrWriter) {
        StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f47547a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m17609a("\t", sb, th);
            i++;
        }
        printStreamOrWriter.mo17611a(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f47549c == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
                for (Throwable runtimeException : this.f47547a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        for (Throwable th : arrayList) {
                            if (hashSet.contains(th)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            compositeExceptionCausalChain2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = compositeExceptionCausalChain2.getCause();
                        if (cause3 != null && this.f47549c != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            compositeExceptionCausalChain2 = cause3;
                        }
                    }
                }
                this.f47549c = compositeExceptionCausalChain;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47549c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f47548b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m17610b(new WrappedPrintStream(printStream));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f47547a);
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
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f47547a = listUnmodifiableList;
            this.f47548b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m17610b(new WrappedPrintWriter(printWriter));
    }
}
