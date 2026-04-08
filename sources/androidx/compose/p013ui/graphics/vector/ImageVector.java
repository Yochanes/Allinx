package androidx.compose.p013ui.graphics.vector;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "Builder", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ImageVector {

    /* JADX INFO: renamed from: k */
    public static int f17964k;

    /* JADX INFO: renamed from: l */
    public static final Companion f17965l = new Companion();

    /* JADX INFO: renamed from: a */
    public final String f17966a;

    /* JADX INFO: renamed from: b */
    public final float f17967b;

    /* JADX INFO: renamed from: c */
    public final float f17968c;

    /* JADX INFO: renamed from: d */
    public final float f17969d;

    /* JADX INFO: renamed from: e */
    public final float f17970e;

    /* JADX INFO: renamed from: f */
    public final VectorGroup f17971f;

    /* JADX INFO: renamed from: g */
    public final long f17972g;

    /* JADX INFO: renamed from: h */
    public final int f17973h;

    /* JADX INFO: renamed from: i */
    public final boolean f17974i;

    /* JADX INFO: renamed from: j */
    public final int f17975j;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "GroupParams", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final String f17976a;

        /* JADX INFO: renamed from: b */
        public final float f17977b;

        /* JADX INFO: renamed from: c */
        public final float f17978c;

        /* JADX INFO: renamed from: d */
        public final float f17979d;

        /* JADX INFO: renamed from: e */
        public final float f17980e;

        /* JADX INFO: renamed from: f */
        public final long f17981f;

        /* JADX INFO: renamed from: g */
        public final int f17982g;

        /* JADX INFO: renamed from: h */
        public final boolean f17983h;

        /* JADX INFO: renamed from: i */
        public final ArrayList f17984i;

        /* JADX INFO: renamed from: j */
        public final GroupParams f17985j;

        /* JADX INFO: renamed from: k */
        public boolean f17986k;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class GroupParams {

            /* JADX INFO: renamed from: a */
            public final String f17987a;

            /* JADX INFO: renamed from: b */
            public final float f17988b;

            /* JADX INFO: renamed from: c */
            public final float f17989c;

            /* JADX INFO: renamed from: d */
            public final float f17990d;

            /* JADX INFO: renamed from: e */
            public final float f17991e;

            /* JADX INFO: renamed from: f */
            public final float f17992f;

            /* JADX INFO: renamed from: g */
            public final float f17993g;

            /* JADX INFO: renamed from: h */
            public final float f17994h;

            /* JADX INFO: renamed from: i */
            public final List f17995i;

            /* JADX INFO: renamed from: j */
            public final ArrayList f17996j;

            public GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0.0f : f7;
                if ((i & 256) != 0) {
                    int i2 = VectorKt.f18156a;
                    list = EmptyList.f51496a;
                }
                ArrayList arrayList = new ArrayList();
                this.f17987a = str;
                this.f17988b = f;
                this.f17989c = f2;
                this.f17990d = f3;
                this.f17991e = f4;
                this.f17992f = f5;
                this.f17993g = f6;
                this.f17994h = f7;
                this.f17995i = list;
                this.f17996j = arrayList;
            }
        }

        public Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z2, int i2) {
            str = (i2 & 1) != 0 ? "" : str;
            long j2 = (i2 & 32) != 0 ? Color.f17583k : j;
            int i3 = (i2 & 64) != 0 ? 5 : i;
            boolean z3 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? false : z2;
            this.f17976a = str;
            this.f17977b = f;
            this.f17978c = f2;
            this.f17979d = f3;
            this.f17980e = f4;
            this.f17981f = j2;
            this.f17982g = i3;
            this.f17983h = z3;
            ArrayList arrayList = new ArrayList();
            this.f17984i = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.f17985j = groupParams;
            arrayList.add(groupParams);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m5480c(Builder builder, ArrayList arrayList, SolidColor solidColor) {
            builder.m5482b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", arrayList);
        }

        /* JADX INFO: renamed from: a */
        public final void m5481a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            if (this.f17986k) {
                InlineClassHelperKt.m5597b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            this.f17984i.add(new GroupParams(str, f, f2, f3, f4, f5, f6, f7, list, 512));
        }

        /* JADX INFO: renamed from: b */
        public final void m5482b(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, Brush brush, Brush brush2, String str, List list) {
            if (this.f17986k) {
                InlineClassHelperKt.m5597b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((GroupParams) AbstractC0000a.m8e(1, this.f17984i)).f17996j.add(new VectorPath(f, f2, f3, f4, f5, f6, f7, i, i2, i3, brush, brush2, str, list));
        }

        /* JADX INFO: renamed from: d */
        public final ImageVector m5483d() {
            if (this.f17986k) {
                InlineClassHelperKt.m5597b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (this.f17984i.size() > 1) {
                m5484e();
            }
            GroupParams groupParams = this.f17985j;
            ImageVector imageVector = new ImageVector(this.f17976a, this.f17977b, this.f17978c, this.f17979d, this.f17980e, new VectorGroup(groupParams.f17987a, groupParams.f17988b, groupParams.f17989c, groupParams.f17990d, groupParams.f17991e, groupParams.f17992f, groupParams.f17993g, groupParams.f17994h, groupParams.f17995i, groupParams.f17996j), this.f17981f, this.f17982g, this.f17983h);
            this.f17986k = true;
            return imageVector;
        }

        /* JADX INFO: renamed from: e */
        public final void m5484e() {
            if (this.f17986k) {
                InlineClassHelperKt.m5597b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ArrayList arrayList = this.f17984i;
            GroupParams groupParams = (GroupParams) arrayList.remove(arrayList.size() - 1);
            ((GroupParams) AbstractC0000a.m8e(1, arrayList)).f17996j.add(new VectorGroup(groupParams.f17987a, groupParams.f17988b, groupParams.f17989c, groupParams.f17990d, groupParams.f17991e, groupParams.f17992f, groupParams.f17993g, groupParams.f17994h, groupParams.f17995i, groupParams.f17996j));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "", "imageVectorCount", "I", "lock", "Ljava/lang/Object;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z2) {
        int i2;
        synchronized (f17965l) {
            i2 = f17964k;
            f17964k = i2 + 1;
        }
        this.f17966a = str;
        this.f17967b = f;
        this.f17968c = f2;
        this.f17969d = f3;
        this.f17970e = f4;
        this.f17971f = vectorGroup;
        this.f17972g = j;
        this.f17973h = i;
        this.f17974i = z2;
        this.f17975j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return Intrinsics.m18594b(this.f17966a, imageVector.f17966a) && C1338Dp.m6641a(this.f17967b, imageVector.f17967b) && C1338Dp.m6641a(this.f17968c, imageVector.f17968c) && this.f17969d == imageVector.f17969d && this.f17970e == imageVector.f17970e && this.f17971f.equals(imageVector.f17971f) && Color.m5181c(this.f17972g, imageVector.f17972g) && this.f17973h == imageVector.f17973h && this.f17974i == imageVector.f17974i;
    }

    public final int hashCode() {
        int iHashCode = (this.f17971f.hashCode() + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(this.f17966a.hashCode() * 31, this.f17967b, 31), this.f17968c, 31), this.f17969d, 31), this.f17970e, 31)) * 31;
        int i = Color.f17584l;
        return Boolean.hashCode(this.f17974i) + AbstractC0455a.m2228c(this.f17973h, AbstractC0455a.m2231f(this.f17972g, iHashCode, 31), 31);
    }
}
