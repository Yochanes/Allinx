package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class InputContentInfoCompat {

    /* JADX INFO: renamed from: a */
    public final InputContentInfoCompatImpl f23547a;

    /* JADX INFO: compiled from: Proguard */
    public interface InputContentInfoCompatImpl {
        /* JADX INFO: renamed from: a */
        ClipDescription mo8121a();

        /* JADX INFO: renamed from: b */
        Uri mo8122b();

        /* JADX INFO: renamed from: c */
        void mo8123c();

        /* JADX INFO: renamed from: d */
        Uri mo8124d();

        /* JADX INFO: renamed from: e */
        Object mo8125e();
    }

    public InputContentInfoCompat(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f23547a = new InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
        } else {
            this.f23547a = new InputContentInfoCompatBaseImpl(uri, clipDescription, uri2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Uri m8116a() {
        return this.f23547a.mo8122b();
    }

    /* JADX INFO: renamed from: b */
    public final ClipDescription m8117b() {
        return this.f23547a.mo8121a();
    }

    /* JADX INFO: renamed from: c */
    public final Uri m8118c() {
        return this.f23547a.mo8124d();
    }

    /* JADX INFO: renamed from: d */
    public final void m8119d() {
        this.f23547a.mo8123c();
    }

    /* JADX INFO: renamed from: e */
    public final Object m8120e() {
        return this.f23547a.mo8125e();
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {

        /* JADX INFO: renamed from: a */
        public final InputContentInfo f23548a;

        public InputContentInfoCompatApi25Impl(Object obj) {
            this.f23548a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: a */
        public final ClipDescription mo8121a() {
            return this.f23548a.getDescription();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: b */
        public final Uri mo8122b() {
            return this.f23548a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: c */
        public final void mo8123c() {
            this.f23548a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: d */
        public final Uri mo8124d() {
            return this.f23548a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: e */
        public final Object mo8125e() {
            return this.f23548a;
        }

        public InputContentInfoCompatApi25Impl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f23548a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(InputContentInfoCompatApi25Impl inputContentInfoCompatApi25Impl) {
        this.f23547a = inputContentInfoCompatApi25Impl;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {

        /* JADX INFO: renamed from: a */
        public final Uri f23549a;

        /* JADX INFO: renamed from: b */
        public final ClipDescription f23550b;

        /* JADX INFO: renamed from: c */
        public final Uri f23551c;

        public InputContentInfoCompatBaseImpl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f23549a = uri;
            this.f23550b = clipDescription;
            this.f23551c = uri2;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: a */
        public final ClipDescription mo8121a() {
            return this.f23550b;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: b */
        public final Uri mo8122b() {
            return this.f23549a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: d */
        public final Uri mo8124d() {
            return this.f23551c;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: e */
        public final Object mo8125e() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* JADX INFO: renamed from: c */
        public final void mo8123c() {
        }
    }
}
