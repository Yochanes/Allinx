package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DocumentData {

    /* JADX INFO: renamed from: a */
    public String f34482a;

    /* JADX INFO: renamed from: b */
    public String f34483b;

    /* JADX INFO: renamed from: c */
    public float f34484c;

    /* JADX INFO: renamed from: d */
    public Justification f34485d;

    /* JADX INFO: renamed from: e */
    public int f34486e;

    /* JADX INFO: renamed from: f */
    public float f34487f;

    /* JADX INFO: renamed from: g */
    public float f34488g;

    /* JADX INFO: renamed from: h */
    public int f34489h;

    /* JADX INFO: renamed from: i */
    public int f34490i;

    /* JADX INFO: renamed from: j */
    public float f34491j;

    /* JADX INFO: renamed from: k */
    public boolean f34492k;

    /* JADX INFO: renamed from: l */
    public PointF f34493l;

    /* JADX INFO: renamed from: m */
    public PointF f34494m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Justification {

        /* JADX INFO: renamed from: a */
        public static final Justification f34495a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Justification[] f34496b;

        /* JADX INFO: Fake field, exist only in values array */
        Justification EF0;

        static {
            Justification justification = new Justification("LEFT_ALIGN", 0);
            Justification justification2 = new Justification("RIGHT_ALIGN", 1);
            Justification justification3 = new Justification("CENTER", 2);
            f34495a = justification3;
            f34496b = new Justification[]{justification, justification2, justification3};
        }

        public static Justification valueOf(String str) {
            return (Justification) Enum.valueOf(Justification.class, str);
        }

        public static Justification[] values() {
            return (Justification[]) f34496b.clone();
        }
    }

    public final int hashCode() {
        int iOrdinal = ((this.f34485d.ordinal() + (((int) (AbstractC0000a.m5b(this.f34482a.hashCode() * 31, 31, this.f34483b) + this.f34484c)) * 31)) * 31) + this.f34486e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f34487f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f34489h;
    }
}
