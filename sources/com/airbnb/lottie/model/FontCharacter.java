package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class FontCharacter {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34501a;

    /* JADX INFO: renamed from: b */
    public final char f34502b;

    /* JADX INFO: renamed from: c */
    public final double f34503c;

    /* JADX INFO: renamed from: d */
    public final String f34504d;

    /* JADX INFO: renamed from: e */
    public final String f34505e;

    public FontCharacter(ArrayList arrayList, char c2, double d, String str, String str2) {
        this.f34501a = arrayList;
        this.f34502b = c2;
        this.f34503c = d;
        this.f34504d = str;
        this.f34505e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static int m12647a(char c2, String str, String str2) {
        return str2.hashCode() + AbstractC0000a.m5b(c2 * 31, 31, str);
    }

    public final int hashCode() {
        return m12647a(this.f34502b, this.f34505e, this.f34504d);
    }
}
