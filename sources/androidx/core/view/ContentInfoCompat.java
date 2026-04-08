package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.AbstractC0157C;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: a */
    public final Compat f23348a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api31Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final BuilderCompat f23349a;

        public Builder(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f23349a = new BuilderCompat31Impl(clipData, i);
                return;
            }
            BuilderCompatImpl builderCompatImpl = new BuilderCompatImpl();
            builderCompatImpl.f23351a = clipData;
            builderCompatImpl.f23352b = i;
            this.f23349a = builderCompatImpl;
        }

        /* JADX INFO: renamed from: a */
        public final ContentInfoCompat m7708a() {
            return this.f23349a.build();
        }

        /* JADX INFO: renamed from: b */
        public final void m7709b(Bundle bundle) {
            this.f23349a.setExtras(bundle);
        }

        /* JADX INFO: renamed from: c */
        public final void m7710c(int i) {
            this.f23349a.mo7713b(i);
        }

        /* JADX INFO: renamed from: d */
        public final void m7711d(Uri uri) {
            this.f23349a.mo7712a(uri);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface BuilderCompat {
        /* JADX INFO: renamed from: a */
        void mo7712a(Uri uri);

        /* JADX INFO: renamed from: b */
        void mo7713b(int i);

        ContentInfoCompat build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class BuilderCompat31Impl implements BuilderCompat {

        /* JADX INFO: renamed from: a */
        public final ContentInfo.Builder f23350a;

        public BuilderCompat31Impl(ClipData clipData, int i) {
            this.f23350a = AbstractC0157C.m844g(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* JADX INFO: renamed from: a */
        public final void mo7712a(Uri uri) {
            AbstractC0157C.m863z(this.f23350a, uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* JADX INFO: renamed from: b */
        public final void mo7713b(int i) {
            AbstractC0157C.m862y(this.f23350a, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(AbstractC0157C.m845h(this.f23350a)));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            AbstractC0157C.m834A(this.f23350a, bundle);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BuilderCompatImpl implements BuilderCompat {

        /* JADX INFO: renamed from: a */
        public ClipData f23351a;

        /* JADX INFO: renamed from: b */
        public int f23352b;

        /* JADX INFO: renamed from: c */
        public int f23353c;

        /* JADX INFO: renamed from: d */
        public Uri f23354d;

        /* JADX INFO: renamed from: e */
        public Bundle f23355e;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* JADX INFO: renamed from: a */
        public final void mo7712a(Uri uri) {
            this.f23354d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* JADX INFO: renamed from: b */
        public final void mo7713b(int i) {
            this.f23353c = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.f23355e = bundle;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Compat {
        /* JADX INFO: renamed from: a */
        ClipData mo7714a();

        /* JADX INFO: renamed from: g */
        int mo7715g();

        /* JADX INFO: renamed from: h */
        int mo7716h();

        /* JADX INFO: renamed from: i */
        ContentInfo mo7717i();
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Compat31Impl implements Compat {

        /* JADX INFO: renamed from: a */
        public final ContentInfo f23356a;

        public Compat31Impl(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f23356a = AbstractC0157C.m846i(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: a */
        public final ClipData mo7714a() {
            return AbstractC0157C.m838a(this.f23356a);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: g */
        public final int mo7715g() {
            return AbstractC1463a.m7997v(this.f23356a);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: h */
        public final int mo7716h() {
            return AbstractC1463a.m7977b(this.f23356a);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: i */
        public final ContentInfo mo7717i() {
            return this.f23356a;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f23356a + "}";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CompatImpl implements Compat {

        /* JADX INFO: renamed from: a */
        public final ClipData f23357a;

        /* JADX INFO: renamed from: b */
        public final int f23358b;

        /* JADX INFO: renamed from: c */
        public final int f23359c;

        /* JADX INFO: renamed from: d */
        public final Uri f23360d;

        /* JADX INFO: renamed from: e */
        public final Bundle f23361e;

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            ClipData clipData = builderCompatImpl.f23351a;
            clipData.getClass();
            this.f23357a = clipData;
            int i = builderCompatImpl.f23352b;
            Preconditions.m7696c(i, 0, 5, "source");
            this.f23358b = i;
            int i2 = builderCompatImpl.f23353c;
            if ((i2 & 1) == i2) {
                this.f23359c = i2;
                this.f23360d = builderCompatImpl.f23354d;
                this.f23361e = builderCompatImpl.f23355e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: a */
        public final ClipData mo7714a() {
            return this.f23357a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: g */
        public final int mo7715g() {
            return this.f23358b;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: h */
        public final int mo7716h() {
            return this.f23359c;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* JADX INFO: renamed from: i */
        public final ContentInfo mo7717i() {
            return null;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f23357a.getDescription());
            sb.append(", source=");
            int i = this.f23358b;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i2 = this.f23359c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.f23360d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return AbstractC0000a.m19p(sb, this.f23361e != null ? ", hasExtras" : "", "}");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    public ContentInfoCompat(Compat compat) {
        this.f23348a = compat;
    }

    /* JADX INFO: renamed from: a */
    public final ClipData m7705a() {
        return this.f23348a.mo7714a();
    }

    /* JADX INFO: renamed from: b */
    public final int m7706b() {
        return this.f23348a.mo7716h();
    }

    /* JADX INFO: renamed from: c */
    public final int m7707c() {
        return this.f23348a.mo7715g();
    }

    public final String toString() {
        return this.f23348a.toString();
    }
}
